package typingsJapgolly.watsonDeveloperCloud.assistantV1Mod

import typingsJapgolly.watsonDeveloperCloud.assistantV1Mod.CreateValueConstants.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createValue` operation. */
trait CreateValueParams extends StObject {
  
  /** The name of the entity. */
  var entity: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Any metadata related to the entity value. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  /** An array of patterns for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A pattern is a regular expression no longer than 512 characters. For more information about how to specify a pattern, see the [documentation](https://cloud.ibm.com/docs/services/assistant/entities.html#entities-create-dictionary-based). */
  var patterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** An array of synonyms for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A synonym must conform to the following resrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var synonyms: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The text of the entity value. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var value: String
  
  /** Specifies the type of entity value. */
  var value_type: js.UndefOr[ValueType | String] = js.undefined
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object CreateValueParams {
  
  inline def apply(entity: String, value: String, workspace_id: String): CreateValueParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateValueParams]
  }
  
  extension [Self <: CreateValueParams](x: Self) {
    
    inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
    
    inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    inline def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValue_type(value: ValueType | String): Self = StObject.set(x, "value_type", value.asInstanceOf[js.Any])
    
    inline def setValue_typeUndefined: Self = StObject.set(x, "value_type", js.undefined)
    
    inline def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
