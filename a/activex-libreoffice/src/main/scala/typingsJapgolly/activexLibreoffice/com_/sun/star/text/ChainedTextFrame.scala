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
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.FillStyle
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.TextVerticalAdjust
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.BorderLine
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends a {@link TextFrame} which shares the same {@link Text} with other {@link ChainedTextFrame} instances that will make the text flow through the
  * chained frames. The text flows in the next frame if there is no space left in the current frame.
  */
trait ChainedTextFrame
  extends StObject
     with TextFrame {
  
  /**
    * name of the previous frame in the chain
    *
    * An empty string indicates that there is no previous frame.
    */
  var ChainNextName: String
  
  /**
    * name of the next frame in the chain
    *
    * An empty string indicates that there is no next frame.
    */
  var ChainPrevName: String
}
object ChainedTextFrame {
  
  inline def apply(
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
    ChainNextName: String,
    ChainPrevName: String,
    ContentProtected: Boolean,
    Description: String,
    EditInReadonly: Boolean,
    FillGradient: Gradient,
    FillGradientName: String,
    FillStyle: FillStyle,
    FrameHeightAbsolute: Double,
    FrameHeightPercent: Double,
    FrameInteropGrabBag: SafeArray[PropertyValue],
    FrameIsAutomaticHeight: Boolean,
    FrameStyleName: String,
    FrameWidthAbsolute: Double,
    FrameWidthPercent: Double,
    Height: Double,
    HoriOrient: Double,
    HoriOrientPosition: Double,
    HoriOrientRelation: Double,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    IsFollowingTextFlow: Boolean,
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
    SizeType: Double,
    Surround: WrapTextMode,
    SurroundAnchorOnly: Boolean,
    Text: XText,
    TextVerticalAdjust: TextVerticalAdjust,
    TextWrap: WrapTextMode,
    Title: String,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    UserDefinedAttributes: XNameContainer,
    VertOrient: Double,
    VertOrientPosition: Double,
    VertOrientRelation: Double,
    Width: Double,
    WidthType: Double,
    WrapInfluenceOnPosition: Double,
    WritingMode: Double,
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
    getText: CallbackTo[XText],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setName: String => Callback,
    setPosition: Point => Callback,
    setPropertyValue: (String, Any) => Callback,
    setSize: Size => Callback
  ): ChainedTextFrame = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorFrame = AnchorFrame.asInstanceOf[js.Any], AnchorPageNo = AnchorPageNo.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], ChainNextName = ChainNextName.asInstanceOf[js.Any], ChainPrevName = ChainPrevName.asInstanceOf[js.Any], ContentProtected = ContentProtected.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], EditInReadonly = EditInReadonly.asInstanceOf[js.Any], FillGradient = FillGradient.asInstanceOf[js.Any], FillGradientName = FillGradientName.asInstanceOf[js.Any], FillStyle = FillStyle.asInstanceOf[js.Any], FrameHeightAbsolute = FrameHeightAbsolute.asInstanceOf[js.Any], FrameHeightPercent = FrameHeightPercent.asInstanceOf[js.Any], FrameInteropGrabBag = FrameInteropGrabBag.asInstanceOf[js.Any], FrameIsAutomaticHeight = FrameIsAutomaticHeight.asInstanceOf[js.Any], FrameStyleName = FrameStyleName.asInstanceOf[js.Any], FrameWidthAbsolute = FrameWidthAbsolute.asInstanceOf[js.Any], FrameWidthPercent = FrameWidthPercent.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HoriOrient = HoriOrient.asInstanceOf[js.Any], HoriOrientPosition = HoriOrientPosition.asInstanceOf[js.Any], HoriOrientRelation = HoriOrientRelation.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], IsFollowingTextFlow = IsFollowingTextFlow.asInstanceOf[js.Any], IsSyncHeightToWidth = IsSyncHeightToWidth.asInstanceOf[js.Any], IsSyncWidthToHeight = IsSyncWidthToHeight.asInstanceOf[js.Any], LayoutSize = LayoutSize.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Opaque = Opaque.asInstanceOf[js.Any], PageToggle = PageToggle.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PositionProtected = PositionProtected.asInstanceOf[js.Any], Print = Print.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], ServerMap = ServerMap.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], ShadowTransparence = ShadowTransparence.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtected = SizeProtected.asInstanceOf[js.Any], SizeType = SizeType.asInstanceOf[js.Any], Surround = Surround.asInstanceOf[js.Any], SurroundAnchorOnly = SurroundAnchorOnly.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextVerticalAdjust = TextVerticalAdjust.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], VertOrient = VertOrient.asInstanceOf[js.Any], VertOrientPosition = VertOrientPosition.asInstanceOf[js.Any], VertOrientRelation = VertOrientRelation.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WidthType = WidthType.asInstanceOf[js.Any], WrapInfluenceOnPosition = WrapInfluenceOnPosition.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getName = getName.toJsFn, getPosition = getPosition.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, getText = getText.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()))
    __obj.asInstanceOf[ChainedTextFrame]
  }
  
  extension [Self <: ChainedTextFrame](x: Self) {
    
    inline def setChainNextName(value: String): Self = StObject.set(x, "ChainNextName", value.asInstanceOf[js.Any])
    
    inline def setChainPrevName(value: String): Self = StObject.set(x, "ChainPrevName", value.asInstanceOf[js.Any])
  }
}
