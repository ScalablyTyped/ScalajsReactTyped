package typingsJapgolly.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QDiscriminator extends StObject {
  
  var qDiscriminator: String
}
object QDiscriminator {
  
  inline def apply(qDiscriminator: String): QDiscriminator = {
    val __obj = js.Dynamic.literal(qDiscriminator = qDiscriminator.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDiscriminator]
  }
  
  extension [Self <: QDiscriminator](x: Self) {
    
    inline def setQDiscriminator(value: String): Self = StObject.set(x, "qDiscriminator", value.asInstanceOf[js.Any])
  }
}
