package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Gradient
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.ColorMode
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.FillStyle
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.PointSequence
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.PointSequenceSequence
import typingsJapgolly.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.BorderLine
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a graphic which can be embedded in {@link Text} . */
trait TextGraphicObject
  extends StObject
     with BaseFrame {
  
  /** contains the original size of the bitmap in the graphic object. */
  var ActualSize: Size
  
  /** changes the display of the blue color channel. It contains percentage values between -100 and +100. */
  var AdjustBlue: Double
  
  /** changes the display of contrast. It contains percentage values between -100 and +100. */
  var AdjustContrast: Double
  
  /** changes the display of the green color channel. It contains percentage values between -100 and +100. */
  var AdjustGreen: Double
  
  /** changes the display of the luminance. It contains percentage values between -100 and +100. */
  var AdjustLuminance: Double
  
  /** changes the display of the red color channel. It contains percentage values between -100 and +100. */
  var AdjustRed: Double
  
  /** the text flows only around the contour of the object. */
  var ContourOutside: Boolean
  
  /** contains the contour of the object as PolyPolygon. */
  var ContourPolyPolygon: PointSequenceSequence
  
  /** determines the gamma value of the graphic. */
  var Gamma: Double
  
  /** contains the graphic. */
  var Graphic: XGraphic
  
  /** contains the ColorMode as {@link com.sun.star.drawing.ColorMode} . */
  var GraphicColorMode: ColorMode
  
  /**
    * contains the cropping of the object.
    * @see GraphicCrop
    */
  var GraphicCrop: typingsJapgolly.activexLibreoffice.com_.sun.star.text.GraphicCrop
  
  /** contains the name of the filter of the background graphic of the object. */
  var GraphicFilter: String
  
  /** determines if the graphic is display in inverted colors. It contains percentage values between -100 and +100. */
  var GraphicIsInverted: Boolean
  
  /** contains the URL of the background graphic of the object */
  var GraphicURL: String
  
  /** determines if the object is horizontally mirrored on even pages. */
  var HoriMirroredOnEvenPages: Boolean
  
  /** determines if the object is horizontally mirrored on odd pages. */
  var HoriMirroredOnOddPages: Boolean
  
  /** returns the client-side image map if one is assigned to the object. */
  var ImageMap: XIndexContainer
  
  /** determines if the text wraps around the contour of the object. */
  var SurroundContour: Boolean
  
  /** contains percentage values between -100 and +100. */
  var Transparency: Double
  
  /** determines if the object is mirrored vertically. */
  var VertMirrored: Boolean
}
object TextGraphicObject {
  
