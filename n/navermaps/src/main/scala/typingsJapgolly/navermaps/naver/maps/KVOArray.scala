package typingsJapgolly.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.KVOArray")
@js.native
class KVOArray protected () extends KVO {
  def this(array: js.Array[_]) = this()
  def clear(): Unit = js.native
  def forEach(callback: js.Function2[/* element */ js.Any, /* index */ Double, Unit]): Unit = js.native
  def getArray(): js.Array[_] = js.native
  def getAt(index: Double): js.Any = js.native
  def getIndexOfElement(element: js.Any): Double = js.native
  def getLength(): Double = js.native
  def insertAt(index: Double, element: js.Any): Unit = js.native
  def pop(): js.Any = js.native
  def push(element: js.Any): Double = js.native
  def removeAt(index: Double): js.Any = js.native
  def removeElement(element: js.Any): Unit = js.native
  def setAt(index: Double, element: js.Any): Unit = js.native
  def splice(startIndex: Double, deleteCount: Double): js.Array[_] = js.native
  def splice(startIndex: Double, deleteCount: Double, element: js.Any): js.Array[_] = js.native
}

