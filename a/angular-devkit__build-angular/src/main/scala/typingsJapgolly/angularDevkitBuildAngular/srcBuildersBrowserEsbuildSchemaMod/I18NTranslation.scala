package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait I18NTranslation extends StObject
@JSImport("@angular-devkit/build-angular/src/builders/browser-esbuild/schema", "I18NTranslation")
@js.native
object I18NTranslation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[I18NTranslation & String] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with I18NTranslation
  /* "error" */ val Error: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.I18NTranslation.Error & String = js.native
  
  @js.native
  sealed trait Ignore
    extends StObject
       with I18NTranslation
  /* "ignore" */ val Ignore: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.I18NTranslation.Ignore & String = js.native
  
  @js.native
  sealed trait Warning
    extends StObject
       with I18NTranslation
  /* "warning" */ val Warning: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.I18NTranslation.Warning & String = js.native
}
