package typingsJapgolly.atlaskitFeedbackCollector.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atlaskitFeedbackCollector.mod.FeedbackFormProps
import typingsJapgolly.atlaskitFeedbackCollector.mod.FormFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedbackForm {
  def apply(
    onClose: Callback,
    onSubmit: FormFields => Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FeedbackFormProps, 
    typingsJapgolly.atlaskitFeedbackCollector.mod.FeedbackForm, 
    Unit, 
    FeedbackFormProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: typingsJapgolly.atlaskitFeedbackCollector.mod.FormFields) => onSubmit(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atlaskitFeedbackCollector.mod.FeedbackFormProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atlaskitFeedbackCollector.mod.FeedbackForm](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atlaskitFeedbackCollector.mod.FeedbackFormProps])(children: _*)
  }
  @JSImport("@atlaskit/feedback-collector", "FeedbackForm")
  @js.native
  object componentImport extends js.Object
  
}

