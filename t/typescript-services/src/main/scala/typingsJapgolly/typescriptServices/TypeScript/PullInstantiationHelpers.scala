package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullInstantiationHelpers {
  
  trait MutableTypeArgumentMap extends StObject {
    
    var createdDuplicateTypeArgumentMap: Boolean
    
    def ensureTypeArgumentCopy(): Unit
    
    var typeParameterArgumentMap: TypeArgumentMap
  }
  object MutableTypeArgumentMap {
    
    inline def apply(
      createdDuplicateTypeArgumentMap: Boolean,
      ensureTypeArgumentCopy: Callback,
      typeParameterArgumentMap: TypeArgumentMap
    ): MutableTypeArgumentMap = {
      val __obj = js.Dynamic.literal(createdDuplicateTypeArgumentMap = createdDuplicateTypeArgumentMap.asInstanceOf[js.Any], ensureTypeArgumentCopy = ensureTypeArgumentCopy.toJsFn, typeParameterArgumentMap = typeParameterArgumentMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutableTypeArgumentMap]
    }
    
    extension [Self <: MutableTypeArgumentMap](x: Self) {
      
      inline def setCreatedDuplicateTypeArgumentMap(value: Boolean): Self = StObject.set(x, "createdDuplicateTypeArgumentMap", value.asInstanceOf[js.Any])
      
      inline def setEnsureTypeArgumentCopy(value: Callback): Self = StObject.set(x, "ensureTypeArgumentCopy", value.toJsFn)
      
      inline def setTypeParameterArgumentMap(value: TypeArgumentMap): Self = StObject.set(x, "typeParameterArgumentMap", value.asInstanceOf[js.Any])
    }
  }
}
