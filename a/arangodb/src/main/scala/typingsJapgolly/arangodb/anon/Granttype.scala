package typingsJapgolly.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Granttype extends StObject {
  
  var grant_type: js.UndefOr[String] = js.undefined
}
object Granttype {
  
  inline def apply(): Granttype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Granttype]
  }
  
  extension [Self <: Granttype](x: Self) {
    
    inline def setGrant_type(value: String): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
    
    inline def setGrant_typeUndefined: Self = StObject.set(x, "grant_type", js.undefined)
  }
}
