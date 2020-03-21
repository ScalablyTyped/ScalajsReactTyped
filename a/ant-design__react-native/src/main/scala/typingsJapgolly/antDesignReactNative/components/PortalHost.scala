package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.portalHostMod.PortalHostProps
import typingsJapgolly.antDesignReactNative.portalHostMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PortalHost {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PortalHostProps, default, Unit, PortalHostProps] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.portalHostMod.PortalHostProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.portalHostMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.portalHostMod.PortalHostProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/portal/portal-host", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

