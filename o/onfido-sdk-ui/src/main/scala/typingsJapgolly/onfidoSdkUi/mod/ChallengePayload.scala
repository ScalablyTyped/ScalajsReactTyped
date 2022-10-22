package typingsJapgolly.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.onfidoSdkUi.anon.Query
  - typingsJapgolly.onfidoSdkUi.anon.Type
*/
trait ChallengePayload extends StObject
object ChallengePayload {
  
  inline def Query(query: js.Array[Double], `type`: /* "recite" */ String): typingsJapgolly.onfidoSdkUi.anon.Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.onfidoSdkUi.anon.Query]
  }
  
  inline def Type(query: String, `type`: /* "movement" */ String): typingsJapgolly.onfidoSdkUi.anon.Type = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.onfidoSdkUi.anon.Type]
  }
}
