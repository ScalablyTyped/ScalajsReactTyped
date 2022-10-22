package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InlineStyleLanguage extends StObject
@JSImport("@angular-devkit/build-angular/src/builders/browser-esbuild/schema", "InlineStyleLanguage")
@js.native
object InlineStyleLanguage extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InlineStyleLanguage & String] = js.native
  
  @js.native
  sealed trait Css
    extends StObject
       with InlineStyleLanguage
  /* "css" */ val Css: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.InlineStyleLanguage.Css & String = js.native
  
  @js.native
  sealed trait Less
    extends StObject
       with InlineStyleLanguage
  /* "less" */ val Less: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.InlineStyleLanguage.Less & String = js.native
  
  @js.native
  sealed trait Sass
    extends StObject
       with InlineStyleLanguage
  /* "sass" */ val Sass: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.InlineStyleLanguage.Sass & String = js.native
  
  @js.native
  sealed trait Scss
    extends StObject
       with InlineStyleLanguage
  /* "scss" */ val Scss: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.InlineStyleLanguage.Scss & String = js.native
}
