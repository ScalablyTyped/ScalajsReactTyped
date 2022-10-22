package typingsJapgolly.pixiJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.pixiCore.mod.ISpriteMaskTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filters {
  
  @JSImport("pixi.js", "filters")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "filters.AlphaFilter")
  @js.native
  /**
    * @param alpha - Amount of alpha from 0 to 1, where 0 is transparent
    */
  open class AlphaFilter ()
    extends typingsJapgolly.pixiFilterAlpha.mod.AlphaFilter
  @JSImport("pixi.js", "filters.AlphaFilter")
  @js.native
  def AlphaFilter: Instantiable0[typingsJapgolly.pixiFilterAlpha.mod.AlphaFilter] = js.native
  inline def AlphaFilter_=(x: Instantiable0[typingsJapgolly.pixiFilterAlpha.mod.AlphaFilter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlphaFilter")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "filters.BlurFilter")
  @js.native
  /**
    * @param strength - The strength of the blur filter.
    * @param quality - The quality of the blur filter.
    * @param [resolution=PIXI.settings.FILTER_RESOLUTION] - The resolution of the blur filter.
    * @param kernelSize - The kernelSize of the blur filter.Options: 5, 7, 9, 11, 13, 15.
    */
  open class BlurFilter ()
    extends typingsJapgolly.pixiFilterBlur.mod.BlurFilter
  @JSImport("pixi.js", "filters.BlurFilter")
  @js.native
  def BlurFilter: Instantiable0[typingsJapgolly.pixiFilterBlur.mod.BlurFilter] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "filters.BlurFilterPass")
  @js.native
  open class BlurFilterPass protected ()
    extends typingsJapgolly.pixiFilterBlur.mod.BlurFilterPass {
    /**
      * @param horizontal - Do pass along the x-axis (`true`) or y-axis (`false`).
      * @param strength - The strength of the blur filter.
      * @param quality - The quality of the blur filter.
      * @param resolution - The resolution of the blur filter.
      * @param kernelSize - The kernelSize of the blur filter.Options: 5, 7, 9, 11, 13, 15.
      */
    def this(horizontal: Boolean) = this()
  }
  @JSImport("pixi.js", "filters.BlurFilterPass")
  @js.native
  def BlurFilterPass: Instantiable1[/* horizontal */ Boolean, typingsJapgolly.pixiFilterBlur.mod.BlurFilterPass] = js.native
  inline def BlurFilterPass_=(x: Instantiable1[/* horizontal */ Boolean, typingsJapgolly.pixiFilterBlur.mod.BlurFilterPass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlurFilterPass")(x.asInstanceOf[js.Any])
  
  inline def BlurFilter_=(x: Instantiable0[typingsJapgolly.pixiFilterBlur.mod.BlurFilter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlurFilter")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "filters.ColorMatrixFilter")
  @js.native
  open class ColorMatrixFilter ()
    extends typingsJapgolly.pixiFilterColorMatrix.mod.ColorMatrixFilter
  @JSImport("pixi.js", "filters.ColorMatrixFilter")
  @js.native
  def ColorMatrixFilter: Instantiable0[typingsJapgolly.pixiFilterColorMatrix.mod.ColorMatrixFilter] = js.native
  inline def ColorMatrixFilter_=(x: Instantiable0[typingsJapgolly.pixiFilterColorMatrix.mod.ColorMatrixFilter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ColorMatrixFilter")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "filters.DisplacementFilter")
  @js.native
  open class DisplacementFilter protected ()
    extends typingsJapgolly.pixiFilterDisplacement.mod.DisplacementFilter {
    /**
      * @param {PIXI.Sprite} sprite - The sprite used for the displacement map. (make sure its added to the scene!)
      * @param scale - The scale of the displacement
      */
    def this(sprite: ISpriteMaskTarget) = this()
  }
  @JSImport("pixi.js", "filters.DisplacementFilter")
  @js.native
  def DisplacementFilter: Instantiable1[
    /* sprite */ ISpriteMaskTarget, 
    typingsJapgolly.pixiFilterDisplacement.mod.DisplacementFilter
  ] = js.native
  inline def DisplacementFilter_=(
    x: Instantiable1[
      /* sprite */ ISpriteMaskTarget, 
      typingsJapgolly.pixiFilterDisplacement.mod.DisplacementFilter
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DisplacementFilter")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "filters.FXAAFilter")
  @js.native
  open class FXAAFilter ()
    extends typingsJapgolly.pixiFilterFxaa.mod.FXAAFilter
  @JSImport("pixi.js", "filters.FXAAFilter")
  @js.native
  def FXAAFilter: Instantiable0[typingsJapgolly.pixiFilterFxaa.mod.FXAAFilter] = js.native
  inline def FXAAFilter_=(x: Instantiable0[typingsJapgolly.pixiFilterFxaa.mod.FXAAFilter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FXAAFilter")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "filters.NoiseFilter")
  @js.native
  /**
    * @param {number} [noise=0.5] - The noise intensity, should be a normalized value in the range [0, 1].
    * @param {number} [seed] - A random seed for the noise generation. Default is `Math.random()`.
    */
  open class NoiseFilter ()
    extends typingsJapgolly.pixiFilterNoise.mod.NoiseFilter
  @JSImport("pixi.js", "filters.NoiseFilter")
  @js.native
  def NoiseFilter: Instantiable0[typingsJapgolly.pixiFilterNoise.mod.NoiseFilter] = js.native
  inline def NoiseFilter_=(x: Instantiable0[typingsJapgolly.pixiFilterNoise.mod.NoiseFilter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoiseFilter")(x.asInstanceOf[js.Any])
}
