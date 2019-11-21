package typingsJapgolly.reactDashNativeDashGestureDashHandler.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble it yourself using js.Dynamic.literal(...) or similar */
object TouchableNativeFeedback {
  def apply(
    props: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TouchableHighlightProperties */ js.Any) with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TouchableHighlightProperties */ js.Any) with js.Object, 
    typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TouchableNativeFeedback, 
    Unit, 
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TouchableHighlightProperties */ js.Any) with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TouchableHighlightProperties */ js.Any) with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TouchableNativeFeedback](js.constructorOf[typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TouchableNativeFeedback])
    f(__obj.asInstanceOf[(/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TouchableHighlightProperties */ js.Any) with js.Object])(children: _*)
  }
}

