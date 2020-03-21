package typingsJapgolly.reactAddonsCssTransitionGroup.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactAddonsCssTransitionGroup.mod.reactAugmentingMod.CSSTransitionGroupProps
import typingsJapgolly.reactAddonsCssTransitionGroup.mod.reactAugmentingMod.CSSTransitionGroupTransitionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Class {
  def apply(
    transitionName: String | CSSTransitionGroupTransitionName,
    transitionAppear: js.UndefOr[Boolean] = js.undefined,
    transitionAppearTimeout: Int | Double = null,
    transitionEnter: js.UndefOr[Boolean] = js.undefined,
    transitionEnterTimeout: Int | Double = null,
    transitionLeave: js.UndefOr[Boolean] = js.undefined,
    transitionLeaveTimeout: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    CSSTransitionGroupProps, 
    typingsJapgolly.reactAddonsCssTransitionGroup.mod.Class, 
    Unit, 
    CSSTransitionGroupProps
  ] = {
    val __obj = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
  
      if (!js.isUndefined(transitionAppear)) __obj.updateDynamic("transitionAppear")(transitionAppear.asInstanceOf[js.Any])
    if (transitionAppearTimeout != null) __obj.updateDynamic("transitionAppearTimeout")(transitionAppearTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionEnter)) __obj.updateDynamic("transitionEnter")(transitionEnter.asInstanceOf[js.Any])
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionLeave)) __obj.updateDynamic("transitionLeave")(transitionLeave.asInstanceOf[js.Any])
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAddonsCssTransitionGroup.mod.reactAugmentingMod.CSSTransitionGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAddonsCssTransitionGroup.mod.Class](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAddonsCssTransitionGroup.mod.reactAugmentingMod.CSSTransitionGroupProps])(children: _*)
  }
  @JSImport("react-addons-css-transition-group", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

