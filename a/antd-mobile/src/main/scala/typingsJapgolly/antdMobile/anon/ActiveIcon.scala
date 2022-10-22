package typingsJapgolly.antdMobile.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveIcon extends StObject {
  
  var activeIcon: js.UndefOr[Node] = js.undefined
  
  def check(`val`: String): Unit
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  def uncheck(`val`: String): Unit
  
  var value: js.Array[String]
}
object ActiveIcon {
  
  inline def apply(check: String => Callback, uncheck: String => Callback, value: js.Array[String]): ActiveIcon = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1((t0: String) => check(t0).runNow()), uncheck = js.Any.fromFunction1((t0: String) => uncheck(t0).runNow()), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIcon]
  }
  
  extension [Self <: ActiveIcon](x: Self) {
    
    inline def setActiveIcon(value: VdomNode): Self = StObject.set(x, "activeIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setActiveIconNull: Self = StObject.set(x, "activeIcon", null)
    
    inline def setActiveIconUndefined: Self = StObject.set(x, "activeIcon", js.undefined)
    
    inline def setActiveIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "activeIcon", js.Array(value*))
    
    inline def setActiveIconVdomElement(value: VdomElement): Self = StObject.set(x, "activeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCheck(value: String => Callback): Self = StObject.set(x, "check", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setUncheck(value: String => Callback): Self = StObject.set(x, "uncheck", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
