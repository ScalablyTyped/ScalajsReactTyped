package typingsJapgolly.mockFs.itemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filesystem item.
  */
trait Item extends js.Object {
  /**  Returns whether the current user has execute permission. */
  def canExecute(): Boolean
  /** Returns whether the current user has read permission. */
  def canRead(): Boolean
  /** Returns whether the current user has write permission. */
  def canWrite(): Boolean
  /** Get access time. */
  def getATime(): js.Date
  /** Get birth time. */
  def getBirthtime(): js.Date
  /** Get change time. */
  def getCTime(): js.Date
  /** Get group id. */
  def getGid(): Double
  /** Get modification time. */
  def getMTime(): js.Date
  /** Get mode (permission only, e.g 0666). */
  def getMode(): Double
  /** Get item stats. */
  def getStats(): Stats
  /** Get user id. */
  def getUid(): Double
  /** Set access time. */
  def setATime(atime: js.Date): Unit
  /** Set birth time. */
  def setBirthtime(birthtime: js.Date): Unit
  /** Set change time. */
  def setCTime(ctime: js.Date): Unit
  /** Set group id. */
  def setGid(gid: Double): Unit
  /** Set modification time. */
  def setMTime(mtime: js.Date): Unit
  /** Set mode (permission only, e.g 0666). */
  def setMode(mode: Double): Unit
  /** Set user id. */
  def setUid(uid: Double): Unit
}

object Item {
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
    getStats: CallbackTo[Stats],
    getUid: CallbackTo[Double],
    setATime: js.Date => Callback,
    setBirthtime: js.Date => Callback,
    setCTime: js.Date => Callback,
    setGid: Double => Callback,
    setMTime: js.Date => Callback,
    setMode: Double => Callback,
    setUid: Double => Callback
  ): Item = {
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
    __obj.updateDynamic("getStats")(getStats.toJsFn)
    __obj.updateDynamic("getUid")(getUid.toJsFn)
    __obj.updateDynamic("setATime")(js.Any.fromFunction1((t0: js.Date) => setATime(t0).runNow()))
    __obj.updateDynamic("setBirthtime")(js.Any.fromFunction1((t0: js.Date) => setBirthtime(t0).runNow()))
    __obj.updateDynamic("setCTime")(js.Any.fromFunction1((t0: js.Date) => setCTime(t0).runNow()))
    __obj.updateDynamic("setGid")(js.Any.fromFunction1((t0: scala.Double) => setGid(t0).runNow()))
    __obj.updateDynamic("setMTime")(js.Any.fromFunction1((t0: js.Date) => setMTime(t0).runNow()))
    __obj.updateDynamic("setMode")(js.Any.fromFunction1((t0: scala.Double) => setMode(t0).runNow()))
    __obj.updateDynamic("setUid")(js.Any.fromFunction1((t0: scala.Double) => setUid(t0).runNow()))
    __obj.asInstanceOf[Item]
  }
}

