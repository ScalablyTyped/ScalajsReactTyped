package typingsJapgolly.protractor

import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.protractor.builtConfigMod.Config
import typingsJapgolly.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtBpRunnerMod {
  
  @JSImport("protractor/built/bpRunner", "BlockingProxyRunner")
  @js.native
  open class BlockingProxyRunner protected () extends StObject {
    def this(config: Config) = this()
    
    var bpProcess: ChildProcess = js.native
    
    def checkSupportedConfig(): Unit = js.native
    
    /* private */ var config: Any = js.native
    
    var port: Double = js.native
    
    def start(): Promise[js.Object] = js.native
  }
}
