package typingsJapgolly.ebml.mod

import typingsJapgolly.ebml.ebmlStrings.f
import typingsJapgolly.ebml.ebmlStrings.i
import typingsJapgolly.ebml.ebmlStrings.u
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.ebml.mod.EBMLTagSchema because Already inherited */ trait EBMLNumericTagSchema
  extends StObject
     with EBMLDefaultableTagSchema {
  
  var br: js.UndefOr[
    String | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) | (js.Tuple4[String, String, String, String])
  ] = js.undefined
  
  var range: String
  
  @JSName("type")
  var type_EBMLNumericTagSchema: u | i | f
}
object EBMLNumericTagSchema {
  
  inline def apply(description: String, level: Double, name: String, range: String, `type`: u | i | f): EBMLNumericTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLNumericTagSchema]
  }
  
  extension [Self <: EBMLNumericTagSchema](x: Self) {
    
    inline def setBr(
      value: String | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) | (js.Tuple4[String, String, String, String])
    ): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: u | i | f): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
