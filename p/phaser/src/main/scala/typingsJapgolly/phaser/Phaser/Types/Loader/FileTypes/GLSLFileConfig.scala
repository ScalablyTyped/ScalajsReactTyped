package typingsJapgolly.phaser.Phaser.Types.Loader.FileTypes

import typingsJapgolly.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GLSLFileConfig extends StObject {
  
  /**
    * The default file extension to use if no url is provided.
    */
  var `extension`: js.UndefOr[String] = js.undefined
  
  /**
    * The key of the file. Must be unique within both the Loader and the Text Cache.
    */
  var key: String
  
  /**
    * The type of shader. Either `fragment` for a fragment shader, or `vertex` for a vertex shader. This is ignored if you load a shader bundle.
    */
  var shaderType: js.UndefOr[String] = js.undefined
  
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}
object GLSLFileConfig {
  
  inline def apply(key: String): GLSLFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLSLFileConfig]
  }
  
  extension [Self <: GLSLFileConfig](x: Self) {
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setShaderType(value: String): Self = StObject.set(x, "shaderType", value.asInstanceOf[js.Any])
    
    inline def setShaderTypeUndefined: Self = StObject.set(x, "shaderType", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    inline def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
