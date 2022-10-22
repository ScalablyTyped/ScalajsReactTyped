package typingsJapgolly.semanticUiProgress

import typingsJapgolly.semanticUiProgress.SemanticUI.Progress
import typingsJapgolly.semanticUiProgress.SemanticUI.ProgressSettings
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
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.complete
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.decrement
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.destroy
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.increment
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.reset
import typingsJapgolly.semanticUiProgress.semanticUiProgressStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def progress(): JQuery
  def progress(settings: ProgressSettings): JQuery
  @JSName("progress")
  var progress_Original: Progress
  /**
    * Finishes progress and sets loaded to 100%
    */
  @JSName("progress")
  def progress_complete(behavior: complete): JQuery
  /**
    * Decrements progress by decrement value, if not passed a value will use random amount specified in settings
    */
  @JSName("progress")
  def progress_decrement(behavior: decrement): JQuery
  @JSName("progress")
  def progress_decrement(behavior: decrement, decrementValue: Double): JQuery
  @JSName("progress")
  def progress_destroy(behavior: destroy): JQuery
  /**
    * Returns normalized value inside acceptable range specified by total.
    */
  @JSName("progress")
  def progress_getnormalizedvalue(behavior: `get normalized value`, value: Double): Double
  /**
    * Returns percent as last specified
    */
  @JSName("progress")
  def progress_getpercent(behavior: `get percent`): Double
  /**
    * Replaces templated string with value, total, percent left and percent.
    */
  @JSName("progress")
  def progress_gettext(behavior: `get text`, text: String): String
  /**
    * Returns total
    */
  @JSName("progress")
  def progress_gettotal(behavior: `get total`): Double
  /**
    * Returns current progress value
    */
  @JSName("progress")
  def progress_getvalue(behavior: `get value`): Double
  /**
    * Increments progress by increment value, if not passed a value will use random amount specified in settings
    */
  @JSName("progress")
  def progress_increment(behavior: increment): JQuery
  @JSName("progress")
  def progress_increment(behavior: increment, incrementValue: Double): JQuery
  /**
    * Returns whether progress is in active state
    */
  @JSName("progress")
  def progress_isactive(behavior: `is active`): Boolean
  /**
    * Returns whether progress is completed
    */
  @JSName("progress")
  def progress_iscomplete(behavior: `is complete`): Boolean
  /**
    * Returns whether progress is in error state
    */
  @JSName("progress")
  def progress_iserror(behavior: `is error`): Boolean
  /**
    * Returns whether progress was a success
    */
  @JSName("progress")
  def progress_issuccess(behavior: `is success`): Boolean
  /**
    * Returns whether progress is in warning state
    */
  @JSName("progress")
  def progress_iswarning(behavior: `is warning`): Boolean
  /**
    * Removes progress to active state
    */
  @JSName("progress")
  def progress_removeactive(behavior: `remove active`): JQuery
  /**
    * Removes progress to error state
    */
  @JSName("progress")
  def progress_removeerror(behavior: `remove error`): JQuery
  /**
    * Removes progress to success state
    */
  @JSName("progress")
  def progress_removesuccess(behavior: `remove success`): JQuery
  /**
    * Removes progress to warning state
    */
  @JSName("progress")
  def progress_removewarning(behavior: `remove warning`): JQuery
  /**
    * Resets progress to zero
    */
  @JSName("progress")
  def progress_reset(behavior: reset): JQuery
  /**
    * Sets progress to active state
    */
  @JSName("progress")
  def progress_setactive(behavior: `set active`): JQuery
  /**
    * Sets progress bar label to text
    */
  @JSName("progress")
  def progress_setbarlabel(behavior: `set bar label`, text: String): JQuery
  /**
    * Changes progress animation speed
    */
  @JSName("progress")
  def progress_setduration(behavior: `set duration`, value: Double): JQuery
  /**
    * Sets progress to error state
    */
  @JSName("progress")
  def progress_seterror(behavior: `set error`): JQuery
  /**
    * Sets progress exterior label to text
    */
  @JSName("progress")
  def progress_setlabel(behavior: `set label`, text: String): JQuery
  /**
    * Sets current percent of progress to value. If using a total will convert from percent to estimated value.
    */
  @JSName("progress")
  def progress_setpercent(behavior: `set percent`, percent: Double): JQuery
  /**
    * Sets progress to specified value. Will automatically calculate percent from total.
    */
  @JSName("progress")
  def progress_setprogress(behavior: `set progress`, value: Double): JQuery
  /**
    * Sets progress to success state
    */
  @JSName("progress")
  def progress_setsuccess(behavior: `set success`): JQuery
  @JSName("progress")
  def progress_setting(behavior: setting, value: ProgressSettings): JQuery
  @JSName("progress")
  def progress_setting[K /* <: /* keyof semantic-ui-progress.SemanticUI.ProgressSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-progress.SemanticUI.ProgressSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("progress")
  def progress_setting[K /* <: /* keyof semantic-ui-progress.SemanticUI.ProgressSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-progress.SemanticUI.ProgressSettings._Impl[K] */ js.Any
  /**
    * Set total to a new value
    */
  @JSName("progress")
  def progress_settotal(behavior: `set total`, total: Double): JQuery
  /**
    * Sets progress to warning state
    */
  @JSName("progress")
  def progress_setwarning(behavior: `set warning`): JQuery
  /**
    * Immediately updates progress to value, ignoring progress animation interval delays
    */
  @JSName("progress")
  def progress_updateprogress(behavior: `update progress`, value: Double): JQuery
}
object JQuery {
  
  inline def apply(progress: Progress): JQuery = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setProgress(value: Progress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
