package typingsJapgolly.dojo.dojox.collections

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/collections/_base.html
  *
  *
  */
trait base extends js.Object {
  /**
    *
    */
  var Set: js.Object
  /**
    * Returns a new object of type dojox.collections.ArrayList
    *
    * @param arr               Optional
    */
  def ArrayList(arr: js.Array[_]): Unit
  /**
    *
    * @param data
    */
  def BinaryTree(data: js.Any): Unit
  /**
    * Returns an object of type dojox.collections.Dictionary
    *
    * @param dictionary               Optional
    */
  def Dictionary(dictionary: typingsJapgolly.dojo.dojox.collections.Dictionary): Unit
  /**
    * return an object of type dojox.collections.DictionaryEntry
    *
    * @param k
    * @param v
    */
  def DictionaryEntry(k: String, v: js.Object): Unit
  /**
    * return an object of type dojox.collections.DictionaryIterator
    *
    * @param obj
    */
  def DictionaryIterator(obj: js.Object): Unit
  /**
    * return an object of type dojox.collections.Iterator
    *
    * @param a
    */
  def Iterator(a: js.Array[_]): Unit
  /**
    * return an object of type dojox.collections.Queue
    *
    * @param arr               Optional
    */
  def Queue(arr: js.Array[_]): Unit
  /**
    * creates a collection that acts like a dictionary but is also internally sorted.
    * Note that the act of adding any elements forces an internal resort, making this object potentially slow.
    *
    * @param dictionary               Optional
    */
  def SortedList(dictionary: js.Object): Unit
  /**
    * returns an object of type dojox.collections.Stack
    *
    * @param arr               Optional
    */
  def Stack(arr: js.Array[_]): Unit
}

object base {
  @scala.inline
  def apply(
    ArrayList: js.Array[js.Any] => Callback,
    BinaryTree: js.Any => Callback,
    Dictionary: Dictionary => Callback,
    DictionaryEntry: (String, js.Object) => Callback,
    DictionaryIterator: js.Object => Callback,
    Iterator: js.Array[js.Any] => Callback,
    Queue: js.Array[js.Any] => Callback,
    Set: js.Object,
    SortedList: js.Object => Callback,
    Stack: js.Array[js.Any] => Callback
  ): base = {
    val __obj = js.Dynamic.literal(Set = Set.asInstanceOf[js.Any])
    __obj.updateDynamic("ArrayList")(js.Any.fromFunction1((t0: js.Array[js.Any]) => ArrayList(t0).runNow()))
    __obj.updateDynamic("BinaryTree")(js.Any.fromFunction1((t0: js.Any) => BinaryTree(t0).runNow()))
    __obj.updateDynamic("Dictionary")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.collections.Dictionary) => Dictionary(t0).runNow()))
    __obj.updateDynamic("DictionaryEntry")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => DictionaryEntry(t0, t1).runNow()))
    __obj.updateDynamic("DictionaryIterator")(js.Any.fromFunction1((t0: js.Object) => DictionaryIterator(t0).runNow()))
    __obj.updateDynamic("Iterator")(js.Any.fromFunction1((t0: js.Array[js.Any]) => Iterator(t0).runNow()))
    __obj.updateDynamic("Queue")(js.Any.fromFunction1((t0: js.Array[js.Any]) => Queue(t0).runNow()))
    __obj.updateDynamic("SortedList")(js.Any.fromFunction1((t0: js.Object) => SortedList(t0).runNow()))
    __obj.updateDynamic("Stack")(js.Any.fromFunction1((t0: js.Array[js.Any]) => Stack(t0).runNow()))
    __obj.asInstanceOf[base]
  }
}

