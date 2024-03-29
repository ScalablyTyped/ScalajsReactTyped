package typingsJapgolly.plottable

import typingsJapgolly.plottable.buildSrcComponentsComponentMod.Component
import typingsJapgolly.plottable.buildSrcScalesQuantitativeScaleMod.QuantitativeScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcComponentsGuideLineLayerMod {
  
  @JSImport("plottable/build/src/components/guideLineLayer", "GuideLineLayer")
  @js.native
  open class GuideLineLayer[D] protected () extends Component {
    def this(orientation: String) = this()
    
    /* private */ var _guideLine: Any = js.native
    
    /* protected */ def _isVertical(): Boolean = js.native
    
    /* private */ var _mode: Any = js.native
    
    /* private */ var _orientation: Any = js.native
    
    /* private */ var _pixelPosition: Any = js.native
    
    /* private */ var _scale: Any = js.native
    
    /* private */ var _scaleUpdateCallback: Any = js.native
    
    /* protected */ def _setPixelPositionWithoutChangingMode(pixelPosition: Double): Unit = js.native
    
    /* private */ var _syncPixelPositionAndValue: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    /**
      * Gets the position of the guide line in pixel-space.
      *
      * @return {number}
      */
    def pixelPosition(): Double = js.native
    /**
      * Sets the position of the guide line in pixel-space.
      * If the GuideLineLayer has a scale, the value() will be updated now and whenever the scale updates.
      *
      * @param {number} pixelPosition
      * @return {GuideLineLayer<D>} The calling GuideLineLayer.
      */
    def pixelPosition(pixelPosition: Double): this.type = js.native
    
    /**
      * Gets the QuantitativeScale on the GuideLineLayer.
      *
      * @return {QuantitativeScale<D>}
      */
    def scale(): QuantitativeScale[D] = js.native
    /**
      * Sets the QuantitativeScale on the GuideLineLayer.
      * If value() was the last property set, pixelPosition() will be updated according to the new scale.
      * If pixelPosition() was the last property set, value() will be updated according to the new scale.
      *
      * @param {QuantitativeScale<D>} scale
      * @return {GuideLineLayer<D>} The calling GuideLineLayer.
      */
    def scale(scale: QuantitativeScale[D]): this.type = js.native
    
    /**
      * Gets the value of the guide line in data-space.
      *
      * @return {D}
      */
    def value(): D = js.native
    /**
      * Sets the value of the guide line in data-space.
      * If the GuideLineLayer has a scale, pixelPosition() will be updated now and whenever the scale updates.
      *
      * @param {D} value
      * @return {GuideLineLayer<D>} The calling GuideLineLayer.
      */
    def value(value: D): this.type = js.native
  }
  /* static members */
  object GuideLineLayer {
    
    @JSImport("plottable/build/src/components/guideLineLayer", "GuideLineLayer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components/guideLineLayer", "GuideLineLayer.ORIENTATION_HORIZONTAL")
    @js.native
    def ORIENTATION_HORIZONTAL: String = js.native
    inline def ORIENTATION_HORIZONTAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIENTATION_HORIZONTAL")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components/guideLineLayer", "GuideLineLayer.ORIENTATION_VERTICAL")
    @js.native
    def ORIENTATION_VERTICAL: String = js.native
    inline def ORIENTATION_VERTICAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIENTATION_VERTICAL")(x.asInstanceOf[js.Any])
  }
}
