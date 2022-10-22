package typingsJapgolly.reactColor.anon

import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/swatches/Swatches.SwatchesPickerStylesProps> */
trait PartialSwatchesPickerStyl extends StObject {
  
  var body: js.UndefOr[CSSProperties] = js.undefined
  
  var clear: js.UndefOr[CSSProperties] = js.undefined
  
  var overflow: js.UndefOr[CSSProperties] = js.undefined
  
  var picker: js.UndefOr[CSSProperties] = js.undefined
}
object PartialSwatchesPickerStyl {
  
  inline def apply(): PartialSwatchesPickerStyl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSwatchesPickerStyl]
  }
  
  extension [Self <: PartialSwatchesPickerStyl](x: Self) {
    
    inline def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setClear(value: CSSProperties): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setOverflow(value: CSSProperties): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
  }
}
