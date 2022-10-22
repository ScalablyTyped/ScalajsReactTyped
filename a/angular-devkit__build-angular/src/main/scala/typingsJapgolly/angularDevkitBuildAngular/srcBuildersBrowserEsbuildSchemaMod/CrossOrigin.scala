package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CrossOrigin extends StObject
@JSImport("@angular-devkit/build-angular/src/builders/browser-esbuild/schema", "CrossOrigin")
@js.native
object CrossOrigin extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CrossOrigin & String] = js.native
  
  @js.native
  sealed trait Anonymous
    extends StObject
       with CrossOrigin
  /* "anonymous" */ val Anonymous: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.CrossOrigin.Anonymous & String = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with CrossOrigin
  /* "none" */ val None: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.CrossOrigin.None & String = js.native
  
  @js.native
  sealed trait UseCredentials
    extends StObject
       with CrossOrigin
  /* "use-credentials" */ val UseCredentials: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.CrossOrigin.UseCredentials & String = js.native
}
