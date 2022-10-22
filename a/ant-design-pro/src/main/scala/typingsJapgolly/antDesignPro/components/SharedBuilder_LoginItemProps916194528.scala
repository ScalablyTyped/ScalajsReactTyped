package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_LoginItemProps916194528 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def buttonText(value: VdomNode): this.type = set("buttonText", value.rawNode.asInstanceOf[js.Any])
  
  inline def buttonTextNull: this.type = set("buttonText", null)
  
  inline def buttonTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("buttonText", js.Array(value*))
  
  inline def buttonTextVdomElement(value: VdomElement): this.type = set("buttonText", value.rawElement.asInstanceOf[js.Any])
  
  inline def countDown(value: Double): this.type = set("countDown", value.asInstanceOf[js.Any])
  
  inline def customprops(value: Any): this.type = set("customprops", value.asInstanceOf[js.Any])
  
  inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def getCaptchaButtonText(value: String): this.type = set("getCaptchaButtonText", value.asInstanceOf[js.Any])
  
  inline def getCaptchaSecondText(value: String): this.type = set("getCaptchaSecondText", value.asInstanceOf[js.Any])
  
  inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* e */ Any => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
  
  inline def onGetCaptcha(value: /* event */ js.UndefOr[MouseEvent] => Callback): this.type = set("onGetCaptcha", js.Any.fromFunction1((t0: /* event */ js.UndefOr[MouseEvent]) => value(t0).runNow()))
  
  inline def onPressEnter(value: /* e */ Any => Callback): this.type = set("onPressEnter", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
  
  inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  inline def rules(value: js.Array[Any]): this.type = set("rules", value.asInstanceOf[js.Any])
  
  inline def rulesVarargs(value: Any*): this.type = set("rules", js.Array(value*))
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
