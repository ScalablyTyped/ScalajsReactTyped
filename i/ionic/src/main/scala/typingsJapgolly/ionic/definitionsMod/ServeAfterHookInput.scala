package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.ionicStrings.serveColonafter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServeAfterHookInput
  extends StObject
     with HookInput {
  
  val name: serveColonafter
  
  val serve: (AngularServeOptions & ServeDetails) | (IonicAngularServeOptions & ServeDetails) | (Ionic1ServeOptions & ServeDetails)
}
object ServeAfterHookInput {
  
  inline def apply(
    serve: (AngularServeOptions & ServeDetails) | (IonicAngularServeOptions & ServeDetails) | (Ionic1ServeOptions & ServeDetails)
  ): ServeAfterHookInput = {
    val __obj = js.Dynamic.literal(name = "serve:after", serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeAfterHookInput]
  }
  
  extension [Self <: ServeAfterHookInput](x: Self) {
    
    inline def setName(value: serveColonafter): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServe(
      value: (AngularServeOptions & ServeDetails) | (IonicAngularServeOptions & ServeDetails) | (Ionic1ServeOptions & ServeDetails)
    ): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
  }
}
