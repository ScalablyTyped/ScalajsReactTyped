package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

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
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.PageStyle
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.PageStyleLayout
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
  * represents a page style for a spreadsheet.
  *
  * This service extends the service {@link com.sun.star.style.PageStyle} with spreadsheet specific properties.
  */
trait TablePageStyle
  extends StObject
     with PageStyle {
  
  /** determines whether the table is centered horizontally on the page. */
  var CenterHorizontally: Boolean
  
  /** determines whether the table is centered vertically on the page. */
  var CenterVertically: Boolean
  
  /**
    * contains the page number applied to the first page for this sheet.
    *
    * The value 0 indicates that the page numbers are continued from the previous sheet.
    */
  var FirstPageNumber: Double
  
  /**
    * contains the content of the footer for left pages.
    *
    * After changing the footer text contents, this property has to be reinserted into the property set.
    * @see com.sun.star.sheet.HeaderFooterContent
    */
  var LeftPageFooterContent: XHeaderFooterContent
  
  /**
    * contains the content of the header for left pages.
    *
    * After changing the header text contents, this property has to be reinserted into the property set.
    * @see com.sun.star.sheet.HeaderFooterContent
    */
  var LeftPageHeaderContent: XHeaderFooterContent
  
  /** contains the scaling factor (in percent) for printing the sheet. */
  var PageScale: Double
  
  /** enables printing of cell annotations. */
  var PrintAnnotations: Boolean
  
  /** enables printing of charts. */
  var PrintCharts: Boolean
  
  /**
    * specifies the print order for the pages within each sheet.
    *
    * If `TRUE` , the order for printing pages begins with top-to-bottom, then continues with the next set of cell columns to the right. If `FALSE` , the
    * order for printing pages begins with left-to-right, then continues with the next set of cell rows to the bottom.
    */
  var PrintDownFirst: Boolean
  
  /** enables printing of drawing objects. */
  var PrintDrawing: Boolean
  
  /** enables printing of formulas instead of their results. */
  var PrintFormulas: Boolean
  
  /** enables printing of the cell grid. */
  var PrintGrid: Boolean
  
  /** enables printing of column and row headers. */
  var PrintHeaders: Boolean
  
  /** enables printing of embedded objects. */
  var PrintObjects: Boolean
  
  /** enables printing of zero-values. */
  var PrintZeroValues: Boolean
  
  /**
    * contains the content of the footer for right pages.
    *
    * After changing the footer text contents, this property has to be reinserted into the property set.
    * @see com.sun.star.sheet.HeaderFooterContent
    */
  var RightPageFooterContent: XHeaderFooterContent
  
  /**
    * contains the content of the header for right pages.
    *
    * After changing the header text contents, this property has to be reinserted into the property set.
    * @see com.sun.star.sheet.HeaderFooterContent
    */
  var RightPageHeaderContent: XHeaderFooterContent
  
  /** contains the number of pages the sheet will printed. */
  var ScaleToPages: Double
  
  /**
    * contains the number of horizontal pages the sheet will printed on.
    * @since OOo 2.0
    */
  var ScaleToPagesX: Double
  
  /**
    * contains the number of vertical pages the sheet will printed on.
    * @since OOo 2.0
    */
  var ScaleToPagesY: Double
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
}
object TablePageStyle {
  
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
    CenterHorizontally: Boolean,
    CenterVertically: Boolean,
    DisplayName: String,
    FirstIsShared: Boolean,
    FirstPageNumber: Double,
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
    LeftPageFooterContent: XHeaderFooterContent,
    LeftPageHeaderContent: XHeaderFooterContent,
    Name: String,
    NumberingType: Double,
    PageScale: Double,
    PageStyleLayout: PageStyleLayout,
    ParaStyleConditions: SafeArray[NamedValue],
    ParentStyle: String,
    PrintAnnotations: Boolean,
    PrintCharts: Boolean,
    PrintDownFirst: Boolean,
    PrintDrawing: Boolean,
    PrintFormulas: Boolean,
    PrintGrid: Boolean,
    PrintHeaders: Boolean,
    PrintObjects: Boolean,
    PrintZeroValues: Boolean,
    PrinterPaperTray: String,
    PropertySetInfo: XPropertySetInfo,
    RegisterModeActive: Boolean,
    RegisterParagraphStyle: String,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RightMargin: Double,
    RightPageFooterContent: XHeaderFooterContent,
    RightPageHeaderContent: XHeaderFooterContent,
    ScaleToPages: Double,
    ScaleToPagesX: Double,
    ScaleToPagesY: Double,
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
  ): TablePageStyle = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], CenterHorizontally = CenterHorizontally.asInstanceOf[js.Any], CenterVertically = CenterVertically.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], FirstIsShared = FirstIsShared.asInstanceOf[js.Any], FirstPageNumber = FirstPageNumber.asInstanceOf[js.Any], FollowStyle = FollowStyle.asInstanceOf[js.Any], FooterBackColor = FooterBackColor.asInstanceOf[js.Any], FooterBackGraphicFilter = FooterBackGraphicFilter.asInstanceOf[js.Any], FooterBackGraphicLocation = FooterBackGraphicLocation.asInstanceOf[js.Any], FooterBackGraphicURL = FooterBackGraphicURL.asInstanceOf[js.Any], FooterBackTransparent = FooterBackTransparent.asInstanceOf[js.Any], FooterBodyDistance = FooterBodyDistance.asInstanceOf[js.Any], FooterBorderDistance = FooterBorderDistance.asInstanceOf[js.Any], FooterBottomBorder = FooterBottomBorder.asInstanceOf[js.Any], FooterBottomBorderDistance = FooterBottomBorderDistance.asInstanceOf[js.Any], FooterDynamicSpacing = FooterDynamicSpacing.asInstanceOf[js.Any], FooterHeight = FooterHeight.asInstanceOf[js.Any], FooterIsDynamicHeight = FooterIsDynamicHeight.asInstanceOf[js.Any], FooterIsOn = FooterIsOn.asInstanceOf[js.Any], FooterIsShared = FooterIsShared.asInstanceOf[js.Any], FooterLeftBorder = FooterLeftBorder.asInstanceOf[js.Any], FooterLeftBorderDistance = FooterLeftBorderDistance.asInstanceOf[js.Any], FooterLeftMargin = FooterLeftMargin.asInstanceOf[js.Any], FooterRightBorder = FooterRightBorder.asInstanceOf[js.Any], FooterRightBorderDistance = FooterRightBorderDistance.asInstanceOf[js.Any], FooterRightMargin = FooterRightMargin.asInstanceOf[js.Any], FooterShadowFormat = FooterShadowFormat.asInstanceOf[js.Any], FooterText = FooterText.asInstanceOf[js.Any], FooterTextLeft = FooterTextLeft.asInstanceOf[js.Any], FooterTextRight = FooterTextRight.asInstanceOf[js.Any], FooterTopBorder = FooterTopBorder.asInstanceOf[js.Any], FooterTopBorderDistance = FooterTopBorderDistance.asInstanceOf[js.Any], FootnoteHeight = FootnoteHeight.asInstanceOf[js.Any], FootnoteLineAdjust = FootnoteLineAdjust.asInstanceOf[js.Any], FootnoteLineColor = FootnoteLineColor.asInstanceOf[js.Any], FootnoteLineDistance = FootnoteLineDistance.asInstanceOf[js.Any], FootnoteLineRelativeWidth = FootnoteLineRelativeWidth.asInstanceOf[js.Any], FootnoteLineStyle = FootnoteLineStyle.asInstanceOf[js.Any], FootnoteLineTextDistance = FootnoteLineTextDistance.asInstanceOf[js.Any], FootnoteLineWeight = FootnoteLineWeight.asInstanceOf[js.Any], GridBaseHeight = GridBaseHeight.asInstanceOf[js.Any], GridColor = GridColor.asInstanceOf[js.Any], GridDisplay = GridDisplay.asInstanceOf[js.Any], GridLines = GridLines.asInstanceOf[js.Any], GridMode = GridMode.asInstanceOf[js.Any], GridPrint = GridPrint.asInstanceOf[js.Any], GridRubyBelow = GridRubyBelow.asInstanceOf[js.Any], GridRubyHeight = GridRubyHeight.asInstanceOf[js.Any], HeaderBackColor = HeaderBackColor.asInstanceOf[js.Any], HeaderBackGraphicFilter = HeaderBackGraphicFilter.asInstanceOf[js.Any], HeaderBackGraphicLocation = HeaderBackGraphicLocation.asInstanceOf[js.Any], HeaderBackGraphicURL = HeaderBackGraphicURL.asInstanceOf[js.Any], HeaderBackTransparent = HeaderBackTransparent.asInstanceOf[js.Any], HeaderBodyDistance = HeaderBodyDistance.asInstanceOf[js.Any], HeaderBorderDistance = HeaderBorderDistance.asInstanceOf[js.Any], HeaderBottomBorder = HeaderBottomBorder.asInstanceOf[js.Any], HeaderBottomBorderDistance = HeaderBottomBorderDistance.asInstanceOf[js.Any], HeaderDynamicSpacing = HeaderDynamicSpacing.asInstanceOf[js.Any], HeaderHeight = HeaderHeight.asInstanceOf[js.Any], HeaderIsDynamicHeight = HeaderIsDynamicHeight.asInstanceOf[js.Any], HeaderIsOn = HeaderIsOn.asInstanceOf[js.Any], HeaderIsShared = HeaderIsShared.asInstanceOf[js.Any], HeaderLeftBorder = HeaderLeftBorder.asInstanceOf[js.Any], HeaderLeftBorderDistance = HeaderLeftBorderDistance.asInstanceOf[js.Any], HeaderLeftMargin = HeaderLeftMargin.asInstanceOf[js.Any], HeaderRightBorder = HeaderRightBorder.asInstanceOf[js.Any], HeaderRightBorderDistance = HeaderRightBorderDistance.asInstanceOf[js.Any], HeaderRightMargin = HeaderRightMargin.asInstanceOf[js.Any], HeaderShadowFormat = HeaderShadowFormat.asInstanceOf[js.Any], HeaderText = HeaderText.asInstanceOf[js.Any], HeaderTextLeft = HeaderTextLeft.asInstanceOf[js.Any], HeaderTextRight = HeaderTextRight.asInstanceOf[js.Any], HeaderTopBorder = HeaderTopBorder.asInstanceOf[js.Any], HeaderTopBorderDistance = HeaderTopBorderDistance.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IsAutoUpdate = IsAutoUpdate.asInstanceOf[js.Any], IsLandscape = IsLandscape.asInstanceOf[js.Any], IsPhysical = IsPhysical.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], LeftPageFooterContent = LeftPageFooterContent.asInstanceOf[js.Any], LeftPageHeaderContent = LeftPageHeaderContent.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PageScale = PageScale.asInstanceOf[js.Any], PageStyleLayout = PageStyleLayout.asInstanceOf[js.Any], ParaStyleConditions = ParaStyleConditions.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], PrintAnnotations = PrintAnnotations.asInstanceOf[js.Any], PrintCharts = PrintCharts.asInstanceOf[js.Any], PrintDownFirst = PrintDownFirst.asInstanceOf[js.Any], PrintDrawing = PrintDrawing.asInstanceOf[js.Any], PrintFormulas = PrintFormulas.asInstanceOf[js.Any], PrintGrid = PrintGrid.asInstanceOf[js.Any], PrintHeaders = PrintHeaders.asInstanceOf[js.Any], PrintObjects = PrintObjects.asInstanceOf[js.Any], PrintZeroValues = PrintZeroValues.asInstanceOf[js.Any], PrinterPaperTray = PrinterPaperTray.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RegisterModeActive = RegisterModeActive.asInstanceOf[js.Any], RegisterParagraphStyle = RegisterParagraphStyle.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], RightPageFooterContent = RightPageFooterContent.asInstanceOf[js.Any], RightPageHeaderContent = RightPageHeaderContent.asInstanceOf[js.Any], ScaleToPages = ScaleToPages.asInstanceOf[js.Any], ScaleToPagesX = ScaleToPagesX.asInstanceOf[js.Any], ScaleToPagesY = ScaleToPagesY.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StyleInteropGrabBag = StyleInteropGrabBag.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (addPropertiesChangeListener(t0, t1)).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), firePropertiesChangeEvent = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (firePropertiesChangeEvent(t0, t1)).runNow()), getName = getName.toJsFn, getParentStyle = getParentStyle.toJsFn, getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), isInUse = isInUse.toJsFn, isUserDefined = isUserDefined.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertiesChangeListener = js.Any.fromFunction1((t0: XPropertiesChangeListener) => removePropertiesChangeListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setAllPropertiesToDefault = setAllPropertiesToDefault.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setParentStyle = js.Any.fromFunction1((t0: String) => setParentStyle(t0).runNow()), setPropertiesToDefault = js.Any.fromFunction1((t0: SeqEquiv[String]) => setPropertiesToDefault(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setPropertyValues = js.Any.fromFunction2((t0: SeqEquiv[String], t1: SeqEquiv[Any]) => (setPropertyValues(t0, t1)).runNow()))
    __obj.asInstanceOf[TablePageStyle]
  }
  
  extension [Self <: TablePageStyle](x: Self) {
    
    inline def setCenterHorizontally(value: Boolean): Self = StObject.set(x, "CenterHorizontally", value.asInstanceOf[js.Any])
    
    inline def setCenterVertically(value: Boolean): Self = StObject.set(x, "CenterVertically", value.asInstanceOf[js.Any])
    
    inline def setFirstPageNumber(value: Double): Self = StObject.set(x, "FirstPageNumber", value.asInstanceOf[js.Any])
    
    inline def setGetPropertySetInfo(value: CallbackTo[XPropertySetInfo]): Self = StObject.set(x, "getPropertySetInfo", value.toJsFn)
    
    inline def setLeftPageFooterContent(value: XHeaderFooterContent): Self = StObject.set(x, "LeftPageFooterContent", value.asInstanceOf[js.Any])
    
    inline def setLeftPageHeaderContent(value: XHeaderFooterContent): Self = StObject.set(x, "LeftPageHeaderContent", value.asInstanceOf[js.Any])
    
    inline def setPageScale(value: Double): Self = StObject.set(x, "PageScale", value.asInstanceOf[js.Any])
    
    inline def setPrintAnnotations(value: Boolean): Self = StObject.set(x, "PrintAnnotations", value.asInstanceOf[js.Any])
    
    inline def setPrintCharts(value: Boolean): Self = StObject.set(x, "PrintCharts", value.asInstanceOf[js.Any])
    
    inline def setPrintDownFirst(value: Boolean): Self = StObject.set(x, "PrintDownFirst", value.asInstanceOf[js.Any])
    
    inline def setPrintDrawing(value: Boolean): Self = StObject.set(x, "PrintDrawing", value.asInstanceOf[js.Any])
    
    inline def setPrintFormulas(value: Boolean): Self = StObject.set(x, "PrintFormulas", value.asInstanceOf[js.Any])
    
    inline def setPrintGrid(value: Boolean): Self = StObject.set(x, "PrintGrid", value.asInstanceOf[js.Any])
    
    inline def setPrintHeaders(value: Boolean): Self = StObject.set(x, "PrintHeaders", value.asInstanceOf[js.Any])
    
    inline def setPrintObjects(value: Boolean): Self = StObject.set(x, "PrintObjects", value.asInstanceOf[js.Any])
    
    inline def setPrintZeroValues(value: Boolean): Self = StObject.set(x, "PrintZeroValues", value.asInstanceOf[js.Any])
    
    inline def setRightPageFooterContent(value: XHeaderFooterContent): Self = StObject.set(x, "RightPageFooterContent", value.asInstanceOf[js.Any])
    
    inline def setRightPageHeaderContent(value: XHeaderFooterContent): Self = StObject.set(x, "RightPageHeaderContent", value.asInstanceOf[js.Any])
    
    inline def setScaleToPages(value: Double): Self = StObject.set(x, "ScaleToPages", value.asInstanceOf[js.Any])
    
    inline def setScaleToPagesX(value: Double): Self = StObject.set(x, "ScaleToPagesX", value.asInstanceOf[js.Any])
    
    inline def setScaleToPagesY(value: Double): Self = StObject.set(x, "ScaleToPagesY", value.asInstanceOf[js.Any])
  }
}
