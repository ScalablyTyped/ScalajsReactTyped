package typingsJapgolly.firebaseFirestore.anon

import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var count: AggregateField[Double]
}
object `11` {
  
  inline def apply(count: AggregateField[Double]): `11` = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setCount(value: AggregateField[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
