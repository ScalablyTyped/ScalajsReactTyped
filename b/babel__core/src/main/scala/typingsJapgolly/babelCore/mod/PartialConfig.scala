package typingsJapgolly.babelCore.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialConfig extends StObject {
  
  var babelignore: js.UndefOr[String] = js.undefined
  
  var babelrc: js.UndefOr[String] = js.undefined
  
  var config: js.UndefOr[String] = js.undefined
  
  def hasFilesystemConfig(): Boolean
  
  var options: TransformOptions
}
object PartialConfig {
  
  inline def apply(hasFilesystemConfig: CallbackTo[Boolean], options: TransformOptions): PartialConfig = {
    val __obj = js.Dynamic.literal(hasFilesystemConfig = hasFilesystemConfig.toJsFn, options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfig]
  }
  
  extension [Self <: PartialConfig](x: Self) {
    
    inline def setBabelignore(value: String): Self = StObject.set(x, "babelignore", value.asInstanceOf[js.Any])
    
    inline def setBabelignoreUndefined: Self = StObject.set(x, "babelignore", js.undefined)
    
    inline def setBabelrc(value: String): Self = StObject.set(x, "babelrc", value.asInstanceOf[js.Any])
    
    inline def setBabelrcUndefined: Self = StObject.set(x, "babelrc", js.undefined)
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setHasFilesystemConfig(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasFilesystemConfig", value.toJsFn)
    
    inline def setOptions(value: TransformOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
