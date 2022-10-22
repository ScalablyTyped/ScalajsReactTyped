package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.FontsClass
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.OptimizationUnion
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.StylesClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsNormalizeOptimizationMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/normalize-optimization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeOptimization(): NormalizedOptimizationOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeOptimization")().asInstanceOf[NormalizedOptimizationOptions]
  inline def normalizeOptimization(optimization: OptimizationUnion): NormalizedOptimizationOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeOptimization")(optimization.asInstanceOf[js.Any]).asInstanceOf[NormalizedOptimizationOptions]
  
  /* Inlined std.Required<std.Omit<@angular-devkit/build-angular.@angular-devkit/build-angular/src/builders/browser/schema.OptimizationClass, 'fonts' | 'styles'>> & {  fonts :@angular-devkit/build-angular.@angular-devkit/build-angular/src/builders/browser/schema.FontsClass,   styles :@angular-devkit/build-angular.@angular-devkit/build-angular/src/builders/browser/schema.StylesClass} */
  trait NormalizedOptimizationOptions extends StObject {
    
    var fonts: FontsClass
    
    var scripts: Boolean
    
    var styles: StylesClass
  }
  object NormalizedOptimizationOptions {
    
    inline def apply(fonts: FontsClass, scripts: Boolean, styles: StylesClass): NormalizedOptimizationOptions = {
      val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedOptimizationOptions]
    }
    
    extension [Self <: NormalizedOptimizationOptions](x: Self) {
      
      inline def setFonts(value: FontsClass): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setScripts(value: Boolean): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: StylesClass): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
