package typingsJapgolly.activexLibreoffice.com_.sun.star.style

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.BorderLine
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.XText
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.XTextColumns
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contributes common properties of page styles.
  * @see com.sun.star.text.TextPageStyle
  * @see com.sun.star.sheet.TablePageStyle
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.activexLibreoffice.com_.sun.star.style.PageProperties because var conflicts: UserDefinedAttributes. Inlined BackColor, BackGraphicFilter, BackGraphicLocation, BackGraphicURL, BackTransparent, BorderDistance, BottomBorder, BottomBorderDistance, BottomMargin, FirstIsShared, FooterBackColor, FooterBackGraphicFilter, FooterBackGraphicLocation, FooterBackGraphicURL, FooterBackTransparent, FooterBodyDistance, FooterBorderDistance, FooterBottomBorder, FooterBottomBorderDistance, FooterDynamicSpacing, FooterHeight, FooterIsDynamicHeight, FooterIsOn, FooterIsShared, FooterLeftBorder, FooterLeftBorderDistance, FooterLeftMargin, FooterRightBorder, FooterRightBorderDistance, FooterRightMargin, FooterShadowFormat, FooterText, FooterTextLeft, FooterTextRight, FooterTopBorder, FooterTopBorderDistance, FootnoteHeight, FootnoteLineAdjust, FootnoteLineColor, FootnoteLineDistance, FootnoteLineRelativeWidth, FootnoteLineStyle, FootnoteLineTextDistance, FootnoteLineWeight, GridBaseHeight, GridColor, GridDisplay, GridLines, GridMode, GridPrint, GridRubyBelow, GridRubyHeight, HeaderBackColor, HeaderBackGraphicFilter, HeaderBackGraphicLocation, HeaderBackGraphicURL, HeaderBackTransparent, HeaderBodyDistance, HeaderBorderDistance, HeaderBottomBorder, HeaderBottomBorderDistance, HeaderDynamicSpacing, HeaderHeight, HeaderIsDynamicHeight, HeaderIsOn, HeaderIsShared, HeaderLeftBorder, HeaderLeftBorderDistance, HeaderLeftMargin, HeaderRightBorder, HeaderRightBorderDistance, HeaderRightMargin, HeaderShadowFormat, HeaderText, HeaderTextLeft, HeaderTextRight, HeaderTopBorder, HeaderTopBorderDistance, Height, IsLandscape, LeftBorder, LeftBorderDistance, LeftMargin, NumberingType, PageStyleLayout, PrinterPaperTray, RegisterModeActive, RegisterParagraphStyle, RightBorder, RightBorderDistance, RightMargin, ShadowFormat, Size, TextColumns, TopBorder, TopBorderDistance, TopMargin, Width, WritingMode */ trait PageStyle
  extends StObject
     with Style {
  
  /** contains the background color of the page. */
  var BackColor: Color
  
  /** contains the filter name of the background graphic. */
  var BackGraphicFilter: String
  
  /** determines the location of the background graphic. */
  var BackGraphicLocation: GraphicLocation
  
  /** contains the URL of the background graphic. */
  var BackGraphicURL: String
  
  /**
    * determines if the background color is transparent.
    *
    * If this property is set to `TRUE` , {@link PageStyle.BackColor} will not be used.
    */
  var BackTransparent: Boolean
  
  /** determines the distance of all borders of the page. */
  var BorderDistance: Double
  
  /** determines the style of the bottom border line of the page. */
  var BottomBorder: BorderLine
  
  /** determines the bottom border distance of the page. */
  var BottomBorderDistance: Double
  
  /** determines the bottom margin of the page. */
  var BottomMargin: Double
  
  /**
    * determines if the header/footer content on the first page and remaining pages is the same.
    * @since LibreOffice 4.0
    */
  var FirstIsShared: Boolean
  
  /** contains the color of the background of the footer. */
  var FooterBackColor: Color
  
  /** contains the filter name of the background graphic in the footer. */
  var FooterBackGraphicFilter: String
  
  /** determines the location of the background graphic in the footer. */
  var FooterBackGraphicLocation: GraphicLocation
  
  /** contains the URL of the background graphic in the footer. */
  var FooterBackGraphicURL: String
  
  /** determines if the background of the footer is transparent. */
  var FooterBackTransparent: Boolean
  
  /** determines the distance between the footer and the body text area. */
  var FooterBodyDistance: Double
  
  /** contains the distance of all borders of the footer. */
  var FooterBorderDistance: Double
  
  /** contains the style of the bottom border line of the footer. */
  var FooterBottomBorder: BorderLine
  
  /** contains the bottom border distance of the footer. */
  var FooterBottomBorderDistance: Double
  
  /** determines whether to use dynamic spacing in footer or not. */
  var FooterDynamicSpacing: Boolean
  
  /** determines the height of the footer. */
  var FooterHeight: Double
  
  /** determines if the height of the footer depends on the content. */
  var FooterIsDynamicHeight: Boolean
  
  /** determines if a footer is used on the page. */
  var FooterIsOn: Boolean
  
  /** determines if the footer content on left and right pages is the same. */
  var FooterIsShared: Boolean
  
  /** contains the style of the left border line of the footer. */
  var FooterLeftBorder: BorderLine
  
  /** contains the left border distance of the footer. */
  var FooterLeftBorderDistance: Double
  
  /** determines the left margin of the footer. */
  var FooterLeftMargin: Double
  
  /** contains the style of the right border line of the footer. */
  var FooterRightBorder: BorderLine
  
  /** contains the right border distance of the footer. */
  var FooterRightBorderDistance: Double
  
  /** determines the right margin of the footer. */
  var FooterRightMargin: Double
  
  /** determines the shadow of the footer. */
  var FooterShadowFormat: ShadowFormat
  
  /** contains the interface to the text of the footer. */
  var FooterText: XText
  
  /** contains the interface to the text of the footer of a left page. */
  var FooterTextLeft: XText
  
  /** contains the interface to the text of the footer of a right page.contains . */
  var FooterTextRight: XText
  
  /** contains the style of the top border line of the footer. */
  var FooterTopBorder: BorderLine
  
  /** contains the top border distance of the footer. */
  var FooterTopBorderDistance: Double
  
  /** contains the maximum height of the footnote area. If set to zero then the height of the current page is used as limit. */
  var FootnoteHeight: Double
  
  /**
    * contains the adjustment of the separator line between the text and the footnote area.
    *
    * com::sun::star::text::HorizontalAdjusts.
    */
  var FootnoteLineAdjust: Double
  
  /** contains the color of the separator line between the text and the footnote area. */
  var FootnoteLineColor: Color
  
  /** contains the distance between the footnote area and the separator line between the text and the footnote area. */
  var FootnoteLineDistance: Double
  
  /** contains the relative width of the separator line between the text and the footnote area. */
  var FootnoteLineRelativeWidth: Double
  
  /**
    * contains the style of the separator line between the text and the footnote area.
    * @see com.sun.star.style.FootnoteLineStyle for the possible values.
    */
  var FootnoteLineStyle: Double
  
  /** contains the distance between the text and the separator line between the text and the footnote area. */
  var FootnoteLineTextDistance: Double
  
  /** contains the weight of the separator line between the text and the footnote area. */
  var FootnoteLineWeight: Double
  
  /** contains the height of the base text line inside the text grid */
  var GridBaseHeight: Double
  
  /** contains the display color of the text grid */
  var GridColor: Color
  
  /** determines whether the text grid lines are visible or not */
  var GridDisplay: Boolean
  
  /** contains the number of lines in the text grid */
  var GridLines: Double
  
  /** contains the mode of the text grid (none, lines, ...), as represented by {@link com.sun.star.text.TextGridMode} constants */
  var GridMode: Double
  
  /** determines whether the text grid lines are printed */
  var GridPrint: Boolean
  
  /** determines whether the text grid's ruby line is located below or above the base line */
  var GridRubyBelow: Boolean
  
  /** contains the height of the ruby text line inside the text grid */
  var GridRubyHeight: Double
  
  /** contains the color of the background of the header. */
  var HeaderBackColor: Color
  
  /** contains the filter name of the background graphic of the header. */
  var HeaderBackGraphicFilter: String
  
  /** determines the location of the background graphic of the header. */
  var HeaderBackGraphicLocation: GraphicLocation
  
  /** contains the URL of the background graphic of the header. */
  var HeaderBackGraphicURL: String
  
  /**
    * determines if the background color of the header is transparent.
    *
    * If this property is set to `TRUE` , {@link PageStyle.HeaderBackColor} will not be used.
    */
  var HeaderBackTransparent: Boolean
  
  /** determines the distance between the header and the body text area. */
  var HeaderBodyDistance: Double
  
  /** determines the distance of all borders of the header. */
  var HeaderBorderDistance: Double
  
  /** determines the style of the bottom border line of the header. */
  var HeaderBottomBorder: BorderLine
  
  /** determines the bottom border distance of the header. */
  var HeaderBottomBorderDistance: Double
  
  /** determines whether to use dynamic spacing in header or not. */
  var HeaderDynamicSpacing: Boolean
  
  /** contains the height of the header. */
  var HeaderHeight: Double
  
  /** determines if the height of the header depends on the content. */
  var HeaderIsDynamicHeight: Boolean
  
  /** determines if a header is used on the page. */
  var HeaderIsOn: Boolean
  
  /** determines if the header content on left and right pages is the same. */
  var HeaderIsShared: Boolean
  
  /** determines the style of the left border line of the header. */
  var HeaderLeftBorder: BorderLine
  
  /** determines the left border distance of the header. */
  var HeaderLeftBorderDistance: Double
  
  /** contains the left margin of the header. */
  var HeaderLeftMargin: Double
  
  /** determines the style of the right border line of the header. */
  var HeaderRightBorder: BorderLine
  
  /** determines the right border distance of the header. */
  var HeaderRightBorderDistance: Double
  
  /** contains the right margin of the header. */
  var HeaderRightMargin: Double
  
  /** determines the shadow of the header. */
  var HeaderShadowFormat: ShadowFormat
  
  /** contains the interface to the text of the header. */
  var HeaderText: XText
  
  /** contains the interface to the text of the header of left pages. */
  var HeaderTextLeft: XText
  
  /** contains the interface to the text of the header of right pages. */
  var HeaderTextRight: XText
  
  /** determines the style of the top border line of the header. */
  var HeaderTopBorder: BorderLine
  
  /** determines the top border distance of the header. */
  var HeaderTopBorderDistance: Double
  
  /** contains the height of the page. */
  var Height: Double
  
  /** determines if the page format is landscape. */
  var IsLandscape: Boolean
  
  /** determines the style of the left border line of the page. */
  var LeftBorder: BorderLine
  
  /** determines the left border distance of the page. */
  var LeftBorderDistance: Double
  
  /** determines the left margin of the page. */
  var LeftMargin: Double
  
  /** determines the default numbering type for this page. */
  var NumberingType: Double
  
  /** determines the layout of the page. */
  var PageStyleLayout: typingsJapgolly.activexLibreoffice.com_.sun.star.style.PageStyleLayout
  
  /** contains the name of a paper tray of the selected printer. */
  var PrinterPaperTray: String
  
  /** determines if the register mode is active on that page. */
  var RegisterModeActive: Boolean
  
  /** contains the name of the paragraph style that is used as reference of the register mode. */
  var RegisterParagraphStyle: String
  
  /** determines the style of the right border line of the page. */
  var RightBorder: BorderLine
  
  /** determines the right border distance of the page. */
  var RightBorderDistance: Double
  
  /** determines the right margin of the page. */
  var RightMargin: Double
  
  /** determines the shadow of the page. */
  var ShadowFormat: typingsJapgolly.activexLibreoffice.com_.sun.star.table.ShadowFormat
  
  /** contains the paper size of the page. */
  var Size: typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
  
  /** contains the column settings of the page. */
  var TextColumns: XTextColumns
  
  /** determines the style of the top border line of the page. */
  var TopBorder: BorderLine
  
  /** determines the top border distance of the page. */
  var TopBorderDistance: Double
  
  /** determines the top margin of the page. */
  var TopMargin: Double
  
  /** contains the width of the page. */
  var Width: Double
  
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: Double
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
}
object PageStyle {
  
