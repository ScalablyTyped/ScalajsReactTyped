package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemBulmaComponent extends StObject {
  
  var Item: BulmaComponent[js.Object, div]
}
object ItemBulmaComponent {
  
  inline def apply(Item: /* props */ js.Object & (ElementProps[js.Object, div]) => Element): ItemBulmaComponent = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[ItemBulmaComponent]
  }
  
  extension [Self <: ItemBulmaComponent](x: Self) {
    
    inline def setItem(value: /* props */ js.Object & (ElementProps[js.Object, div]) => Element): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
