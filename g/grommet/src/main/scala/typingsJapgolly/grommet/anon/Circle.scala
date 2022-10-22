package typingsJapgolly.grommet.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circle extends StObject {
  
  var circle: js.UndefOr[
    Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
  ] = js.undefined
}
object Circle {
  
  inline def apply(): Circle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Circle]
  }
  
  extension [Self <: Circle](x: Self) {
    
    inline def setCircle(
      value: Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
    ): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleNull: Self = StObject.set(x, "circle", null)
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    inline def setCircleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "circle", js.Array(value*))
    
    inline def setCircleVdomElement(value: VdomElement): Self = StObject.set(x, "circle", value.rawElement.asInstanceOf[js.Any])
  }
}
