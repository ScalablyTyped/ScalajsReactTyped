package typingsJapgolly.reactNoSsr.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactNoSsr.AnonOnSSR
import typingsJapgolly.reactNoSsr.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNoSsr {
  def apply(
    onSSR: ReactChild = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonOnSSR, default, Unit, AnonOnSSR] = {
    val __obj = js.Dynamic.literal()
  
      if (onSSR != null) __obj.updateDynamic("onSSR")(onSSR.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNoSsr.AnonOnSSR, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNoSsr.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNoSsr.AnonOnSSR])(children: _*)
  }
  @JSImport("react-no-ssr", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