  inline def apply(
    ActualSize: Size,
    AdjustBlue: Double,
    AdjustContrast: Double,
    AdjustGreen: Double,
    AdjustLuminance: Double,
    AdjustRed: Double,
    Anchor: XTextRange,
    AnchorFrame: XTextFrame,
    AnchorPageNo: Double,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BottomMargin: Double,
    ContentProtected: Boolean,
    ContourOutside: Boolean,
    ContourPolyPolygon: PointSequenceSequence,
    Description: String,
    FillGradient: Gradient,
    FillGradientName: String,
    FillStyle: FillStyle,
    FrameInteropGrabBag: SafeArray[PropertyValue],
    FrameStyleName: String,
    Gamma: Double,
    Graphic: XGraphic,
    GraphicColorMode: ColorMode,
    GraphicCrop: GraphicCrop,
    GraphicFilter: String,
    GraphicIsInverted: Boolean,
    GraphicURL: String,
    Height: Double,
    HoriMirroredOnEvenPages: Boolean,
    HoriMirroredOnOddPages: Boolean,
    HoriOrient: Double,
    HoriOrientPosition: Double,
    HoriOrientRelation: Double,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    ImageMap: XIndexContainer,
    IsSyncHeightToWidth: Boolean,
    IsSyncWidthToHeight: Boolean,
    LayoutSize: Size,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    LeftMargin: Double,
    Name: String,
    Opaque: Boolean,
    PageToggle: Boolean,
    Position: Point,
    PositionProtected: Boolean,
    Print: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RelativeHeight: Double,
    RelativeHeightRelation: Double,
    RelativeWidth: Double,
    RelativeWidthRelation: Double,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RightMargin: Double,
    ServerMap: Boolean,
    ShadowFormat: ShadowFormat,
    ShadowTransparence: Double,
    ShapeType: String,
    Size: Size,
    SizeProtected: Boolean,
    Surround: WrapTextMode,
    SurroundAnchorOnly: Boolean,
    SurroundContour: Boolean,
    TextWrap: WrapTextMode,
    Title: String,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    Transparency: Double,
    UserDefinedAttributes: XNameContainer,
    VertMirrored: Boolean,
    VertOrient: Double,
    VertOrientPosition: Double,
    VertOrientRelation: Double,
    Width: Double,
    WrapInfluenceOnPosition: Double,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    attach: XTextRange => Callback,
    dispose: Callback,
    getAnchor: CallbackTo[XTextRange],
    getName: CallbackTo[String],
    getPosition: CallbackTo[Point],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getShapeType: CallbackTo[String],
    getSize: CallbackTo[Size],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setName: String => Callback,
    setPosition: Point => Callback,
    setPropertyValue: (String, Any) => Callback,
    setSize: Size => Callback
  ): TextGraphicObject = {
    val __obj = js.Dynamic.literal(ActualSize = ActualSize.asInstanceOf[js.Any], AdjustBlue = AdjustBlue.asInstanceOf[js.Any], AdjustContrast = AdjustContrast.asInstanceOf[js.Any], AdjustGreen = AdjustGreen.asInstanceOf[js.Any], AdjustLuminance = AdjustLuminance.asInstanceOf[js.Any], AdjustRed = AdjustRed.asInstanceOf[js.Any], Anchor = Anchor.asInstanceOf[js.Any], AnchorFrame = AnchorFrame.asInstanceOf[js.Any], AnchorPageNo = AnchorPageNo.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], ContentProtected = ContentProtected.asInstanceOf[js.Any], ContourOutside = ContourOutside.asInstanceOf[js.Any], ContourPolyPolygon = ContourPolyPolygon.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FillGradient = FillGradient.asInstanceOf[js.Any], FillGradientName = FillGradientName.asInstanceOf[js.Any], FillStyle = FillStyle.asInstanceOf[js.Any], FrameInteropGrabBag = FrameInteropGrabBag.asInstanceOf[js.Any], FrameStyleName = FrameStyleName.asInstanceOf[js.Any], Gamma = Gamma.asInstanceOf[js.Any], Graphic = Graphic.asInstanceOf[js.Any], GraphicColorMode = GraphicColorMode.asInstanceOf[js.Any], GraphicCrop = GraphicCrop.asInstanceOf[js.Any], GraphicFilter = GraphicFilter.asInstanceOf[js.Any], GraphicIsInverted = GraphicIsInverted.asInstanceOf[js.Any], GraphicURL = GraphicURL.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HoriMirroredOnEvenPages = HoriMirroredOnEvenPages.asInstanceOf[js.Any], HoriMirroredOnOddPages = HoriMirroredOnOddPages.asInstanceOf[js.Any], HoriOrient = HoriOrient.asInstanceOf[js.Any], HoriOrientPosition = HoriOrientPosition.asInstanceOf[js.Any], HoriOrientRelation = HoriOrientRelation.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], ImageMap = ImageMap.asInstanceOf[js.Any], IsSyncHeightToWidth = IsSyncHeightToWidth.asInstanceOf[js.Any], IsSyncWidthToHeight = IsSyncWidthToHeight.asInstanceOf[js.Any], LayoutSize = LayoutSize.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Opaque = Opaque.asInstanceOf[js.Any], PageToggle = PageToggle.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PositionProtected = PositionProtected.asInstanceOf[js.Any], Print = Print.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], ServerMap = ServerMap.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], ShadowTransparence = ShadowTransparence.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtected = SizeProtected.asInstanceOf[js.Any], Surround = Surround.asInstanceOf[js.Any], SurroundAnchorOnly = SurroundAnchorOnly.asInstanceOf[js.Any], SurroundContour = SurroundContour.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], VertMirrored = VertMirrored.asInstanceOf[js.Any], VertOrient = VertOrient.asInstanceOf[js.Any], VertOrientPosition = VertOrientPosition.asInstanceOf[js.Any], VertOrientRelation = VertOrientRelation.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WrapInfluenceOnPosition = WrapInfluenceOnPosition.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getName = getName.toJsFn, getPosition = getPosition.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()))
    __obj.asInstanceOf[TextGraphicObject]
  }
  
  extension [Self <: TextGraphicObject](x: Self) {
    
    inline def setActualSize(value: Size): Self = StObject.set(x, "ActualSize", value.asInstanceOf[js.Any])
    
    inline def setAdjustBlue(value: Double): Self = StObject.set(x, "AdjustBlue", value.asInstanceOf[js.Any])
    
    inline def setAdjustContrast(value: Double): Self = StObject.set(x, "AdjustContrast", value.asInstanceOf[js.Any])
    
    inline def setAdjustGreen(value: Double): Self = StObject.set(x, "AdjustGreen", value.asInstanceOf[js.Any])
    
    inline def setAdjustLuminance(value: Double): Self = StObject.set(x, "AdjustLuminance", value.asInstanceOf[js.Any])
    
    inline def setAdjustRed(value: Double): Self = StObject.set(x, "AdjustRed", value.asInstanceOf[js.Any])
    
    inline def setContourOutside(value: Boolean): Self = StObject.set(x, "ContourOutside", value.asInstanceOf[js.Any])
    
    inline def setContourPolyPolygon(value: PointSequenceSequence): Self = StObject.set(x, "ContourPolyPolygon", value.asInstanceOf[js.Any])
    
    inline def setContourPolyPolygonVarargs(value: PointSequence*): Self = StObject.set(x, "ContourPolyPolygon", js.Array(value*))
    
    inline def setGamma(value: Double): Self = StObject.set(x, "Gamma", value.asInstanceOf[js.Any])
    
    inline def setGraphic(value: XGraphic): Self = StObject.set(x, "Graphic", value.asInstanceOf[js.Any])
    
    inline def setGraphicColorMode(value: ColorMode): Self = StObject.set(x, "GraphicColorMode", value.asInstanceOf[js.Any])
    
    inline def setGraphicCrop(value: GraphicCrop): Self = StObject.set(x, "GraphicCrop", value.asInstanceOf[js.Any])
    
    inline def setGraphicFilter(value: String): Self = StObject.set(x, "GraphicFilter", value.asInstanceOf[js.Any])
    
    inline def setGraphicIsInverted(value: Boolean): Self = StObject.set(x, "GraphicIsInverted", value.asInstanceOf[js.Any])
    
    inline def setGraphicURL(value: String): Self = StObject.set(x, "GraphicURL", value.asInstanceOf[js.Any])
    
    inline def setHoriMirroredOnEvenPages(value: Boolean): Self = StObject.set(x, "HoriMirroredOnEvenPages", value.asInstanceOf[js.Any])
    
    inline def setHoriMirroredOnOddPages(value: Boolean): Self = StObject.set(x, "HoriMirroredOnOddPages", value.asInstanceOf[js.Any])
    
    inline def setImageMap(value: XIndexContainer): Self = StObject.set(x, "ImageMap", value.asInstanceOf[js.Any])
    
    inline def setSurroundContour(value: Boolean): Self = StObject.set(x, "SurroundContour", value.asInstanceOf[js.Any])
    
    inline def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
    
    inline def setVertMirrored(value: Boolean): Self = StObject.set(x, "VertMirrored", value.asInstanceOf[js.Any])
  }
}
