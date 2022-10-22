package typingsJapgolly.mmdbLib.libReaderResponseMod

import typingsJapgolly.mmdbLib.mmdbLibStrings.AF
import typingsJapgolly.mmdbLib.mmdbLibStrings.AN
import typingsJapgolly.mmdbLib.mmdbLibStrings.AS
import typingsJapgolly.mmdbLib.mmdbLibStrings.EU
import typingsJapgolly.mmdbLib.mmdbLibStrings.NA
import typingsJapgolly.mmdbLib.mmdbLibStrings.OC
import typingsJapgolly.mmdbLib.mmdbLibStrings.SA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinentRecord extends StObject {
  
  val code: AF | AN | AS | EU | NA | OC | SA
  
  val geoname_id: Double
  
  val names: Names
}
object ContinentRecord {
  
  inline def apply(code: AF | AN | AS | EU | NA | OC | SA, geoname_id: Double, names: Names): ContinentRecord = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], geoname_id = geoname_id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinentRecord]
  }
  
  extension [Self <: ContinentRecord](x: Self) {
    
    inline def setCode(value: AF | AN | AS | EU | NA | OC | SA): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setGeoname_id(value: Double): Self = StObject.set(x, "geoname_id", value.asInstanceOf[js.Any])
    
    inline def setNames(value: Names): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
