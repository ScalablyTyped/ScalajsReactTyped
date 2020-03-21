package typingsJapgolly.reactPortal.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactPortal.mod.PortalFunctionParams
import typingsJapgolly.reactPortal.mod.PortalWithStateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PortalWithState {
  def apply(
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    node: Element = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onOpen: js.UndefOr[Callback] = js.undefined,
    openByClickOn: VdomElement = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: PortalFunctionParams => CallbackTo[Node]
  ): UnmountedWithRoot[
    PortalWithStateProps, 
    typingsJapgolly.reactPortal.mod.PortalWithState, 
    Unit, 
    PortalWithStateProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactPortal.mod.PortalFunctionParams) => children(t0).runNow()))
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnOutsideClick)) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    if (openByClickOn != null) __obj.updateDynamic("openByClickOn")(openByClickOn.rawElement.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPortal.mod.PortalWithStateProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactPortal.mod.PortalWithState](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPortal.mod.PortalWithStateProps])
  }
  @JSImport("react-portal", "PortalWithState")
  @js.native
  object componentImport extends js.Object
  
}

