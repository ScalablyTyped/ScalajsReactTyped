package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.HorizontalAlignment
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XGridColumn} defines the properties and behavior of a column in a grid control.
  * @since OOo 3.3
  */
trait XGridColumn
  extends StObject
     with XComponent
     with XCloneable {
  
  /** specifies the current width of the column. */
  var ColumnWidth: Double
  
  /**
    * denotes the index of the data column which should be used to fetch this grid column's data
    *
    * A grid control has a column model and a data model, both containing a possibly different number of columns. The `DataColumnIndex` attribute defines
    * the index of the column within the data model, which should be used to retrieve actual data.
    *
    * Using this, you can do runtime changes to the column model, i.e. insertion and removal of columns, without necessarily needing to adjust the data
    * model, too.
    *
    * If `DataColumnIndex` is negative, the it will be ignored, then the column's index within its column model, as determined by the {@link Index}
    * attribute, will be used.
    */
  var DataColumnIndex: Double
  
  /**
    * specifies the flexibility of the column when it is automatically resized due to the grid control as a whole being resized.
    *
    * Specify `0` here if you do not want the column to be resized automatically.
    *
    * If a column has a flexibility greater than 0, it is set in relationship to the flexibility of all other such columns, and the respective widths of the
    * columns are changed in the same relationship.
    *
    * Note that a column's flexibility is ignored if its {@link Resizeable} attribute is `FALSE` .
    *
    * A column's flexibility cannot be negative, attempts to set a negative value will raise an exception.
    */
  var Flexibility: Double
  
  /**
    * is the help text associated with the column.
    *
    * A grid control will usually display a column's help text as tooltip.
    */
  var HelpText: String
  
  /** Specifies the horizontal alignment of the content in the control. */
  var HorizontalAlign: HorizontalAlignment
  
  /**
    * specifies an identifier of the column
    *
    * This identifier will not be evaluated by the grid control, or its model. It is merely for clients to identify particular columns.
    */
  var Identifier: Any
  
  /**
    * denotes the index of the column within the grid column model it belongs to
    *
    * If the column is not yet part of a column model, `Index` is -1.
    */
  var Index: Double
  
  /** specifies the maximal width the column can have. */
  var MaxWidth: Double
  
  /** specifies the minimal width the column can have. */
  var MinWidth: Double
  
  /**
    * controls whether or not the column's width is fixed or not.
    *
    * If this is `TRUE` , the user can interactively change the column's width. Also, the column is subject to auto-resizing, if its {@link Flexibility}
    * attribute is greater `0` .
    */
  var Resizeable: Boolean
  
  /** A title is displayed in the column header row if {@link UnoControlGridModel.ShowColumnHeader()} is set to `TRUE` */
  var Title: String
  
  /**
    * Adds a listener for the {@link GridColumnEvent} posted after the grid changes.
    * @param Listener the listener to add.
    */
  def addGridColumnListener(Listener: XGridColumnListener): Unit
  
  /**
    * Removes a listener previously added with addColumnListener().
    * @param Listener the listener to remove.
    */
  def removeGridColumnListener(Listener: XGridColumnListener): Unit
}
object XGridColumn {
  
  inline def apply(
    ColumnWidth: Double,
    DataColumnIndex: Double,
    Flexibility: Double,
    HelpText: String,
    HorizontalAlign: HorizontalAlignment,
    Identifier: Any,
    Index: Double,
    MaxWidth: Double,
    MinWidth: Double,
    Resizeable: Boolean,
    Title: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addGridColumnListener: XGridColumnListener => Callback,
    createClone: CallbackTo[XCloneable],
    dispose: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeGridColumnListener: XGridColumnListener => Callback
  ): XGridColumn = {
    val __obj = js.Dynamic.literal(ColumnWidth = ColumnWidth.asInstanceOf[js.Any], DataColumnIndex = DataColumnIndex.asInstanceOf[js.Any], Flexibility = Flexibility.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], HorizontalAlign = HorizontalAlign.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MaxWidth = MaxWidth.asInstanceOf[js.Any], MinWidth = MinWidth.asInstanceOf[js.Any], Resizeable = Resizeable.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addGridColumnListener = js.Any.fromFunction1((t0: XGridColumnListener) => addGridColumnListener(t0).runNow()), createClone = createClone.toJsFn, dispose = dispose.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeGridColumnListener = js.Any.fromFunction1((t0: XGridColumnListener) => removeGridColumnListener(t0).runNow()))
    __obj.asInstanceOf[XGridColumn]
  }
  
  extension [Self <: XGridColumn](x: Self) {
    
    inline def setAddGridColumnListener(value: XGridColumnListener => Callback): Self = StObject.set(x, "addGridColumnListener", js.Any.fromFunction1((t0: XGridColumnListener) => value(t0).runNow()))
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "ColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setDataColumnIndex(value: Double): Self = StObject.set(x, "DataColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setFlexibility(value: Double): Self = StObject.set(x, "Flexibility", value.asInstanceOf[js.Any])
    
    inline def setHelpText(value: String): Self = StObject.set(x, "HelpText", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlign(value: HorizontalAlignment): Self = StObject.set(x, "HorizontalAlign", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Any): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "MaxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "MinWidth", value.asInstanceOf[js.Any])
    
    inline def setRemoveGridColumnListener(value: XGridColumnListener => Callback): Self = StObject.set(x, "removeGridColumnListener", js.Any.fromFunction1((t0: XGridColumnListener) => value(t0).runNow()))
    
    inline def setResizeable(value: Boolean): Self = StObject.set(x, "Resizeable", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
