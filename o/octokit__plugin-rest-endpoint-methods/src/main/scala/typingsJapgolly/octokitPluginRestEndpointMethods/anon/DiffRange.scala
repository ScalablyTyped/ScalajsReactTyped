package typingsJapgolly.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiffRange extends StObject {
  
  var createRepositorySnapshot: `1037`
  
  var diffRange: `1038`
}
object DiffRange {
  
  inline def apply(createRepositorySnapshot: `1037`, diffRange: `1038`): DiffRange = {
    val __obj = js.Dynamic.literal(createRepositorySnapshot = createRepositorySnapshot.asInstanceOf[js.Any], diffRange = diffRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffRange]
  }
  
  extension [Self <: DiffRange](x: Self) {
    
    inline def setCreateRepositorySnapshot(value: `1037`): Self = StObject.set(x, "createRepositorySnapshot", value.asInstanceOf[js.Any])
    
    inline def setDiffRange(value: `1038`): Self = StObject.set(x, "diffRange", value.asInstanceOf[js.Any])
  }
}
