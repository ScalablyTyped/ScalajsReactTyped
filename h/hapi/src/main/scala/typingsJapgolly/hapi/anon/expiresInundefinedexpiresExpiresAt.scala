package typingsJapgolly.hapi.anon

import typingsJapgolly.hapi.hapiStrings.`private`
import typingsJapgolly.hapi.hapiStrings.default
import typingsJapgolly.hapi.hapiStrings.public
import typingsJapgolly.hapi.mod.RouteOptionsCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  expiresIn :undefined,   expiresAt :undefined} & {  privacy :'default' | 'public' | 'private' | undefined,   statuses :std.Array<number> | undefined,   otherwise :string | undefined} */
trait expiresInundefinedexpiresExpiresAt
  extends StObject
     with RouteOptionsCache {
  
  var expiresAt: Unit
  
  var expiresIn: Unit
  
  var otherwise: js.UndefOr[String] = js.undefined
  
  var privacy: js.UndefOr[default | public | `private`] = js.undefined
  
  var statuses: js.UndefOr[js.Array[Double]] = js.undefined
}
object expiresInundefinedexpiresExpiresAt {
  
  inline def apply(expiresAt: Unit, expiresIn: Unit): expiresInundefinedexpiresExpiresAt = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[expiresInundefinedexpiresExpiresAt]
  }
  
  extension [Self <: expiresInundefinedexpiresExpiresAt](x: Self) {
    
    inline def setExpiresAt(value: Unit): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresIn(value: Unit): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setOtherwise(value: String): Self = StObject.set(x, "otherwise", value.asInstanceOf[js.Any])
    
    inline def setOtherwiseUndefined: Self = StObject.set(x, "otherwise", js.undefined)
    
    inline def setPrivacy(value: default | public | `private`): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
    
    inline def setStatuses(value: js.Array[Double]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    inline def setStatusesVarargs(value: Double*): Self = StObject.set(x, "statuses", js.Array(value*))
  }
}
