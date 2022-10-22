package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.mod.CategoryScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsCategoryScaleOptions extends StObject {
  
  var options: CategoryScaleOptions
}
object OptionsCategoryScaleOptions {
  
  inline def apply(options: CategoryScaleOptions): OptionsCategoryScaleOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsCategoryScaleOptions]
  }
  
  extension [Self <: OptionsCategoryScaleOptions](x: Self) {
    
    inline def setOptions(value: CategoryScaleOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
