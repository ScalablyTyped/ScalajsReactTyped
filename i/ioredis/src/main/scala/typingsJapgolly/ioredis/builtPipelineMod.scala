package typingsJapgolly.ioredis

import typingsJapgolly.ioredis.anon.Type
import typingsJapgolly.ioredis.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtPipelineMod {
  
  @JSImport("ioredis/built/Pipeline", JSImport.Default)
  @js.native
  open class default protected () extends Pipeline {
    def this(redis: typingsJapgolly.ioredis.builtClusterMod.default) = this()
    def this(redis: typingsJapgolly.ioredis.builtRedisMod.default) = this()
  }
  
  @js.native
  trait Pipeline
    extends typingsJapgolly.ioredis.builtUtilsCommanderMod.default[Type] {
    
    /* private */ var _queue: Any = js.native
    
    /* private */ var _result: Any = js.native
    
    /* private */ var _shaToScript: Any = js.native
    
    /* private */ var _transactions: Any = js.native
    
    def addBatch(commands: Any): this.type = js.native
    
    def fillResult(value: js.Array[Any], position: Double): Unit = js.native
    
    var isCluster: Boolean = js.native
    
    var isPipeline: Boolean = js.native
    
    var leftRedirections: Value = js.native
    
    var length: Double = js.native
    
    /* private */ var preferKey: Any = js.native
    
    var promise: js.Promise[Any] = js.native
    
    var redis: typingsJapgolly.ioredis.builtRedisMod.default | typingsJapgolly.ioredis.builtClusterMod.default = js.native
    
    def reject(error: js.Error): Unit = js.native
    
    /* private */ var replyPending: Any = js.native
    
    def resolve(result: Any): Unit = js.native
  }
}
