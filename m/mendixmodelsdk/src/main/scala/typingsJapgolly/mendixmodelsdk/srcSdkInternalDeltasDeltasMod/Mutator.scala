package typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IChangeMutator
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IAddMutator
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IRemoveMutator
*/
trait Mutator extends StObject
object Mutator {
  
  inline def IAddMutator(value: PrimitiveValue): typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IAddMutator = {
    val __obj = js.Dynamic.literal(mutatorType = "ADD", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IAddMutator]
  }
  
  inline def IChangeMutator(): typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IChangeMutator = {
    val __obj = js.Dynamic.literal(mutatorType = "CHANGE", value = null)
    __obj.asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IChangeMutator]
  }
  
  inline def IRemoveMutator(removalIndex: Double): typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IRemoveMutator = {
    val __obj = js.Dynamic.literal(mutatorType = "REMOVE", removalIndex = removalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IRemoveMutator]
  }
}
