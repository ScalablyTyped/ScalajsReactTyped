package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TQueries represent a collection of individual TQuery objects tracked in a given view. Most of the
  * methods on this interface are simple proxy methods to the corresponding functionality on TQuery.
  */
trait TQueries extends js.Object {
  /**
    * Returns the number of queries tracked in a given view.
    */
  var length: Double
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `elementEnd` on each and every TQuery.
    * @param tNode
    */
  def elementEnd(tNode: TNode): Unit
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `elementStart` on each and every TQuery.
    * @param tView
    * @param tNode
    */
  def elementStart(tView: TView, tNode: TNode): Unit
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `embeddedTView` on each and every TQuery.
    * @param tNode
    */
  def embeddedTView(tNode: TNode): TQueries | Null
  /**
    * Returns a TQuery instance for at the given index  in the queries array.
    * @param index
    */
  def getByIndex(index: Double): TQuery
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `template` on each and every TQuery.
    * @param tView
    * @param tNode
    */
  def template(tView: TView, tNode: TNode): Unit
  /**
    * Adds a new TQuery to a collection of queries tracked in a given view.
    * @param tQuery
    */
  def track(tQuery: TQuery): Unit
}

object TQueries {
  @scala.inline
  def apply(
    elementEnd: TNode => Callback,
    elementStart: (TView, TNode) => Callback,
    embeddedTView: TNode => CallbackTo[TQueries | Null],
    getByIndex: Double => CallbackTo[TQuery],
    length: Double,
    template: (TView, TNode) => Callback,
    track: TQuery => Callback
  ): TQueries = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("elementEnd")(js.Any.fromFunction1((t0: typingsJapgolly.angularCore.mod.TNode) => elementEnd(t0).runNow()))
    __obj.updateDynamic("elementStart")(js.Any.fromFunction2((t0: typingsJapgolly.angularCore.mod.TView, t1: typingsJapgolly.angularCore.mod.TNode) => elementStart(t0, t1).runNow()))
    __obj.updateDynamic("embeddedTView")(js.Any.fromFunction1((t0: typingsJapgolly.angularCore.mod.TNode) => embeddedTView(t0).runNow()))
    __obj.updateDynamic("getByIndex")(js.Any.fromFunction1((t0: scala.Double) => getByIndex(t0).runNow()))
    __obj.updateDynamic("template")(js.Any.fromFunction2((t0: typingsJapgolly.angularCore.mod.TView, t1: typingsJapgolly.angularCore.mod.TNode) => template(t0, t1).runNow()))
    __obj.updateDynamic("track")(js.Any.fromFunction1((t0: typingsJapgolly.angularCore.mod.TQuery) => track(t0).runNow()))
    __obj.asInstanceOf[TQueries]
  }
}