  inline def apply(
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BottomMargin: Double,
    DisplayName: String,
    FirstIsShared: Boolean,
    FollowStyle: String,
    FooterBackColor: Color,
    FooterBackGraphicFilter: String,
    FooterBackGraphicLocation: GraphicLocation,
    FooterBackGraphicURL: String,
    FooterBackTransparent: Boolean,
    FooterBodyDistance: Double,
    FooterBorderDistance: Double,
    FooterBottomBorder: BorderLine,
    FooterBottomBorderDistance: Double,
    FooterDynamicSpacing: Boolean,
    FooterHeight: Double,
    FooterIsDynamicHeight: Boolean,
    FooterIsOn: Boolean,
    FooterIsShared: Boolean,
    FooterLeftBorder: BorderLine,
    FooterLeftBorderDistance: Double,
    FooterLeftMargin: Double,
    FooterRightBorder: BorderLine,
    FooterRightBorderDistance: Double,
    FooterRightMargin: Double,
    FooterShadowFormat: ShadowFormat,
    FooterText: XText,
    FooterTextLeft: XText,
    FooterTextRight: XText,
    FooterTopBorder: BorderLine,
    FooterTopBorderDistance: Double,
    FootnoteHeight: Double,
    FootnoteLineAdjust: Double,
    FootnoteLineColor: Color,
    FootnoteLineDistance: Double,
    FootnoteLineRelativeWidth: Double,
    FootnoteLineStyle: Double,
    FootnoteLineTextDistance: Double,
    FootnoteLineWeight: Double,
    GridBaseHeight: Double,
    GridColor: Color,
    GridDisplay: Boolean,
    GridLines: Double,
    GridMode: Double,
    GridPrint: Boolean,
    GridRubyBelow: Boolean,
    GridRubyHeight: Double,
    HeaderBackColor: Color,
    HeaderBackGraphicFilter: String,
    HeaderBackGraphicLocation: GraphicLocation,
    HeaderBackGraphicURL: String,
    HeaderBackTransparent: Boolean,
    HeaderBodyDistance: Double,
    HeaderBorderDistance: Double,
    HeaderBottomBorder: BorderLine,
    HeaderBottomBorderDistance: Double,
    HeaderDynamicSpacing: Boolean,
    HeaderHeight: Double,
    HeaderIsDynamicHeight: Boolean,
    HeaderIsOn: Boolean,
    HeaderIsShared: Boolean,
    HeaderLeftBorder: BorderLine,
    HeaderLeftBorderDistance: Double,
    HeaderLeftMargin: Double,
    HeaderRightBorder: BorderLine,
    HeaderRightBorderDistance: Double,
    HeaderRightMargin: Double,
    HeaderShadowFormat: ShadowFormat,
    HeaderText: XText,
    HeaderTextLeft: XText,
    HeaderTextRight: XText,
    HeaderTopBorder: BorderLine,
    HeaderTopBorderDistance: Double,
    Height: Double,
    Hidden: Boolean,
    IsAutoUpdate: String,
    IsLandscape: Boolean,
    IsPhysical: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    LeftMargin: Double,
    Name: String,
    NumberingType: Double,
    PageStyleLayout: PageStyleLayout,
    ParaStyleConditions: SafeArray[NamedValue],
    ParentStyle: String,
    PrinterPaperTray: String,
    PropertySetInfo: XPropertySetInfo,
    RegisterModeActive: Boolean,
    RegisterParagraphStyle: String,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RightMargin: Double,
    ShadowFormat: ShadowFormat,
    Size: Size,
    StyleInteropGrabBag: SafeArray[PropertyValue],
    TextColumns: XTextColumns,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    UserDefinedAttributes: XNameContainer,
    Width: Double,
    WritingMode: Double,
    acquire: Callback,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    getName: CallbackTo[String],
    getParentStyle: CallbackTo[String],
    getPropertyDefaults: SeqEquiv[String] => SafeArray[Any],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[Any],
    isInUse: CallbackTo[Boolean],
    isUserDefined: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertiesChangeListener: XPropertiesChangeListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setAllPropertiesToDefault: Callback,
    setName: String => Callback,
    setParentStyle: String => Callback,
    setPropertiesToDefault: SeqEquiv[String] => Callback,
    setPropertyValue: (String, Any) => Callback,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Callback
  ): PageStyle = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], FirstIsShared = FirstIsShared.asInstanceOf[js.Any], FollowStyle = FollowStyle.asInstanceOf[js.Any], FooterBackColor = FooterBackColor.asInstanceOf[js.Any], FooterBackGraphicFilter = FooterBackGraphicFilter.asInstanceOf[js.Any], FooterBackGraphicLocation = FooterBackGraphicLocation.asInstanceOf[js.Any], FooterBackGraphicURL = FooterBackGraphicURL.asInstanceOf[js.Any], FooterBackTransparent = FooterBackTransparent.asInstanceOf[js.Any], FooterBodyDistance = FooterBodyDistance.asInstanceOf[js.Any], FooterBorderDistance = FooterBorderDistance.asInstanceOf[js.Any], FooterBottomBorder = FooterBottomBorder.asInstanceOf[js.Any], FooterBottomBorderDistance = FooterBottomBorderDistance.asInstanceOf[js.Any], FooterDynamicSpacing = FooterDynamicSpacing.asInstanceOf[js.Any], FooterHeight = FooterHeight.asInstanceOf[js.Any], FooterIsDynamicHeight = FooterIsDynamicHeight.asInstanceOf[js.Any], FooterIsOn = FooterIsOn.asInstanceOf[js.Any], FooterIsShared = FooterIsShared.asInstanceOf[js.Any], FooterLeftBorder = FooterLeftBorder.asInstanceOf[js.Any], FooterLeftBorderDistance = FooterLeftBorderDistance.asInstanceOf[js.Any], FooterLeftMargin = FooterLeftMargin.asInstanceOf[js.Any], FooterRightBorder = FooterRightBorder.asInstanceOf[js.Any], FooterRightBorderDistance = FooterRightBorderDistance.asInstanceOf[js.Any], FooterRightMargin = FooterRightMargin.asInstanceOf[js.Any], FooterShadowFormat = FooterShadowFormat.asInstanceOf[js.Any], FooterText = FooterText.asInstanceOf[js.Any], FooterTextLeft = FooterTextLeft.asInstanceOf[js.Any], FooterTextRight = FooterTextRight.asInstanceOf[js.Any], FooterTopBorder = FooterTopBorder.asInstanceOf[js.Any], FooterTopBorderDistance = FooterTopBorderDistance.asInstanceOf[js.Any], FootnoteHeight = FootnoteHeight.asInstanceOf[js.Any], FootnoteLineAdjust = FootnoteLineAdjust.asInstanceOf[js.Any], FootnoteLineColor = FootnoteLineColor.asInstanceOf[js.Any], FootnoteLineDistance = FootnoteLineDistance.asInstanceOf[js.Any], FootnoteLineRelativeWidth = FootnoteLineRelativeWidth.asInstanceOf[js.Any], FootnoteLineStyle = FootnoteLineStyle.asInstanceOf[js.Any], FootnoteLineTextDistance = FootnoteLineTextDistance.asInstanceOf[js.Any], FootnoteLineWeight = FootnoteLineWeight.asInstanceOf[js.Any], GridBaseHeight = GridBaseHeight.asInstanceOf[js.Any], GridColor = GridColor.asInstanceOf[js.Any], GridDisplay = GridDisplay.asInstanceOf[js.Any], GridLines = GridLines.asInstanceOf[js.Any], GridMode = GridMode.asInstanceOf[js.Any], GridPrint = GridPrint.asInstanceOf[js.Any], GridRubyBelow = GridRubyBelow.asInstanceOf[js.Any], GridRubyHeight = GridRubyHeight.asInstanceOf[js.Any], HeaderBackColor = HeaderBackColor.asInstanceOf[js.Any], HeaderBackGraphicFilter = HeaderBackGraphicFilter.asInstanceOf[js.Any], HeaderBackGraphicLocation = HeaderBackGraphicLocation.asInstanceOf[js.Any], HeaderBackGraphicURL = HeaderBackGraphicURL.asInstanceOf[js.Any], HeaderBackTransparent = HeaderBackTransparent.asInstanceOf[js.Any], HeaderBodyDistance = HeaderBodyDistance.asInstanceOf[js.Any], HeaderBorderDistance = HeaderBorderDistance.asInstanceOf[js.Any], HeaderBottomBorder = HeaderBottomBorder.asInstanceOf[js.Any], HeaderBottomBorderDistance = HeaderBottomBorderDistance.asInstanceOf[js.Any], HeaderDynamicSpacing = HeaderDynamicSpacing.asInstanceOf[js.Any], HeaderHeight = HeaderHeight.asInstanceOf[js.Any], HeaderIsDynamicHeight = HeaderIsDynamicHeight.asInstanceOf[js.Any], HeaderIsOn = HeaderIsOn.asInstanceOf[js.Any], HeaderIsShared = HeaderIsShared.asInstanceOf[js.Any], HeaderLeftBorder = HeaderLeftBorder.asInstanceOf[js.Any], HeaderLeftBorderDistance = HeaderLeftBorderDistance.asInstanceOf[js.Any], HeaderLeftMargin = HeaderLeftMargin.asInstanceOf[js.Any], HeaderRightBorder = HeaderRightBorder.asInstanceOf[js.Any], HeaderRightBorderDistance = HeaderRightBorderDistance.asInstanceOf[js.Any], HeaderRightMargin = HeaderRightMargin.asInstanceOf[js.Any], HeaderShadowFormat = HeaderShadowFormat.asInstanceOf[js.Any], HeaderText = HeaderText.asInstanceOf[js.Any], HeaderTextLeft = HeaderTextLeft.asInstanceOf[js.Any], HeaderTextRight = HeaderTextRight.asInstanceOf[js.Any], HeaderTopBorder = HeaderTopBorder.asInstanceOf[js.Any], HeaderTopBorderDistance = HeaderTopBorderDistance.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IsAutoUpdate = IsAutoUpdate.asInstanceOf[js.Any], IsLandscape = IsLandscape.asInstanceOf[js.Any], IsPhysical = IsPhysical.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PageStyleLayout = PageStyleLayout.asInstanceOf[js.Any], ParaStyleConditions = ParaStyleConditions.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], PrinterPaperTray = PrinterPaperTray.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RegisterModeActive = RegisterModeActive.asInstanceOf[js.Any], RegisterParagraphStyle = RegisterParagraphStyle.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StyleInteropGrabBag = StyleInteropGrabBag.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (addPropertiesChangeListener(t0, t1)).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), firePropertiesChangeEvent = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (firePropertiesChangeEvent(t0, t1)).runNow()), getName = getName.toJsFn, getParentStyle = getParentStyle.toJsFn, getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), isInUse = isInUse.toJsFn, isUserDefined = isUserDefined.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertiesChangeListener = js.Any.fromFunction1((t0: XPropertiesChangeListener) => removePropertiesChangeListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setAllPropertiesToDefault = setAllPropertiesToDefault.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setParentStyle = js.Any.fromFunction1((t0: String) => setParentStyle(t0).runNow()), setPropertiesToDefault = js.Any.fromFunction1((t0: SeqEquiv[String]) => setPropertiesToDefault(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setPropertyValues = js.Any.fromFunction2((t0: SeqEquiv[String], t1: SeqEquiv[Any]) => (setPropertyValues(t0, t1)).runNow()))
    __obj.asInstanceOf[PageStyle]
  }
  
  extension [Self <: PageStyle](x: Self) {
    
    inline def setBackColor(value: Color): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setBackGraphicFilter(value: String): Self = StObject.set(x, "BackGraphicFilter", value.asInstanceOf[js.Any])
    
    inline def setBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "BackGraphicLocation", value.asInstanceOf[js.Any])
    
    inline def setBackGraphicURL(value: String): Self = StObject.set(x, "BackGraphicURL", value.asInstanceOf[js.Any])
    
    inline def setBackTransparent(value: Boolean): Self = StObject.set(x, "BackTransparent", value.asInstanceOf[js.Any])
    
    inline def setBorderDistance(value: Double): Self = StObject.set(x, "BorderDistance", value.asInstanceOf[js.Any])
    
    inline def setBottomBorder(value: BorderLine): Self = StObject.set(x, "BottomBorder", value.asInstanceOf[js.Any])
    
    inline def setBottomBorderDistance(value: Double): Self = StObject.set(x, "BottomBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setBottomMargin(value: Double): Self = StObject.set(x, "BottomMargin", value.asInstanceOf[js.Any])
    
    inline def setFirstIsShared(value: Boolean): Self = StObject.set(x, "FirstIsShared", value.asInstanceOf[js.Any])
    
    inline def setFooterBackColor(value: Color): Self = StObject.set(x, "FooterBackColor", value.asInstanceOf[js.Any])
    
    inline def setFooterBackGraphicFilter(value: String): Self = StObject.set(x, "FooterBackGraphicFilter", value.asInstanceOf[js.Any])
    
    inline def setFooterBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "FooterBackGraphicLocation", value.asInstanceOf[js.Any])
    
    inline def setFooterBackGraphicURL(value: String): Self = StObject.set(x, "FooterBackGraphicURL", value.asInstanceOf[js.Any])
    
    inline def setFooterBackTransparent(value: Boolean): Self = StObject.set(x, "FooterBackTransparent", value.asInstanceOf[js.Any])
    
    inline def setFooterBodyDistance(value: Double): Self = StObject.set(x, "FooterBodyDistance", value.asInstanceOf[js.Any])
    
    inline def setFooterBorderDistance(value: Double): Self = StObject.set(x, "FooterBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setFooterBottomBorder(value: BorderLine): Self = StObject.set(x, "FooterBottomBorder", value.asInstanceOf[js.Any])
    
    inline def setFooterBottomBorderDistance(value: Double): Self = StObject.set(x, "FooterBottomBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setFooterDynamicSpacing(value: Boolean): Self = StObject.set(x, "FooterDynamicSpacing", value.asInstanceOf[js.Any])
    
    inline def setFooterHeight(value: Double): Self = StObject.set(x, "FooterHeight", value.asInstanceOf[js.Any])
    
    inline def setFooterIsDynamicHeight(value: Boolean): Self = StObject.set(x, "FooterIsDynamicHeight", value.asInstanceOf[js.Any])
    
    inline def setFooterIsOn(value: Boolean): Self = StObject.set(x, "FooterIsOn", value.asInstanceOf[js.Any])
    
    inline def setFooterIsShared(value: Boolean): Self = StObject.set(x, "FooterIsShared", value.asInstanceOf[js.Any])
    
    inline def setFooterLeftBorder(value: BorderLine): Self = StObject.set(x, "FooterLeftBorder", value.asInstanceOf[js.Any])
    
    inline def setFooterLeftBorderDistance(value: Double): Self = StObject.set(x, "FooterLeftBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setFooterLeftMargin(value: Double): Self = StObject.set(x, "FooterLeftMargin", value.asInstanceOf[js.Any])
    
    inline def setFooterRightBorder(value: BorderLine): Self = StObject.set(x, "FooterRightBorder", value.asInstanceOf[js.Any])
    
    inline def setFooterRightBorderDistance(value: Double): Self = StObject.set(x, "FooterRightBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setFooterRightMargin(value: Double): Self = StObject.set(x, "FooterRightMargin", value.asInstanceOf[js.Any])
    
    inline def setFooterShadowFormat(value: ShadowFormat): Self = StObject.set(x, "FooterShadowFormat", value.asInstanceOf[js.Any])
    
    inline def setFooterText(value: XText): Self = StObject.set(x, "FooterText", value.asInstanceOf[js.Any])
    
    inline def setFooterTextLeft(value: XText): Self = StObject.set(x, "FooterTextLeft", value.asInstanceOf[js.Any])
    
    inline def setFooterTextRight(value: XText): Self = StObject.set(x, "FooterTextRight", value.asInstanceOf[js.Any])
    
    inline def setFooterTopBorder(value: BorderLine): Self = StObject.set(x, "FooterTopBorder", value.asInstanceOf[js.Any])
    
    inline def setFooterTopBorderDistance(value: Double): Self = StObject.set(x, "FooterTopBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setFootnoteHeight(value: Double): Self = StObject.set(x, "FootnoteHeight", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineAdjust(value: Double): Self = StObject.set(x, "FootnoteLineAdjust", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineColor(value: Color): Self = StObject.set(x, "FootnoteLineColor", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineDistance(value: Double): Self = StObject.set(x, "FootnoteLineDistance", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineRelativeWidth(value: Double): Self = StObject.set(x, "FootnoteLineRelativeWidth", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineStyle(value: Double): Self = StObject.set(x, "FootnoteLineStyle", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineTextDistance(value: Double): Self = StObject.set(x, "FootnoteLineTextDistance", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineWeight(value: Double): Self = StObject.set(x, "FootnoteLineWeight", value.asInstanceOf[js.Any])
    
    inline def setGetPropertySetInfo(value: CallbackTo[XPropertySetInfo]): Self = StObject.set(x, "getPropertySetInfo", value.toJsFn)
    
    inline def setGridBaseHeight(value: Double): Self = StObject.set(x, "GridBaseHeight", value.asInstanceOf[js.Any])
    
    inline def setGridColor(value: Color): Self = StObject.set(x, "GridColor", value.asInstanceOf[js.Any])
    
    inline def setGridDisplay(value: Boolean): Self = StObject.set(x, "GridDisplay", value.asInstanceOf[js.Any])
    
    inline def setGridLines(value: Double): Self = StObject.set(x, "GridLines", value.asInstanceOf[js.Any])
    
    inline def setGridMode(value: Double): Self = StObject.set(x, "GridMode", value.asInstanceOf[js.Any])
    
    inline def setGridPrint(value: Boolean): Self = StObject.set(x, "GridPrint", value.asInstanceOf[js.Any])
    
    inline def setGridRubyBelow(value: Boolean): Self = StObject.set(x, "GridRubyBelow", value.asInstanceOf[js.Any])
    
    inline def setGridRubyHeight(value: Double): Self = StObject.set(x, "GridRubyHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackColor(value: Color): Self = StObject.set(x, "HeaderBackColor", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackGraphicFilter(value: String): Self = StObject.set(x, "HeaderBackGraphicFilter", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "HeaderBackGraphicLocation", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackGraphicURL(value: String): Self = StObject.set(x, "HeaderBackGraphicURL", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackTransparent(value: Boolean): Self = StObject.set(x, "HeaderBackTransparent", value.asInstanceOf[js.Any])
    
    inline def setHeaderBodyDistance(value: Double): Self = StObject.set(x, "HeaderBodyDistance", value.asInstanceOf[js.Any])
    
    inline def setHeaderBorderDistance(value: Double): Self = StObject.set(x, "HeaderBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setHeaderBottomBorder(value: BorderLine): Self = StObject.set(x, "HeaderBottomBorder", value.asInstanceOf[js.Any])
    
    inline def setHeaderBottomBorderDistance(value: Double): Self = StObject.set(x, "HeaderBottomBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setHeaderDynamicSpacing(value: Boolean): Self = StObject.set(x, "HeaderDynamicSpacing", value.asInstanceOf[js.Any])
    
    inline def setHeaderHeight(value: Double): Self = StObject.set(x, "HeaderHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderIsDynamicHeight(value: Boolean): Self = StObject.set(x, "HeaderIsDynamicHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderIsOn(value: Boolean): Self = StObject.set(x, "HeaderIsOn", value.asInstanceOf[js.Any])
    
    inline def setHeaderIsShared(value: Boolean): Self = StObject.set(x, "HeaderIsShared", value.asInstanceOf[js.Any])
    
    inline def setHeaderLeftBorder(value: BorderLine): Self = StObject.set(x, "HeaderLeftBorder", value.asInstanceOf[js.Any])
    
    inline def setHeaderLeftBorderDistance(value: Double): Self = StObject.set(x, "HeaderLeftBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setHeaderLeftMargin(value: Double): Self = StObject.set(x, "HeaderLeftMargin", value.asInstanceOf[js.Any])
    
    inline def setHeaderRightBorder(value: BorderLine): Self = StObject.set(x, "HeaderRightBorder", value.asInstanceOf[js.Any])
    
    inline def setHeaderRightBorderDistance(value: Double): Self = StObject.set(x, "HeaderRightBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setHeaderRightMargin(value: Double): Self = StObject.set(x, "HeaderRightMargin", value.asInstanceOf[js.Any])
    
    inline def setHeaderShadowFormat(value: ShadowFormat): Self = StObject.set(x, "HeaderShadowFormat", value.asInstanceOf[js.Any])
    
    inline def setHeaderText(value: XText): Self = StObject.set(x, "HeaderText", value.asInstanceOf[js.Any])
    
    inline def setHeaderTextLeft(value: XText): Self = StObject.set(x, "HeaderTextLeft", value.asInstanceOf[js.Any])
    
    inline def setHeaderTextRight(value: XText): Self = StObject.set(x, "HeaderTextRight", value.asInstanceOf[js.Any])
    
    inline def setHeaderTopBorder(value: BorderLine): Self = StObject.set(x, "HeaderTopBorder", value.asInstanceOf[js.Any])
    
    inline def setHeaderTopBorderDistance(value: Double): Self = StObject.set(x, "HeaderTopBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setIsLandscape(value: Boolean): Self = StObject.set(x, "IsLandscape", value.asInstanceOf[js.Any])
    
    inline def setLeftBorder(value: BorderLine): Self = StObject.set(x, "LeftBorder", value.asInstanceOf[js.Any])
    
    inline def setLeftBorderDistance(value: Double): Self = StObject.set(x, "LeftBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    inline def setNumberingType(value: Double): Self = StObject.set(x, "NumberingType", value.asInstanceOf[js.Any])
    
    inline def setPageStyleLayout(value: PageStyleLayout): Self = StObject.set(x, "PageStyleLayout", value.asInstanceOf[js.Any])
    
    inline def setPrinterPaperTray(value: String): Self = StObject.set(x, "PrinterPaperTray", value.asInstanceOf[js.Any])
    
    inline def setRegisterModeActive(value: Boolean): Self = StObject.set(x, "RegisterModeActive", value.asInstanceOf[js.Any])
    
    inline def setRegisterParagraphStyle(value: String): Self = StObject.set(x, "RegisterParagraphStyle", value.asInstanceOf[js.Any])
    
    inline def setRightBorder(value: BorderLine): Self = StObject.set(x, "RightBorder", value.asInstanceOf[js.Any])
    
    inline def setRightBorderDistance(value: Double): Self = StObject.set(x, "RightBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setRightMargin(value: Double): Self = StObject.set(x, "RightMargin", value.asInstanceOf[js.Any])
    
    inline def setShadowFormat(value: ShadowFormat): Self = StObject.set(x, "ShadowFormat", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setTextColumns(value: XTextColumns): Self = StObject.set(x, "TextColumns", value.asInstanceOf[js.Any])
    
    inline def setTopBorder(value: BorderLine): Self = StObject.set(x, "TopBorder", value.asInstanceOf[js.Any])
    
    inline def setTopBorderDistance(value: Double): Self = StObject.set(x, "TopBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setTopMargin(value: Double): Self = StObject.set(x, "TopMargin", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWritingMode(value: Double): Self = StObject.set(x, "WritingMode", value.asInstanceOf[js.Any])
  }
}
