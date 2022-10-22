package typingsJapgolly.pulumiPulumi.automationEventsMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepEventStateMetadata extends StObject {
  
  var custom: js.UndefOr[Boolean] = js.undefined
  
  var delete: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var initErrors: js.UndefOr[js.Array[String]] = js.undefined
  
  var inputs: Record[String, Any]
  
  var outputs: Record[String, Any]
  
  var parent: String
  
  var protect: js.UndefOr[Boolean] = js.undefined
  
  var provider: String
  
  var `type`: String
  
  var urn: String
}
object StepEventStateMetadata {
  
  inline def apply(
    id: String,
    inputs: Record[String, Any],
    outputs: Record[String, Any],
    parent: String,
    provider: String,
    `type`: String,
    urn: String
  ): StepEventStateMetadata = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepEventStateMetadata]
  }
  
  extension [Self <: StepEventStateMetadata](x: Self) {
    
    inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitErrors(value: js.Array[String]): Self = StObject.set(x, "initErrors", value.asInstanceOf[js.Any])
    
    inline def setInitErrorsUndefined: Self = StObject.set(x, "initErrors", js.undefined)
    
    inline def setInitErrorsVarargs(value: String*): Self = StObject.set(x, "initErrors", js.Array(value*))
    
    inline def setInputs(value: Record[String, Any]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: Record[String, Any]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setProtect(value: Boolean): Self = StObject.set(x, "protect", value.asInstanceOf[js.Any])
    
    inline def setProtectUndefined: Self = StObject.set(x, "protect", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
  }
}
