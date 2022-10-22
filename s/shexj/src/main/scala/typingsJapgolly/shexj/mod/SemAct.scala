package typingsJapgolly.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemAct extends StObject {
  
  /*
    * The actual code to be interpreted/executed.
    * This may be kept separate from the ShEx containing the schema by including only {@link name}s in the schema.
    */
  var code: js.UndefOr[STRING] = js.undefined
  
  /*
    * Identifier of the language for this semantic action.
    */
  var name: IRIREF
  
  /**
    * Mandatory type "SemAct".
    */
  var `type`: typingsJapgolly.shexj.shexjStrings.SemAct
}
object SemAct {
  
  inline def apply(name: IRIREF): SemAct = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SemAct")
    __obj.asInstanceOf[SemAct]
  }
  
  extension [Self <: SemAct](x: Self) {
    
    inline def setCode(value: STRING): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setName(value: IRIREF): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.shexj.shexjStrings.SemAct): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
