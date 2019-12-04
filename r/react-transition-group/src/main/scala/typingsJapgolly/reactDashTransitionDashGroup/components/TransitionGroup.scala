package typingsJapgolly.reactDashTransitionDashGroup.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashTransitionDashGroup.reactDashTransitionDashGroupStrings.div
import typingsJapgolly.reactDashTransitionDashGroup.transitionGroupMod.TransitionGroupProps
import typingsJapgolly.reactDashTransitionDashGroup.transitionGroupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object TransitionGroup {
  def apply(
    props: (TransitionGroupProps[div, js.Any]) with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    (TransitionGroupProps[div, js.Any]) with js.Object, 
    default, 
    Unit, 
    (TransitionGroupProps[div, js.Any]) with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  (typingsJapgolly.reactDashTransitionDashGroup.transitionGroupMod.TransitionGroupProps[
    typingsJapgolly.reactDashTransitionDashGroup.reactDashTransitionDashGroupStrings.div, 
    js.Any
  ]) with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashTransitionDashGroup.transitionGroupMod.default](this.componentImport)
    f(__obj.asInstanceOf[(typingsJapgolly.reactDashTransitionDashGroup.transitionGroupMod.TransitionGroupProps[
  typingsJapgolly.reactDashTransitionDashGroup.reactDashTransitionDashGroupStrings.div, 
  js.Any]) with js.Object])(children: _*)
  }
  @JSImport("react-transition-group/TransitionGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

