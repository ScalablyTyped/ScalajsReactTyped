package typingsJapgolly.atAngularCore.atAngularCoreMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * lQueries represent a collection of individual LQuery objects tracked in a given view.
  */
trait LQueries extends js.Object {
  /**
    * A collection of queries tracked in a given view.
    */
  var queries: js.Array[LQuery[_]]
  /**
    * A method called when a new embedded view is created. As a result a set of LQueries applicable
    * for a new embedded view is instantiated (cloned) from the declaration view.
    * @param tView
    */
  def createEmbeddedView(tView: TView): LQueries | Null
  /**
    * A method called when an embedded view is detached from a container. As a result all impacted
    * `LQuery` objects (and associated `QueryList`) are marked as dirty.
    * @param tView
    */
  def detachView(tView: TView): Unit
  /**
    * A method called when an embedded view is inserted into a container. As a result all impacted
    * `LQuery` objects (and associated `QueryList`) are marked as dirty.
    * @param tView
    */
  def insertView(tView: TView): Unit
}

object LQueries {
  @scala.inline
  def apply(
    createEmbeddedView: TView => CallbackTo[LQueries | Null],
    detachView: TView => Callback,
    insertView: TView => Callback,
    queries: js.Array[LQuery[_]]
  ): LQueries = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
    __obj.updateDynamic("createEmbeddedView")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.atAngularCoreMod.TView) => createEmbeddedView(t0).runNow()))
    __obj.updateDynamic("detachView")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.atAngularCoreMod.TView) => detachView(t0).runNow()))
    __obj.updateDynamic("insertView")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.atAngularCoreMod.TView) => insertView(t0).runNow()))
    __obj.asInstanceOf[LQueries]
  }
}

