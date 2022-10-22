package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains settings which are specific to each view of a spreadsheet */
trait SpreadsheetViewSettings
  extends StObject
     with XPropertySet {
  
  /** specifies the color in which the cell grid is displayed. */
  var GridColor: Color
  
  /** enables the column and row headers of the view. */
  var HasColumnRowHeaders: Boolean
  
  /** enables the horizontal scroll bar of the view. */
  var HasHorizontalScrollBar: Boolean
  
  /** enables the sheet tabs of the view. */
  var HasSheetTabs: Boolean
  
  /** enables the vertical scroll bar of the view. */
  var HasVerticalScrollBar: Boolean
  
  /** disables the display of marks from online spelling. */
  var HideSpellMarks: Boolean
  
  /** enables the display of outline symbols. */
  var IsOutlineSymbolsSet: Boolean
  
  /** controls whether strings, values, and formulas are displayed in different colors. */
  var IsValueHighlightingEnabled: Boolean
  
  /** enables display of anchor symbols when drawing objects are selected. */
  var ShowAnchor: Boolean
  
  /**
    * enables the display of charts in the view.
    * @see SpreadsheetViewObjectsMode
    */
  var ShowCharts: Double
  
  /**
    * enables the display of drawing objects in the view.
    * @see SpreadsheetViewObjectsMode
    */
  var ShowDrawing: Double
  
  /** controls whether formulas are displayed instead of their results. */
  var ShowFormulas: Boolean
  
  /** enables the display of the cell grid. */
  var ShowGrid: Boolean
  
  /** enables display of help lines when moving drawing objects. */
  var ShowHelpLines: Boolean
  
  /** controls whether a marker is shown for notes in cells. */
  var ShowNotes: Boolean
  
  /**
    * enables display of embedded objects in the view.
    * @see SpreadsheetViewObjectsMode
    */
  var ShowObjects: Double
  
  /** enables display of page breaks. */
  var ShowPageBreaks: Boolean
  
  /** enables display of zero-values. */
  var ShowZeroValues: Boolean
  
  /**
    * This property defines the zoom type for the document.
    * @see com.sun.star.view.DocumentZoomType
    */
  var ZoomType: Double
  
  /** Defines the zoom value to use. Valid only if the ZoomType is set to {@link com.sun.star.view.DocumentZoomType.BY_VALUE} . */
  var ZoomValue: Double
}
object SpreadsheetViewSettings {
  
