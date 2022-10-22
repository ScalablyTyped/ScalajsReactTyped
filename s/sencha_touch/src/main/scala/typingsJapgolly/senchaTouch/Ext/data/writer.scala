package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writer {
  
  trait IJson
    extends StObject
       with typingsJapgolly.senchaTouch.Ext.data.writer.IWriter {
    
    /** [Config Option] (Boolean) */
    var allowSingle: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var encode: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Returns the value of allowSingle
      * @returns Boolean
      */
    var getAllowSingle: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of encode
      * @returns Boolean
      */
    var getEncode: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of encodeRequest
      * @returns Boolean
      */
    var getEncodeRequest: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of rootProperty
      * @returns String
      */
    var getRootProperty: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Config Option] (String) */
    var root: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var rootProperty: js.UndefOr[String] = js.undefined
    
    /** [Method] Sets the value of allowSingle
      * @param allowSingle Boolean The new value.
      */
    var setAllowSingle: js.UndefOr[js.Function1[/* allowSingle */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of encode
      * @param encode Boolean The new value.
      */
    var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of encodeRequest
      * @param encodeRequest Boolean The new value.
      */
    var setEncodeRequest: js.UndefOr[js.Function1[/* encodeRequest */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of rootProperty
      * @param rootProperty String The new value.
      */
    var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[String], Unit]] = js.undefined
  }
  object IJson {
    
    inline def apply(): IJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJson]
    }
    
    extension [Self <: IJson](x: Self) {
      
      inline def setAllowSingle(value: Boolean): Self = StObject.set(x, "allowSingle", value.asInstanceOf[js.Any])
      
      inline def setAllowSingleUndefined: Self = StObject.set(x, "allowSingle", js.undefined)
      
      inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setGetAllowSingle(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAllowSingle", value.toJsFn)
      
      inline def setGetAllowSingleUndefined: Self = StObject.set(x, "getAllowSingle", js.undefined)
      
      inline def setGetEncode(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEncode", value.toJsFn)
      
      inline def setGetEncodeRequest(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEncodeRequest", value.toJsFn)
      
      inline def setGetEncodeRequestUndefined: Self = StObject.set(x, "getEncodeRequest", js.undefined)
      
      inline def setGetEncodeUndefined: Self = StObject.set(x, "getEncode", js.undefined)
      
      inline def setGetRootProperty(value: CallbackTo[String]): Self = StObject.set(x, "getRootProperty", value.toJsFn)
      
      inline def setGetRootPropertyUndefined: Self = StObject.set(x, "getRootProperty", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootProperty(value: String): Self = StObject.set(x, "rootProperty", value.asInstanceOf[js.Any])
      
      inline def setRootPropertyUndefined: Self = StObject.set(x, "rootProperty", js.undefined)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSetAllowSingle(value: /* allowSingle */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAllowSingle", js.Any.fromFunction1((t0: /* allowSingle */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetAllowSingleUndefined: Self = StObject.set(x, "setAllowSingle", js.undefined)
      
      inline def setSetEncode(value: /* encode */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setEncode", js.Any.fromFunction1((t0: /* encode */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetEncodeRequest(value: /* encodeRequest */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setEncodeRequest", js.Any.fromFunction1((t0: /* encodeRequest */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetEncodeRequestUndefined: Self = StObject.set(x, "setEncodeRequest", js.undefined)
      
      inline def setSetEncodeUndefined: Self = StObject.set(x, "setEncode", js.undefined)
      
      inline def setSetRootProperty(value: /* rootProperty */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setRootProperty", js.Any.fromFunction1((t0: /* rootProperty */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetRootPropertyUndefined: Self = StObject.set(x, "setRootProperty", js.undefined)
    }
  }
  
  trait IWriter
    extends StObject
       with IBase {
    
    /** [Method] Returns the value of nameProperty
      * @returns String
      */
    var getNameProperty: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Formats the data for each record before sending it to the server
      * @param record Object The record that we are writing to the server.
      * @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
      */
    var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Returns the value of writeAllFields
      * @returns Boolean
      */
    var getWriteAllFields: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (String) */
    var nameProperty: js.UndefOr[String] = js.undefined
    
    /** [Method] Sets the value of nameProperty
      * @param nameProperty String The new value.
      */
    var setNameProperty: js.UndefOr[js.Function1[/* nameProperty */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of writeAllFields
      * @param writeAllFields Boolean The new value.
      */
    var setWriteAllFields: js.UndefOr[js.Function1[/* writeAllFields */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Prepares a Proxy s Ext data Request object
      * @param request Ext.data.Request The request object.
      * @returns Ext.data.Request The modified request object.
      */
    var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var writeAllFields: js.UndefOr[Boolean] = js.undefined
  }
  object IWriter {
    
    inline def apply(): typingsJapgolly.senchaTouch.Ext.data.writer.IWriter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.senchaTouch.Ext.data.writer.IWriter]
    }
    
    extension [Self <: typingsJapgolly.senchaTouch.Ext.data.writer.IWriter](x: Self) {
      
      inline def setGetNameProperty(value: CallbackTo[String]): Self = StObject.set(x, "getNameProperty", value.toJsFn)
      
      inline def setGetNamePropertyUndefined: Self = StObject.set(x, "getNameProperty", js.undefined)
      
      inline def setGetRecordData(value: /* record */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getRecordData", js.Any.fromFunction1(value))
      
      inline def setGetRecordDataUndefined: Self = StObject.set(x, "getRecordData", js.undefined)
      
      inline def setGetWriteAllFields(value: CallbackTo[Boolean]): Self = StObject.set(x, "getWriteAllFields", value.toJsFn)
      
      inline def setGetWriteAllFieldsUndefined: Self = StObject.set(x, "getWriteAllFields", js.undefined)
      
      inline def setNameProperty(value: String): Self = StObject.set(x, "nameProperty", value.asInstanceOf[js.Any])
      
      inline def setNamePropertyUndefined: Self = StObject.set(x, "nameProperty", js.undefined)
      
      inline def setSetNameProperty(value: /* nameProperty */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setNameProperty", js.Any.fromFunction1((t0: /* nameProperty */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetNamePropertyUndefined: Self = StObject.set(x, "setNameProperty", js.undefined)
      
      inline def setSetWriteAllFields(value: /* writeAllFields */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setWriteAllFields", js.Any.fromFunction1((t0: /* writeAllFields */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetWriteAllFieldsUndefined: Self = StObject.set(x, "setWriteAllFields", js.undefined)
      
      inline def setWrite(value: /* request */ js.UndefOr[IRequest] => IRequest): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      inline def setWriteAllFields(value: Boolean): Self = StObject.set(x, "writeAllFields", value.asInstanceOf[js.Any])
      
      inline def setWriteAllFieldsUndefined: Self = StObject.set(x, "writeAllFields", js.undefined)
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  trait IXml
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
  object IXml {
    
    inline def apply(): IXml = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IXml]
    }
    
    extension [Self <: IXml](x: Self) {
      
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
}
