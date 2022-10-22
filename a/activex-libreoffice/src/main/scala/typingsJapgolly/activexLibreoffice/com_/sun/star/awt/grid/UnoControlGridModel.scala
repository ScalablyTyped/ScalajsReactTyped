package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.SelectionType
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the standard model of a {@link UnoControlGrid} control.
  * @since OOo 3.3
  */
trait UnoControlGridModel
  extends StObject
     with UnoControlModel {
  
  /**
    * specifies the color to be used when drawing the background of selected cells, while the control has the focus.
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var ActiveSelectionBackgroundColor: Color
  
  /**
    * specifies the color to be used when drawing the text of selected cells, while the control has the focus.
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var ActiveSelectionTextColor: Color
  
  /**
    * specifies the height of the column header row, if applicable.
    *
    * The height is specified in application font units - see {@link com.sun.star.util.MeasureUnit} .
    *
    * The value given here is ignored if {@link ShowColumnHeader} is `FALSE` .
    *
    * If the property is `VOID` , the grid control shall automatically determine a height which conveniently allows, according to the used font, to display
    * one line of text.
    */
  var ColumnHeaderHeight: Double
  
  /**
    * Specifies the {@link XGridColumnModel} that is providing the column structure.
    *
    * You can implement your own instance of {@link XGridColumnModel} or use the {@link DefaultGridColumnModel} .
    *
    * The column model is in the ownership of the grid model: When you set a new column model, or dispose the grid model, then the (old) column model is
    * disposed, too.
    *
    * The default for this property is an empty instance of the {@link DefaultGridColumnModel} .
    */
  var ColumnModel: XGridColumnModel
  
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typingsJapgolly.activexLibreoffice.com_.sun.star.awt.FontDescriptor
  
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: Double
  
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: Double
  
  /**
    * Specifies the {@link XGridDataModel} that is providing the hierarchical data.
    *
    * You can implement your own instance of {@link XGridDataModel} or use the {@link DefaultGridDataModel} .
    *
    * The data model is in the ownership of the grid model: When you set a new data model, or dispose the grid model, then the (old) data model is disposed,
    * too.
    *
    * The default for this property is an empty instance of the {@link DefaultGridDataModel} .
    */
  var GridDataModel: XGridDataModel
  
  /**
    * specifies the color to be used when drawing lines between cells
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    * @see UseGridLines
    */
  var GridLineColor: Color
  
  /**
    * Specifies the vertical scrollbar mode.
    *
    * The default value is `FALSE`
    */
  var HScroll: Boolean
  
  /**
    * specifies the color to be used when drawing the background of row or column headers
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var HeaderBackgroundColor: Color
  
  /**
    * specifies the color to be used when drawing the text within row or column headers
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var HeaderTextColor: Color
  
  /** specifies the help text of the control. */
  var HelpText: String
  
  /** specifies the help URL of the control. */
  var HelpURL: String
  
  /**
    * specifies the color to be used when drawing the background of selected cells, while the control does not have the focus.
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var InactiveSelectionBackgroundColor: Color
  
  /**
    * specifies the color to be used when drawing the text of selected cells, while the control does not have the focus.
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var InactiveSelectionTextColor: Color
  
  /**
    * specifies the colors to be used as background for data rows.
    *
    * If this sequence is non-empty, the data rows will be rendered with alternating background colors: Assuming the sequence has `n` elements, each row
    * will use the background color as specified by its number's remainder modulo `n` .
    *
    * If this sequence is empty, all rows will use the same background color as the control as whole.
    *
    * If this property has a value of `VOID` , rows will be painted in alternating background colors, every second row having a background color derived
    * from the control's selection color.
    */
  var RowBackgroundColors: SafeArray[Color]
  
  /**
    * specifies the width of the row header column, if applicable.
    *
    * The width is specified in application font units - see {@link com.sun.star.util.MeasureUnit} .
    *
    * The value given here is ignored if {@link ShowRowHeader} is `FALSE` .
    */
  var RowHeaderWidth: Double
  
  /**
    * Specifies the height of rows in the grid control.
    *
    * The height is specified in application font units - see {@link com.sun.star.util.MeasureUnit} .
    */
  var RowHeight: Double
  
  /**
    * Specifies the selection mode that is enabled for this grid control.
    *
    * The default value is com::sun::star::view::SelectionType::SINGLE
    */
  var SelectionModel: SelectionType
  
  /**
    * Specifies whether the grid control should display a title row.
    *
    * The default value is `TRUE`
    */
  var ShowColumnHeader: Boolean
  
  /**
    * Specifies whether the grid control should display a special header column.
    *
    * The default value is `FALSE`
    */
  var ShowRowHeader: Boolean
  
  /** Specifies that the control can be reached with the TAB key. */
  var Tabstop: Boolean
  
  /**
    * specifies the color to be used when drawing cell texts
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var TextColor: Color
  
  /**
    * specifies the color to be used when drawing text lines (underlining and strikethrough)
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var TextLineColor: Color
  
  /**
    * controls whether or not to paint horizontal and vertical lines between the grid cells.
    * @see GridLineColor
    */
  var UseGridLines: Boolean
  
  /**
    * Specifies the horizontal scrollbar mode.
    *
    * The default value is `FALSE`
    */
  var VScroll: Boolean
  
  /** specifies the vertical alignment of the content in the control. */
  var VerticalAlign: VerticalAlignment
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
}
object UnoControlGridModel {
  
