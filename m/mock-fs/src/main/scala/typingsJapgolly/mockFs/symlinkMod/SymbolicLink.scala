package typingsJapgolly.mockFs.symlinkMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mockFs.itemMod.Item
import typingsJapgolly.mockFs.itemMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolicLink extends Item {
  /** Get the path (relative) to the source. */
  def getPath(): String
  /** Sets the path (relative) to the source. */
  def setPath(pathname: String): Unit
}

object SymbolicLink {
  @scala.inline
  def apply(
    canExecute: CallbackTo[Boolean],
    canRead: CallbackTo[Boolean],
    canWrite: CallbackTo[Boolean],
    getATime: CallbackTo[js.Date],
    getBirthtime: CallbackTo[js.Date],
    getCTime: CallbackTo[js.Date],
    getGid: CallbackTo[Double],
    getMTime: CallbackTo[js.Date],
    getMode: CallbackTo[Double],
    getPath: CallbackTo[String],
    getStats: CallbackTo[Stats],
    getUid: CallbackTo[Double],
    setATime: js.Date => Callback,
    setBirthtime: js.Date => Callback,
    setCTime: js.Date => Callback,
    setGid: Double => Callback,
    setMTime: js.Date => Callback,
    setMode: Double => Callback,
    setPath: String => Callback,
    setUid: Double => Callback
  ): SymbolicLink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canExecute")(canExecute.toJsFn)
    __obj.updateDynamic("canRead")(canRead.toJsFn)
    __obj.updateDynamic("canWrite")(canWrite.toJsFn)
    __obj.updateDynamic("getATime")(getATime.toJsFn)
    __obj.updateDynamic("getBirthtime")(getBirthtime.toJsFn)
    __obj.updateDynamic("getCTime")(getCTime.toJsFn)
    __obj.updateDynamic("getGid")(getGid.toJsFn)
    __obj.updateDynamic("getMTime")(getMTime.toJsFn)
    __obj.updateDynamic("getMode")(getMode.toJsFn)
    __obj.updateDynamic("getPath")(getPath.toJsFn)
    __obj.updateDynamic("getStats")(getStats.toJsFn)
    __obj.updateDynamic("getUid")(getUid.toJsFn)
    __obj.updateDynamic("setATime")(js.Any.fromFunction1((t0: js.Date) => setATime(t0).runNow()))
    __obj.updateDynamic("setBirthtime")(js.Any.fromFunction1((t0: js.Date) => setBirthtime(t0).runNow()))
    __obj.updateDynamic("setCTime")(js.Any.fromFunction1((t0: js.Date) => setCTime(t0).runNow()))
    __obj.updateDynamic("setGid")(js.Any.fromFunction1((t0: scala.Double) => setGid(t0).runNow()))
    __obj.updateDynamic("setMTime")(js.Any.fromFunction1((t0: js.Date) => setMTime(t0).runNow()))
    __obj.updateDynamic("setMode")(js.Any.fromFunction1((t0: scala.Double) => setMode(t0).runNow()))
    __obj.updateDynamic("setPath")(js.Any.fromFunction1((t0: java.lang.String) => setPath(t0).runNow()))
    __obj.updateDynamic("setUid")(js.Any.fromFunction1((t0: scala.Double) => setUid(t0).runNow()))
    __obj.asInstanceOf[SymbolicLink]
  }
}

