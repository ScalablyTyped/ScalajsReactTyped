package typingsJapgolly.imageQ

import japgolly.scalajs.react.Callback
import typingsJapgolly.imageQ.distTypesSrcUtilsPaletteMod.Palette
import typingsJapgolly.imageQ.distTypesSrcUtilsPointContainerMod.PointContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcBasicAPIMod {
  
  @JSImport("image-q/dist/types/src/basicAPI", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyPalette(image: PointContainer, palette: Palette): js.Promise[PointContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPalette")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PointContainer]]
  inline def applyPalette(
    image: PointContainer,
    palette: Palette,
    hasColorDistanceFormulaImageQuantizationOnProgress: ApplyPaletteOptions & ProgressOptions
  ): js.Promise[PointContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPalette")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], hasColorDistanceFormulaImageQuantizationOnProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PointContainer]]
  
  inline def applyPaletteSync(image: PointContainer, palette: Palette): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPaletteSync")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
  inline def applyPaletteSync(
    image: PointContainer,
    palette: Palette,
    hasColorDistanceFormulaImageQuantization: ApplyPaletteOptions
  ): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPaletteSync")(image.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], hasColorDistanceFormulaImageQuantization.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
  
  inline def buildPalette(images: js.Array[PointContainer]): js.Promise[Palette] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPalette")(images.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Palette]]
  inline def buildPalette(
    images: js.Array[PointContainer],
    hasColorDistanceFormulaPaletteQuantizationColorsOnProgress: BuildPaletteOptions & ProgressOptions
  ): js.Promise[Palette] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPalette")(images.asInstanceOf[js.Any], hasColorDistanceFormulaPaletteQuantizationColorsOnProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Palette]]
  
  inline def buildPaletteSync(images: js.Array[PointContainer]): Palette = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPaletteSync")(images.asInstanceOf[js.Any]).asInstanceOf[Palette]
  inline def buildPaletteSync(
    images: js.Array[PointContainer],
    hasColorDistanceFormulaPaletteQuantizationColors: BuildPaletteOptions
  ): Palette = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPaletteSync")(images.asInstanceOf[js.Any], hasColorDistanceFormulaPaletteQuantizationColors.asInstanceOf[js.Any])).asInstanceOf[Palette]
  
  trait ApplyPaletteOptions extends StObject {
    
    var colorDistanceFormula: js.UndefOr[ColorDistanceFormula] = js.undefined
    
    var imageQuantization: js.UndefOr[ImageQuantization] = js.undefined
  }
  object ApplyPaletteOptions {
    
    inline def apply(): ApplyPaletteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplyPaletteOptions]
    }
    
    extension [Self <: ApplyPaletteOptions](x: Self) {
      
      inline def setColorDistanceFormula(value: ColorDistanceFormula): Self = StObject.set(x, "colorDistanceFormula", value.asInstanceOf[js.Any])
      
      inline def setColorDistanceFormulaUndefined: Self = StObject.set(x, "colorDistanceFormula", js.undefined)
      
      inline def setImageQuantization(value: ImageQuantization): Self = StObject.set(x, "imageQuantization", value.asInstanceOf[js.Any])
      
      inline def setImageQuantizationUndefined: Self = StObject.set(x, "imageQuantization", js.undefined)
    }
  }
  
  trait BuildPaletteOptions extends StObject {
    
    var colorDistanceFormula: js.UndefOr[ColorDistanceFormula] = js.undefined
    
    var colors: js.UndefOr[Double] = js.undefined
    
    var paletteQuantization: js.UndefOr[PaletteQuantization] = js.undefined
  }
  object BuildPaletteOptions {
    
    inline def apply(): BuildPaletteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildPaletteOptions]
    }
    
    extension [Self <: BuildPaletteOptions](x: Self) {
      
      inline def setColorDistanceFormula(value: ColorDistanceFormula): Self = StObject.set(x, "colorDistanceFormula", value.asInstanceOf[js.Any])
      
      inline def setColorDistanceFormulaUndefined: Self = StObject.set(x, "colorDistanceFormula", js.undefined)
      
      inline def setColors(value: Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setPaletteQuantization(value: PaletteQuantization): Self = StObject.set(x, "paletteQuantization", value.asInstanceOf[js.Any])
      
      inline def setPaletteQuantizationUndefined: Self = StObject.set(x, "paletteQuantization", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.imageQ.imageQStrings.`cie94-textiles`
    - typingsJapgolly.imageQ.imageQStrings.`cie94-graphic-arts`
    - typingsJapgolly.imageQ.imageQStrings.ciede2000
    - typingsJapgolly.imageQ.imageQStrings.`color-metric`
    - typingsJapgolly.imageQ.imageQStrings.euclidean
    - typingsJapgolly.imageQ.imageQStrings.`euclidean-bt709-noalpha`
    - typingsJapgolly.imageQ.imageQStrings.`euclidean-bt709`
    - typingsJapgolly.imageQ.imageQStrings.manhattan
    - typingsJapgolly.imageQ.imageQStrings.`manhattan-bt709`
    - typingsJapgolly.imageQ.imageQStrings.`manhattan-nommyde`
    - typingsJapgolly.imageQ.imageQStrings.pngquant
  */
  trait ColorDistanceFormula extends StObject
  object ColorDistanceFormula {
    
    inline def `cie94-graphic-arts`: typingsJapgolly.imageQ.imageQStrings.`cie94-graphic-arts` = "cie94-graphic-arts".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.`cie94-graphic-arts`]
    
    inline def `cie94-textiles`: typingsJapgolly.imageQ.imageQStrings.`cie94-textiles` = "cie94-textiles".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.`cie94-textiles`]
    
    inline def ciede2000: typingsJapgolly.imageQ.imageQStrings.ciede2000 = "ciede2000".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.ciede2000]
    
    inline def `color-metric`: typingsJapgolly.imageQ.imageQStrings.`color-metric` = "color-metric".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.`color-metric`]
    
    inline def euclidean: typingsJapgolly.imageQ.imageQStrings.euclidean = "euclidean".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.euclidean]
    
    inline def `euclidean-bt709`: typingsJapgolly.imageQ.imageQStrings.`euclidean-bt709` = "euclidean-bt709".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.`euclidean-bt709`]
    
    inline def `euclidean-bt709-noalpha`: typingsJapgolly.imageQ.imageQStrings.`euclidean-bt709-noalpha` = "euclidean-bt709-noalpha".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.`euclidean-bt709-noalpha`]
    
    inline def manhattan: typingsJapgolly.imageQ.imageQStrings.manhattan = "manhattan".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.manhattan]
    
    inline def `manhattan-bt709`: typingsJapgolly.imageQ.imageQStrings.`manhattan-bt709` = "manhattan-bt709".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.`manhattan-bt709`]
    
    inline def `manhattan-nommyde`: typingsJapgolly.imageQ.imageQStrings.`manhattan-nommyde` = "manhattan-nommyde".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.`manhattan-nommyde`]
    
    inline def pngquant: typingsJapgolly.imageQ.imageQStrings.pngquant = "pngquant".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.pngquant]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.imageQ.imageQStrings.nearest
    - typingsJapgolly.imageQ.imageQStrings.riemersma
    - typingsJapgolly.imageQ.imageQStrings.`floyd-steinberg`
    - typingsJapgolly.imageQ.imageQStrings.`false-floyd-steinberg`
    - typingsJapgolly.imageQ.imageQStrings.stucki
    - typingsJapgolly.imageQ.imageQStrings.atkinson
    - typingsJapgolly.imageQ.imageQStrings.jarvis
    - typingsJapgolly.imageQ.imageQStrings.burkes
    - typingsJapgolly.imageQ.imageQStrings.sierra
    - typingsJapgolly.imageQ.imageQStrings.`two-sierra`
    - typingsJapgolly.imageQ.imageQStrings.`sierra-lite`
  */
  trait ImageQuantization extends StObject
  object ImageQuantization {
    
    inline def atkinson: typingsJapgolly.imageQ.imageQStrings.atkinson = "atkinson".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.atkinson]
    
    inline def burkes: typingsJapgolly.imageQ.imageQStrings.burkes = "burkes".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.burkes]
    
    inline def `false-floyd-steinberg`: typingsJapgolly.imageQ.imageQStrings.`false-floyd-steinberg` = "false-floyd-steinberg".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.`false-floyd-steinberg`]
    
    inline def `floyd-steinberg`: typingsJapgolly.imageQ.imageQStrings.`floyd-steinberg` = "floyd-steinberg".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.`floyd-steinberg`]
    
    inline def jarvis: typingsJapgolly.imageQ.imageQStrings.jarvis = "jarvis".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.jarvis]
    
    inline def nearest: typingsJapgolly.imageQ.imageQStrings.nearest = "nearest".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.nearest]
    
    inline def riemersma: typingsJapgolly.imageQ.imageQStrings.riemersma = "riemersma".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.riemersma]
    
    inline def sierra: typingsJapgolly.imageQ.imageQStrings.sierra = "sierra".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.sierra]
    
    inline def `sierra-lite`: typingsJapgolly.imageQ.imageQStrings.`sierra-lite` = "sierra-lite".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.`sierra-lite`]
    
    inline def stucki: typingsJapgolly.imageQ.imageQStrings.stucki = "stucki".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.stucki]
    
    inline def `two-sierra`: typingsJapgolly.imageQ.imageQStrings.`two-sierra` = "two-sierra".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.`two-sierra`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.imageQ.imageQStrings.neuquant
    - typingsJapgolly.imageQ.imageQStrings.`neuquant-float`
    - typingsJapgolly.imageQ.imageQStrings.rgbquant
    - typingsJapgolly.imageQ.imageQStrings.wuquant
  */
  trait PaletteQuantization extends StObject
  object PaletteQuantization {
    
    inline def neuquant: typingsJapgolly.imageQ.imageQStrings.neuquant = "neuquant".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.neuquant]
    
    inline def `neuquant-float`: typingsJapgolly.imageQ.imageQStrings.`neuquant-float` = "neuquant-float".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.`neuquant-float`]
    
    inline def rgbquant: typingsJapgolly.imageQ.imageQStrings.rgbquant = "rgbquant".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.rgbquant]
    
    inline def wuquant: typingsJapgolly.imageQ.imageQStrings.wuquant = "wuquant".asInstanceOf[typingsJapgolly.imageQ.imageQStrings.wuquant]
  }
  
  trait ProgressOptions extends StObject {
    
    var onProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.undefined
  }
  object ProgressOptions {
    
    inline def apply(): ProgressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressOptions]
    }
    
    extension [Self <: ProgressOptions](x: Self) {
      
      inline def setOnProgress(value: /* progress */ Double => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: /* progress */ Double) => value(t0).runNow()))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    }
  }
}
