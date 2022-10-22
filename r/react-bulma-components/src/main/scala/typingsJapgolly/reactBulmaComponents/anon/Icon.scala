package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var Icon: BulmaComponent[js.Object, div]
  
  var Title: BulmaComponent[js.Object, div]
}
object Icon {
  
  inline def apply(
    Icon: /* props */ js.Object & (ElementProps[js.Object, div]) => Element,
    Title: /* props */ js.Object & (ElementProps[js.Object, div]) => Element
  ): Icon = {
    val __obj = js.Dynamic.literal(Icon = js.Any.fromFunction1(Icon), Title = js.Any.fromFunction1(Title))
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setIcon(value: /* props */ js.Object & (ElementProps[js.Object, div]) => Element): Self = StObject.set(x, "Icon", js.Any.fromFunction1(value))
    
    inline def setTitle(value: /* props */ js.Object & (ElementProps[js.Object, div]) => Element): Self = StObject.set(x, "Title", js.Any.fromFunction1(value))
  }
}
