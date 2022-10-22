package typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationActorChange
  extends StObject
     with NormalizationSelection {
  
  val kind: String
  
  // "ActorChange";
  val linkedField: NormalizationLinkedField
}
object NormalizationActorChange {
  
  inline def apply(kind: String, linkedField: NormalizationLinkedField): NormalizationActorChange = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], linkedField = linkedField.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationActorChange]
  }
  
  extension [Self <: NormalizationActorChange](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLinkedField(value: NormalizationLinkedField): Self = StObject.set(x, "linkedField", value.asInstanceOf[js.Any])
  }
}
