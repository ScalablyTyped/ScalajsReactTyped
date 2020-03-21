package typingsJapgolly.solidReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.solidReact.AnonSubscribe
import typingsJapgolly.solidReact.solidReactStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LiveUpdate {
  def apply(
    subscribe: Asterisk | String | js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonSubscribe, typingsJapgolly.solidReact.mod.LiveUpdate, Unit, AnonSubscribe] = {
    val __obj = js.Dynamic.literal()
  
      if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.solidReact.AnonSubscribe, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.solidReact.mod.LiveUpdate](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.solidReact.AnonSubscribe])(children: _*)
  }
  @JSImport("@solid/react", "LiveUpdate")
  @js.native
  object componentImport extends js.Object
  
}

