package typingsJapgolly.csstoolsPostcssSteppedValueFunctions

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@csstools/postcss-stepped-value-functions", JSImport.Default)
  @js.native
  val default: PluginCreator[pluginOptions] = js.native
  
  type _To = PluginCreator[pluginOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[pluginOptions] = default
  
  trait pluginOptions extends StObject {
    
    var onInvalid: js.UndefOr[String] = js.undefined
    
    var preserve: js.UndefOr[Boolean] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    extension [Self <: pluginOptions](x: Self) {
      
      inline def setOnInvalid(value: String): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    }
  }
}
