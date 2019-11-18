package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an immutable snapshot of a script at a specified time.Once acquired, the
  * snapshot is observably immutable. i.e. the same calls with the same parameters will return
  * the same values.
  */
trait IScriptSnapshot extends js.Object {
  /** Releases all resources held by this script snapshot */
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Gets the TextChangeRange that describe how the text changed between this text and
    * an older version.  This information is used by the incremental parser to determine
    * what sections of the script need to be re-parsed.  'undefined' can be returned if the
    * change range cannot be determined.  However, in that case, incremental parsing will
    * not happen and the entire document will be re - parsed.
    */
  def getChangeRange(oldSnapshot: IScriptSnapshot): js.UndefOr[TextChangeRange]
  /** Gets the length of this script snapshot. */
  def getLength(): Double
  /** Gets a portion of the script snapshot specified by [start, end). */
  def getText(start: Double, end: Double): String
}

object IScriptSnapshot {
  @scala.inline
  def apply(
    getChangeRange: IScriptSnapshot => CallbackTo[js.UndefOr[TextChangeRange]],
    getLength: CallbackTo[Double],
    getText: (Double, Double) => CallbackTo[String],
    dispose: js.UndefOr[Callback] = js.undefined
  ): IScriptSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getChangeRange")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.typescriptMod.IScriptSnapshot) => getChangeRange(t0).runNow()))
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getText")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getText(t0, t1).runNow()))
    dispose.foreach(p => __obj.updateDynamic("dispose")(p.toJsFn))
    __obj.asInstanceOf[IScriptSnapshot]
  }
}

