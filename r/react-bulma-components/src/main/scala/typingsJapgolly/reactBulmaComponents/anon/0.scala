package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.srcComponentsMediaMod.MediaItemProps
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var Item: BulmaComponent[MediaItemProps, div]
}
object `0` {
  
  inline def apply(Item: /* props */ MediaItemProps & (ElementProps[MediaItemProps, div]) => Element): `0` = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setItem(value: /* props */ MediaItemProps & (ElementProps[MediaItemProps, div]) => Element): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
