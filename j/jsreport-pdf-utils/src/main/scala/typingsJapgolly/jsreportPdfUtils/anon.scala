package typingsJapgolly.jsreportPdfUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Contrent extends StObject {
    
    var contrent: String
    
    var encoding: String
    
    var password: String
  }
  object Contrent {
    
    inline def apply(contrent: String, encoding: String, password: String): Contrent = {
      val __obj = js.Dynamic.literal(contrent = contrent.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contrent]
    }
    
    extension [Self <: Contrent](x: Self) {
      
      inline def setContrent(value: String): Self = StObject.set(x, "contrent", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
}
