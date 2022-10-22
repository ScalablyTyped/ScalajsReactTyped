package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoPathEditorObject extends StObject {
  
  def CloseDocument(): Unit
  
  var DataConnectionBaseUrl: String
  
  def FlushDocument(): Unit
  
  var Host: Any
  
  var HostName: String
  
  /* private */ @JSName("InfoPath.InfoPathEditorObject_typekey")
  var InfoPathDotInfoPathEditorObject_typekey: InfoPathEditorObject
  
  def Load(bstrURL: String): Unit
  
  def LoadFromStream(punkStream: Any): Unit
  
  def NewFromSolution(bstrSolutionURI: String): Unit
  
  def NewFromSolutionWithData(bstrURLXSN: String, punkStream: Any, dwBehavior: Double): Unit
  
  def SetInitEventHandler(handler: IInitEventHandler): Unit
  
  def SetNotifyHostEventHandler(pHandler: INotifyHostEventHandler): Unit
  
  def SetSubmitToHostEventHandler(pHandler: ISubmitToHostEventHandler): Unit
  
  val XDocument: _XDocument
}
object InfoPathEditorObject {
  
  inline def apply(
    CloseDocument: Callback,
    DataConnectionBaseUrl: String,
    FlushDocument: Callback,
    Host: Any,
    HostName: String,
    InfoPathDotInfoPathEditorObject_typekey: InfoPathEditorObject,
    Load: String => Callback,
    LoadFromStream: Any => Callback,
    NewFromSolution: String => Callback,
    NewFromSolutionWithData: (String, Any, Double) => Callback,
    SetInitEventHandler: IInitEventHandler => Callback,
    SetNotifyHostEventHandler: INotifyHostEventHandler => Callback,
    SetSubmitToHostEventHandler: ISubmitToHostEventHandler => Callback,
    XDocument: _XDocument
  ): InfoPathEditorObject = {
    val __obj = js.Dynamic.literal(CloseDocument = CloseDocument.toJsFn, DataConnectionBaseUrl = DataConnectionBaseUrl.asInstanceOf[js.Any], FlushDocument = FlushDocument.toJsFn, Host = Host.asInstanceOf[js.Any], HostName = HostName.asInstanceOf[js.Any], Load = js.Any.fromFunction1((t0: String) => Load(t0).runNow()), LoadFromStream = js.Any.fromFunction1((t0: Any) => LoadFromStream(t0).runNow()), NewFromSolution = js.Any.fromFunction1((t0: String) => NewFromSolution(t0).runNow()), NewFromSolutionWithData = js.Any.fromFunction3((t0: String, t1: Any, t2: Double) => (NewFromSolutionWithData(t0, t1, t2)).runNow()), SetInitEventHandler = js.Any.fromFunction1((t0: IInitEventHandler) => SetInitEventHandler(t0).runNow()), SetNotifyHostEventHandler = js.Any.fromFunction1((t0: INotifyHostEventHandler) => SetNotifyHostEventHandler(t0).runNow()), SetSubmitToHostEventHandler = js.Any.fromFunction1((t0: ISubmitToHostEventHandler) => SetSubmitToHostEventHandler(t0).runNow()), XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.InfoPathEditorObject_typekey")(InfoPathDotInfoPathEditorObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoPathEditorObject]
  }
  
  extension [Self <: InfoPathEditorObject](x: Self) {
    
    inline def setCloseDocument(value: Callback): Self = StObject.set(x, "CloseDocument", value.toJsFn)
    
    inline def setDataConnectionBaseUrl(value: String): Self = StObject.set(x, "DataConnectionBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setFlushDocument(value: Callback): Self = StObject.set(x, "FlushDocument", value.toJsFn)
    
    inline def setHost(value: Any): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setHostName(value: String): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotInfoPathEditorObject_typekey(value: InfoPathEditorObject): Self = StObject.set(x, "InfoPath.InfoPathEditorObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: String => Callback): Self = StObject.set(x, "Load", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLoadFromStream(value: Any => Callback): Self = StObject.set(x, "LoadFromStream", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setNewFromSolution(value: String => Callback): Self = StObject.set(x, "NewFromSolution", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setNewFromSolutionWithData(value: (String, Any, Double) => Callback): Self = StObject.set(x, "NewFromSolutionWithData", js.Any.fromFunction3((t0: String, t1: Any, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetInitEventHandler(value: IInitEventHandler => Callback): Self = StObject.set(x, "SetInitEventHandler", js.Any.fromFunction1((t0: IInitEventHandler) => value(t0).runNow()))
    
    inline def setSetNotifyHostEventHandler(value: INotifyHostEventHandler => Callback): Self = StObject.set(x, "SetNotifyHostEventHandler", js.Any.fromFunction1((t0: INotifyHostEventHandler) => value(t0).runNow()))
    
    inline def setSetSubmitToHostEventHandler(value: ISubmitToHostEventHandler => Callback): Self = StObject.set(x, "SetSubmitToHostEventHandler", js.Any.fromFunction1((t0: ISubmitToHostEventHandler) => value(t0).runNow()))
    
    inline def setXDocument(value: _XDocument): Self = StObject.set(x, "XDocument", value.asInstanceOf[js.Any])
  }
}
