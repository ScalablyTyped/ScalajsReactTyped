package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.SourceMapClass
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.SourceMapUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsNormalizeSourceMapsMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/normalize-source-maps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeSourceMaps(sourceMap: SourceMapUnion): SourceMapClass = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSourceMaps")(sourceMap.asInstanceOf[js.Any]).asInstanceOf[SourceMapClass]
}
