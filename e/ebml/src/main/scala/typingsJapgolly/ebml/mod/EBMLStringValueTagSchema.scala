package typingsJapgolly.ebml.mod

import typingsJapgolly.ebml.ebmlStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.ebml.mod.EBMLTagSchema because Already inherited */ trait EBMLStringValueTagSchema
  extends StObject
     with EBMLDefaultableTagSchema {
  
  @JSName("type")
  var type_EBMLStringValueTagSchema: s
}
object EBMLStringValueTagSchema {
  
  inline def apply(description: String, level: Double, name: String): EBMLStringValueTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("s")
    __obj.asInstanceOf[EBMLStringValueTagSchema]
  }
  
  extension [Self <: EBMLStringValueTagSchema](x: Self) {
    
    inline def setType(value: s): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
