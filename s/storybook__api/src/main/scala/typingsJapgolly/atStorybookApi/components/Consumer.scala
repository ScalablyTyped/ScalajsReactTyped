package typingsJapgolly.atStorybookApi.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atStorybookApi.atStorybookApiMod.Combo
import typingsJapgolly.atStorybookApi.atStorybookApiMod.ConsumerProps
import typingsJapgolly.atStorybookApi.atStorybookApiMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Consumer {
  def apply(
    filter: Combo => CallbackTo[SubState] = null,
    pure: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: Combo | SubState => CallbackTo[Element | Null]
  ): UnmountedWithRoot[
    ConsumerProps[SubState, Combo], 
    typingsJapgolly.atStorybookApi.atStorybookApiMod.Consumer, 
    Unit, 
    ConsumerProps[SubState, Combo]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookApi.atStorybookApiMod.Combo | typingsJapgolly.atStorybookApi.atStorybookApiMod.SubState) => children(t0).runNow()))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookApi.atStorybookApiMod.Combo) => filter(t0).runNow()))
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atStorybookApi.atStorybookApiMod.ConsumerProps[
    typingsJapgolly.atStorybookApi.atStorybookApiMod.SubState, 
    typingsJapgolly.atStorybookApi.atStorybookApiMod.Combo
  ], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.atStorybookApi.atStorybookApiMod.Consumer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atStorybookApi.atStorybookApiMod.ConsumerProps[
  typingsJapgolly.atStorybookApi.atStorybookApiMod.SubState, 
  typingsJapgolly.atStorybookApi.atStorybookApiMod.Combo]])
  }
  @JSImport("@storybook/api", "Consumer")
  @js.native
  object componentImport extends js.Object
  
}

