package typingsJapgolly.durandal

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurandalActivatorSettings extends StObject {
  
  /**
    * Lower-cased words which represent a truthy value.
    * @default ['yes', 'ok', 'true']
    */
  var affirmations: js.Array[String]
  
  /**
    * Called immediately after the old item is deactivated.
    * @param {object} oldItem The previous item.
    * @param {boolean} close Whether or not the previous item was closed.
    * @param {function} setter The activate item setter function.
    */
  def afterDeactivate(oldItem: Any, close: Boolean, setter: js.Function): Unit
  
  /**
    * Determines whether or not the current item and the new item are the same.
    * @param {object} currentItem
    * @param {object} newItem
    * @param {object} currentActivationData
    * @param {object} newActivationData
    * @returns {boolean}
    */
  def areSameItem(currentItem: Any, newItem: Any, currentActivationData: Any, newActivationData: Any): Boolean
  
  /**
    * Called immediately before the new item is activated.
    * @param {object} newItem
    */
  def beforeActivate(newItem: Any): Any
  
  /**
    * The default value passed to an object's deactivate function as its close parameter.
    * @default true
    */
  var closeOnDeactivate: Boolean
  
  /**
    * Interprets the response of a `canActivate` or `canDeactivate` call using the known affirmative values in the `affirmations` array.
    * @param {object} value
    * @returns {boolean}
    */
  def interpretResponse(value: Any): Boolean
}
object DurandalActivatorSettings {
  
  inline def apply(
    affirmations: js.Array[String],
    afterDeactivate: (Any, Boolean, js.Function) => Callback,
    areSameItem: (Any, Any, Any, Any) => Boolean,
    beforeActivate: Any => Any,
    closeOnDeactivate: Boolean,
    interpretResponse: Any => Boolean
  ): DurandalActivatorSettings = {
    val __obj = js.Dynamic.literal(affirmations = affirmations.asInstanceOf[js.Any], afterDeactivate = js.Any.fromFunction3((t0: Any, t1: Boolean, t2: js.Function) => (afterDeactivate(t0, t1, t2)).runNow()), areSameItem = js.Any.fromFunction4(areSameItem), beforeActivate = js.Any.fromFunction1(beforeActivate), closeOnDeactivate = closeOnDeactivate.asInstanceOf[js.Any], interpretResponse = js.Any.fromFunction1(interpretResponse))
    __obj.asInstanceOf[DurandalActivatorSettings]
  }
  
  extension [Self <: DurandalActivatorSettings](x: Self) {
    
    inline def setAffirmations(value: js.Array[String]): Self = StObject.set(x, "affirmations", value.asInstanceOf[js.Any])
    
    inline def setAffirmationsVarargs(value: String*): Self = StObject.set(x, "affirmations", js.Array(value*))
    
    inline def setAfterDeactivate(value: (Any, Boolean, js.Function) => Callback): Self = StObject.set(x, "afterDeactivate", js.Any.fromFunction3((t0: Any, t1: Boolean, t2: js.Function) => (value(t0, t1, t2)).runNow()))
    
    inline def setAreSameItem(value: (Any, Any, Any, Any) => Boolean): Self = StObject.set(x, "areSameItem", js.Any.fromFunction4(value))
    
    inline def setBeforeActivate(value: Any => Any): Self = StObject.set(x, "beforeActivate", js.Any.fromFunction1(value))
    
    inline def setCloseOnDeactivate(value: Boolean): Self = StObject.set(x, "closeOnDeactivate", value.asInstanceOf[js.Any])
    
    inline def setInterpretResponse(value: Any => Boolean): Self = StObject.set(x, "interpretResponse", js.Any.fromFunction1(value))
  }
}