  inline def apply(
    GridColor: Color,
    HasColumnRowHeaders: Boolean,
    HasHorizontalScrollBar: Boolean,
    HasSheetTabs: Boolean,
    HasVerticalScrollBar: Boolean,
    HideSpellMarks: Boolean,
    IsOutlineSymbolsSet: Boolean,
    IsValueHighlightingEnabled: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ShowAnchor: Boolean,
    ShowCharts: Double,
    ShowDrawing: Double,
    ShowFormulas: Boolean,
    ShowGrid: Boolean,
    ShowHelpLines: Boolean,
    ShowNotes: Boolean,
    ShowObjects: Double,
    ShowPageBreaks: Boolean,
    ShowZeroValues: Boolean,
    ZoomType: Double,
    ZoomValue: Double,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): SpreadsheetViewSettings = {
    val __obj = js.Dynamic.literal(GridColor = GridColor.asInstanceOf[js.Any], HasColumnRowHeaders = HasColumnRowHeaders.asInstanceOf[js.Any], HasHorizontalScrollBar = HasHorizontalScrollBar.asInstanceOf[js.Any], HasSheetTabs = HasSheetTabs.asInstanceOf[js.Any], HasVerticalScrollBar = HasVerticalScrollBar.asInstanceOf[js.Any], HideSpellMarks = HideSpellMarks.asInstanceOf[js.Any], IsOutlineSymbolsSet = IsOutlineSymbolsSet.asInstanceOf[js.Any], IsValueHighlightingEnabled = IsValueHighlightingEnabled.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ShowAnchor = ShowAnchor.asInstanceOf[js.Any], ShowCharts = ShowCharts.asInstanceOf[js.Any], ShowDrawing = ShowDrawing.asInstanceOf[js.Any], ShowFormulas = ShowFormulas.asInstanceOf[js.Any], ShowGrid = ShowGrid.asInstanceOf[js.Any], ShowHelpLines = ShowHelpLines.asInstanceOf[js.Any], ShowNotes = ShowNotes.asInstanceOf[js.Any], ShowObjects = ShowObjects.asInstanceOf[js.Any], ShowPageBreaks = ShowPageBreaks.asInstanceOf[js.Any], ShowZeroValues = ShowZeroValues.asInstanceOf[js.Any], ZoomType = ZoomType.asInstanceOf[js.Any], ZoomValue = ZoomValue.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[SpreadsheetViewSettings]
  }
  
  extension [Self <: SpreadsheetViewSettings](x: Self) {
    
    inline def setGridColor(value: Color): Self = StObject.set(x, "GridColor", value.asInstanceOf[js.Any])
    
    inline def setHasColumnRowHeaders(value: Boolean): Self = StObject.set(x, "HasColumnRowHeaders", value.asInstanceOf[js.Any])
    
    inline def setHasHorizontalScrollBar(value: Boolean): Self = StObject.set(x, "HasHorizontalScrollBar", value.asInstanceOf[js.Any])
    
    inline def setHasSheetTabs(value: Boolean): Self = StObject.set(x, "HasSheetTabs", value.asInstanceOf[js.Any])
    
    inline def setHasVerticalScrollBar(value: Boolean): Self = StObject.set(x, "HasVerticalScrollBar", value.asInstanceOf[js.Any])
    
    inline def setHideSpellMarks(value: Boolean): Self = StObject.set(x, "HideSpellMarks", value.asInstanceOf[js.Any])
    
    inline def setIsOutlineSymbolsSet(value: Boolean): Self = StObject.set(x, "IsOutlineSymbolsSet", value.asInstanceOf[js.Any])
    
    inline def setIsValueHighlightingEnabled(value: Boolean): Self = StObject.set(x, "IsValueHighlightingEnabled", value.asInstanceOf[js.Any])
    
    inline def setShowAnchor(value: Boolean): Self = StObject.set(x, "ShowAnchor", value.asInstanceOf[js.Any])
    
    inline def setShowCharts(value: Double): Self = StObject.set(x, "ShowCharts", value.asInstanceOf[js.Any])
    
    inline def setShowDrawing(value: Double): Self = StObject.set(x, "ShowDrawing", value.asInstanceOf[js.Any])
    
    inline def setShowFormulas(value: Boolean): Self = StObject.set(x, "ShowFormulas", value.asInstanceOf[js.Any])
    
    inline def setShowGrid(value: Boolean): Self = StObject.set(x, "ShowGrid", value.asInstanceOf[js.Any])
    
    inline def setShowHelpLines(value: Boolean): Self = StObject.set(x, "ShowHelpLines", value.asInstanceOf[js.Any])
    
    inline def setShowNotes(value: Boolean): Self = StObject.set(x, "ShowNotes", value.asInstanceOf[js.Any])
    
    inline def setShowObjects(value: Double): Self = StObject.set(x, "ShowObjects", value.asInstanceOf[js.Any])
    
    inline def setShowPageBreaks(value: Boolean): Self = StObject.set(x, "ShowPageBreaks", value.asInstanceOf[js.Any])
    
    inline def setShowZeroValues(value: Boolean): Self = StObject.set(x, "ShowZeroValues", value.asInstanceOf[js.Any])
    
    inline def setZoomType(value: Double): Self = StObject.set(x, "ZoomType", value.asInstanceOf[js.Any])
    
    inline def setZoomValue(value: Double): Self = StObject.set(x, "ZoomValue", value.asInstanceOf[js.Any])
  }
}
