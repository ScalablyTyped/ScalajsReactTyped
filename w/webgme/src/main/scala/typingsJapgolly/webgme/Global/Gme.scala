package typingsJapgolly.webgme.global

import typingsJapgolly.webgme.Core.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gme {
  
  /**
    * https://github.com/webgme/webgme/wiki/GME-Client-API
    * 
    * https://github.com/webgme/webgme/blob/master/src/client/js/client.js
    */
  @JSGlobal("Gme.Client")
  @js.native
  open class Client ()
    extends StObject
       with typingsJapgolly.webgme.Gme.Client
  
  object Concepts {
    
    @JSGlobal("Gme.Concepts")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isConnection(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConnection")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
