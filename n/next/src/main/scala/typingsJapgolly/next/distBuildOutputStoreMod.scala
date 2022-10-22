package typingsJapgolly.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildOutputStoreMod {
  
  @JSImport("next/dist/build/output/store", "store")
  @js.native
  val store: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_unistore.Store<OutputState> */ Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.anon.AppUrl
    - typingsJapgolly.next.anon.loadingtruetriggerstringu
    - typingsJapgolly.next.anon.loadingfalsetypeCheckingb
  */
  trait OutputState extends StObject
  object OutputState {
    
    inline def AppUrl(): typingsJapgolly.next.anon.AppUrl = {
      val __obj = js.Dynamic.literal(bootstrap = true, appUrl = null, bindAddr = null)
      __obj.asInstanceOf[typingsJapgolly.next.anon.AppUrl]
    }
    
    inline def loadingfalsetypeCheckingb(hasEdgeServer: Boolean, modules: Double, typeChecking: Boolean): typingsJapgolly.next.anon.loadingfalsetypeCheckingb = {
      val __obj = js.Dynamic.literal(bootstrap = false, hasEdgeServer = hasEdgeServer.asInstanceOf[js.Any], loading = false, modules = modules.asInstanceOf[js.Any], typeChecking = typeChecking.asInstanceOf[js.Any], appUrl = null, bindAddr = null, errors = null, warnings = null)
      __obj.asInstanceOf[typingsJapgolly.next.anon.loadingfalsetypeCheckingb]
    }
    
    inline def loadingtruetriggerstringu(): typingsJapgolly.next.anon.loadingtruetriggerstringu = {
      val __obj = js.Dynamic.literal(bootstrap = false, loading = true, appUrl = null, bindAddr = null)
      __obj.asInstanceOf[typingsJapgolly.next.anon.loadingtruetriggerstringu]
    }
  }
}
