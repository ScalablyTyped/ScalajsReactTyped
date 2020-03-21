package typingsJapgolly.reduxRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.reactRouter.mod.PromptProps
import typingsJapgolly.reduxRouter.mod.ReduxRouter.Prompt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReduxRouterPrompt {
  def apply(
    message: String | (js.Function1[/* location */ Location[LocationState], String | Boolean]),
    when: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PromptProps, Prompt, Unit, PromptProps] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
      if (!js.isUndefined(when)) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouter.mod.PromptProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reduxRouter.mod.ReduxRouter.Prompt](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouter.mod.PromptProps])(children: _*)
  }
  @JSImport("redux-router", "ReduxRouter.Prompt")
  @js.native
  object componentImport extends js.Object
  
}

