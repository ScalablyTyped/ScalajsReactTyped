package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Optional
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is the event broadcasted by a XListItems implementation for changes in its item list. */
trait ItemListEvent
  extends StObject
     with EventObject {
  
  /**
    * the URL of the image of the item
    *
    * If the event being notified did not touch the image of an item, this member is empty. For instance, upon invocation of {@link XItemList.setItemText()}
    * , only `ItemText` will be set, and `ItemImageURL` will be empty.
    */
  var ItemImageURL: Optional[String]
  
  /**
    * specifies the position of the item which is affected by the event
    *
    * In case the event is not related to a single item, but to the complete list, the value of this member is undefined.
    */
  var ItemPosition: Double
  
  /**
    * the text of the item.
    *
    * If the event being notified did not touch the text of an item, this member is empty. For instance, upon invocation of {@link XItemList.setItemImage()}
    * , only `ItemImageURL` will be set, and `ItemText` will be empty.
    */
  var ItemText: Optional[String]
}
object ItemListEvent {
  
  inline def apply(
    ItemImageURL: Optional[String],
    ItemPosition: Double,
    ItemText: Optional[String],
    Source: XInterface
  ): ItemListEvent = {
    val __obj = js.Dynamic.literal(ItemImageURL = ItemImageURL.asInstanceOf[js.Any], ItemPosition = ItemPosition.asInstanceOf[js.Any], ItemText = ItemText.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemListEvent]
  }
  
  extension [Self <: ItemListEvent](x: Self) {
    
    inline def setItemImageURL(value: Optional[String]): Self = StObject.set(x, "ItemImageURL", value.asInstanceOf[js.Any])
    
    inline def setItemPosition(value: Double): Self = StObject.set(x, "ItemPosition", value.asInstanceOf[js.Any])
    
    inline def setItemText(value: Optional[String]): Self = StObject.set(x, "ItemText", value.asInstanceOf[js.Any])
  }
}
