package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.span
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var Text: BulmaComponent[js.Object, span]
}
object Text {
  
  inline def apply(Text: /* props */ js.Object & (ElementProps[js.Object, span]) => Element): Text = {
    val __obj = js.Dynamic.literal(Text = js.Any.fromFunction1(Text))
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setText(value: /* props */ js.Object & (ElementProps[js.Object, span]) => Element): Self = StObject.set(x, "Text", js.Any.fromFunction1(value))
  }
}
