package typingsJapgolly.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/block/Block.BlockPickerStylesProps>> */
trait PartialClassesBlockPicker extends StObject {
  
  var default: js.UndefOr[PartialBlockPickerStylesP] = js.undefined
}
object PartialClassesBlockPicker {
  
  inline def apply(): PartialClassesBlockPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesBlockPicker]
  }
  
  extension [Self <: PartialClassesBlockPicker](x: Self) {
    
    inline def setDefault(value: PartialBlockPickerStylesP): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
