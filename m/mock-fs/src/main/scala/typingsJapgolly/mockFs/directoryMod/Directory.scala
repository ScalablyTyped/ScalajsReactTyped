package typingsJapgolly.mockFs.directoryMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mockFs.itemMod.Item
import typingsJapgolly.mockFs.itemMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directory extends Item {
  /**
    * Add an item to the directory.
    * @param name The name to give the item.
    * @param item The item to add.
    * @return The added item.
    */
  def addItem[T /* <: typingsJapgolly.mockFs.itemMod.^ */](name: String, item: T): T
  /** Get a named item (or null if none). */
  def getItem(name: String): typingsJapgolly.mockFs.itemMod.^  | Null
  /** Get sorted list of item names in this directory. */
  def list(): js.Array[String]
  /**
    * Remove an item. Will throw an error if not present.
    *
    * @param name Name of the item to remove.
    * @return The orphan item.
    */
  def removeItem(name: String): typingsJapgolly.mockFs.itemMod.^
}

object Directory {
  @scala.inline
  def apply(
    addItem: (String, js.Any) => CallbackTo[js.Any],
    canExecute: CallbackTo[Boolean],
    canRead: CallbackTo[Boolean],
    canWrite: CallbackTo[Boolean],
    getATime: CallbackTo[js.Date],
    getBirthtime: CallbackTo[js.Date],
    getCTime: CallbackTo[js.Date],
    getGid: CallbackTo[Double],
    getItem: String => CallbackTo[typingsJapgolly.mockFs.itemMod.^  | Null],
    getMTime: CallbackTo[js.Date],
    getMode: CallbackTo[Double],
    getStats: CallbackTo[Stats],
    getUid: CallbackTo[Double],
    list: CallbackTo[js.Array[String]],
    removeItem: String => CallbackTo[typingsJapgolly.mockFs.itemMod.^],
    setATime: js.Date => Callback,
    setBirthtime: js.Date => Callback,
    setCTime: js.Date => Callback,
    setGid: Double => Callback,
    setMTime: js.Date => Callback,
    setMode: Double => Callback,
    setUid: Double => Callback
  ): Directory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addItem")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => addItem(t0, t1).runNow()))
    __obj.updateDynamic("canExecute")(canExecute.toJsFn)
    __obj.updateDynamic("canRead")(canRead.toJsFn)
    __obj.updateDynamic("canWrite")(canWrite.toJsFn)
    __obj.updateDynamic("getATime")(getATime.toJsFn)
    __obj.updateDynamic("getBirthtime")(getBirthtime.toJsFn)
    __obj.updateDynamic("getCTime")(getCTime.toJsFn)
    __obj.updateDynamic("getGid")(getGid.toJsFn)
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: java.lang.String) => getItem(t0).runNow()))
    __obj.updateDynamic("getMTime")(getMTime.toJsFn)
    __obj.updateDynamic("getMode")(getMode.toJsFn)
    __obj.updateDynamic("getStats")(getStats.toJsFn)
    __obj.updateDynamic("getUid")(getUid.toJsFn)
    __obj.updateDynamic("list")(list.toJsFn)
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: java.lang.String) => removeItem(t0).runNow()))
    __obj.updateDynamic("setATime")(js.Any.fromFunction1((t0: js.Date) => setATime(t0).runNow()))
    __obj.updateDynamic("setBirthtime")(js.Any.fromFunction1((t0: js.Date) => setBirthtime(t0).runNow()))
    __obj.updateDynamic("setCTime")(js.Any.fromFunction1((t0: js.Date) => setCTime(t0).runNow()))
    __obj.updateDynamic("setGid")(js.Any.fromFunction1((t0: scala.Double) => setGid(t0).runNow()))
    __obj.updateDynamic("setMTime")(js.Any.fromFunction1((t0: js.Date) => setMTime(t0).runNow()))
    __obj.updateDynamic("setMode")(js.Any.fromFunction1((t0: scala.Double) => setMode(t0).runNow()))
    __obj.updateDynamic("setUid")(js.Any.fromFunction1((t0: scala.Double) => setUid(t0).runNow()))
    __obj.asInstanceOf[Directory]
  }
}

