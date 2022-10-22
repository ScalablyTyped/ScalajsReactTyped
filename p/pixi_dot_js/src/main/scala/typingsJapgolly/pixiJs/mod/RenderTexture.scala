package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiCore.mod.IBaseTextureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "RenderTexture")
@js.native
open class RenderTexture protected ()
  extends typingsJapgolly.pixiCore.mod.RenderTexture {
  /**
    * @param baseRenderTexture - The base texture object that this texture uses.
    * @param frame - The rectangle frame of the texture to show.
    */
  def this(baseRenderTexture: typingsJapgolly.pixiCore.mod.BaseRenderTexture) = this()
  def this(
    baseRenderTexture: typingsJapgolly.pixiCore.mod.BaseRenderTexture,
    frame: typingsJapgolly.pixiMath.mod.Rectangle
  ) = this()
}
/* static members */
object RenderTexture {
  
  @JSImport("pixi.js", "RenderTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A short hand way of creating a render texture.
    * @param options - Options
    * @param {number} [options.width=100] - The width of the render texture
    * @param {number} [options.height=100] - The height of the render texture
    * @param {PIXI.SCALE_MODES} [options.scaleMode=PIXI.settings.SCALE_MODE] - See {@link PIXI.SCALE_MODES}
    *    for possible values
    * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio of the texture
    *    being generated
    * @param {PIXI.MSAA_QUALITY} [options.multisample=PIXI.MSAA_QUALITY.NONE] - The number of samples of the frame buffer
    * @returns The new render texture
    */
  inline def create(): typingsJapgolly.pixiCore.mod.RenderTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.pixiCore.mod.RenderTexture]
  inline def create(options: IBaseTextureOptions[Any]): typingsJapgolly.pixiCore.mod.RenderTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.pixiCore.mod.RenderTexture]
  /**
    * Use the object-based construction instead.
    * @deprecated since 6.0.0
    * @param {number} [width]
    * @param {number} [height]
    * @param {PIXI.SCALE_MODES} [scaleMode=PIXI.settings.SCALE_MODE]
    * @param {number} [resolution=PIXI.settings.FILTER_RESOLUTION]
    */
  inline def create(width: Double, height: Double): typingsJapgolly.pixiCore.mod.RenderTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.RenderTexture]
  inline def create(width: Double, height: Double, scaleMode: Unit, resolution: Double): typingsJapgolly.pixiCore.mod.RenderTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scaleMode.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.RenderTexture]
  inline def create(width: Double, height: Double, scaleMode: typingsJapgolly.pixiConstants.mod.SCALE_MODES): typingsJapgolly.pixiCore.mod.RenderTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scaleMode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.RenderTexture]
  inline def create(
    width: Double,
    height: Double,
    scaleMode: typingsJapgolly.pixiConstants.mod.SCALE_MODES,
    resolution: Double
  ): typingsJapgolly.pixiCore.mod.RenderTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scaleMode.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.RenderTexture]
}
