package typingsJapgolly.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRouterControllerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/router/Controller", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Controller
  @JSImport("@nginstack/engine/lib/router/Controller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrap(`object`: Any): Controller = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(`object`.asInstanceOf[js.Any]).asInstanceOf[Controller]
  
  @js.native
  trait Controller extends StObject {
    
    /* protected */ var actions_ : Any = js.native
    
    def badRequest(): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    def badRequest(opt_content: Any): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def created(): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    def created(opt_content: Any): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def forbidden(): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    def forbidden(opt_content: Any): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def hasAction(name: String): Boolean = js.native
    
    var moduleFileName: String = js.native
    
    /* private */ var newResult_ : Any = js.native
    
    def noContent(): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def notFound(): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    def notFound(opt_content: Any): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def notModified(): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def ok(): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    def ok(opt_content: Any): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def permanentRedirect(url: String): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def runAction(action: String, parameters: js.Array[Any], request: Request, response: Response): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def temporaryRedirect(url: String): typingsJapgolly.nginstackEngine.libRouterRouteResultMod.^ = js.native
  }
  
  type Request = typingsJapgolly.nginstackEngine.libHttpRequestMod.^
  
  type Response = typingsJapgolly.nginstackEngine.libHttpResponseMod.^
}
