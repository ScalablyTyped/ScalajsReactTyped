package typingsJapgolly.firebaseFirestoreTypes.mod

import typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.cache
import typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.default
import typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOptions extends StObject {
  
  val source: js.UndefOr[default | server | cache] = js.undefined
}
object GetOptions {
  
  inline def apply(): GetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOptions]
  }
  
  extension [Self <: GetOptions](x: Self) {
    
    inline def setSource(value: default | server | cache): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
