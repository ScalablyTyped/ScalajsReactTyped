package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a consolidation descriptor.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.ConsolidationDescriptor
  */
trait XConsolidationDescriptor
  extends StObject
     with XInterface {
  
  /** returns the function by which the ranges are consolidated. */
  var Function: GeneralFunction
  
  /** returns, whether links to the original data are inserted in the output area or not. */
  var InsertLinks: Boolean
  
  /** returns the cell ranges which are consolidated. */
  var Sources: SafeArray[CellRangeAddress]
  
  /** returns the position of the top left cell of the cell range where the consolidated data are copied. */
  var StartOutputPosition: CellAddress
  
  /** returns, whether column headers from the cell ranges are used to find matching data or not. */
  var UseColumnHeaders: Boolean
  
  /** returns, whether row headers from the cell ranges are used to find matching data or not. */
  var UseRowHeaders: Boolean
  
  /** returns the function by which the ranges are consolidated. */
  def getFunction(): GeneralFunction
  
  /** returns, whether links to the original data are inserted in the output area or not. */
  def getInsertLinks(): Boolean
  
  /** returns the cell ranges which are consolidated. */
  def getSources(): SafeArray[CellRangeAddress]
  
  /** returns the position of the top left cell of the cell range where the consolidated data are copied. */
  def getStartOutputPosition(): CellAddress
  
  /** returns, whether column headers from the cell ranges are used to find matching data or not. */
  def getUseColumnHeaders(): Boolean
  
  /** returns, whether row headers from the cell ranges are used to find matching data or not. */
  def getUseRowHeaders(): Boolean
  
  /** sets the function by which the ranges are consolidated. */
  def setFunction(nFunction: GeneralFunction): Unit
  
  /** specifies if links to the original data are inserted in the output area. */
  def setInsertLinks(bInsertLinks: Boolean): Unit
  
  /** sets the cell ranges which are consolidated. */
  def setSources(aSources: SeqEquiv[CellRangeAddress]): Unit
  
  /** sets the position of the top left cell of the cell range where the consolidated data are copied. */
  def setStartOutputPosition(aStartOutputPosition: CellAddress): Unit
  
  /** specifies if column headers from the cell ranges are used to find matching data. */
  def setUseColumnHeaders(bUseColumnHeaders: Boolean): Unit
  
  /** specifies if row headers from the cell ranges are used to find matching data. */
  def setUseRowHeaders(bUseRowHeaders: Boolean): Unit
}
object XConsolidationDescriptor {
  
  inline def apply(
    Function: GeneralFunction,
    InsertLinks: Boolean,
    Sources: SafeArray[CellRangeAddress],
    StartOutputPosition: CellAddress,
    UseColumnHeaders: Boolean,
    UseRowHeaders: Boolean,
    acquire: Callback,
    getFunction: CallbackTo[GeneralFunction],
    getInsertLinks: CallbackTo[Boolean],
    getSources: CallbackTo[SafeArray[CellRangeAddress]],
    getStartOutputPosition: CallbackTo[CellAddress],
    getUseColumnHeaders: CallbackTo[Boolean],
    getUseRowHeaders: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setFunction: GeneralFunction => Callback,
    setInsertLinks: Boolean => Callback,
    setSources: SeqEquiv[CellRangeAddress] => Callback,
    setStartOutputPosition: CellAddress => Callback,
    setUseColumnHeaders: Boolean => Callback,
    setUseRowHeaders: Boolean => Callback
  ): XConsolidationDescriptor = {
    val __obj = js.Dynamic.literal(Function = Function.asInstanceOf[js.Any], InsertLinks = InsertLinks.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any], StartOutputPosition = StartOutputPosition.asInstanceOf[js.Any], UseColumnHeaders = UseColumnHeaders.asInstanceOf[js.Any], UseRowHeaders = UseRowHeaders.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFunction = getFunction.toJsFn, getInsertLinks = getInsertLinks.toJsFn, getSources = getSources.toJsFn, getStartOutputPosition = getStartOutputPosition.toJsFn, getUseColumnHeaders = getUseColumnHeaders.toJsFn, getUseRowHeaders = getUseRowHeaders.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFunction = js.Any.fromFunction1((t0: GeneralFunction) => setFunction(t0).runNow()), setInsertLinks = js.Any.fromFunction1((t0: Boolean) => setInsertLinks(t0).runNow()), setSources = js.Any.fromFunction1((t0: SeqEquiv[CellRangeAddress]) => setSources(t0).runNow()), setStartOutputPosition = js.Any.fromFunction1((t0: CellAddress) => setStartOutputPosition(t0).runNow()), setUseColumnHeaders = js.Any.fromFunction1((t0: Boolean) => setUseColumnHeaders(t0).runNow()), setUseRowHeaders = js.Any.fromFunction1((t0: Boolean) => setUseRowHeaders(t0).runNow()))
    __obj.asInstanceOf[XConsolidationDescriptor]
  }
  
  extension [Self <: XConsolidationDescriptor](x: Self) {
    
    inline def setFunction(value: GeneralFunction): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    inline def setGetFunction(value: CallbackTo[GeneralFunction]): Self = StObject.set(x, "getFunction", value.toJsFn)
    
    inline def setGetInsertLinks(value: CallbackTo[Boolean]): Self = StObject.set(x, "getInsertLinks", value.toJsFn)
    
    inline def setGetSources(value: CallbackTo[SafeArray[CellRangeAddress]]): Self = StObject.set(x, "getSources", value.toJsFn)
    
    inline def setGetStartOutputPosition(value: CallbackTo[CellAddress]): Self = StObject.set(x, "getStartOutputPosition", value.toJsFn)
    
    inline def setGetUseColumnHeaders(value: CallbackTo[Boolean]): Self = StObject.set(x, "getUseColumnHeaders", value.toJsFn)
    
    inline def setGetUseRowHeaders(value: CallbackTo[Boolean]): Self = StObject.set(x, "getUseRowHeaders", value.toJsFn)
    
    inline def setInsertLinks(value: Boolean): Self = StObject.set(x, "InsertLinks", value.asInstanceOf[js.Any])
    
    inline def setSetFunction(value: GeneralFunction => Callback): Self = StObject.set(x, "setFunction", js.Any.fromFunction1((t0: GeneralFunction) => value(t0).runNow()))
    
    inline def setSetInsertLinks(value: Boolean => Callback): Self = StObject.set(x, "setInsertLinks", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetSources(value: SeqEquiv[CellRangeAddress] => Callback): Self = StObject.set(x, "setSources", js.Any.fromFunction1((t0: SeqEquiv[CellRangeAddress]) => value(t0).runNow()))
    
    inline def setSetStartOutputPosition(value: CellAddress => Callback): Self = StObject.set(x, "setStartOutputPosition", js.Any.fromFunction1((t0: CellAddress) => value(t0).runNow()))
    
    inline def setSetUseColumnHeaders(value: Boolean => Callback): Self = StObject.set(x, "setUseColumnHeaders", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetUseRowHeaders(value: Boolean => Callback): Self = StObject.set(x, "setUseRowHeaders", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSources(value: SafeArray[CellRangeAddress]): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setStartOutputPosition(value: CellAddress): Self = StObject.set(x, "StartOutputPosition", value.asInstanceOf[js.Any])
    
    inline def setUseColumnHeaders(value: Boolean): Self = StObject.set(x, "UseColumnHeaders", value.asInstanceOf[js.Any])
    
    inline def setUseRowHeaders(value: Boolean): Self = StObject.set(x, "UseRowHeaders", value.asInstanceOf[js.Any])
  }
}
