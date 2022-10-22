package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.SmartArtNodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.SmartArt")
@js.native
/* private */ open class SmartArt ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.SmartArt {
  
  /* CompleteClass */
  override def AllNodes(Index: String): typingsJapgolly.activexOffice.Office.SmartArtNode = js.native
  /* CompleteClass */
  override def AllNodes(Index: Double): typingsJapgolly.activexOffice.Office.SmartArtNode = js.native
  /* CompleteClass */
  @JSName("AllNodes")
  override val AllNodes_Original: SmartArtNodes = js.native
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var Color: typingsJapgolly.activexOffice.Office.SmartArtColor = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var Layout: typingsJapgolly.activexOffice.Office.SmartArtLayout = js.native
  
  /* CompleteClass */
  override def Nodes(Index: String): typingsJapgolly.activexOffice.Office.SmartArtNode = js.native
  /* CompleteClass */
  override def Nodes(Index: Double): typingsJapgolly.activexOffice.Office.SmartArtNode = js.native
  /* CompleteClass */
  @JSName("Nodes")
  override val Nodes_Original: SmartArtNodes = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.SmartArt_typekey")
  var OfficeDotSmartArt_typekey: typingsJapgolly.activexOffice.Office.SmartArt = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var QuickStyle: typingsJapgolly.activexOffice.Office.SmartArtQuickStyle = js.native
  
  /* CompleteClass */
  override def Reset(): Unit = js.native
  
  /* CompleteClass */
  var Reverse: MsoTriState = js.native
}
