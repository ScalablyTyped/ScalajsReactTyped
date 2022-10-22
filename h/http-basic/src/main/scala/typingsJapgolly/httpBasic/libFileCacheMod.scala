package typingsJapgolly.httpBasic

import typingsJapgolly.httpBasic.anon.PickCachedResponseheaders
import typingsJapgolly.httpBasic.libIcacheMod.ICache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileCacheMod {
  
  @JSImport("http-basic/lib/FileCache", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FileCache {
    def this(location: String) = this()
  }
  
  @js.native
  trait FileCache
    extends StObject
       with ICache {
    
    /* private */ val _location: Any = js.native
    
    @JSName("updateResponseHeaders")
    def updateResponseHeaders_MFileCache(url: String, response: PickCachedResponseheaders): Unit = js.native
  }
}
