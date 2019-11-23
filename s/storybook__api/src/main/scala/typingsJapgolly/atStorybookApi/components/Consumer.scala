package typingsJapgolly.atStorybookApi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atStorybookApi.atStorybookApiMod.Combo
import typingsJapgolly.atStorybookApi.atStorybookApiMod.ConsumerProps
import typingsJapgolly.atStorybookApi.atStorybookApiMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object Consumer {
  def apply(
    props: (ConsumerProps[SubState, Combo]) with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    (ConsumerProps[SubState, Combo]) with js.Object, 
    typingsJapgolly.atStorybookApi.atStorybookApiMod.Consumer, 
    Unit, 
    (ConsumerProps[SubState, Combo]) with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  (typingsJapgolly.atStorybookApi.atStorybookApiMod.ConsumerProps[
    typingsJapgolly.atStorybookApi.atStorybookApiMod.SubState, 
    typingsJapgolly.atStorybookApi.atStorybookApiMod.Combo
  ]) with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atStorybookApi.atStorybookApiMod.Consumer](js.constructorOf[typingsJapgolly.atStorybookApi.atStorybookApiMod.Consumer])
    f(__obj.asInstanceOf[(typingsJapgolly.atStorybookApi.atStorybookApiMod.ConsumerProps[
  typingsJapgolly.atStorybookApi.atStorybookApiMod.SubState, 
  typingsJapgolly.atStorybookApi.atStorybookApiMod.Combo]) with js.Object])(children: _*)
  }
}

