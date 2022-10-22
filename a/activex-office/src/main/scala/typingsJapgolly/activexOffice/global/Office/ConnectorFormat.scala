package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.MsoConnectorType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.ConnectorFormat")
@js.native
/* private */ open class ConnectorFormat ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.ConnectorFormat {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override def BeginConnect(ConnectedShape: typingsJapgolly.activexOffice.Office.Shape, ConnectionSite: Double): Unit = js.native
  
  /* CompleteClass */
  override val BeginConnected: MsoTriState = js.native
  
  /* CompleteClass */
  override val BeginConnectedShape: typingsJapgolly.activexOffice.Office.Shape = js.native
  
  /* CompleteClass */
  override val BeginConnectionSite: Double = js.native
  
  /* CompleteClass */
  override def BeginDisconnect(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def EndConnect(ConnectedShape: typingsJapgolly.activexOffice.Office.Shape, ConnectionSite: Double): Unit = js.native
  
  /* CompleteClass */
  override val EndConnected: MsoTriState = js.native
  
  /* CompleteClass */
  override val EndConnectedShape: typingsJapgolly.activexOffice.Office.Shape = js.native
  
  /* CompleteClass */
  override val EndConnectionSite: Double = js.native
  
  /* CompleteClass */
  override def EndDisconnect(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.ConnectorFormat_typekey")
  var OfficeDotConnectorFormat_typekey: typingsJapgolly.activexOffice.Office.ConnectorFormat = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Type: MsoConnectorType = js.native
}
