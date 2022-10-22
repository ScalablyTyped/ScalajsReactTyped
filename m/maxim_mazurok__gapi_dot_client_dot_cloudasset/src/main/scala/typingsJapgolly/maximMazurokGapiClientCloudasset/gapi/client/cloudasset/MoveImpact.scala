package typingsJapgolly.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveImpact extends StObject {
  
  /** User friendly impact detail in a free form message. */
  var detail: js.UndefOr[String] = js.undefined
}
object MoveImpact {
  
  inline def apply(): MoveImpact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveImpact]
  }
  
  extension [Self <: MoveImpact](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
  }
}
