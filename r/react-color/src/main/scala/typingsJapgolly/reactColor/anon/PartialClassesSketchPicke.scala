package typingsJapgolly.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/sketch/Sketch.SketchPickerStylesProps>> */
trait PartialClassesSketchPicke extends StObject {
  
  var default: js.UndefOr[PartialSketchPickerStyles] = js.undefined
}
object PartialClassesSketchPicke {
  
  inline def apply(): PartialClassesSketchPicke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesSketchPicke]
  }
  
  extension [Self <: PartialClassesSketchPicke](x: Self) {
    
    inline def setDefault(value: PartialSketchPickerStyles): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
