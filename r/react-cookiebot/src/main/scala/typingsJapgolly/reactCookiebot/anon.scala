package typingsJapgolly.reactCookiebot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DomainGroupId extends StObject {
    
    var domainGroupId: String
    
    var language: js.UndefOr[String] = js.undefined
  }
  object DomainGroupId {
    
    inline def apply(domainGroupId: String): DomainGroupId = {
      val __obj = js.Dynamic.literal(domainGroupId = domainGroupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainGroupId]
    }
    
    extension [Self <: DomainGroupId](x: Self) {
      
      inline def setDomainGroupId(value: String): Self = StObject.set(x, "domainGroupId", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
}
