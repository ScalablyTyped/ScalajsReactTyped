package typingsJapgolly.parseAuthor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(author: String): Author = ^.asInstanceOf[js.Dynamic].apply(author.asInstanceOf[js.Any]).asInstanceOf[Author]
  
  @JSImport("parse-author", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Author extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Author {
    
    inline def apply(): Author = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Author]
    }
    
    extension [Self <: Author](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
