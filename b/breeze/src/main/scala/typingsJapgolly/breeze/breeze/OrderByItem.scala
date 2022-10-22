package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.Callback
import typingsJapgolly.breeze.breezeInts.`-1`
import typingsJapgolly.breeze.breezeInts.`0`
import typingsJapgolly.breeze.breezeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderByItem extends StObject {
  
  def getComparer(entityType: EntityType): js.Function2[/* entity1 */ Entity, /* entity2 */ Entity, `-1` | `0` | `1`]
  
  var isDesc: Boolean
  
  var propertyPath: String
  
  def validate(entityType: EntityType): Unit
}
object OrderByItem {
  
  inline def apply(
    getComparer: EntityType => js.Function2[/* entity1 */ Entity, /* entity2 */ Entity, `-1` | `0` | `1`],
    isDesc: Boolean,
    propertyPath: String,
    validate: EntityType => Callback
  ): OrderByItem = {
    val __obj = js.Dynamic.literal(getComparer = js.Any.fromFunction1(getComparer), isDesc = isDesc.asInstanceOf[js.Any], propertyPath = propertyPath.asInstanceOf[js.Any], validate = js.Any.fromFunction1((t0: EntityType) => validate(t0).runNow()))
    __obj.asInstanceOf[OrderByItem]
  }
  
  extension [Self <: OrderByItem](x: Self) {
    
    inline def setGetComparer(value: EntityType => js.Function2[/* entity1 */ Entity, /* entity2 */ Entity, `-1` | `0` | `1`]): Self = StObject.set(x, "getComparer", js.Any.fromFunction1(value))
    
    inline def setIsDesc(value: Boolean): Self = StObject.set(x, "isDesc", value.asInstanceOf[js.Any])
    
    inline def setPropertyPath(value: String): Self = StObject.set(x, "propertyPath", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: EntityType => Callback): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: EntityType) => value(t0).runNow()))
  }
}
