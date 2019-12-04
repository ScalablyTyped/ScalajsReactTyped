package typingsJapgolly.reactDashRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.historyMod.Location
import typingsJapgolly.history.historyMod.LocationState
import typingsJapgolly.reactDashRouter.reactDashRouterMod.PromptProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Prompt {
  def apply(
    message: String | (js.Function1[/* location */ Location[LocationState], String | Boolean]),
    when: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PromptProps, 
    typingsJapgolly.reactDashRouter.reactDashRouterMod.Prompt, 
    Unit, 
    PromptProps
  ] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
      if (!js.isUndefined(when)) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashRouter.reactDashRouterMod.PromptProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashRouter.reactDashRouterMod.Prompt](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashRouter.reactDashRouterMod.PromptProps])(children: _*)
  }
  @JSImport("react-router", "Prompt")
  @js.native
  object componentImport extends js.Object
  
}

