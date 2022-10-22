package typingsJapgolly.lasso

import typingsJapgolly.lasso.libDependenciesMod.DependencyRegistry
import typingsJapgolly.lasso.libWritersWriterMod.Writer
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLassoContextMod {
  
  @JSImport("lasso/lib/LassoContext", JSImport.Default)
  @js.native
  open class default () extends LassoContext
  
  @js.native
  trait LassoContext extends EventEmitter {
    
    var LassoContext: Boolean = js.native
    
    var basePath: js.UndefOr[String] = js.native
    
    var cache: Any = js.native
    
    var config: Any = js.native
    
    var contentType: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[Any] = js.native
    
    var dependencyRegistry: DependencyRegistry = js.native
    
    var flags: js.Array[Any] = js.native
    
    var lasso: typingsJapgolly.lasso.libLassoMod.default = js.native
    
    var options: Any = js.native
    
    def writer(impl: Any): Writer = js.native
    @JSName("writer")
    var writer_Original: typingsJapgolly.lasso.libWritersMod.Writer = js.native
  }
}
