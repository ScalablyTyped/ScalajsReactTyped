package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Gradient
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XBitmap
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.GetDirectPropertyTolerantResult
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.GetPropertyTolerantResult
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.SetPropertyTolerantFailed
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.XStyle
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.GraphicCrop
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link CaptionShape} represents a rectangular drawing shape with an additional set of lines. It can be used as a description for a fixed point
  * inside a drawing.
  */
trait CaptionShape
  extends StObject
     with Shape
     with FillProperties
     with LineProperties
     with ShadowProperties
     with Text
     with RotationDescriptor {
  
  /** This property specifies the escape angle of the line of a caption. It is only used if `CaptionIsFixedAngle` is set to `TRUE` */
  var CaptionAngle: Double
  
  /** This property specifies the absolute escape distance for the line of a caption. */
  var CaptionEscapeAbsolute: Double
  
  /**
    * This property specifies the escape direction for the line of a caption.
    * @see CaptionEscapeDirection
    */
  var CaptionEscapeDirection: Double
  
  /** This property specifies the relative escape distance for the line of a caption. */
  var CaptionEscapeRelative: Double
  
  /** This property specifies the distance between the text area of the caption and the start of the line. */
  var CaptionGap: Double
  
  /** If this property is `TRUE` , the property `CaptionEscapeRelative` is used, else the property `CaptionEscapeAbsolute` is used. */
  var CaptionIsEscapeRelative: Boolean
  
  /** If this property is `TRUE` , the application determines the best possible length for the caption line. */
  var CaptionIsFitLineLength: Boolean
  
  /**
    * This property specifies if the escape angle of the line of a caption is fixed or free. If this is set to `FALSE` , the application can choose the best
    * possible angle. If not, the value in `CaptionAngle` is used.
    */
  var CaptionIsFixedAngle: Boolean
  
  /** This property specifies the length of the caption line. */
  var CaptionLineLength: Double
  
  /** The caption point property specify the position of the point that is captioned. A set of lines are rendered from the caption area. */
  var CaptionPoint: Point
  
  /**
    * This property specifies the geometry of the line of a caption.
    * @see CaptionType
    */
  var CaptionType: Double
  
  /** This is the radius of the caption area corners. */
  var CornerRadius: Double
}
object CaptionShape {
  
