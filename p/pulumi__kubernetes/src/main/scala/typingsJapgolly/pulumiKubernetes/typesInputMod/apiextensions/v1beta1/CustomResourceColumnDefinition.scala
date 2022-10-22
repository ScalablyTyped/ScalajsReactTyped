package typingsJapgolly.pulumiKubernetes.typesInputMod.apiextensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceColumnDefinition specifies a column for server side printing.
  */
trait CustomResourceColumnDefinition extends StObject {
  
  /**
    * JSONPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
    */
  var JSONPath: Input[String]
  
  /**
    * description is a human readable description of this column.
    */
  var description: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
    */
  var format: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * name is a human readable name for the column.
    */
  var name: Input[String]
  
  /**
    * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
    */
  var priority: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
    */
  var `type`: Input[String]
}
object CustomResourceColumnDefinition {
  
  inline def apply(JSONPath: Input[String], name: Input[String], `type`: Input[String]): CustomResourceColumnDefinition = {
    val __obj = js.Dynamic.literal(JSONPath = JSONPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceColumnDefinition]
  }
  
  extension [Self <: CustomResourceColumnDefinition](x: Self) {
    
    inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setJSONPath(value: Input[String]): Self = StObject.set(x, "JSONPath", value.asInstanceOf[js.Any])
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
