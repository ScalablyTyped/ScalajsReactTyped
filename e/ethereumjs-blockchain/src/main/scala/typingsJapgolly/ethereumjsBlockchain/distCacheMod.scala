package typingsJapgolly.ethereumjsBlockchain

import typingsJapgolly.lruCache.mod.Options
import typingsJapgolly.lruCache.mod.^
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheMod {
  
  @JSImport("ethereumjs-blockchain/dist/cache", JSImport.Default)
  @js.native
  open class default[V] protected ()
    extends StObject
       with Cache[V] {
    def this(opts: Options[String, V]) = this()
  }
  
  @js.native
  trait Cache[V] extends StObject {
    
    var _cache: ^[String, V] = js.native
    
    def del(key: String): Unit = js.native
    def del(key: Buffer): Unit = js.native
    
    def get(key: String): js.UndefOr[V] = js.native
    def get(key: Buffer): js.UndefOr[V] = js.native
    
    def set(key: String, value: V): Unit = js.native
    def set(key: Buffer, value: V): Unit = js.native
  }
}
