package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.renderAs
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.span
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponentWithoutRenderAs
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import typingsJapgolly.reactBulmaComponents.srcComponentsTagMod.TagGroupProps
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupBulmaComponentWithoutRenderAs extends StObject {
  
  var Group: BulmaComponentWithoutRenderAs[TagGroupProps, span]
}
object GroupBulmaComponentWithoutRenderAs {
  
  inline def apply(Group: /* props */ TagGroupProps & (Omit[ElementProps[TagGroupProps, span], renderAs]) => Element): GroupBulmaComponentWithoutRenderAs = {
    val __obj = js.Dynamic.literal(Group = js.Any.fromFunction1(Group))
    __obj.asInstanceOf[GroupBulmaComponentWithoutRenderAs]
  }
  
  extension [Self <: GroupBulmaComponentWithoutRenderAs](x: Self) {
    
    inline def setGroup(value: /* props */ TagGroupProps & (Omit[ElementProps[TagGroupProps, span], renderAs]) => Element): Self = StObject.set(x, "Group", js.Any.fromFunction1(value))
  }
}
