package typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod

import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.REMOVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRemoveMutator
  extends StObject
     with Mutator {
  
  var mutatorType: REMOVE
  
  var removalIndex: Double
}
object IRemoveMutator {
  
  inline def apply(removalIndex: Double): IRemoveMutator = {
    val __obj = js.Dynamic.literal(mutatorType = "REMOVE", removalIndex = removalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRemoveMutator]
  }
  
  extension [Self <: IRemoveMutator](x: Self) {
    
    inline def setMutatorType(value: REMOVE): Self = StObject.set(x, "mutatorType", value.asInstanceOf[js.Any])
    
    inline def setRemovalIndex(value: Double): Self = StObject.set(x, "removalIndex", value.asInstanceOf[js.Any])
  }
}
