package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.li
import typingsJapgolly.reactBulmaComponents.srcComponentsBreadcrumbMod.BreadcrumbItemProps
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var Item: BulmaComponent[BreadcrumbItemProps, li]
}
object Item {
  
  inline def apply(Item: /* props */ BreadcrumbItemProps & (ElementProps[BreadcrumbItemProps, li]) => Element): Item = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setItem(value: /* props */ BreadcrumbItemProps & (ElementProps[BreadcrumbItemProps, li]) => Element): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
