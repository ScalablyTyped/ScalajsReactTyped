package typingsJapgolly.serverDestroy

import typingsJapgolly.node.netMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(server: Server): Unit = ^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("server-destroy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object netAugmentingMod {
    
    @js.native
    trait Server extends StObject {
      
      def destroy(): Unit = js.native
      def destroy(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    }
  }
}
