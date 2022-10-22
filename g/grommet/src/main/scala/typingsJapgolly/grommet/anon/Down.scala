package typingsJapgolly.grommet.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Down extends StObject {
  
  var down: js.UndefOr[
    Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
  ] = js.undefined
  
  var up: js.UndefOr[
    Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
  ] = js.undefined
}
object Down {
  
  inline def apply(): Down = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Down]
  }
  
  extension [Self <: Down](x: Self) {
    
    inline def setDown(
      value: Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
    ): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownNull: Self = StObject.set(x, "down", null)
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setDownVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "down", js.Array(value*))
    
    inline def setDownVdomElement(value: VdomElement): Self = StObject.set(x, "down", value.rawElement.asInstanceOf[js.Any])
    
    inline def setUp(
      value: Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
    ): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpNull: Self = StObject.set(x, "up", null)
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    
    inline def setUpVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "up", js.Array(value*))
    
    inline def setUpVdomElement(value: VdomElement): Self = StObject.set(x, "up", value.rawElement.asInstanceOf[js.Any])
  }
}
