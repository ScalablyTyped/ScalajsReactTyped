package typingsJapgolly.asn1js.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.asn1js.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.asn1js.mod.CompareSchemaSuccess
  - typingsJapgolly.asn1js.mod.CompareSchemaFail
*/
trait CompareSchemaResult extends StObject
object CompareSchemaResult {
  
  inline def CompareSchemaFail(result: AsnType | Error): typingsJapgolly.asn1js.mod.CompareSchemaFail = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], verified = false)
    __obj.asInstanceOf[typingsJapgolly.asn1js.mod.CompareSchemaFail]
  }
  
  inline def CompareSchemaSuccess(result: AsnType & StringDictionary[scala.Any]): typingsJapgolly.asn1js.mod.CompareSchemaSuccess = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], verified = true)
    __obj.asInstanceOf[typingsJapgolly.asn1js.mod.CompareSchemaSuccess]
  }
}
