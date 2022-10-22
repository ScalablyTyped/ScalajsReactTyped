package typingsJapgolly.azureSb

import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServiceclientMod {
  
  @JSImport("azure-sb/lib/serviceclient", JSImport.Namespace)
  @js.native
  open class ^ () extends ServiceClient
  
  @js.native
  trait ServiceClient extends EventEmitter {
    
    var host: String = js.native
    
    var port: Double = js.native
    
    var protocol: String = js.native
  }
}
