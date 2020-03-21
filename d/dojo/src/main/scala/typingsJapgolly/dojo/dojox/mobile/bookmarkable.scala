package typingsJapgolly.dojo.dojox.mobile

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.dijit.WidgetBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/bookmarkable.html
  *
  * Utilities to make the view transitions bookmarkable.
  *
  */
trait bookmarkable extends js.Object {
  /**
    * An array containing information about the transition.
    *
    */
  var transitionInfo: js.Array[_]
  /**
    * Adds transition information.
    *
    * @param fromViewId
    * @param toViewId
    * @param args
    */
  def addTransitionInfo(fromViewId: String, toViewId: String, args: js.Object): Unit
  /**
    * Searches for a starting view and a destination view.
    *
    * @param moveTo
    */
  def findTransitionViews(moveTo: String): js.Array[_]
  /**
    * Returns an array containing the transition information.
    *
    * @param fromViewId
    * @param toViewId
    */
  def getTransitionInfo(fromViewId: String, toViewId: String): js.Any
  /**
    * Analyzes the given hash (fragment id).
    * Given a comma-separated list of view IDs, this method
    * searches for a transition destination, and makes all the
    * views in the hash visible.
    *
    * @param fragIds
    */
  def handleFragIds(fragIds: String): js.Object
  /**
    * Updates the hash (fragment id) in the browser URL.
    * The hash value consists of one or more visible view ids
    * separated with commas.
    *
    * @param toView
    */
  def setFragIds(toView: WidgetBase): Unit
}

object bookmarkable {
  @scala.inline
  def apply(
    addTransitionInfo: (String, String, js.Object) => Callback,
    findTransitionViews: String => CallbackTo[js.Array[js.Any]],
    getTransitionInfo: (String, String) => CallbackTo[js.Any],
    handleFragIds: String => CallbackTo[js.Object],
    setFragIds: WidgetBase => Callback,
    transitionInfo: js.Array[_]
  ): bookmarkable = {
    val __obj = js.Dynamic.literal(transitionInfo = transitionInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("addTransitionInfo")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Object) => addTransitionInfo(t0, t1, t2).runNow()))
    __obj.updateDynamic("findTransitionViews")(js.Any.fromFunction1((t0: java.lang.String) => findTransitionViews(t0).runNow()))
    __obj.updateDynamic("getTransitionInfo")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => getTransitionInfo(t0, t1).runNow()))
    __obj.updateDynamic("handleFragIds")(js.Any.fromFunction1((t0: java.lang.String) => handleFragIds(t0).runNow()))
    __obj.updateDynamic("setFragIds")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dijit.WidgetBase) => setFragIds(t0).runNow()))
    __obj.asInstanceOf[bookmarkable]
  }
}

