package typingsJapgolly.durandal

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalActivatorSettings extends js.Object {
  /**
    * Lower-cased words which represent a truthy value.
    * @default ['yes', 'ok', 'true']
    */
  var affirmations: js.Array[String]
  /**
    * The default value passed to an object's deactivate function as its close parameter.
    * @default true
    */
  var closeOnDeactivate: Boolean
  /**
    * Called immediately after the old item is deactivated.
    * @param {object} oldItem The previous item.
    * @param {boolean} close Whether or not the previous item was closed.
    * @param {function} setter The activate item setter function.
    */
  def afterDeactivate(oldItem: js.Any, close: Boolean, setter: js.Function): Unit
  /**
    * Determines whether or not the current item and the new item are the same.
    * @param {object} currentItem
    * @param {object} newItem
    * @param {object} currentActivationData
    * @param {object} newActivationData
    * @returns {boolean}
    */
  def areSameItem(currentItem: js.Any, newItem: js.Any, currentActivationData: js.Any, newActivationData: js.Any): Boolean
  /**
    * Called immediately before the new item is activated.
    * @param {object} newItem
    */
  def beforeActivate(newItem: js.Any): js.Any
  /**
    * Interprets the response of a `canActivate` or `canDeactivate` call using the known affirmative values in the `affirmations` array.
    * @param {object} value
    * @returns {boolean}
    */
  def interpretResponse(value: js.Any): Boolean
}

object DurandalActivatorSettings {
  @scala.inline
  def apply(
    affirmations: js.Array[String],
    afterDeactivate: (js.Any, Boolean, js.Function) => Callback,
    areSameItem: (js.Any, js.Any, js.Any, js.Any) => CallbackTo[Boolean],
    beforeActivate: js.Any => CallbackTo[js.Any],
    closeOnDeactivate: Boolean,
    interpretResponse: js.Any => CallbackTo[Boolean]
  ): DurandalActivatorSettings = {
    val __obj = js.Dynamic.literal(affirmations = affirmations.asInstanceOf[js.Any], closeOnDeactivate = closeOnDeactivate.asInstanceOf[js.Any])
    __obj.updateDynamic("afterDeactivate")(js.Any.fromFunction3((t0: js.Any, t1: scala.Boolean, t2: js.Function) => afterDeactivate(t0, t1, t2).runNow()))
    __obj.updateDynamic("areSameItem")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => areSameItem(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("beforeActivate")(js.Any.fromFunction1((t0: js.Any) => beforeActivate(t0).runNow()))
    __obj.updateDynamic("interpretResponse")(js.Any.fromFunction1((t0: js.Any) => interpretResponse(t0).runNow()))
    __obj.asInstanceOf[DurandalActivatorSettings]
  }
}

