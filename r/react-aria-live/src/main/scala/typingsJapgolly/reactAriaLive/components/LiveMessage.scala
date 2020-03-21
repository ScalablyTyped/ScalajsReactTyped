package typingsJapgolly.reactAriaLive.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactAriaLive.AnonArialive
import typingsJapgolly.reactAriaLive.reactAriaLiveStrings.assertive
import typingsJapgolly.reactAriaLive.reactAriaLiveStrings.polite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LiveMessage {
  def apply(
    message: String,
    `aria-live`: assertive | polite,
    clearOnUnmount: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    AnonArialive, 
    MountedWithRawType[AnonArialive, js.Object, RawMounted[AnonArialive, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
      __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnUnmount)) __obj.updateDynamic("clearOnUnmount")(clearOnUnmount.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactAriaLive.AnonArialive, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAriaLive.AnonArialive])(children: _*)
  }
  @JSImport("react-aria-live", "LiveMessage")
  @js.native
  object componentImport extends js.Object
  
}

