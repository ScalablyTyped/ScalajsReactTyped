package typingsJapgolly.ol.linkedListMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedList extends js.Object {
  def concat(list: LinkedList): Unit
  def firstItem(): js.Any
  def getCurrItem(): js.Any
  def getLength(): Double
  def getNextItem(): js.Any
  def getPrevItem(): js.Any
  def insertItem(data: js.Any): Unit
  def lastItem(): js.Any
  def nextItem(): js.Any
  def prevItem(): js.Any
  def removeItem(): Unit
  def setFirstItem(): Unit
}

object LinkedList {
  @scala.inline
  def apply(
    concat: LinkedList => Callback,
    firstItem: CallbackTo[js.Any],
    getCurrItem: CallbackTo[js.Any],
    getLength: CallbackTo[Double],
    getNextItem: CallbackTo[js.Any],
    getPrevItem: CallbackTo[js.Any],
    insertItem: js.Any => Callback,
    lastItem: CallbackTo[js.Any],
    nextItem: CallbackTo[js.Any],
    prevItem: CallbackTo[js.Any],
    removeItem: Callback,
    setFirstItem: Callback
  ): LinkedList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("concat")(js.Any.fromFunction1((t0: typingsJapgolly.ol.linkedListMod.LinkedList) => concat(t0).runNow()))
    __obj.updateDynamic("firstItem")(firstItem.toJsFn)
    __obj.updateDynamic("getCurrItem")(getCurrItem.toJsFn)
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getNextItem")(getNextItem.toJsFn)
    __obj.updateDynamic("getPrevItem")(getPrevItem.toJsFn)
    __obj.updateDynamic("insertItem")(js.Any.fromFunction1((t0: js.Any) => insertItem(t0).runNow()))
    __obj.updateDynamic("lastItem")(lastItem.toJsFn)
    __obj.updateDynamic("nextItem")(nextItem.toJsFn)
    __obj.updateDynamic("prevItem")(prevItem.toJsFn)
    __obj.updateDynamic("removeItem")(removeItem.toJsFn)
    __obj.updateDynamic("setFirstItem")(setFirstItem.toJsFn)
    __obj.asInstanceOf[LinkedList]
  }
}

