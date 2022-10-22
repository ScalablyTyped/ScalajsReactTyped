package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// iOS Specific Attributes
trait IosElementAttributes
  extends StObject
     with ElementAttributes {
  
  /**
    * The [activation point]{@link https://developer.apple.com/documentation/objectivec/nsobject/1615179-accessibilityactivationpoint} of the element, in element coordinate space.
    */
  var activationPoint: Point2D
  
  /**
    * The adjusted content inset (if it is a scroll view).
    */
  var adjustedContentInset: js.UndefOr[IosElementAttributeInsets] = js.undefined
  
  /**
    * The content inset (if it is a scroll view).
    */
  var contentInset: js.UndefOr[IosElementAttributeInsets] = js.undefined
  
  /**
    * The content offset (if it is a scroll view).
    */
  var contentOffset: js.UndefOr[Point2D] = js.undefined
  
  /**
    * The date of the element (if it is a date picker).
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The bounds of the element, in element coordinate space.
    */
  var elementBounds: IosElementAttributeFrame
  
  /**
    * The frame of the element, in container coordinate space.
    */
  var elementFrame: IosElementAttributeFrame
  
  /**
    * The safe area bounds of the element, in element coordinate space.
    */
  var elementSafeBounds: IosElementAttributeFrame
  
  /**
    * The frame of the element, in screen coordinate space.
    */
  var frame: IosElementAttributeFrame
  
  /**
    * Whether the element is hittable at the activation point.
    */
  var hittable: Boolean
  
  /**
    * @example "<CALayer: 0x600003f759e0>"
    */
  var layer: String
  
  /**
    * The activation point of the element, in normalized percentage ([0.0, 1.0]).
    */
  var normalizedActivationPoint: Point2D
  
  /**
    * The normalized slider position (if it is a slider).
    */
  var normalizedSliderPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * The safe area insets of the element, in element coordinate space.
    */
  var safeAreaInsets: IosElementAttributeInsets
}
object IosElementAttributes {
  
  inline def apply(
    activationPoint: Point2D,
    elementBounds: IosElementAttributeFrame,
    elementFrame: IosElementAttributeFrame,
    elementSafeBounds: IosElementAttributeFrame,
    enabled: Boolean,
    frame: IosElementAttributeFrame,
    hittable: Boolean,
    identifier: String,
    layer: String,
    normalizedActivationPoint: Point2D,
    safeAreaInsets: IosElementAttributeInsets,
    visible: Boolean
  ): IosElementAttributes = {
    val __obj = js.Dynamic.literal(activationPoint = activationPoint.asInstanceOf[js.Any], elementBounds = elementBounds.asInstanceOf[js.Any], elementFrame = elementFrame.asInstanceOf[js.Any], elementSafeBounds = elementSafeBounds.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hittable = hittable.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], normalizedActivationPoint = normalizedActivationPoint.asInstanceOf[js.Any], safeAreaInsets = safeAreaInsets.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosElementAttributes]
  }
  
  extension [Self <: IosElementAttributes](x: Self) {
    
    inline def setActivationPoint(value: Point2D): Self = StObject.set(x, "activationPoint", value.asInstanceOf[js.Any])
    
    inline def setAdjustedContentInset(value: IosElementAttributeInsets): Self = StObject.set(x, "adjustedContentInset", value.asInstanceOf[js.Any])
    
    inline def setAdjustedContentInsetUndefined: Self = StObject.set(x, "adjustedContentInset", js.undefined)
    
    inline def setContentInset(value: IosElementAttributeInsets): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    inline def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    inline def setContentOffset(value: Point2D): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
    
    inline def setContentOffsetUndefined: Self = StObject.set(x, "contentOffset", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setElementBounds(value: IosElementAttributeFrame): Self = StObject.set(x, "elementBounds", value.asInstanceOf[js.Any])
    
    inline def setElementFrame(value: IosElementAttributeFrame): Self = StObject.set(x, "elementFrame", value.asInstanceOf[js.Any])
    
    inline def setElementSafeBounds(value: IosElementAttributeFrame): Self = StObject.set(x, "elementSafeBounds", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: IosElementAttributeFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setHittable(value: Boolean): Self = StObject.set(x, "hittable", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setNormalizedActivationPoint(value: Point2D): Self = StObject.set(x, "normalizedActivationPoint", value.asInstanceOf[js.Any])
    
    inline def setNormalizedSliderPosition(value: Double): Self = StObject.set(x, "normalizedSliderPosition", value.asInstanceOf[js.Any])
    
    inline def setNormalizedSliderPositionUndefined: Self = StObject.set(x, "normalizedSliderPosition", js.undefined)
    
    inline def setSafeAreaInsets(value: IosElementAttributeInsets): Self = StObject.set(x, "safeAreaInsets", value.asInstanceOf[js.Any])
  }
}
