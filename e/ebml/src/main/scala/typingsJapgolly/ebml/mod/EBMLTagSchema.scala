package typingsJapgolly.ebml.mod

import typingsJapgolly.ebml.ebmlStrings.f
import typingsJapgolly.ebml.ebmlStrings.i
import typingsJapgolly.ebml.ebmlStrings.u
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ebml.mod.EBMLTagSchemaBase
  - typingsJapgolly.ebml.mod.EBMLNumericTagSchema
  - typingsJapgolly.ebml.mod.EBMLStringValueTagSchema
  - typingsJapgolly.ebml.mod.EBMLBinaryTagSchema
*/
trait EBMLTagSchema extends StObject
object EBMLTagSchema {
  
  inline def EBMLBinaryTagSchema(description: String, level: Double, name: String, `type`: TagType): typingsJapgolly.ebml.mod.EBMLBinaryTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ebml.mod.EBMLBinaryTagSchema]
  }
  
  inline def EBMLNumericTagSchema(description: String, level: Double, name: String, range: String, `type`: u | i | f): typingsJapgolly.ebml.mod.EBMLNumericTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ebml.mod.EBMLNumericTagSchema]
  }
  
  inline def EBMLStringValueTagSchema(description: String, level: Double, name: String): typingsJapgolly.ebml.mod.EBMLStringValueTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("s")
    __obj.asInstanceOf[typingsJapgolly.ebml.mod.EBMLStringValueTagSchema]
  }
  
  inline def EBMLTagSchemaBase(description: String, level: Double, name: String, `type`: TagType): typingsJapgolly.ebml.mod.EBMLTagSchemaBase = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ebml.mod.EBMLTagSchemaBase]
  }
}
