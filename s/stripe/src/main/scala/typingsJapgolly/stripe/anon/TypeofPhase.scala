package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPhase extends StObject {
  
  val Item: Any
}
object TypeofPhase {
  
  inline def apply(Item: Any): TypeofPhase = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPhase]
  }
  
  extension [Self <: TypeofPhase](x: Self) {
    
    inline def setItem(value: Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
