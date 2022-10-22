package typingsJapgolly.activexInfopath.global.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.InfoPathEditorObject")
@js.native
/* private */ open class InfoPathEditorObject ()
  extends StObject
     with typingsJapgolly.activexInfopath.InfoPath.InfoPathEditorObject {
  
  /* CompleteClass */
  override def CloseDocument(): Unit = js.native
  
  /* CompleteClass */
  var DataConnectionBaseUrl: String = js.native
  
  /* CompleteClass */
  override def FlushDocument(): Unit = js.native
  
  /* CompleteClass */
  var Host: Any = js.native
  
  /* CompleteClass */
  var HostName: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath.InfoPathEditorObject_typekey")
  var InfoPathDotInfoPathEditorObject_typekey: typingsJapgolly.activexInfopath.InfoPath.InfoPathEditorObject = js.native
  
  /* CompleteClass */
  override def Load(bstrURL: String): Unit = js.native
  
  /* CompleteClass */
  override def LoadFromStream(punkStream: Any): Unit = js.native
  
  /* CompleteClass */
  override def NewFromSolution(bstrSolutionURI: String): Unit = js.native
  
  /* CompleteClass */
  override def NewFromSolutionWithData(bstrURLXSN: String, punkStream: Any, dwBehavior: Double): Unit = js.native
  
  /* CompleteClass */
  override def SetInitEventHandler(handler: typingsJapgolly.activexInfopath.InfoPath.IInitEventHandler): Unit = js.native
  
  /* CompleteClass */
  override def SetNotifyHostEventHandler(pHandler: typingsJapgolly.activexInfopath.InfoPath.INotifyHostEventHandler): Unit = js.native
  
  /* CompleteClass */
  override def SetSubmitToHostEventHandler(pHandler: typingsJapgolly.activexInfopath.InfoPath.ISubmitToHostEventHandler): Unit = js.native
  
  /* CompleteClass */
  override val XDocument: typingsJapgolly.activexInfopath.InfoPath._XDocument = js.native
}