  inline def apply(
    CaptionAngle: Double,
    CaptionEscapeAbsolute: Double,
    CaptionEscapeDirection: Double,
    CaptionEscapeRelative: Double,
    CaptionGap: Double,
    CaptionIsEscapeRelative: Boolean,
    CaptionIsFitLineLength: Boolean,
    CaptionIsFixedAngle: Boolean,
    CaptionLineLength: Double,
    CaptionPoint: Point,
    CaptionType: Double,
    CornerRadius: Double,
    FillBackground: Boolean,
    FillBitmap: XBitmap,
    FillBitmapLogicalSize: Boolean,
    FillBitmapMode: BitmapMode,
    FillBitmapName: String,
    FillBitmapOffsetX: Double,
    FillBitmapOffsetY: Double,
    FillBitmapPositionOffsetX: Double,
    FillBitmapPositionOffsetY: Double,
    FillBitmapRectanglePoint: RectanglePoint,
    FillBitmapSizeX: Double,
    FillBitmapSizeY: Double,
    FillBitmapStretch: Boolean,
    FillBitmapTile: Boolean,
    FillBitmapURL: String,
    FillColor: Color,
    FillGradient: Gradient,
    FillGradientName: String,
    FillHatch: Hatch,
    FillHatchName: String,
    FillStyle: FillStyle,
    FillTransparence: Double,
    FillTransparenceGradient: Gradient,
    FillTransparenceGradientName: String,
    GluePoints: XIndexContainer,
    GraphicCrop: GraphicCrop,
    Hyperlink: String,
    InteropGrabBag: SafeArray[PropertyValue],
    LayerID: Double,
    LayerName: String,
    LineCap: LineCap,
    LineColor: Color,
    LineDash: LineDash,
    LineDashName: String,
    LineEnd: PolyPolygonBezierCoords,
    LineEndCenter: Boolean,
    LineEndName: String,
    LineEndWidth: Double,
    LineJoint: LineJoint,
    LineStart: PolyPolygonBezierCoords,
    LineStartCenter: Boolean,
    LineStartName: String,
    LineStartWidth: Double,
    LineStyle: LineStyle,
    LineTransparence: Double,
    LineWidth: Double,
    MoveProtect: Boolean,
    Name: String,
    NavigationOrder: Double,
    Position: Point,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RelativeHeight: Double,
    RelativeHeightRelation: Double,
    RelativeWidth: Double,
    RelativeWidthRelation: Double,
    RotationDescriptor: RotationDescriptor,
    Shadow: Boolean,
    ShadowColor: Color,
    ShadowTransparence: Double,
    ShadowXDistance: Double,
    ShadowYDistance: Double,
    ShapeType: String,
    ShapeUserDefinedAttributes: XNameContainer,
    Size: Size,
    SizeProtect: Boolean,
    Style: XStyle,
    Transformation: HomogenMatrix3,
    Visible: Boolean,
    ZOrder: Double,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    dispose: Callback,
    getDirectPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetDirectPropertyTolerantResult],
    getGluePoints: CallbackTo[XIndexContainer],
    getPosition: CallbackTo[Point],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetPropertyTolerantResult],
    getShapeType: CallbackTo[String],
    getSize: CallbackTo[Size],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPosition: Point => Callback,
    setPropertyValue: (String, Any) => Callback,
    setPropertyValuesTolerant: (SeqEquiv[String], SeqEquiv[Any]) => SafeArray[SetPropertyTolerantFailed],
    setSize: Size => Callback
  ): CaptionShape = {
    val __obj = js.Dynamic.literal(CaptionAngle = CaptionAngle.asInstanceOf[js.Any], CaptionEscapeAbsolute = CaptionEscapeAbsolute.asInstanceOf[js.Any], CaptionEscapeDirection = CaptionEscapeDirection.asInstanceOf[js.Any], CaptionEscapeRelative = CaptionEscapeRelative.asInstanceOf[js.Any], CaptionGap = CaptionGap.asInstanceOf[js.Any], CaptionIsEscapeRelative = CaptionIsEscapeRelative.asInstanceOf[js.Any], CaptionIsFitLineLength = CaptionIsFitLineLength.asInstanceOf[js.Any], CaptionIsFixedAngle = CaptionIsFixedAngle.asInstanceOf[js.Any], CaptionLineLength = CaptionLineLength.asInstanceOf[js.Any], CaptionPoint = CaptionPoint.asInstanceOf[js.Any], CaptionType = CaptionType.asInstanceOf[js.Any], CornerRadius = CornerRadius.asInstanceOf[js.Any], FillBackground = FillBackground.asInstanceOf[js.Any], FillBitmap = FillBitmap.asInstanceOf[js.Any], FillBitmapLogicalSize = FillBitmapLogicalSize.asInstanceOf[js.Any], FillBitmapMode = FillBitmapMode.asInstanceOf[js.Any], FillBitmapName = FillBitmapName.asInstanceOf[js.Any], FillBitmapOffsetX = FillBitmapOffsetX.asInstanceOf[js.Any], FillBitmapOffsetY = FillBitmapOffsetY.asInstanceOf[js.Any], FillBitmapPositionOffsetX = FillBitmapPositionOffsetX.asInstanceOf[js.Any], FillBitmapPositionOffsetY = FillBitmapPositionOffsetY.asInstanceOf[js.Any], FillBitmapRectanglePoint = FillBitmapRectanglePoint.asInstanceOf[js.Any], FillBitmapSizeX = FillBitmapSizeX.asInstanceOf[js.Any], FillBitmapSizeY = FillBitmapSizeY.asInstanceOf[js.Any], FillBitmapStretch = FillBitmapStretch.asInstanceOf[js.Any], FillBitmapTile = FillBitmapTile.asInstanceOf[js.Any], FillBitmapURL = FillBitmapURL.asInstanceOf[js.Any], FillColor = FillColor.asInstanceOf[js.Any], FillGradient = FillGradient.asInstanceOf[js.Any], FillGradientName = FillGradientName.asInstanceOf[js.Any], FillHatch = FillHatch.asInstanceOf[js.Any], FillHatchName = FillHatchName.asInstanceOf[js.Any], FillStyle = FillStyle.asInstanceOf[js.Any], FillTransparence = FillTransparence.asInstanceOf[js.Any], FillTransparenceGradient = FillTransparenceGradient.asInstanceOf[js.Any], FillTransparenceGradientName = FillTransparenceGradientName.asInstanceOf[js.Any], GluePoints = GluePoints.asInstanceOf[js.Any], GraphicCrop = GraphicCrop.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], InteropGrabBag = InteropGrabBag.asInstanceOf[js.Any], LayerID = LayerID.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any], LineCap = LineCap.asInstanceOf[js.Any], LineColor = LineColor.asInstanceOf[js.Any], LineDash = LineDash.asInstanceOf[js.Any], LineDashName = LineDashName.asInstanceOf[js.Any], LineEnd = LineEnd.asInstanceOf[js.Any], LineEndCenter = LineEndCenter.asInstanceOf[js.Any], LineEndName = LineEndName.asInstanceOf[js.Any], LineEndWidth = LineEndWidth.asInstanceOf[js.Any], LineJoint = LineJoint.asInstanceOf[js.Any], LineStart = LineStart.asInstanceOf[js.Any], LineStartCenter = LineStartCenter.asInstanceOf[js.Any], LineStartName = LineStartName.asInstanceOf[js.Any], LineStartWidth = LineStartWidth.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineTransparence = LineTransparence.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], MoveProtect = MoveProtect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationOrder = NavigationOrder.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], ShadowColor = ShadowColor.asInstanceOf[js.Any], ShadowTransparence = ShadowTransparence.asInstanceOf[js.Any], ShadowXDistance = ShadowXDistance.asInstanceOf[js.Any], ShadowYDistance = ShadowYDistance.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], ShapeUserDefinedAttributes = ShapeUserDefinedAttributes.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtect = SizeProtect.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transformation = Transformation.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], ZOrder = ZOrder.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), dispose = dispose.toJsFn, getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getGluePoints = getGluePoints.toJsFn, getPosition = getPosition.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()))
    js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    __obj.asInstanceOf[CaptionShape]
  }
  
  extension [Self <: CaptionShape](x: Self) {
    
    inline def setCaptionAngle(value: Double): Self = StObject.set(x, "CaptionAngle", value.asInstanceOf[js.Any])
    
    inline def setCaptionEscapeAbsolute(value: Double): Self = StObject.set(x, "CaptionEscapeAbsolute", value.asInstanceOf[js.Any])
    
    inline def setCaptionEscapeDirection(value: Double): Self = StObject.set(x, "CaptionEscapeDirection", value.asInstanceOf[js.Any])
    
    inline def setCaptionEscapeRelative(value: Double): Self = StObject.set(x, "CaptionEscapeRelative", value.asInstanceOf[js.Any])
    
    inline def setCaptionGap(value: Double): Self = StObject.set(x, "CaptionGap", value.asInstanceOf[js.Any])
    
    inline def setCaptionIsEscapeRelative(value: Boolean): Self = StObject.set(x, "CaptionIsEscapeRelative", value.asInstanceOf[js.Any])
    
    inline def setCaptionIsFitLineLength(value: Boolean): Self = StObject.set(x, "CaptionIsFitLineLength", value.asInstanceOf[js.Any])
    
    inline def setCaptionIsFixedAngle(value: Boolean): Self = StObject.set(x, "CaptionIsFixedAngle", value.asInstanceOf[js.Any])
    
    inline def setCaptionLineLength(value: Double): Self = StObject.set(x, "CaptionLineLength", value.asInstanceOf[js.Any])
    
    inline def setCaptionPoint(value: Point): Self = StObject.set(x, "CaptionPoint", value.asInstanceOf[js.Any])
    
    inline def setCaptionType(value: Double): Self = StObject.set(x, "CaptionType", value.asInstanceOf[js.Any])
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "CornerRadius", value.asInstanceOf[js.Any])
  }
}
