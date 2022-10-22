package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.srcComponentsButtonMod.ButtonGroupProps
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  var Group: BulmaComponent[ButtonGroupProps, div]
}
object Group {
  
  inline def apply(Group: /* props */ ButtonGroupProps & (ElementProps[ButtonGroupProps, div]) => Element): Group = {
    val __obj = js.Dynamic.literal(Group = js.Any.fromFunction1(Group))
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setGroup(value: /* props */ ButtonGroupProps & (ElementProps[ButtonGroupProps, div]) => Element): Self = StObject.set(x, "Group", js.Any.fromFunction1(value))
  }
}
