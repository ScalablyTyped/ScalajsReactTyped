package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Secrets extends StObject {
  
  var secrets: js.Array[Selectedrepositoriesurl]
  
  var total_count: Double
}
object Secrets {
  
  inline def apply(secrets: js.Array[Selectedrepositoriesurl], total_count: Double): Secrets = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secrets]
  }
  
  extension [Self <: Secrets](x: Self) {
    
    inline def setSecrets(value: js.Array[Selectedrepositoriesurl]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsVarargs(value: Selectedrepositoriesurl*): Self = StObject.set(x, "secrets", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
