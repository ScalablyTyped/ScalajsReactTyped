package typingsJapgolly.wdioTypes.buildOptionsMod

import typingsJapgolly.std.Record
import typingsJapgolly.wdioTypes.buildCompilerMod.RegisterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCompileConfig extends StObject {
  
  var autoCompile: js.UndefOr[Boolean] = js.undefined
  
  var babelOpts: js.UndefOr[Record[String, Any]] = js.undefined
  
  var tsConfigPathsOpts: js.UndefOr[TSConfigPathsOptions] = js.undefined
  
  var tsNodeOpts: js.UndefOr[RegisterOptions] = js.undefined
}
object AutoCompileConfig {
  
  inline def apply(): AutoCompileConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompileConfig]
  }
  
  extension [Self <: AutoCompileConfig](x: Self) {
    
    inline def setAutoCompile(value: Boolean): Self = StObject.set(x, "autoCompile", value.asInstanceOf[js.Any])
    
    inline def setAutoCompileUndefined: Self = StObject.set(x, "autoCompile", js.undefined)
    
    inline def setBabelOpts(value: Record[String, Any]): Self = StObject.set(x, "babelOpts", value.asInstanceOf[js.Any])
    
    inline def setBabelOptsUndefined: Self = StObject.set(x, "babelOpts", js.undefined)
    
    inline def setTsConfigPathsOpts(value: TSConfigPathsOptions): Self = StObject.set(x, "tsConfigPathsOpts", value.asInstanceOf[js.Any])
    
    inline def setTsConfigPathsOptsUndefined: Self = StObject.set(x, "tsConfigPathsOpts", js.undefined)
    
    inline def setTsNodeOpts(value: RegisterOptions): Self = StObject.set(x, "tsNodeOpts", value.asInstanceOf[js.Any])
    
    inline def setTsNodeOptsUndefined: Self = StObject.set(x, "tsNodeOpts", js.undefined)
  }
}
