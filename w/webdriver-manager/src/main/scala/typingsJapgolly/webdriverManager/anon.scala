package typingsJapgolly.webdriverManager

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.webdriverManager.builtLibBinariesBinaryMod.OS
import typingsJapgolly.webdriverManager.builtLibBinariesMod.Binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Index extends StObject {
    
    var index: String
    
    var version: String
  }
  object Index {
    
    inline def apply(index: String, version: String): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofBinary
    extends StObject
       with Instantiable0[Binary]
       with Instantiable1[/* opt_alternativeCdn */ String, Binary] {
    
    var os: js.Array[OS] = js.native
  }
  
  trait Url extends StObject {
    
    var url: String
    
    var version: String
  }
  object Url {
    
    inline def apply(url: String, version: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
