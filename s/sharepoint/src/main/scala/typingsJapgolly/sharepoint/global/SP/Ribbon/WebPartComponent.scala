package typingsJapgolly.sharepoint.global.SP.Ribbon

import org.scalajs.dom.HTMLElement
import typingsJapgolly.sharepoint.SP.Ribbon.WebPartComponentInitInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Ribbon.WebPartComponent")
@js.native
open class WebPartComponent ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.Ribbon.WebPartComponent {
  
  /* CompleteClass */
  override def canHandleCommand(commandId: String): Boolean = js.native
  
  /* CompleteClass */
  override def getFocusedCommands(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def getGlobalCommands(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def getId(): String = js.native
  
  /* CompleteClass */
  override def handleCommand(commandId: String, properties: Any, sequenceNumber: Double): Boolean = js.native
  
  /* CompleteClass */
  override def init(): Unit = js.native
  
  /* CompleteClass */
  override def isFocusable(): Boolean = js.native
  
  /* CompleteClass */
  override def receiveFocus(): Boolean = js.native
  
  /* CompleteClass */
  override def selectWebPart(zc: HTMLElement, setNextRibbonTab: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def yieldFocus(): Boolean = js.native
}
object WebPartComponent {
  
  @JSGlobal("SP.Ribbon.WebPartComponent")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getInstance(): typingsJapgolly.sharepoint.SP.Ribbon.WebPartComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("get_instance")().asInstanceOf[typingsJapgolly.sharepoint.SP.Ribbon.WebPartComponent]
  
  /* static member */
  inline def registerWithPageManager(initInfo: WebPartComponentInitInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerWithPageManager")(initInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
