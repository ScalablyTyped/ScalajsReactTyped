package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowSessionStorage extends StObject {
  
  /* standard dom */
  val sessionStorage: org.scalajs.dom.Storage
}
object WindowSessionStorage {
  
  inline def apply(sessionStorage: org.scalajs.dom.Storage): WindowSessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSessionStorage]
  }
  
  extension [Self <: WindowSessionStorage](x: Self) {
    
    inline def setSessionStorage(value: org.scalajs.dom.Storage): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
  }
}
