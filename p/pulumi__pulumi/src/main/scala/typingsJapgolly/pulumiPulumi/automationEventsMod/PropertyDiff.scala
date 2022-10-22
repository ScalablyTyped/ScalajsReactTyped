package typingsJapgolly.pulumiPulumi.automationEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyDiff extends StObject {
  
  var diffKind: DiffKind
  
  var inputDiff: Boolean
}
object PropertyDiff {
  
  inline def apply(diffKind: DiffKind, inputDiff: Boolean): PropertyDiff = {
    val __obj = js.Dynamic.literal(diffKind = diffKind.asInstanceOf[js.Any], inputDiff = inputDiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDiff]
  }
  
  extension [Self <: PropertyDiff](x: Self) {
    
    inline def setDiffKind(value: DiffKind): Self = StObject.set(x, "diffKind", value.asInstanceOf[js.Any])
    
    inline def setInputDiff(value: Boolean): Self = StObject.set(x, "inputDiff", value.asInstanceOf[js.Any])
  }
}
