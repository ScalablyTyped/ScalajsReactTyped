package typingsJapgolly.ioredis

import typingsJapgolly.ioredis.anon.Pipeline
import typingsJapgolly.ioredis.anon.`2`
import typingsJapgolly.ioredis.builtUtilsRedisCommanderMod.ChainableCommander
import typingsJapgolly.ioredis.ioredisStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtTransactionMod {
  
  @JSImport("ioredis/built/transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTransactionSupport(redis: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTransactionSupport")(redis.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait Transaction extends StObject {
    
    def multi(): ChainableCommander = js.native
    def multi(commands: js.Array[js.Array[Any]]): ChainableCommander = js.native
    def multi(options: Pipeline): js.Promise[OK] = js.native
    def multi(options: `2`): ChainableCommander = js.native
    
    def pipeline(): ChainableCommander = js.native
    def pipeline(commands: js.Array[js.Array[Any]]): ChainableCommander = js.native
  }
}