  inline def apply(
    ActiveSelectionBackgroundColor: Color,
    ActiveSelectionTextColor: Color,
    ColumnHeaderHeight: Double,
    ColumnModel: XGridColumnModel,
    DefaultControl: String,
    FontDescriptor: FontDescriptor,
    FontEmphasisMark: Double,
    FontRelief: Double,
    GridDataModel: XGridDataModel,
    GridLineColor: Color,
    HScroll: Boolean,
    HeaderBackgroundColor: Color,
    HeaderTextColor: Color,
    Height: Double,
    HelpText: String,
    HelpURL: String,
    InactiveSelectionBackgroundColor: Color,
    InactiveSelectionTextColor: Color,
    Name: String,
    PositionX: String,
    PositionY: String,
    PropertySetInfo: XPropertySetInfo,
    RowBackgroundColors: SafeArray[Color],
    RowHeaderWidth: Double,
    RowHeight: Double,
    SelectionModel: SelectionType,
    ServiceName: String,
    ShowColumnHeader: Boolean,
    ShowRowHeader: Boolean,
    Step: Double,
    TabIndex: Double,
    Tabstop: Boolean,
    Tag: String,
    TextColor: Color,
    TextLineColor: Color,
    UseGridLines: Boolean,
    VScroll: Boolean,
    VerticalAlign: VerticalAlignment,
    Width: Double,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    createClone: CallbackTo[XCloneable],
    dispose: Callback,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[Any],
    getServiceName: CallbackTo[String],
    queryInterface: `type` => Any,
    read: XObjectInputStream => Callback,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertiesChangeListener: XPropertiesChangeListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Callback,
    write: XObjectOutputStream => Callback
  ): UnoControlGridModel = {
    val __obj = js.Dynamic.literal(ActiveSelectionBackgroundColor = ActiveSelectionBackgroundColor.asInstanceOf[js.Any], ActiveSelectionTextColor = ActiveSelectionTextColor.asInstanceOf[js.Any], ColumnHeaderHeight = ColumnHeaderHeight.asInstanceOf[js.Any], ColumnModel = ColumnModel.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontEmphasisMark = FontEmphasisMark.asInstanceOf[js.Any], FontRelief = FontRelief.asInstanceOf[js.Any], GridDataModel = GridDataModel.asInstanceOf[js.Any], GridLineColor = GridLineColor.asInstanceOf[js.Any], HScroll = HScroll.asInstanceOf[js.Any], HeaderBackgroundColor = HeaderBackgroundColor.asInstanceOf[js.Any], HeaderTextColor = HeaderTextColor.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], InactiveSelectionBackgroundColor = InactiveSelectionBackgroundColor.asInstanceOf[js.Any], InactiveSelectionTextColor = InactiveSelectionTextColor.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RowBackgroundColors = RowBackgroundColors.asInstanceOf[js.Any], RowHeaderWidth = RowHeaderWidth.asInstanceOf[js.Any], RowHeight = RowHeight.asInstanceOf[js.Any], SelectionModel = SelectionModel.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ShowColumnHeader = ShowColumnHeader.asInstanceOf[js.Any], ShowRowHeader = ShowRowHeader.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tabstop = Tabstop.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], TextLineColor = TextLineColor.asInstanceOf[js.Any], UseGridLines = UseGridLines.asInstanceOf[js.Any], VScroll = VScroll.asInstanceOf[js.Any], VerticalAlign = VerticalAlign.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (addPropertiesChangeListener(t0, t1)).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), createClone = createClone.toJsFn, dispose = dispose.toJsFn, firePropertiesChangeEvent = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (firePropertiesChangeEvent(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = getServiceName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1((t0: XObjectInputStream) => read(t0).runNow()), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertiesChangeListener = js.Any.fromFunction1((t0: XPropertiesChangeListener) => removePropertiesChangeListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setPropertyValues = js.Any.fromFunction2((t0: SeqEquiv[String], t1: SeqEquiv[Any]) => (setPropertyValues(t0, t1)).runNow()), write = js.Any.fromFunction1((t0: XObjectOutputStream) => write(t0).runNow()))
    __obj.asInstanceOf[UnoControlGridModel]
  }
  
  extension [Self <: UnoControlGridModel](x: Self) {
    
    inline def setActiveSelectionBackgroundColor(value: Color): Self = StObject.set(x, "ActiveSelectionBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setActiveSelectionTextColor(value: Color): Self = StObject.set(x, "ActiveSelectionTextColor", value.asInstanceOf[js.Any])
    
    inline def setColumnHeaderHeight(value: Double): Self = StObject.set(x, "ColumnHeaderHeight", value.asInstanceOf[js.Any])
    
    inline def setColumnModel(value: XGridColumnModel): Self = StObject.set(x, "ColumnModel", value.asInstanceOf[js.Any])
    
    inline def setFontDescriptor(value: FontDescriptor): Self = StObject.set(x, "FontDescriptor", value.asInstanceOf[js.Any])
    
    inline def setFontEmphasisMark(value: Double): Self = StObject.set(x, "FontEmphasisMark", value.asInstanceOf[js.Any])
    
    inline def setFontRelief(value: Double): Self = StObject.set(x, "FontRelief", value.asInstanceOf[js.Any])
    
    inline def setGetPropertySetInfo(value: CallbackTo[XPropertySetInfo]): Self = StObject.set(x, "getPropertySetInfo", value.toJsFn)
    
    inline def setGridDataModel(value: XGridDataModel): Self = StObject.set(x, "GridDataModel", value.asInstanceOf[js.Any])
    
    inline def setGridLineColor(value: Color): Self = StObject.set(x, "GridLineColor", value.asInstanceOf[js.Any])
    
    inline def setHScroll(value: Boolean): Self = StObject.set(x, "HScroll", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackgroundColor(value: Color): Self = StObject.set(x, "HeaderBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHeaderTextColor(value: Color): Self = StObject.set(x, "HeaderTextColor", value.asInstanceOf[js.Any])
    
    inline def setHelpText(value: String): Self = StObject.set(x, "HelpText", value.asInstanceOf[js.Any])
    
    inline def setHelpURL(value: String): Self = StObject.set(x, "HelpURL", value.asInstanceOf[js.Any])
    
    inline def setInactiveSelectionBackgroundColor(value: Color): Self = StObject.set(x, "InactiveSelectionBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setInactiveSelectionTextColor(value: Color): Self = StObject.set(x, "InactiveSelectionTextColor", value.asInstanceOf[js.Any])
    
    inline def setRowBackgroundColors(value: SafeArray[Color]): Self = StObject.set(x, "RowBackgroundColors", value.asInstanceOf[js.Any])
    
    inline def setRowHeaderWidth(value: Double): Self = StObject.set(x, "RowHeaderWidth", value.asInstanceOf[js.Any])
    
    inline def setRowHeight(value: Double): Self = StObject.set(x, "RowHeight", value.asInstanceOf[js.Any])
    
    inline def setSelectionModel(value: SelectionType): Self = StObject.set(x, "SelectionModel", value.asInstanceOf[js.Any])
    
    inline def setShowColumnHeader(value: Boolean): Self = StObject.set(x, "ShowColumnHeader", value.asInstanceOf[js.Any])
    
    inline def setShowRowHeader(value: Boolean): Self = StObject.set(x, "ShowRowHeader", value.asInstanceOf[js.Any])
    
    inline def setTabstop(value: Boolean): Self = StObject.set(x, "Tabstop", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: Color): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
    
    inline def setTextLineColor(value: Color): Self = StObject.set(x, "TextLineColor", value.asInstanceOf[js.Any])
    
    inline def setUseGridLines(value: Boolean): Self = StObject.set(x, "UseGridLines", value.asInstanceOf[js.Any])
    
    inline def setVScroll(value: Boolean): Self = StObject.set(x, "VScroll", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlign(value: VerticalAlignment): Self = StObject.set(x, "VerticalAlign", value.asInstanceOf[js.Any])
  }
}
