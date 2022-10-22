package typingsJapgolly.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attrs extends StObject {
  
  var attrs: Items
  
  var category: Ref
  
  var customExecutor: Ref
  
  var inputs: Items
  
  var outputs: Type
  
  var tfOpName: Type
}
object Attrs {
  
  inline def apply(attrs: Items, category: Ref, customExecutor: Ref, inputs: Items, outputs: Type, tfOpName: Type): Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], customExecutor = customExecutor.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], tfOpName = tfOpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  
  extension [Self <: Attrs](x: Self) {
    
    inline def setAttrs(value: Items): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: Ref): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCustomExecutor(value: Ref): Self = StObject.set(x, "customExecutor", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: Items): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: Type): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setTfOpName(value: Type): Self = StObject.set(x, "tfOpName", value.asInstanceOf[js.Any])
  }
}
