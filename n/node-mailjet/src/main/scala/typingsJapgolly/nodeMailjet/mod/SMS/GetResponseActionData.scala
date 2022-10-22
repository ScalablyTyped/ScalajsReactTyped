package typingsJapgolly.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponseActionData extends StObject {
  
  val Count: Double
}
object GetResponseActionData {
  
  inline def apply(Count: Double): GetResponseActionData = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseActionData]
  }
  
  extension [Self <: GetResponseActionData](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
  }
}
