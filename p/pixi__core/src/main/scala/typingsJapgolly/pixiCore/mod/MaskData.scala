package typingsJapgolly.pixiCore.mod

import typingsJapgolly.pixiConstants.mod.COLOR_MASK_BITS
import typingsJapgolly.pixiConstants.mod.MASK_TYPES
import typingsJapgolly.pixiConstants.mod.MSAA_QUALITY
import typingsJapgolly.pixiMath.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "MaskData")
@js.native
/**
  * Create MaskData
  * @param {PIXI.DisplayObject} [maskObject=null] - object that describes the mask
  */
open class MaskData () extends StObject {
  def this(maskObject: IMaskTarget) = this()
  
  /**
    * pre-computed color mask
    * @private
    */
  var _colorMask: Double = js.native
  
  /**
    * The sprite mask filter wrapped in an array.
    * @private
    */
  var _filters: js.Array[ISpriteMaskFilter] = js.native
  
  /**
    * Scissor counter above the mask in stack
    * @private
    */
  var _scissorCounter: Double = js.native
  
  /**
    * Scissor operation above the mask in stack.
    * Null if _scissorCounter is zero, rectangle instance if positive.
    * @private
    */
  var _scissorRect: Rectangle = js.native
  
  /**
    * pre-computed scissor rect
    * does become _scissorRect when mask is actually pushed
    * @private
    */
  var _scissorRectLocal: Rectangle = js.native
  
  /**
    * Stencil counter above the mask in stack
    * @private
    */
  var _stencilCounter: Double = js.native
  
  /**
    * Targeted element. Temporary variable set by MaskSystem
    * @member {PIXI.DisplayObject}
    * @private
    */
  var _target: IMaskTarget = js.native
  
  /**
    * Whether we know the mask type beforehand
    * @default true
    */
  var autoDetect: Boolean = js.native
  
  /** Color mask. */
  var colorMask: COLOR_MASK_BITS = js.native
  
  /**
    * Copies counters from maskData above, called from pushMask().
    * @param maskAbove
    */
  def copyCountersOrReset(): Unit = js.native
  def copyCountersOrReset(maskAbove: MaskData): Unit = js.native
  
  /** If enabled is true the mask is applied, if false it will not. */
  var enabled: Boolean = js.native
  
  /**
    * The sprite mask filter.
    * If set to `null`, the default sprite mask filter is used.
    * @default null
    */
  def filter: ISpriteMaskFilter = js.native
  def filter_=(value: ISpriteMaskFilter): Unit = js.native
  
  /** Indicator of the type (always true for {@link MaskData} objects) */
  var isMaskData: Boolean = js.native
  
  /**
    * Which element we use to mask
    * @member {PIXI.DisplayObject}
    */
  var maskObject: IMaskTarget = js.native
  
  /**
    * Number of samples of the sprite mask filter.
    * If set to `null`, the sample count of the current render target is used.
    * @default PIXI.settings.FILTER_MULTISAMPLE
    */
  var multisample: MSAA_QUALITY = js.native
  
  /** Whether it belongs to MaskSystem pool */
  var pooled: Boolean = js.native
  
  /** Resets the mask data after popMask(). */
  def reset(): Unit = js.native
  
  /**
    * Resolution of the sprite mask filter.
    * If set to `null` or `0`, the resolution of the current render target is used.
    * @default null
    */
  var resolution: Double = js.native
  
  /** Mask type */
  var `type`: MASK_TYPES = js.native
}
