package typingsJapgolly.pulumiPulumi.automationEventsMod

import typingsJapgolly.pulumiPulumi.automationStackMod.OpType
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepEventMetadata extends StObject {
  
  var detailedDiff: js.UndefOr[Record[String, PropertyDiff]] = js.undefined
  
  var diffs: js.UndefOr[js.Array[String]] = js.undefined
  
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  
  var logical: js.UndefOr[Boolean] = js.undefined
  
  var `new`: js.UndefOr[StepEventStateMetadata] = js.undefined
  
  var old: js.UndefOr[StepEventStateMetadata] = js.undefined
  
  var op: OpType
  
  var provider: String
  
  var `type`: String
  
  var urn: String
}
object StepEventMetadata {
  
  inline def apply(op: OpType, provider: String, `type`: String, urn: String): StepEventMetadata = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepEventMetadata]
  }
  
  extension [Self <: StepEventMetadata](x: Self) {
    
    inline def setDetailedDiff(value: Record[String, PropertyDiff]): Self = StObject.set(x, "detailedDiff", value.asInstanceOf[js.Any])
    
    inline def setDetailedDiffUndefined: Self = StObject.set(x, "detailedDiff", js.undefined)
    
    inline def setDiffs(value: js.Array[String]): Self = StObject.set(x, "diffs", value.asInstanceOf[js.Any])
    
    inline def setDiffsUndefined: Self = StObject.set(x, "diffs", js.undefined)
    
    inline def setDiffsVarargs(value: String*): Self = StObject.set(x, "diffs", js.Array(value*))
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setLogical(value: Boolean): Self = StObject.set(x, "logical", value.asInstanceOf[js.Any])
    
    inline def setLogicalUndefined: Self = StObject.set(x, "logical", js.undefined)
    
    inline def setNew(value: StepEventStateMetadata): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
    
    inline def setOld(value: StepEventStateMetadata): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    
    inline def setOldUndefined: Self = StObject.set(x, "old", js.undefined)
    
    inline def setOp(value: OpType): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
  }
}
