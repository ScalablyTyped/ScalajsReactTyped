package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeFirebase.AnonPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSnapshot extends js.Object {
  var key: String | Null
  var ref: Reference
  def child(path: String): DataSnapshot
  def exists(): Boolean
  def exportVal(): AnonPriority
  def forEach(action: js.Function1[/* a */ this.type, Boolean]): Boolean
  def getPriority(): String | Double | Null
  def hasChild(path: String): Boolean
  def hasChildren(): Boolean
  def numChildren(): Double
  def toJSON(): js.Object | Null
  def `val`(): js.Any
}

object DataSnapshot {
  @scala.inline
  def apply(
    child: String => CallbackTo[DataSnapshot],
    exists: CallbackTo[Boolean],
    exportVal: CallbackTo[AnonPriority],
    forEach: js.Function1[DataSnapshot, Boolean] => CallbackTo[Boolean],
    getPriority: CallbackTo[String | Double | Null],
    hasChild: String => CallbackTo[Boolean],
    hasChildren: CallbackTo[Boolean],
    numChildren: CallbackTo[Double],
    ref: Reference,
    toJSON: CallbackTo[js.Object | Null],
    `val`: CallbackTo[js.Any],
    key: String = null
  ): DataSnapshot = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("child")(js.Any.fromFunction1((t0: java.lang.String) => child(t0).runNow()))
    __obj.updateDynamic("exists")(exists.toJsFn)
    __obj.updateDynamic("exportVal")(exportVal.toJsFn)
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function1[
  typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.DataSnapshot, 
  scala.Boolean]) => forEach(t0).runNow()))
    __obj.updateDynamic("getPriority")(getPriority.toJsFn)
    __obj.updateDynamic("hasChild")(js.Any.fromFunction1((t0: java.lang.String) => hasChild(t0).runNow()))
    __obj.updateDynamic("hasChildren")(hasChildren.toJsFn)
    __obj.updateDynamic("numChildren")(numChildren.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("val")(`val`.toJsFn)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSnapshot]
  }
}

