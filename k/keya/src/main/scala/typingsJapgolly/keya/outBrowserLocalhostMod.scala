package typingsJapgolly.keya

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outBrowserLocalhostMod {
  
  @JSImport("keya/out/browser/localhost", JSImport.Default)
  @js.native
  open class default[T] () extends LocalStoreStore[T]
  /* static members */
  object default {
    
    @JSImport("keya/out/browser/localhost", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets all stores
      */
    inline def stores(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stores")().asInstanceOf[js.Promise[js.Array[String]]]
  }
  
  @js.native
  trait LocalStoreStore[T]
    extends typingsJapgolly.keya.outCoreStoreMod.default[T] {
    
    var prefix: String = js.native
  }
}
