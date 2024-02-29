package hello.shop.Sevice.Item;

import hello.shop.Entity.Item.Item;
import hello.shop.Repository.Item.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    /**
     * 비즈니스 로직
     * enroll: 상품 등록
     * findOne: 상품 하나 조회
     * findItems: 전체 상품 조회
     */
    private final ItemRepository itemRepository;

    @Transactional
    public void enroll(Item item) {
        itemRepository.save(item);
    }

    public Item findOne(Long itemId) {
        return itemRepository.findOne(itemId);
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }
}