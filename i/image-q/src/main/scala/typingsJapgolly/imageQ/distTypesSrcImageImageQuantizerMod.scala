package typingsJapgolly.imageQ

import typingsJapgolly.imageQ.distTypesSrcImageImageQuantizerYieldValueMod.ImageQuantizerYieldValue
import typingsJapgolly.imageQ.distTypesSrcUtilsPaletteMod.Palette
import typingsJapgolly.imageQ.distTypesSrcUtilsPointContainerMod.PointContainer
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcImageImageQuantizerMod {
  
  /* note: abstract class */ @JSImport("image-q/dist/types/src/image/imageQuantizer", "AbstractImageQuantizer")
  @js.native
  open class AbstractImageQuantizer () extends StObject {
    
    def quantize(pointContainer: PointContainer, palette: Palette): IterableIterator[ImageQuantizerYieldValue] = js.native
    
    def quantizeSync(pointContainer: PointContainer, palette: Palette): PointContainer = js.native
  }
}
