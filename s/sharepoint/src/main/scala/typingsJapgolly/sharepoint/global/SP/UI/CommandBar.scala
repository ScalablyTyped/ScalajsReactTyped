package typingsJapgolly.sharepoint.global.SP.UI

import typingsJapgolly.sharepoint.SP.HtmlBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UI.CommandBar")
@js.native
open class CommandBar ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.UI.CommandBar {
  
  /* CompleteClass */
  override def addCommand(action: typingsJapgolly.sharepoint.SP.UI.Command): Unit = js.native
  
  /* CompleteClass */
  override def attachEvents(): Unit = js.native
  
  /* CompleteClass */
  override def findCommandByName(name: String): typingsJapgolly.sharepoint.SP.UI.Command = js.native
  
  /* CompleteClass */
  override def get_commands(): js.Array[typingsJapgolly.sharepoint.SP.UI.Command] = js.native
  
  /* CompleteClass */
  override def get_dropDownThreshold(): Double = js.native
  
  /* CompleteClass */
  override def get_elementID(): String = js.native
  
  /* CompleteClass */
  override def get_overrideClass(): String = js.native
  
  /* CompleteClass */
  override def insertCommand(action: typingsJapgolly.sharepoint.SP.UI.Command, position: Double): Unit = js.native
  
  /* CompleteClass */
  override def render(builder: HtmlBuilder): Unit = js.native
  
  /* CompleteClass */
  override def set_dropDownThreshold(value: Double): Double = js.native
  
  /* CompleteClass */
  override def set_overrideClass(value: String): String = js.native
}
