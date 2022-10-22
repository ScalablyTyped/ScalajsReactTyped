package typingsJapgolly.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputSet
  extends StObject
     with BaseElement {
  
  var dataOutputRefs: js.Array[DataOutput]
  
  var inputSetRefs: js.Array[InputSet]
  
  var name: String
  
  var optionalOutputRefs: js.Array[DataOutput]
  
  var whileExecutingOutputREfs: js.Array[DataOutput]
}
object OutputSet {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataOutputRefs: js.Array[DataOutput],
    id: String,
    inputSetRefs: js.Array[InputSet],
    name: String,
    optionalOutputRefs: js.Array[DataOutput],
    whileExecutingOutputREfs: js.Array[DataOutput]
  ): OutputSet = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataOutputRefs = dataOutputRefs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputSetRefs = inputSetRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalOutputRefs = optionalOutputRefs.asInstanceOf[js.Any], whileExecutingOutputREfs = whileExecutingOutputREfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSet]
  }
  
  extension [Self <: OutputSet](x: Self) {
    
    inline def setDataOutputRefs(value: js.Array[DataOutput]): Self = StObject.set(x, "dataOutputRefs", value.asInstanceOf[js.Any])
    
    inline def setDataOutputRefsVarargs(value: DataOutput*): Self = StObject.set(x, "dataOutputRefs", js.Array(value*))
    
    inline def setInputSetRefs(value: js.Array[InputSet]): Self = StObject.set(x, "inputSetRefs", value.asInstanceOf[js.Any])
    
    inline def setInputSetRefsVarargs(value: InputSet*): Self = StObject.set(x, "inputSetRefs", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptionalOutputRefs(value: js.Array[DataOutput]): Self = StObject.set(x, "optionalOutputRefs", value.asInstanceOf[js.Any])
    
    inline def setOptionalOutputRefsVarargs(value: DataOutput*): Self = StObject.set(x, "optionalOutputRefs", js.Array(value*))
    
    inline def setWhileExecutingOutputREfs(value: js.Array[DataOutput]): Self = StObject.set(x, "whileExecutingOutputREfs", value.asInstanceOf[js.Any])
    
    inline def setWhileExecutingOutputREfsVarargs(value: DataOutput*): Self = StObject.set(x, "whileExecutingOutputREfs", js.Array(value*))
  }
}
