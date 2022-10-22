package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the layout settings of a data pilot table.
  *
  * This interface extends the interface {@link com.sun.star.container.XNamed} which provides access to the name of the data pilot table used e.g. in
  * collections.
  * @see com.sun.star.sheet.DataPilotDescriptor
  * @see com.sun.star.sheet.DataPilotTable
  */
trait XDataPilotDescriptor
  extends StObject
     with XNamed {
  
  /**
    * returns the collection of the data pilot fields used as column fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val ColumnFields: XIndexAccess
  
  /**
    * returns the collection of the data pilot fields used as data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val DataFields: XIndexAccess
  
  /** returns the collection of all the data pilot fields. */
  val DataPilotFields: XIndexAccess
  
  /** returns the filter descriptor specifying which data from the source cell range are used for the data pilot table. */
  val FilterDescriptor: XSheetFilterDescriptor
  
  /**
    * returns the collection of the data pilot fields not used as column, row, page, or data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val HiddenFields: XIndexAccess
  
  /**
    * returns the collection of the data pilot fields used as page fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val PageFields: XIndexAccess
  
  /**
    * returns the collection of the data pilot fields used as row fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val RowFields: XIndexAccess
  
  /** returns the cell range containing the data for the data pilot table. */
  var SourceRange: CellRangeAddress
  
  /** returns an additional string stored in the data pilot table. */
  var Tag: String
  
  /**
    * returns the collection of the data pilot fields used as column fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getColumnFields(): XIndexAccess
  
  /**
    * returns the collection of the data pilot fields used as data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getDataFields(): XIndexAccess
  
  /** returns the collection of all the data pilot fields. */
  def getDataPilotFields(): XIndexAccess
  
  /** returns the filter descriptor specifying which data from the source cell range are used for the data pilot table. */
  def getFilterDescriptor(): XSheetFilterDescriptor
  
  /**
    * returns the collection of the data pilot fields not used as column, row, page, or data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getHiddenFields(): XIndexAccess
  
  /**
    * returns the collection of the data pilot fields used as page fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getPageFields(): XIndexAccess
  
  /**
    * returns the collection of the data pilot fields used as row fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getRowFields(): XIndexAccess
  
  /** returns the cell range containing the data for the data pilot table. */
  def getSourceRange(): CellRangeAddress
  
  /** returns an additional string stored in the data pilot table. */
  def getTag(): String
  
  /** sets the cell range containing the data for the data pilot table. */
  def setSourceRange(aSourceRange: CellRangeAddress): Unit
  
  /** sets an additional string stored in the data pilot table. */
  def setTag(aTag: String): Unit
}
object XDataPilotDescriptor {
  
  inline def apply(
    ColumnFields: XIndexAccess,
    DataFields: XIndexAccess,
    DataPilotFields: XIndexAccess,
    FilterDescriptor: XSheetFilterDescriptor,
    HiddenFields: XIndexAccess,
    Name: String,
    PageFields: XIndexAccess,
    RowFields: XIndexAccess,
    SourceRange: CellRangeAddress,
    Tag: String,
    acquire: Callback,
    getColumnFields: CallbackTo[XIndexAccess],
    getDataFields: CallbackTo[XIndexAccess],
    getDataPilotFields: CallbackTo[XIndexAccess],
    getFilterDescriptor: CallbackTo[XSheetFilterDescriptor],
    getHiddenFields: CallbackTo[XIndexAccess],
    getName: CallbackTo[String],
    getPageFields: CallbackTo[XIndexAccess],
    getRowFields: CallbackTo[XIndexAccess],
    getSourceRange: CallbackTo[CellRangeAddress],
    getTag: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setName: String => Callback,
    setSourceRange: CellRangeAddress => Callback,
    setTag: String => Callback
  ): XDataPilotDescriptor = {
    val __obj = js.Dynamic.literal(ColumnFields = ColumnFields.asInstanceOf[js.Any], DataFields = DataFields.asInstanceOf[js.Any], DataPilotFields = DataPilotFields.asInstanceOf[js.Any], FilterDescriptor = FilterDescriptor.asInstanceOf[js.Any], HiddenFields = HiddenFields.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PageFields = PageFields.asInstanceOf[js.Any], RowFields = RowFields.asInstanceOf[js.Any], SourceRange = SourceRange.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], acquire = acquire.toJsFn, getColumnFields = getColumnFields.toJsFn, getDataFields = getDataFields.toJsFn, getDataPilotFields = getDataPilotFields.toJsFn, getFilterDescriptor = getFilterDescriptor.toJsFn, getHiddenFields = getHiddenFields.toJsFn, getName = getName.toJsFn, getPageFields = getPageFields.toJsFn, getRowFields = getRowFields.toJsFn, getSourceRange = getSourceRange.toJsFn, getTag = getTag.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setSourceRange = js.Any.fromFunction1((t0: CellRangeAddress) => setSourceRange(t0).runNow()), setTag = js.Any.fromFunction1((t0: String) => setTag(t0).runNow()))
    __obj.asInstanceOf[XDataPilotDescriptor]
  }
  
  extension [Self <: XDataPilotDescriptor](x: Self) {
    
    inline def setColumnFields(value: XIndexAccess): Self = StObject.set(x, "ColumnFields", value.asInstanceOf[js.Any])
    
    inline def setDataFields(value: XIndexAccess): Self = StObject.set(x, "DataFields", value.asInstanceOf[js.Any])
    
    inline def setDataPilotFields(value: XIndexAccess): Self = StObject.set(x, "DataPilotFields", value.asInstanceOf[js.Any])
    
    inline def setFilterDescriptor(value: XSheetFilterDescriptor): Self = StObject.set(x, "FilterDescriptor", value.asInstanceOf[js.Any])
    
    inline def setGetColumnFields(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getColumnFields", value.toJsFn)
    
    inline def setGetDataFields(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getDataFields", value.toJsFn)
    
    inline def setGetDataPilotFields(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getDataPilotFields", value.toJsFn)
    
    inline def setGetFilterDescriptor(value: CallbackTo[XSheetFilterDescriptor]): Self = StObject.set(x, "getFilterDescriptor", value.toJsFn)
    
    inline def setGetHiddenFields(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getHiddenFields", value.toJsFn)
    
    inline def setGetPageFields(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getPageFields", value.toJsFn)
    
    inline def setGetRowFields(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getRowFields", value.toJsFn)
    
    inline def setGetSourceRange(value: CallbackTo[CellRangeAddress]): Self = StObject.set(x, "getSourceRange", value.toJsFn)
    
    inline def setGetTag(value: CallbackTo[String]): Self = StObject.set(x, "getTag", value.toJsFn)
    
    inline def setHiddenFields(value: XIndexAccess): Self = StObject.set(x, "HiddenFields", value.asInstanceOf[js.Any])
    
    inline def setPageFields(value: XIndexAccess): Self = StObject.set(x, "PageFields", value.asInstanceOf[js.Any])
    
    inline def setRowFields(value: XIndexAccess): Self = StObject.set(x, "RowFields", value.asInstanceOf[js.Any])
    
    inline def setSetSourceRange(value: CellRangeAddress => Callback): Self = StObject.set(x, "setSourceRange", js.Any.fromFunction1((t0: CellRangeAddress) => value(t0).runNow()))
    
    inline def setSetTag(value: String => Callback): Self = StObject.set(x, "setTag", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSourceRange(value: CellRangeAddress): Self = StObject.set(x, "SourceRange", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
  }
}
