package typingsJapgolly.reactMailchimpSubscribe.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMailchimpSubscribe.mod.FormHooks
import typingsJapgolly.reactMailchimpSubscribe.mod.Props
import typingsJapgolly.reactMailchimpSubscribe.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMailchimpSubscribe {
  def apply[FormFields](
    url: String,
    render: /* hooks */ FormHooks[FormFields] => CallbackTo[Node] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props[FormFields], default[FormFields], Unit, Props[FormFields]] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
      if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* hooks */ typingsJapgolly.reactMailchimpSubscribe.mod.FormHooks[FormFields]) => render(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMailchimpSubscribe.mod.Props[FormFields], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMailchimpSubscribe.mod.default[FormFields]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMailchimpSubscribe.mod.Props[FormFields]])(children: _*)
  }
  @JSImport("react-mailchimp-subscribe", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

