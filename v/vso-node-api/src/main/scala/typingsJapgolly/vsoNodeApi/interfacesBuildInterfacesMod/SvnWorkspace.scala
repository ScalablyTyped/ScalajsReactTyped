package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SvnWorkspace extends StObject {
  
  var mappings: js.Array[SvnMappingDetails]
}
object SvnWorkspace {
  
  inline def apply(mappings: js.Array[SvnMappingDetails]): SvnWorkspace = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvnWorkspace]
  }
  
  extension [Self <: SvnWorkspace](x: Self) {
    
    inline def setMappings(value: js.Array[SvnMappingDetails]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsVarargs(value: SvnMappingDetails*): Self = StObject.set(x, "mappings", js.Array(value*))
  }
}
