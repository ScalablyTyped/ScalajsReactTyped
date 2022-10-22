package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.ImageData
import typingsJapgolly.babylonjs.enginesIcanvasMod.ICanvas
import typingsJapgolly.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typingsJapgolly.babylonjs.typesMod.Nullable
import typingsJapgolly.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsEngineDotdynamicTextureMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    trait ThinEngine extends StObject {
      
      /**
        * Creates a dynamic texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param generateMipMaps defines if the engine should generate the mip levels
        * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
        * @returns the dynamic texture inside an InternalTexture
        */
      def createDynamicTexture(width: Double, height: Double, generateMipMaps: Boolean, samplingMode: Double): InternalTexture
      
      /**
        * Update the content of a dynamic texture
        * @param texture defines the texture to update
        * @param source defines the source containing the data
        * @param invertY defines if data must be stored with Y axis inverted
        * @param premulAlpha defines if alpha is stored as premultiplied
        * @param format defines the format of the data
        * @param forceBindTexture if the texture should be forced to be bound eg. after a graphics context loss (Default: false)
        * @param allowGPUOptimization true to allow some specific GPU optimizations (subject to engine feature "allowGPUOptimizationsForGUI" being true)
        */
      def updateDynamicTexture(
        texture: Nullable[InternalTexture],
        source: ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas | ICanvas,
        invertY: js.UndefOr[Boolean],
        premulAlpha: js.UndefOr[Boolean],
        format: js.UndefOr[Double],
        forceBindTexture: js.UndefOr[Boolean],
        allowGPUOptimization: js.UndefOr[Boolean]
      ): Unit
    }
    object ThinEngine {
      
      inline def apply(
        createDynamicTexture: (Double, Double, Boolean, Double) => InternalTexture,
        updateDynamicTexture: (Nullable[InternalTexture], ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas | ICanvas, js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Double], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Callback
      ): ThinEngine = {
        val __obj = js.Dynamic.literal(createDynamicTexture = js.Any.fromFunction4(createDynamicTexture), updateDynamicTexture = js.Any.fromFunction7((t0: Nullable[InternalTexture], t1: ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas | ICanvas, t2: js.UndefOr[Boolean], t3: js.UndefOr[Boolean], t4: js.UndefOr[Double], t5: js.UndefOr[Boolean], t6: js.UndefOr[Boolean]) => (updateDynamicTexture(t0, t1, t2, t3, t4, t5, t6)).runNow()))
        __obj.asInstanceOf[ThinEngine]
      }
      
      extension [Self <: ThinEngine](x: Self) {
        
        inline def setCreateDynamicTexture(value: (Double, Double, Boolean, Double) => InternalTexture): Self = StObject.set(x, "createDynamicTexture", js.Any.fromFunction4(value))
        
        inline def setUpdateDynamicTexture(
          value: (Nullable[InternalTexture], ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas | ICanvas, js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Double], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Callback
        ): Self = StObject.set(x, "updateDynamicTexture", js.Any.fromFunction7((t0: Nullable[InternalTexture], t1: ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas | ICanvas, t2: js.UndefOr[Boolean], t3: js.UndefOr[Boolean], t4: js.UndefOr[Double], t5: js.UndefOr[Boolean], t6: js.UndefOr[Boolean]) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
      }
    }
  }
}
