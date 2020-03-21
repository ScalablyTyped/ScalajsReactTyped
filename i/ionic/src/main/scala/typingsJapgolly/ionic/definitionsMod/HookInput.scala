package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.ionicStrings.buildColonafter
import typingsJapgolly.ionic.ionicStrings.buildColonbefore
import typingsJapgolly.ionic.ionicStrings.serveColonafter
import typingsJapgolly.ionic.ionicStrings.serveColonbefore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.definitionsMod.BuildHookInput
  - typingsJapgolly.ionic.definitionsMod.ServeBeforeHookInput
  - typingsJapgolly.ionic.definitionsMod.ServeAfterHookInput
*/
trait HookInput extends js.Object

object HookInput {
  @scala.inline
  def BuildHookInput(
    build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions,
    name: buildColonbefore | buildColonafter
  ): HookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookInput]
  }
  @scala.inline
  def ServeBeforeHookInput(name: serveColonbefore, serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): HookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookInput]
  }
  @scala.inline
  def ServeAfterHookInput(
    name: serveColonafter,
    serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails
  ): HookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookInput]
  }
}

