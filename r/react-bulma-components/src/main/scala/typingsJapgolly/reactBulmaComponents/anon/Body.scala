package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.srcComponentsFormMod.FieldLabelProps
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var Body: BulmaComponent[js.Object, div]
  
  var Label: BulmaComponent[FieldLabelProps, div]
}
object Body {
  
  inline def apply(
    Body: /* props */ js.Object & (ElementProps[js.Object, div]) => Element,
    Label: /* props */ FieldLabelProps & (ElementProps[FieldLabelProps, div]) => Element
  ): Body = {
    val __obj = js.Dynamic.literal(Body = js.Any.fromFunction1(Body), Label = js.Any.fromFunction1(Label))
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: /* props */ js.Object & (ElementProps[js.Object, div]) => Element): Self = StObject.set(x, "Body", js.Any.fromFunction1(value))
    
    inline def setLabel(value: /* props */ FieldLabelProps & (ElementProps[FieldLabelProps, div]) => Element): Self = StObject.set(x, "Label", js.Any.fromFunction1(value))
  }
}
