package typingsJapgolly.dojo.dojox.app.utils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.dojox.app.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/utils/constraints.html
  *
  *
  */
trait constraints extends js.Object {
  /**
    * get current all selected children for this view and it's selected subviews
    *
    * @param view the View to get the child from
    * @param selChildren the Array of the subChildren found
    */
  def getAllSelectedChildren(view: View, selChildren: js.Array[_]): js.Any
  /**
    * get current selected child according to the constraint
    *
    * @param view the View to get the child from
    * @param constraint tbe constraint object
    */
  def getSelectedChild(view: View, constraint: js.Object): js.Any
  /**
    *
    * @param constraint
    */
  def register(constraint: js.Any): Unit
  /**
    * set current selected child according to the constraint
    *
    * @param view the View to set the selected child to
    * @param constraint tbe constraint object
    * @param child the child to select
    */
  def setSelectedChild(view: View, constraint: js.Object, child: View): Unit
}

object constraints {
  @scala.inline
  def apply(
    getAllSelectedChildren: (View, js.Array[js.Any]) => CallbackTo[js.Any],
    getSelectedChild: (View, js.Object) => CallbackTo[js.Any],
    register: js.Any => Callback,
    setSelectedChild: (View, js.Object, View) => Callback
  ): constraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllSelectedChildren")(js.Any.fromFunction2((t0: typingsJapgolly.dojo.dojox.app.View, t1: js.Array[js.Any]) => getAllSelectedChildren(t0, t1).runNow()))
    __obj.updateDynamic("getSelectedChild")(js.Any.fromFunction2((t0: typingsJapgolly.dojo.dojox.app.View, t1: js.Object) => getSelectedChild(t0, t1).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: js.Any) => register(t0).runNow()))
    __obj.updateDynamic("setSelectedChild")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.app.View, t1: js.Object, t2: typingsJapgolly.dojo.dojox.app.View) => setSelectedChild(t0, t1, t2).runNow()))
    __obj.asInstanceOf[constraints]
  }
}

