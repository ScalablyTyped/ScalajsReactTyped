package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.Dismiss
import typingsJapgolly.baseui.toastTypesMod.Children
import typingsJapgolly.baseui.toastTypesMod.ComponentRenderProp
import typingsJapgolly.baseui.toastTypesMod.KindType
import typingsJapgolly.baseui.toastTypesMod.NotificationType
import typingsJapgolly.baseui.toastTypesMod.ToastOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ToastProps640370120[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def __updated(value: Double): this.type = set("__updated", value.asInstanceOf[js.Any])
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def autoHideDuration(value: Double): this.type = set("autoHideDuration", value.asInstanceOf[js.Any])
  
  inline def children(value: Children | ComponentRenderProp): this.type = set("children", value.asInstanceOf[js.Any])
  
  inline def childrenFunction1(value: /* props */ Dismiss => Node): this.type = set("children", js.Any.fromFunction1(value))
  
  inline def childrenNull: this.type = set("children", null)
  
  inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
  
  inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
  
  inline def closeable(value: Boolean): this.type = set("closeable", value.asInstanceOf[js.Any])
  
  inline def `data-baseweb`(value: String): this.type = set("data-baseweb", value.asInstanceOf[js.Any])
  
  inline def kind(value: KindType): this.type = set("kind", value.asInstanceOf[js.Any])
  
  inline def notificationType(value: NotificationType): this.type = set("notificationType", value.asInstanceOf[js.Any])
  
  inline def onBlur(value: /* e */ ReactFocusEventFrom[org.scalajs.dom.Element] => Any): this.type = set("onBlur", js.Any.fromFunction1(value))
  
  inline def onClose(value: CallbackTo[Any]): this.type = set("onClose", value.toJsFn)
  
  inline def onFocus(value: /* e */ ReactFocusEventFrom[org.scalajs.dom.Element] => Any): this.type = set("onFocus", js.Any.fromFunction1(value))
  
  inline def onMouseEnter(value: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element] => Any): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  inline def onMouseLeave(value: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element] => Any): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  inline def overrides(value: ToastOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
}
