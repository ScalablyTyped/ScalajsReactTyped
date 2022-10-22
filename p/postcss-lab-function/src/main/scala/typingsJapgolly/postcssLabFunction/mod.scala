package typingsJapgolly.postcssLabFunction

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.postcss.mod.PluginCreator
import typingsJapgolly.postcssLabFunction.anon.DisplayP3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-lab-function", JSImport.Default)
  @js.native
  val default: PluginCreator[pluginOptions] = js.native
  
  type _To = PluginCreator[pluginOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[pluginOptions] = default
  
  trait pluginOptions extends StObject {
    
    var enableProgressiveCustomProperties: js.UndefOr[Boolean] = js.undefined
    
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    var subFeatures: js.UndefOr[DisplayP3] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    extension [Self <: pluginOptions](x: Self) {
      
      inline def setEnableProgressiveCustomProperties(value: Boolean): Self = StObject.set(x, "enableProgressiveCustomProperties", value.asInstanceOf[js.Any])
      
      inline def setEnableProgressiveCustomPropertiesUndefined: Self = StObject.set(x, "enableProgressiveCustomProperties", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setSubFeatures(value: DisplayP3): Self = StObject.set(x, "subFeatures", value.asInstanceOf[js.Any])
      
      inline def setSubFeaturesUndefined: Self = StObject.set(x, "subFeatures", js.undefined)
    }
  }
}
