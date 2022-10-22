package typingsJapgolly.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbindEnumEntity extends StObject {
  
  val value: Double
}
object EmbindEnumEntity {
  
  inline def apply(value: Double): EmbindEnumEntity = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbindEnumEntity]
  }
  
  extension [Self <: EmbindEnumEntity](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
