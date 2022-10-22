package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.a
import typingsJapgolly.reactBulmaComponents.srcComponentsMenuMod.MenuListItemProps
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var Item: BulmaComponent[MenuListItemProps, a]
}
object `1` {
  
  inline def apply(Item: /* props */ MenuListItemProps & (ElementProps[MenuListItemProps, a]) => Element): `1` = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setItem(value: /* props */ MenuListItemProps & (ElementProps[MenuListItemProps, a]) => Element): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
