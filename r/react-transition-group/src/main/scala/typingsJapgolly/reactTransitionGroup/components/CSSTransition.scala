package typingsJapgolly.reactTransitionGroup.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTransitionGroup.csstransitionMod.CSSTransitionProps
import typingsJapgolly.reactTransitionGroup.csstransitionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object CSSTransition {
  def apply(
    props: CSSTransitionProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CSSTransitionProps with js.Object, default, Unit, CSSTransitionProps with js.Object] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTransitionGroup.csstransitionMod.CSSTransitionProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTransitionGroup.csstransitionMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTransitionGroup.csstransitionMod.CSSTransitionProps with js.Object])(children: _*)
  }
  @JSImport("react-transition-group/CSSTransition", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

