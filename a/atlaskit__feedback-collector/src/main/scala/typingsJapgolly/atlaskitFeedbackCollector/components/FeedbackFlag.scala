package typingsJapgolly.atlaskitFeedbackCollector.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atlaskitFeedbackCollector.mod.FeedbackFlagProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedbackFlag {
  def apply(
    isDismissAllowed: js.UndefOr[Boolean] = js.undefined,
    onDismissed: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FeedbackFlagProps, 
    typingsJapgolly.atlaskitFeedbackCollector.mod.FeedbackFlag, 
    Unit, 
    FeedbackFlagProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(isDismissAllowed)) __obj.updateDynamic("isDismissAllowed")(isDismissAllowed.asInstanceOf[js.Any])
    if (onDismissed != null) __obj.updateDynamic("onDismissed")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onDismissed(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atlaskitFeedbackCollector.mod.FeedbackFlagProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atlaskitFeedbackCollector.mod.FeedbackFlag](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atlaskitFeedbackCollector.mod.FeedbackFlagProps])(children: _*)
  }
  @JSImport("@atlaskit/feedback-collector", "FeedbackFlag")
  @js.native
  object componentImport extends js.Object
  
}

