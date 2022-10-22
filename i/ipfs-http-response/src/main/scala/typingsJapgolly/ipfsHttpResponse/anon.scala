package typingsJapgolly.ipfsHttpResponse

import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cid extends StObject {
    
    var cid: Any
  }
  object Cid {
    
    inline def apply(cid: Any): Cid = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cid]
    }
    
    extension [Self <: Cid](x: Self) {
      
      inline def setCid(value: Any): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var source: AsyncIterable[js.typedarray.Uint8Array]
  }
  object ContentType {
    
    inline def apply(source: AsyncIterable[js.typedarray.Uint8Array]): ContentType = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentType]
    }
    
    extension [Self <: ContentType](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setSource(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var Name: String
    
    var Tsize: Double
  }
  object Name {
    
    inline def apply(Name: String, Tsize: Double): Name = {
      val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Tsize = Tsize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setTsize(value: Double): Self = StObject.set(x, "Tsize", value.asInstanceOf[js.Any])
    }
  }
  
  trait NameAny extends StObject {
    
    var Name: Any
  }
  object NameAny {
    
    inline def apply(Name: Any): NameAny = {
      val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameAny]
    }
    
    extension [Self <: NameAny](x: Self) {
      
      inline def setName(value: Any): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
}
