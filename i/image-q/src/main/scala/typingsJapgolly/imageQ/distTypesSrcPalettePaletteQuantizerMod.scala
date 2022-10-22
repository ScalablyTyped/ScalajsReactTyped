package typingsJapgolly.imageQ

import typingsJapgolly.imageQ.distTypesSrcPalettePaletteQuantizerYieldValueMod.PaletteQuantizerYieldValue
import typingsJapgolly.imageQ.distTypesSrcUtilsMod.Palette
import typingsJapgolly.imageQ.distTypesSrcUtilsPointContainerMod.PointContainer
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcPalettePaletteQuantizerMod {
  
  /* note: abstract class */ @JSImport("image-q/dist/types/src/palette/paletteQuantizer", "AbstractPaletteQuantizer")
  @js.native
  open class AbstractPaletteQuantizer () extends StObject {
    
    def quantize(): IterableIterator[PaletteQuantizerYieldValue] = js.native
    
    def quantizeSync(): Palette = js.native
    
    def sample(pointContainer: PointContainer): Unit = js.native
  }
}
