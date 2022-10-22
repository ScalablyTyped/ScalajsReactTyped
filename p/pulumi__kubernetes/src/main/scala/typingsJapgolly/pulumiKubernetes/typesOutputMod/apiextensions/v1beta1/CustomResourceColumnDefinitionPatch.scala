package typingsJapgolly.pulumiKubernetes.typesOutputMod.apiextensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceColumnDefinition specifies a column for server side printing.
  */
trait CustomResourceColumnDefinitionPatch extends StObject {
  
  /**
    * JSONPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
    */
  var JSONPath: String
  
  /**
    * description is a human readable description of this column.
    */
  var description: String
  
  /**
    * format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
    */
  var format: String
  
  /**
    * name is a human readable name for the column.
    */
  var name: String
  
  /**
    * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
    */
  var priority: Double
  
  /**
    * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
    */
  var `type`: String
}
object CustomResourceColumnDefinitionPatch {
  
  inline def apply(
    JSONPath: String,
    description: String,
    format: String,
    name: String,
    priority: Double,
    `type`: String
  ): CustomResourceColumnDefinitionPatch = {
    val __obj = js.Dynamic.literal(JSONPath = JSONPath.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceColumnDefinitionPatch]
  }
  
  extension [Self <: CustomResourceColumnDefinitionPatch](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setJSONPath(value: String): Self = StObject.set(x, "JSONPath", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
