package typingsJapgolly.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOnly extends StObject {
  
  /** Reads documents at the given time. This may not be older than 60 seconds. */
  var readTime: js.UndefOr[String] = js.undefined
}
object ReadOnly {
  
  inline def apply(): ReadOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOnly]
  }
  
  extension [Self <: ReadOnly](x: Self) {
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
