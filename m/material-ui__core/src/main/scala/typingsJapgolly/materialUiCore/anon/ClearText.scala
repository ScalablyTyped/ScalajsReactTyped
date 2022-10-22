package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearText extends StObject {
  
  var clearText: js.UndefOr[String] = js.undefined
  
  var closeText: js.UndefOr[String] = js.undefined
  
  var loadingText: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  var noOptionsText: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  var openText: js.UndefOr[String] = js.undefined
}
object ClearText {
  
  inline def apply(): ClearText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearText]
  }
  
  extension [Self <: ClearText](x: Self) {
    
    inline def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
    
    inline def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
    
    inline def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
    
    inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
    
    inline def setLoadingText(value: VdomNode): Self = StObject.set(x, "loadingText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLoadingTextNull: Self = StObject.set(x, "loadingText", null)
    
    inline def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
    
    inline def setLoadingTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "loadingText", js.Array(value*))
    
    inline def setLoadingTextVdomElement(value: VdomElement): Self = StObject.set(x, "loadingText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setNoOptionsText(value: VdomNode): Self = StObject.set(x, "noOptionsText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setNoOptionsTextNull: Self = StObject.set(x, "noOptionsText", null)
    
    inline def setNoOptionsTextUndefined: Self = StObject.set(x, "noOptionsText", js.undefined)
    
    inline def setNoOptionsTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "noOptionsText", js.Array(value*))
    
    inline def setNoOptionsTextVdomElement(value: VdomElement): Self = StObject.set(x, "noOptionsText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOpenText(value: String): Self = StObject.set(x, "openText", value.asInstanceOf[js.Any])
    
    inline def setOpenTextUndefined: Self = StObject.set(x, "openText", js.undefined)
  }
}
