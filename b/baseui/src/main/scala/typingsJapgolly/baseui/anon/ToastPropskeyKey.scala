package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import typingsJapgolly.baseui.toastTypesMod.ComponentRenderProp
import typingsJapgolly.baseui.toastTypesMod.KindType
import typingsJapgolly.baseui.toastTypesMod.NotificationType
import typingsJapgolly.baseui.toastTypesMod.ToastOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/toast/types.ToastProps & {  key :react.react.Key} */
trait ToastPropskeyKey extends StObject {
  
  /** This is a private property to detect manual changes to a toast
    *  i.e. calling toaster.info() with the same key twice
    *  currently the change detection is used to reset the autohide timer
    */
  var __updated: js.UndefOr[Double] = js.undefined
  
  /** If true, the toast close icon will receive focus on mount
    and restore focus to previously focused element on unmount.
    This should only be used when there is no autoHideDuration
    and the toast for some reason has an action within it.
    Focusing alerts is bad for screenreaders! */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  /** The number of milliseconds to wait before automatically dismissing a
    * notification. This behavior is disabled when the value is set to 0.*/
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  
  /** Toast notification content. The children-as-function
    *  receives a dismiss method that can be called to
    * dismiss the notification and can be used as a
    * handler for an action inside the toast content. */
  var children: typingsJapgolly.baseui.toastTypesMod.Children | ComponentRenderProp
  
  /** When set to true a close button is displayed and the notification can be dismissed by a user. */
  var closeable: js.UndefOr[Boolean] = js.undefined
  
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[typingsJapgolly.react.mod.Key] & typingsJapgolly.react.mod.Key
  
  /** Defines the type of notification. */
  var kind: js.UndefOr[KindType] = js.undefined
  
  var notificationType: js.UndefOr[NotificationType] = js.undefined
  
  /** A callback function called when a notification is dismissed. */
  var onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.undefined
  
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.undefined
  
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.undefined
  
  var overrides: js.UndefOr[ToastOverrides] = js.undefined
}
object ToastPropskeyKey {
  
  inline def apply(key: js.UndefOr[typingsJapgolly.react.mod.Key] & typingsJapgolly.react.mod.Key): ToastPropskeyKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[ToastPropskeyKey]
  }
  
  extension [Self <: ToastPropskeyKey](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
    
    inline def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
    
    inline def setChildren(value: typingsJapgolly.baseui.toastTypesMod.Children | ComponentRenderProp): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* props */ Dismiss => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
    
    inline def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
    
    inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
    
    inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
    
    inline def setKey(value: js.UndefOr[typingsJapgolly.react.mod.Key] & typingsJapgolly.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: KindType): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNotificationType(value: NotificationType): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    inline def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
    
    inline def setOnBlur(value: /* e */ ReactFocusEventFrom[Element] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClose(value: CallbackTo[Any]): Self = StObject.set(x, "onClose", value.toJsFn)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnFocus(value: /* e */ ReactFocusEventFrom[Element] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnMouseEnter(value: /* e */ ReactMouseEventFrom[Element] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* e */ ReactMouseEventFrom[Element] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOverrides(value: ToastOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def set__updated(value: Double): Self = StObject.set(x, "__updated", value.asInstanceOf[js.Any])
    
    inline def set__updatedUndefined: Self = StObject.set(x, "__updated", js.undefined)
  }
}
