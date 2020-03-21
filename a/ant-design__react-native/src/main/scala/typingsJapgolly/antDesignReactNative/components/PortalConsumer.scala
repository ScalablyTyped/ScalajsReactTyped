package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.portalConsumerMod.PortalConsumerProps
import typingsJapgolly.antDesignReactNative.portalConsumerMod.default
import typingsJapgolly.antDesignReactNative.portalHostMod.PortalMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PortalConsumer {
  def apply(
    manager: PortalMethods,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PortalConsumerProps, default, Unit, PortalConsumerProps] = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.portalConsumerMod.PortalConsumerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.portalConsumerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.portalConsumerMod.PortalConsumerProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/portal/portal-consumer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

