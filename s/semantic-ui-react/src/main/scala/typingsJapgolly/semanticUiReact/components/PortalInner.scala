package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.portalInnerMod.PortalInnerProps
import typingsJapgolly.semanticUiReact.portalInnerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PortalInner {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    innerRef: japgolly.scalajs.react.raw.React.Ref = null,
    mountNode: js.Any = null,
    onMount: (/* nothing */ Null, /* data */ PortalInnerProps) => Callback = null,
    onUnmount: (/* nothing */ Null, /* data */ PortalInnerProps) => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PortalInnerProps, default, Unit, PortalInnerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.portalInnerMod.PortalInnerProps) => onMount(t0, t1).runNow()))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.portalInnerMod.PortalInnerProps) => onUnmount(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticUiReact.portalInnerMod.PortalInnerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticUiReact.portalInnerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticUiReact.portalInnerMod.PortalInnerProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/Portal/PortalInner", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

