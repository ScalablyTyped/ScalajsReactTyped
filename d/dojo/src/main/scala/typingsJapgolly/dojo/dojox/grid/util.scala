package typingsJapgolly.dojo.dojox.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/util.html
  *
  * grid utility library
  *
  */
trait util extends js.Object {
  /**
    *
    */
  var gridViewTag: String
  /**
    *
    */
  var keyEvents: js.Array[_]
  /**
    *
    */
  var mouseEvents: js.Array[_]
  /**
    *
    */
  var na: String
  /**
    *
    */
  var rowIndexTag: String
  /**
    *
    * @param inA
    * @param inB
    */
  def arrayCompare(inA: js.Any, inB: js.Any): Unit
  /**
    *
    * @param inArray
    * @param inIndex
    * @param inValue
    */
  def arrayInsert(inArray: js.Any, inIndex: js.Any, inValue: js.Any): Unit
  /**
    *
    * @param inArray
    * @param inIndex
    */
  def arrayRemove(inArray: js.Any, inIndex: js.Any): Unit
  /**
    *
    * @param inArray
    * @param inI
    * @param inJ
    */
  def arraySwap(inArray: js.Any, inI: js.Any, inJ: js.Any): Unit
  /**
    *
    * @param ob
    * @param ev
    * @param args
    */
  def fire(ob: js.Any, ev: js.Any, args: js.Any): js.Any
  /**
    *
    * @param inNode
    * @param inObject
    * @param inMethod
    * @param inEvents
    */
  def funnelEvents(inNode: js.Any, inObject: js.Any, inMethod: js.Any, inEvents: js.Any): Unit
  /**
    *
    * @param inNode
    */
  def removeNode(inNode: js.Any): js.Any
  /**
    *
    * @param inElement
    * @param inHeight
    */
  def setStyleHeightPx(inElement: js.Any, inHeight: js.Any): Unit
}

object util {
  @scala.inline
  def apply(
    arrayCompare: (js.Any, js.Any) => Callback,
    arrayInsert: (js.Any, js.Any, js.Any) => Callback,
    arrayRemove: (js.Any, js.Any) => Callback,
    arraySwap: (js.Any, js.Any, js.Any) => Callback,
    fire: (js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    funnelEvents: (js.Any, js.Any, js.Any, js.Any) => Callback,
    gridViewTag: String,
    keyEvents: js.Array[_],
    mouseEvents: js.Array[_],
    na: String,
    removeNode: js.Any => CallbackTo[js.Any],
    rowIndexTag: String,
    setStyleHeightPx: (js.Any, js.Any) => Callback
  ): util = {
    val __obj = js.Dynamic.literal(gridViewTag = gridViewTag.asInstanceOf[js.Any], keyEvents = keyEvents.asInstanceOf[js.Any], mouseEvents = mouseEvents.asInstanceOf[js.Any], na = na.asInstanceOf[js.Any], rowIndexTag = rowIndexTag.asInstanceOf[js.Any])
    __obj.updateDynamic("arrayCompare")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => arrayCompare(t0, t1).runNow()))
    __obj.updateDynamic("arrayInsert")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => arrayInsert(t0, t1, t2).runNow()))
    __obj.updateDynamic("arrayRemove")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => arrayRemove(t0, t1).runNow()))
    __obj.updateDynamic("arraySwap")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => arraySwap(t0, t1, t2).runNow()))
    __obj.updateDynamic("fire")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => fire(t0, t1, t2).runNow()))
    __obj.updateDynamic("funnelEvents")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => funnelEvents(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("removeNode")(js.Any.fromFunction1((t0: js.Any) => removeNode(t0).runNow()))
    __obj.updateDynamic("setStyleHeightPx")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => setStyleHeightPx(t0, t1).runNow()))
    __obj.asInstanceOf[util]
  }
}

