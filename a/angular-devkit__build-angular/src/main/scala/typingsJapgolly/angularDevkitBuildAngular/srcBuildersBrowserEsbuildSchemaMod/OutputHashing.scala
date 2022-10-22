package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutputHashing extends StObject
@JSImport("@angular-devkit/build-angular/src/builders/browser-esbuild/schema", "OutputHashing")
@js.native
object OutputHashing extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OutputHashing & String] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with OutputHashing
  /* "all" */ val All: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.OutputHashing.All & String = js.native
  
  @js.native
  sealed trait Bundles
    extends StObject
       with OutputHashing
  /* "bundles" */ val Bundles: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.OutputHashing.Bundles & String = js.native
  
  @js.native
  sealed trait Media
    extends StObject
       with OutputHashing
  /* "media" */ val Media: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.OutputHashing.Media & String = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with OutputHashing
  /* "none" */ val None: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.OutputHashing.None & String = js.native
}
