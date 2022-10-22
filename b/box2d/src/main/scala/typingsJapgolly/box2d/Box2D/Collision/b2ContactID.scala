package typingsJapgolly.box2d.Box2D.Collision

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2ContactID extends StObject {
  
  /**
    * Copies the Contact ID.
    * @return Copied Contact ID.
    **/
  def Copy(): b2ContactID
  
  /**
    * ID Key
    **/
  var Key: Double
  
  /**
    * Sets the Contact ID from a Contact ID.
    * @param id The Contact ID to copy values from.
    **/
  def Set(id: b2ContactID): Unit
  
  /**
    * Features
    **/
  var features: Features
}
object b2ContactID {
  
  inline def apply(Copy: CallbackTo[b2ContactID], Key: Double, Set: b2ContactID => Callback, features: Features): b2ContactID = {
    val __obj = js.Dynamic.literal(Copy = Copy.toJsFn, Key = Key.asInstanceOf[js.Any], Set = js.Any.fromFunction1((t0: b2ContactID) => Set(t0).runNow()), features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ContactID]
  }
  
  extension [Self <: b2ContactID](x: Self) {
    
    inline def setCopy(value: CallbackTo[b2ContactID]): Self = StObject.set(x, "Copy", value.toJsFn)
    
    inline def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Double): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setSet(value: b2ContactID => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction1((t0: b2ContactID) => value(t0).runNow()))
  }
}
