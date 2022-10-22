package typingsJapgolly.jsonPatchGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Array[JsonPatch] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[JsonPatch]]
  inline def apply(obj1: js.Object): js.Array[JsonPatch] = ^.asInstanceOf[js.Dynamic].apply(obj1.asInstanceOf[js.Any]).asInstanceOf[js.Array[JsonPatch]]
  inline def apply(obj1: js.Object, obj2: js.Object): js.Array[JsonPatch] = (^.asInstanceOf[js.Dynamic].apply(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Array[JsonPatch]]
  inline def apply(obj1: Null, obj2: js.Object): js.Array[JsonPatch] = (^.asInstanceOf[js.Dynamic].apply(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Array[JsonPatch]]
  
  @JSImport("json-patch-gen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JsonPatch extends StObject {
    
    var op: PatchOperation
    
    var path: String
    
    var value: Any
  }
  object JsonPatch {
    
    inline def apply(op: PatchOperation, path: String, value: Any): JsonPatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonPatch]
    }
    
    extension [Self <: JsonPatch](x: Self) {
      
      inline def setOp(value: PatchOperation): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.replace
    - typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.add
    - typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.remove
  */
  trait PatchOperation extends StObject
  object PatchOperation {
    
    inline def add: typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.add = "add".asInstanceOf[typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.add]
    
    inline def remove: typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.remove = "remove".asInstanceOf[typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.remove]
    
    inline def replace: typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.replace = "replace".asInstanceOf[typingsJapgolly.jsonPatchGen.jsonPatchGenStrings.replace]
  }
}
