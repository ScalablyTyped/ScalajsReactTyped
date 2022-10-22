package typingsJapgolly.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialPropertiesListobject
  extends StObject
     with /* key */ StringDictionary[Any]
     with InitialProperties {
  
  var qListobjectDef: ListobjectDef
}
object InitialPropertiesListobject {
  
  inline def apply(qListobjectDef: ListobjectDef): InitialPropertiesListobject = {
    val __obj = js.Dynamic.literal(qListobjectDef = qListobjectDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialPropertiesListobject]
  }
  
  extension [Self <: InitialPropertiesListobject](x: Self) {
    
    inline def setQListobjectDef(value: ListobjectDef): Self = StObject.set(x, "qListobjectDef", value.asInstanceOf[js.Any])
  }
}
