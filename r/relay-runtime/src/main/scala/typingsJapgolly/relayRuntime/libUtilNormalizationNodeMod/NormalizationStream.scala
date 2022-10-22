package typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationStream
  extends StObject
     with NormalizationNode
     with NormalizationSelectableNode
     with NormalizationSelection {
  
  val `if`: String | Null
  
  val kind: String
  
  // "Stream";
  val label: String
  
  val selections: js.Array[NormalizationSelection]
}
object NormalizationStream {
  
  inline def apply(kind: String, label: String, selections: js.Array[NormalizationSelection]): NormalizationStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[NormalizationStream]
  }
  
  extension [Self <: NormalizationStream](x: Self) {
    
    inline def setIf(value: String): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfNull: Self = StObject.set(x, "if", null)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setSelections(value: js.Array[NormalizationSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: NormalizationSelection*): Self = StObject.set(x, "selections", js.Array(value*))
  }
}
