package typingsJapgolly.imageQ

import typingsJapgolly.imageQ.distTypesSrcUtilsMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcPalettePaletteQuantizerYieldValueMod {
  
  trait PaletteQuantizerYieldValue extends StObject {
    
    var palette: js.UndefOr[Palette] = js.undefined
    
    var progress: Double
  }
  object PaletteQuantizerYieldValue {
    
    inline def apply(progress: Double): PaletteQuantizerYieldValue = {
      val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaletteQuantizerYieldValue]
    }
    
    extension [Self <: PaletteQuantizerYieldValue](x: Self) {
      
      inline def setPalette(value: Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
}
