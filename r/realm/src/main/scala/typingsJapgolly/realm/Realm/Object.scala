package typingsJapgolly.realm.Realm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Object.html }
  */
trait Object extends js.Object {
  /**
    * @returns void
    */
  def addListener(callback: ObjectChangeCallback): Unit
  /**
    * @returns boolean
    */
  def isValid(): Boolean
  /**
    * @returns Results<T>
    */
  def linkingObjects[T](objectType: String, property: String): Results[T with Object]
  /**
    * @returns number
    */
  def linkingObjectsCount(): Double
  /**
    * @returns ObjectSchema
    */
  def objectSchema(): ObjectSchema
  def removeAllListeners(): Unit
  def removeListener(callback: ObjectChangeCallback): Unit
}

object Object {
  @scala.inline
  def apply(
    addListener: ObjectChangeCallback => Callback,
    isValid: CallbackTo[Boolean],
    linkingObjects: (String, String) => CallbackTo[Results[js.Any with Object]],
    linkingObjectsCount: CallbackTo[Double],
    objectSchema: CallbackTo[ObjectSchema],
    removeAllListeners: Callback,
    removeListener: ObjectChangeCallback => Callback
  ): Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: typingsJapgolly.realm.Realm.ObjectChangeCallback) => addListener(t0).runNow()))
    __obj.updateDynamic("isValid")(isValid.toJsFn)
    __obj.updateDynamic("linkingObjects")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => linkingObjects(t0, t1).runNow()))
    __obj.updateDynamic("linkingObjectsCount")(linkingObjectsCount.toJsFn)
    __obj.updateDynamic("objectSchema")(objectSchema.toJsFn)
    __obj.updateDynamic("removeAllListeners")(removeAllListeners.toJsFn)
    __obj.updateDynamic("removeListener")(js.Any.fromFunction1((t0: typingsJapgolly.realm.Realm.ObjectChangeCallback) => removeListener(t0).runNow()))
    __obj.asInstanceOf[Object]
  }
}

