package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXmlWriter
  extends StObject
     with typingsJapgolly.senchaTouch.Ext.data.writer.IWriter {
  
  /** [Config Option] (String) */
  var defaultDocumentRoot: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var documentRoot: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of defaultDocumentRoot
    * @returns String
    */
  var getDefaultDocumentRoot: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of documentRoot
    * @returns String
    */
  var getDocumentRoot: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of header
    * @returns String
    */
  var getHeader: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of record
    * @returns String
    */
  var getRecord: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var header: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of defaultDocumentRoot
    * @param defaultDocumentRoot String The new value.
    */
  var setDefaultDocumentRoot: js.UndefOr[js.Function1[/* defaultDocumentRoot */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of documentRoot
    * @param documentRoot String The new value.
    */
  var setDocumentRoot: js.UndefOr[js.Function1[/* documentRoot */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of header
    * @param header String The new value.
    */
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of record
    * @param record String The new value.
    */
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method]
    * @param request Object
    * @param data Array
    * @returns Object
    */
  var writeRecords: js.UndefOr[js.Function2[/* request */ js.UndefOr[Any], /* data */ js.UndefOr[Array], Any]] = js.undefined
}
object IXmlWriter {
  
  inline def apply(): IXmlWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlWriter]
  }
  
  extension [Self <: IXmlWriter](x: Self) {
    
    inline def setDefaultDocumentRoot(value: String): Self = StObject.set(x, "defaultDocumentRoot", value.asInstanceOf[js.Any])
    
    inline def setDefaultDocumentRootUndefined: Self = StObject.set(x, "defaultDocumentRoot", js.undefined)
    
    inline def setDocumentRoot(value: String): Self = StObject.set(x, "documentRoot", value.asInstanceOf[js.Any])
    
    inline def setDocumentRootUndefined: Self = StObject.set(x, "documentRoot", js.undefined)
    
    inline def setGetDefaultDocumentRoot(value: CallbackTo[String]): Self = StObject.set(x, "getDefaultDocumentRoot", value.toJsFn)
    
    inline def setGetDefaultDocumentRootUndefined: Self = StObject.set(x, "getDefaultDocumentRoot", js.undefined)
    
    inline def setGetDocumentRoot(value: CallbackTo[String]): Self = StObject.set(x, "getDocumentRoot", value.toJsFn)
    
    inline def setGetDocumentRootUndefined: Self = StObject.set(x, "getDocumentRoot", js.undefined)
    
    inline def setGetHeader(value: CallbackTo[String]): Self = StObject.set(x, "getHeader", value.toJsFn)
    
    inline def setGetHeaderUndefined: Self = StObject.set(x, "getHeader", js.undefined)
    
    inline def setGetRecord(value: CallbackTo[String]): Self = StObject.set(x, "getRecord", value.toJsFn)
    
    inline def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setSetDefaultDocumentRoot(value: /* defaultDocumentRoot */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setDefaultDocumentRoot", js.Any.fromFunction1((t0: /* defaultDocumentRoot */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetDefaultDocumentRootUndefined: Self = StObject.set(x, "setDefaultDocumentRoot", js.undefined)
    
    inline def setSetDocumentRoot(value: /* documentRoot */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setDocumentRoot", js.Any.fromFunction1((t0: /* documentRoot */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetDocumentRootUndefined: Self = StObject.set(x, "setDocumentRoot", js.undefined)
    
    inline def setSetHeader(value: /* header */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setHeader", js.Any.fromFunction1((t0: /* header */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetHeaderUndefined: Self = StObject.set(x, "setHeader", js.undefined)
    
    inline def setSetRecord(value: /* record */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setRecord", js.Any.fromFunction1((t0: /* record */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
    
    inline def setWriteRecords(value: (/* request */ js.UndefOr[Any], /* data */ js.UndefOr[Array]) => Any): Self = StObject.set(x, "writeRecords", js.Any.fromFunction2(value))
    
    inline def setWriteRecordsUndefined: Self = StObject.set(x, "writeRecords", js.undefined)
  }
}
