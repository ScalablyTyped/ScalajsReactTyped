package typingsJapgolly.semanticUiProgress

import typingsJapgolly.semanticUiProgress.SemanticUI.Progress
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.ClassNameSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.ErrorSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.MetadataSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.RandomSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.RegExpSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.SelectorSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.TextSettings
import typingsJapgolly.semanticUiProgress.SemanticUI.ProgressSettings
import typingsJapgolly.semanticUiProgress.semanticUiProgressBooleans.`false`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`get normalized value`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`get percent`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`get text`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`get total`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`get value`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`is active`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`is complete`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`is error`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`is success`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`is warning`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`remove active`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`remove error`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`remove success`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`remove warning`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`set active`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`set bar label`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`set duration`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`set error`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`set label`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`set percent`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`set progress`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`set success`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`set total`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`set warning`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.`update progress`
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.autoSuccess
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.className
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.complete
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.debug
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.decrement
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.destroy
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.error
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.increment
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.label
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.limitValues
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.metadata
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.name
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.namespace
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.onActive
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.onChange
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.onError
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.onSuccess
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.onWarning
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.percent
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.performance
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.precision
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.random
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.ratio
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.regExp
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.reset
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.selector
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.setting
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.showActivity
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.silent
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.text
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.total
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.value
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("progress")
  var progress_Original: Progress = js.native
  def progress(): JQuery = js.native
  def progress(behavior: setting, name: autoSuccess): Boolean = js.native
  def progress(behavior: setting, name: autoSuccess, value: Boolean): JQuery = js.native
  def progress(behavior: setting, name: className): ClassNameSettings = js.native
  def progress(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def progress(behavior: setting, name: debug): Boolean = js.native
  def progress(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def progress(behavior: setting, name: error): ErrorSettings = js.native
  def progress(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def progress(behavior: setting, name: label): percent | ratio = js.native
  def progress(behavior: setting, name: label, value: percent): JQuery = js.native
  def progress(behavior: setting, name: label, value: ratio): JQuery = js.native
  def progress(behavior: setting, name: limitValues): Boolean = js.native
  def progress(behavior: setting, name: limitValues, value: Boolean): JQuery = js.native
  def progress(behavior: setting, name: metadata): MetadataSettings = js.native
  def progress(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def progress(behavior: setting, name: name): String = js.native
  def progress(behavior: setting, name: namespace): String = js.native
  def progress(behavior: setting, name: namespace, value: String): JQuery = js.native
  def progress(behavior: setting, name: name, value: String): JQuery = js.native
  def progress(behavior: setting, name: onActive): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
  def progress(
    behavior: setting,
    name: onActive,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def progress(behavior: setting, name: onChange): js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit] = js.native
  def progress(
    behavior: setting,
    name: onChange,
    value: js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def progress(behavior: setting, name: onError): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
  def progress(
    behavior: setting,
    name: onError,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def progress(behavior: setting, name: onSuccess): js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit] = js.native
  def progress(
    behavior: setting,
    name: onSuccess,
    value: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]
  ): JQuery = js.native
  def progress(behavior: setting, name: onWarning): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
  def progress(
    behavior: setting,
    name: onWarning,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def progress(behavior: setting, name: performance): Boolean = js.native
  def progress(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def progress(behavior: setting, name: precision): Double = js.native
  def progress(behavior: setting, name: precision, value: Double): JQuery = js.native
  def progress(behavior: setting, name: random): RandomSettings = js.native
  def progress(behavior: setting, name: random, value: RandomSettings): JQuery = js.native
  def progress(behavior: setting, name: regExp): RegExpSettings = js.native
  def progress(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def progress(behavior: setting, name: selector): SelectorSettings = js.native
  def progress(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def progress(behavior: setting, name: showActivity): Boolean = js.native
  def progress(behavior: setting, name: showActivity, value: Boolean): JQuery = js.native
  def progress(behavior: setting, name: silent): Boolean = js.native
  def progress(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def progress(behavior: setting, name: text): TextSettings = js.native
  def progress(behavior: setting, name: text, value: TextSettings): JQuery = js.native
  def progress(behavior: setting, name: total): `false` | Double = js.native
  def progress(behavior: setting, name: total, value: Double): JQuery = js.native
  def progress(behavior: setting, name: total, value: `false`): JQuery = js.native
  def progress(behavior: setting, name: value): `false` | Double = js.native
  def progress(behavior: setting, name: value, value: Double): JQuery = js.native
  def progress(behavior: setting, name: value, value: `false`): JQuery = js.native
  def progress(behavior: setting, name: verbose): Boolean = js.native
  def progress(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def progress(settings: ProgressSettings): JQuery = js.native
  /**
    * Finishes progress and sets loaded to 100%
    */
  @JSName("progress")
  def progress_complete(behavior: complete): JQuery = js.native
  /**
    * Decrements progress by decrement value, if not passed a value will use random amount specified in settings
    */
  @JSName("progress")
  def progress_decrement(behavior: decrement): JQuery = js.native
  @JSName("progress")
  def progress_decrement(behavior: decrement, decrementValue: Double): JQuery = js.native
  @JSName("progress")
  def progress_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns normalized value inside acceptable range specified by total.
    */
  @JSName("progress")
  def progress_getnormalizedvalue(behavior: `get normalized value`, value: Double): Double = js.native
  /**
    * Returns percent as last specified
    */
  @JSName("progress")
  def progress_getpercent(behavior: `get percent`): Double = js.native
  /**
    * Replaces templated string with value, total, percent left and percent.
    */
  @JSName("progress")
  def progress_gettext(behavior: `get text`, text: String): String = js.native
  /**
    * Returns total
    */
  @JSName("progress")
  def progress_gettotal(behavior: `get total`): Double = js.native
  /**
    * Returns current progress value
    */
  @JSName("progress")
  def progress_getvalue(behavior: `get value`): Double = js.native
  /**
    * Increments progress by increment value, if not passed a value will use random amount specified in settings
    */
  @JSName("progress")
  def progress_increment(behavior: increment): JQuery = js.native
  @JSName("progress")
  def progress_increment(behavior: increment, incrementValue: Double): JQuery = js.native
  /**
    * Returns whether progress is in active state
    */
  @JSName("progress")
  def progress_isactive(behavior: `is active`): Boolean = js.native
  /**
    * Returns whether progress is completed
    */
  @JSName("progress")
  def progress_iscomplete(behavior: `is complete`): Boolean = js.native
  /**
    * Returns whether progress is in error state
    */
  @JSName("progress")
  def progress_iserror(behavior: `is error`): Boolean = js.native
  /**
    * Returns whether progress was a success
    */
  @JSName("progress")
  def progress_issuccess(behavior: `is success`): Boolean = js.native
  /**
    * Returns whether progress is in warning state
    */
  @JSName("progress")
  def progress_iswarning(behavior: `is warning`): Boolean = js.native
  /**
    * Removes progress to active state
    */
  @JSName("progress")
  def progress_removeactive(behavior: `remove active`): JQuery = js.native
  /**
    * Removes progress to error state
    */
  @JSName("progress")
  def progress_removeerror(behavior: `remove error`): JQuery = js.native
  /**
    * Removes progress to success state
    */
  @JSName("progress")
  def progress_removesuccess(behavior: `remove success`): JQuery = js.native
  /**
    * Removes progress to warning state
    */
  @JSName("progress")
  def progress_removewarning(behavior: `remove warning`): JQuery = js.native
  /**
    * Resets progress to zero
    */
  @JSName("progress")
  def progress_reset(behavior: reset): JQuery = js.native
  /**
    * Sets progress to active state
    */
  @JSName("progress")
  def progress_setactive(behavior: `set active`): JQuery = js.native
  /**
    * Sets progress bar label to text
    */
  @JSName("progress")
  def progress_setbarlabel(behavior: `set bar label`, text: String): JQuery = js.native
  /**
    * Changes progress animation speed
    */
  @JSName("progress")
  def progress_setduration(behavior: `set duration`, value: Double): JQuery = js.native
  /**
    * Sets progress to error state
    */
  @JSName("progress")
  def progress_seterror(behavior: `set error`): JQuery = js.native
  /**
    * Sets progress exterior label to text
    */
  @JSName("progress")
  def progress_setlabel(behavior: `set label`, text: String): JQuery = js.native
  /**
    * Sets current percent of progress to value. If using a total will convert from percent to estimated value.
    */
  @JSName("progress")
  def progress_setpercent(behavior: `set percent`, percent: Double): JQuery = js.native
  /**
    * Sets progress to specified value. Will automatically calculate percent from total.
    */
  @JSName("progress")
  def progress_setprogress(behavior: `set progress`, value: Double): JQuery = js.native
  /**
    * Sets progress to success state
    */
  @JSName("progress")
  def progress_setsuccess(behavior: `set success`): JQuery = js.native
  @JSName("progress")
  def progress_setting(behavior: setting, value: ProgressSettings): JQuery = js.native
  /**
    * Set total to a new value
    */
  @JSName("progress")
  def progress_settotal(behavior: `set total`, total: Double): JQuery = js.native
  /**
    * Sets progress to warning state
    */
  @JSName("progress")
  def progress_setwarning(behavior: `set warning`): JQuery = js.native
  /**
    * Immediately updates progress to value, ignoring progress animation interval delays
    */
  @JSName("progress")
  def progress_updateprogress(behavior: `update progress`, value: Double): JQuery = js.native
}

