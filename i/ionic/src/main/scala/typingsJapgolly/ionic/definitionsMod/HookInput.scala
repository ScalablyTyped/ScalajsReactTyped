package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.ionicStrings.buildColonafter
import typingsJapgolly.ionic.ionicStrings.buildColonbefore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.definitionsMod.BuildHookInput
  - typingsJapgolly.ionic.definitionsMod.ServeBeforeHookInput
  - typingsJapgolly.ionic.definitionsMod.ServeAfterHookInput
*/
trait HookInput extends StObject
object HookInput {
  
  inline def BuildHookInput(
    build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions,
    name: buildColonbefore | buildColonafter
  ): typingsJapgolly.ionic.definitionsMod.BuildHookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.BuildHookInput]
  }
  
  inline def ServeAfterHookInput(
    serve: (AngularServeOptions & ServeDetails) | (IonicAngularServeOptions & ServeDetails) | (Ionic1ServeOptions & ServeDetails)
  ): typingsJapgolly.ionic.definitionsMod.ServeAfterHookInput = {
    val __obj = js.Dynamic.literal(name = "serve:after", serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.ServeAfterHookInput]
  }
  
  inline def ServeBeforeHookInput(serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): typingsJapgolly.ionic.definitionsMod.ServeBeforeHookInput = {
    val __obj = js.Dynamic.literal(name = "serve:before", serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.ServeBeforeHookInput]
  }
}
