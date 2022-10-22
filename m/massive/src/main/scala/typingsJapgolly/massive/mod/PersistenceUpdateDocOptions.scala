package typingsJapgolly.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceUpdateDocOptions extends StObject {
  
  var body: js.UndefOr[String] = js.undefined
}
object PersistenceUpdateDocOptions {
  
  inline def apply(): PersistenceUpdateDocOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceUpdateDocOptions]
  }
  
  extension [Self <: PersistenceUpdateDocOptions](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
