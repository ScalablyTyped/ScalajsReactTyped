package typingsJapgolly.plottable

import typingsJapgolly.plottable.buildSrcAxesAxisMod.Axis
import typingsJapgolly.plottable.buildSrcAxesAxisMod.AxisOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAxesCategoryAxisMod {
  
  @JSImport("plottable/build/src/axes/categoryAxis", "Category")
  @js.native
  open class Category protected () extends Axis[String] {
    /**
      * Constructs a Category Axis.
      *
      * A Category Axis is a visual representation of a Category Scale.
      *
      * @constructor
      * @param {Scales.Category} scale
      * @param {AxisOrientation} [orientation="bottom"] Orientation of this Category Axis.
      */
    def this(scale: typingsJapgolly.plottable.buildSrcScalesMod.Category) = this()
    def this(scale: typingsJapgolly.plottable.buildSrcScalesMod.Category, orientation: AxisOrientation) = this()
    
    /**
      * Write ticks to the DOM.
      * @param {Plottable.Scales.Category} scale The scale this axis is representing.
      * @param {d3.Selection} ticks The tick elements to write.
      */
    /* private */ var _drawTicks: Any = js.native
    
    /**
      * Measures the size of the tick labels without making any (permanent) DOM changes.
      *
      * @param {number} axisWidth Width available for this axis.
      * @param {number} axisHeight Height available for this axis.
      * @param {Plottable.Scales.Category} scale The scale this axis is representing.
      * @param {string[]} ticks The strings that will be printed on the ticks.
      */
    /* private */ var _measureTickLabels: Any = js.native
    
    /* private */ var _measurer: Any = js.native
    
    /**
      * The rotation angle of tick label text. Only 0, 90, -90 are supported
      */
    /* private */ var _tickLabelAngle: Any = js.native
    
    /**
      * Maximum allowable number of wrapped lines for tick labels.
      */
    /* private */ var _tickLabelMaxLines: Any = js.native
    
    /**
      * Maximum allowable px width of tick labels.
      */
    /* private */ var _tickLabelMaxWidth: Any = js.native
    
    /**
      * The shear angle of the tick label text. Only values -80 <= x <= 80 are supported
      */
    /* private */ var _tickLabelShearAngle: Any = js.native
    
    /**
      * Return the space required by the ticks, padding included.
      * @returns {number}
      */
    /* private */ var _tickSpaceRequired: Any = js.native
    
    /* private */ var _typesetterContext: Any = js.native
    
    /**
      * A Wrapper configured according to the other properties on this axis.
      * @returns {Typesettable.Wrapper}
      */
    /* private */ def _wrapper: Any = js.native
    
    /**
      * A Writer attached to this measurer and wrapper.
      * @returns {Typesettable.Writer}
      */
    /* private */ def _writer: Any = js.native
    
    /**
      * Take the scale and drop ticks at regular intervals such that the resultant ticks are all a reasonable minimum
      * distance apart. Return the resultant ticks to render, as well as the new stepWidth between them.
      *
      * @param {Scales.Category} scale - The scale being downsampled. Defaults to this Axis' scale.
      * @return {DownsampleInfo} an object holding the resultant domain and new stepWidth.
      */
    def getDownsampleInfo(): IDownsampleInfo = js.native
    def getDownsampleInfo(scale: Unit, domain: js.Array[String]): IDownsampleInfo = js.native
    def getDownsampleInfo(scale: typingsJapgolly.plottable.buildSrcScalesMod.Category): IDownsampleInfo = js.native
    def getDownsampleInfo(scale: typingsJapgolly.plottable.buildSrcScalesMod.Category, domain: js.Array[String]): IDownsampleInfo = js.native
    
    /**
      * Gets the tick label angle in degrees.
      */
    def tickLabelAngle(): Double = js.native
    /**
      * Sets the tick label angle in degrees.
      * Right now only -90/0/90 are supported. 0 is horizontal.
      *
      * @param {number} angle
      * @returns {Category} The calling Category Axis.
      */
    def tickLabelAngle(angle: Double): this.type = js.native
    
    /**
      * Get the tick label max number of wrapped lines on this axis.
      */
    def tickLabelMaxLines(): Double = js.native
    /**
      * Set the tick label's max number of wrapped lines on this axis. By default, a Category Axis will line-wrap
      * long tick labels onto multiple lines in order to fit the width of the axis. When set, long tick labels will be
      * rendered on at most `tickLabelMaxLines()` lines. This ensures the axis doesn't grow to an undesirable height.
      *
      * Pass undefined to un-set the max lines.
      * @param maxLines
      */
    def tickLabelMaxLines(maxLines: Double): this.type = js.native
    
    /**
      * Get the tick label max width on this axis.
      */
    def tickLabelMaxWidth(): Double = js.native
    /**
      * Set the tick label's max width on this axis. When set, tick labels will be truncated with ellipsis to be
      * at most `tickLabelMaxWidth()` pixels wide. This ensures the axis doesn't grow to an undesirable width.
      *
      * Pass undefined to un-set the max width.
      * @param maxWidth
      */
    def tickLabelMaxWidth(maxWidth: Double): this.type = js.native
    
    /**
      * Gets the tick label shear angle in degrees.
      */
    def tickLabelShearAngle(): Double = js.native
    /**
      * Sets the tick label shear angle in degrees.
      * Only angles between -80 and 80 are supported.
      *
      * @param {number} angle
      * @returns {Category} The calling Category Axis.
      */
    def tickLabelShearAngle(angle: Double): this.type = js.native
  }
  /* static members */
  object Category {
    
    @JSImport("plottable/build/src/axes/categoryAxis", "Category")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * How many pixels to give labels at minimum before downsampling takes effect.
      */
    @JSImport("plottable/build/src/axes/categoryAxis", "Category._MINIMUM_WIDTH_PER_LABEL_PX")
    @js.native
    def _MINIMUM_WIDTH_PER_LABEL_PX: Any = js.native
    inline def _MINIMUM_WIDTH_PER_LABEL_PX_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MINIMUM_WIDTH_PER_LABEL_PX")(x.asInstanceOf[js.Any])
  }
  
  trait IDownsampleInfo extends StObject {
    
    var domain: js.Array[String]
    
    var stepWidth: Double
  }
  object IDownsampleInfo {
    
    inline def apply(domain: js.Array[String], stepWidth: Double): IDownsampleInfo = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], stepWidth = stepWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDownsampleInfo]
    }
    
    extension [Self <: IDownsampleInfo](x: Self) {
      
      inline def setDomain(value: js.Array[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainVarargs(value: String*): Self = StObject.set(x, "domain", js.Array(value*))
      
      inline def setStepWidth(value: Double): Self = StObject.set(x, "stepWidth", value.asInstanceOf[js.Any])
    }
  }
}
