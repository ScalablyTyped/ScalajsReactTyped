package typingsJapgolly.imageQ.mod

import typingsJapgolly.imageQ.distTypesSrcDistanceDistanceCalculatorMod.AbstractDistanceCalculator
import typingsJapgolly.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object image {
  
  /* note: abstract class */ @JSImport("image-q", "image.AbstractImageQuantizer")
  @js.native
  open class AbstractImageQuantizer ()
    extends typingsJapgolly.imageQ.distTypesSrcImageMod.AbstractImageQuantizer
  
  @JSImport("image-q", "image.ErrorDiffusionArray")
  @js.native
  open class ErrorDiffusionArray protected ()
    extends typingsJapgolly.imageQ.distTypesSrcImageMod.ErrorDiffusionArray {
    def this(colorDistanceCalculator: AbstractDistanceCalculator, kernel: ErrorDiffusionArrayKernel) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean,
      minimumColorDistanceToDither: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Unit,
      minimumColorDistanceToDither: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean,
      minimumColorDistanceToDither: Double,
      calculateErrorLikeGIMP: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean,
      minimumColorDistanceToDither: Unit,
      calculateErrorLikeGIMP: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Unit,
      minimumColorDistanceToDither: Double,
      calculateErrorLikeGIMP: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Unit,
      minimumColorDistanceToDither: Unit,
      calculateErrorLikeGIMP: Boolean
    ) = this()
  }
  
  @JSImport("image-q", "image.ErrorDiffusionArrayKernel")
  @js.native
  object ErrorDiffusionArrayKernel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel & Double
      ] = js.native
    
    /* 3 */ val Atkinson: typingsJapgolly.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Atkinson & Double = js.native
    
    /* 5 */ val Burkes: typingsJapgolly.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Burkes & Double = js.native
    
    /* 1 */ val FalseFloydSteinberg: typingsJapgolly.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.FalseFloydSteinberg & Double = js.native
    
    /* 0 */ val FloydSteinberg: typingsJapgolly.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.FloydSteinberg & Double = js.native
    
    /* 4 */ val Jarvis: typingsJapgolly.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Jarvis & Double = js.native
    
    /* 6 */ val Sierra: typingsJapgolly.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Sierra & Double = js.native
    
    /* 8 */ val SierraLite: typingsJapgolly.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.SierraLite & Double = js.native
    
    /* 2 */ val Stucki: typingsJapgolly.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Stucki & Double = js.native
    
    /* 7 */ val TwoSierra: typingsJapgolly.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.TwoSierra & Double = js.native
  }
  
  @JSImport("image-q", "image.ErrorDiffusionRiemersma")
  @js.native
  open class ErrorDiffusionRiemersma protected ()
    extends typingsJapgolly.imageQ.distTypesSrcImageMod.ErrorDiffusionRiemersma {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, errorQueueSize: Double) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      errorQueueSize: Double,
      errorPropagation: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      errorQueueSize: Unit,
      errorPropagation: Double
    ) = this()
  }
  /* static members */
  object ErrorDiffusionRiemersma {
    
    @JSImport("image-q", "image.ErrorDiffusionRiemersma")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("image-q", "image.ErrorDiffusionRiemersma._createWeights")
    @js.native
    def _createWeights: Any = js.native
    inline def _createWeights_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_createWeights")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("image-q", "image.NearestColor")
  @js.native
  open class NearestColor protected ()
    extends typingsJapgolly.imageQ.distTypesSrcImageMod.NearestColor {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
  }
}
