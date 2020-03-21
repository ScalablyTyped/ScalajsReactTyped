package typingsJapgolly.storybookApi.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookApi.mod.Combo
import typingsJapgolly.storybookApi.mod.ConsumerProps
import typingsJapgolly.storybookApi.mod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Consumer {
  def apply(
    filter: Combo => CallbackTo[SubState] = null,
    pure: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Combo | SubState => CallbackTo[Element | Null]
  ): UnmountedWithRoot[
    ConsumerProps[SubState, Combo], 
    typingsJapgolly.storybookApi.mod.Consumer, 
    Unit, 
    ConsumerProps[SubState, Combo]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.storybookApi.mod.Combo | typingsJapgolly.storybookApi.mod.SubState) => children(t0).runNow()))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: typingsJapgolly.storybookApi.mod.Combo) => filter(t0).runNow()))
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookApi.mod.ConsumerProps[typingsJapgolly.storybookApi.mod.SubState, typingsJapgolly.storybookApi.mod.Combo], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.storybookApi.mod.Consumer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookApi.mod.ConsumerProps[typingsJapgolly.storybookApi.mod.SubState, typingsJapgolly.storybookApi.mod.Combo]])
  }
  @JSImport("@storybook/api", "Consumer")
  @js.native
  object componentImport extends js.Object
  
}

