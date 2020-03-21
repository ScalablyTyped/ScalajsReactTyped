package typingsJapgolly.reactNativeReadMoreText.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeReadMoreText.mod.ReadMoreProps
import typingsJapgolly.reactNativeReadMoreText.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeReadMoreText {
  def apply(
    numberOfLines: Double,
    renderRevealedFooter: js.Function0[Unit] => CallbackTo[Node],
    renderTruncatedFooter: js.Function0[Unit] => CallbackTo[Node],
    onReady: js.UndefOr[Callback] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReadMoreProps, default, Unit, ReadMoreProps] = {
    val __obj = js.Dynamic.literal(numberOfLines = numberOfLines.asInstanceOf[js.Any])
  
      __obj.updateDynamic("renderRevealedFooter")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => renderRevealedFooter(t0).runNow()))
    __obj.updateDynamic("renderTruncatedFooter")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => renderTruncatedFooter(t0).runNow()))
    onReady.foreach(p => __obj.updateDynamic("onReady")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeReadMoreText.mod.ReadMoreProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeReadMoreText.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeReadMoreText.mod.ReadMoreProps])(children: _*)
  }
  @JSImport("react-native-read-more-text", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

