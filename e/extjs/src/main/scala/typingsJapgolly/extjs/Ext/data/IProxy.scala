package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProxy
  extends StObject
     with IObservable {
  
  /** [Method] Performs a batch of Operations in the order specified by batchOrder
    * @param options Object Object containing one or more properties supported by the batch method:
    * @returns Ext.data.Batch The newly created Batch
    */
  var batch: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], IBatch]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var batchActions: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var batchOrder: js.UndefOr[String] = js.undefined
  
  /** [Method] Performs the given create operation
    * @param operation Ext.data.Operation The Operation to perform
    * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
    * @param scope Object Scope to execute the callback function in
    */
  var create: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Performs the given destroy operation
    * @param operation Ext.data.Operation The Operation to perform
    * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
    * @param scope Object Scope to execute the callback function in
    */
  var destroy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Returns the model attached to this Proxy
    * @returns Ext.data.Model The model
    */
  var getModel: js.UndefOr[js.Function0[IModel]] = js.undefined
  
  /** [Method] Returns the reader currently attached to this proxy instance
    * @returns Ext.data.reader.Reader The Reader instance
    */
  var getReader: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.data.reader.IReader]] = js.undefined
  
  /** [Method] Returns the writer currently attached to this proxy instance
    * @returns Ext.data.writer.Writer The Writer instance
    */
  var getWriter: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.data.writer.IWriter]] = js.undefined
  
  /** [Property] (Boolean) */
  var isProxy: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var isSynchronous: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String/Ext.data.Model) */
  var model: js.UndefOr[Any] = js.undefined
  
  /** [Method] Performs the given read operation
    * @param operation Ext.data.Operation The Operation to perform
    * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
    * @param scope Object Scope to execute the callback function in
    */
  var read: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (Object/String/Ext.data.reader.Reader) */
  var reader: js.UndefOr[Any] = js.undefined
  
  /** [Method] Sets the model associated with this proxy
    * @param model String/Ext.data.Model The new model. Can be either the model name string, or a reference to the model's constructor
    * @param setOnStore Boolean Sets the new model on the associated Store, if one is present
    */
  var setModel: js.UndefOr[
    js.Function2[/* model */ js.UndefOr[Any], /* setOnStore */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Method] Sets the Proxy s Reader by string config object or Reader instance
    * @param reader String/Object/Ext.data.reader.Reader The new Reader, which can be either a type string, a configuration object or an Ext.data.reader.Reader instance
    * @returns Ext.data.reader.Reader The attached Reader object
    */
  var setReader: js.UndefOr[
    js.Function1[/* reader */ js.UndefOr[Any], typingsJapgolly.extjs.Ext.data.reader.IReader]
  ] = js.undefined
  
  /** [Method] Sets the Proxy s Writer by string config object or Writer instance
    * @param writer String/Object/Ext.data.writer.Writer The new Writer, which can be either a type string, a configuration object or an Ext.data.writer.Writer instance
    * @returns Ext.data.writer.Writer The attached Writer object
    */
  var setWriter: js.UndefOr[
    js.Function1[/* writer */ js.UndefOr[Any], typingsJapgolly.extjs.Ext.data.writer.IWriter]
  ] = js.undefined
  
  /** [Method] Performs the given update operation
    * @param operation Ext.data.Operation The Operation to perform
    * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
    * @param scope Object Scope to execute the callback function in
    */
  var update: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (Object/String/Ext.data.writer.Writer) */
  var writer: js.UndefOr[Any] = js.undefined
}
object IProxy {
  
  inline def apply(): IProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProxy]
  }
  
  extension [Self <: IProxy](x: Self) {
    
    inline def setBatch(value: /* options */ js.UndefOr[Any] => IBatch): Self = StObject.set(x, "batch", js.Any.fromFunction1(value))
    
    inline def setBatchActions(value: Boolean): Self = StObject.set(x, "batchActions", value.asInstanceOf[js.Any])
    
    inline def setBatchActionsUndefined: Self = StObject.set(x, "batchActions", js.undefined)
    
    inline def setBatchOrder(value: String): Self = StObject.set(x, "batchOrder", value.asInstanceOf[js.Any])
    
    inline def setBatchOrderUndefined: Self = StObject.set(x, "batchOrder", js.undefined)
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setCreate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: /* operation */ js.UndefOr[IOperation], t1: /* callback */ js.UndefOr[Any], t2: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "destroy", js.Any.fromFunction3((t0: /* operation */ js.UndefOr[IOperation], t1: /* callback */ js.UndefOr[Any], t2: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setGetModel(value: CallbackTo[IModel]): Self = StObject.set(x, "getModel", value.toJsFn)
    
    inline def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
    
    inline def setGetReader(value: CallbackTo[typingsJapgolly.extjs.Ext.data.reader.IReader]): Self = StObject.set(x, "getReader", value.toJsFn)
    
    inline def setGetReaderUndefined: Self = StObject.set(x, "getReader", js.undefined)
    
    inline def setGetWriter(value: CallbackTo[typingsJapgolly.extjs.Ext.data.writer.IWriter]): Self = StObject.set(x, "getWriter", value.toJsFn)
    
    inline def setGetWriterUndefined: Self = StObject.set(x, "getWriter", js.undefined)
    
    inline def setIsProxy(value: Boolean): Self = StObject.set(x, "isProxy", value.asInstanceOf[js.Any])
    
    inline def setIsProxyUndefined: Self = StObject.set(x, "isProxy", js.undefined)
    
    inline def setIsSynchronous(value: Boolean): Self = StObject.set(x, "isSynchronous", value.asInstanceOf[js.Any])
    
    inline def setIsSynchronousUndefined: Self = StObject.set(x, "isSynchronous", js.undefined)
    
    inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setRead(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "read", js.Any.fromFunction3((t0: /* operation */ js.UndefOr[IOperation], t1: /* callback */ js.UndefOr[Any], t2: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setReader(value: Any): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
    
    inline def setReaderUndefined: Self = StObject.set(x, "reader", js.undefined)
    
    inline def setSetModel(value: (/* model */ js.UndefOr[Any], /* setOnStore */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "setModel", js.Any.fromFunction2((t0: /* model */ js.UndefOr[Any], t1: /* setOnStore */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
    
    inline def setSetModelUndefined: Self = StObject.set(x, "setModel", js.undefined)
    
    inline def setSetReader(value: /* reader */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.data.reader.IReader): Self = StObject.set(x, "setReader", js.Any.fromFunction1(value))
    
    inline def setSetReaderUndefined: Self = StObject.set(x, "setReader", js.undefined)
    
    inline def setSetWriter(value: /* writer */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.data.writer.IWriter): Self = StObject.set(x, "setWriter", js.Any.fromFunction1(value))
    
    inline def setSetWriterUndefined: Self = StObject.set(x, "setWriter", js.undefined)
    
    inline def setUpdate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: /* operation */ js.UndefOr[IOperation], t1: /* callback */ js.UndefOr[Any], t2: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setWriter(value: Any): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    
    inline def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
  }
}
