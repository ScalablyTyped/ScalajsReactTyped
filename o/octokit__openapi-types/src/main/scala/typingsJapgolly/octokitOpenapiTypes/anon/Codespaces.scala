package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codespaces extends StObject {
  
  var codespaces: js.Array[Devcontainerpath]
  
  var total_count: Double
}
object Codespaces {
  
  inline def apply(codespaces: js.Array[Devcontainerpath], total_count: Double): Codespaces = {
    val __obj = js.Dynamic.literal(codespaces = codespaces.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codespaces]
  }
  
  extension [Self <: Codespaces](x: Self) {
    
    inline def setCodespaces(value: js.Array[Devcontainerpath]): Self = StObject.set(x, "codespaces", value.asInstanceOf[js.Any])
    
    inline def setCodespacesVarargs(value: Devcontainerpath*): Self = StObject.set(x, "codespaces", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
