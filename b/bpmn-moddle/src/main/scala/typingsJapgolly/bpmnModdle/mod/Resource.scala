package typingsJapgolly.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource
  extends StObject
     with BaseElement {
  
  var name: String
  
  var resourceParameters: js.Array[ResourceParameter]
}
object Resource {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    name: String,
    resourceParameters: js.Array[ResourceParameter]
  ): Resource = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceParameters = resourceParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResourceParameters(value: js.Array[ResourceParameter]): Self = StObject.set(x, "resourceParameters", value.asInstanceOf[js.Any])
    
    inline def setResourceParametersVarargs(value: ResourceParameter*): Self = StObject.set(x, "resourceParameters", js.Array(value*))
  }
}
