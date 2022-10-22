package typingsJapgolly.baidumapWebSdk.global.BMap

import typingsJapgolly.baidumapWebSdk.BMap.PushpinToolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.PushpinTool")
@js.native
open class PushpinTool protected ()
  extends StObject
     with typingsJapgolly.baidumapWebSdk.BMap.PushpinTool {
  def this(map: typingsJapgolly.baidumapWebSdk.BMap.Map) = this()
  def this(map: typingsJapgolly.baidumapWebSdk.BMap.Map, opts: PushpinToolOptions) = this()
  
  /* CompleteClass */
  override def close(): Boolean = js.native
  
  /* CompleteClass */
  override def getCursor(): String = js.native
  
  /* CompleteClass */
  override def getIcon(): typingsJapgolly.baidumapWebSdk.BMap.Icon = js.native
  
  /* CompleteClass */
  override def onmarkend(event: typingsJapgolly.baidumapWebSdk.anon.Marker): Unit = js.native
  
  /* CompleteClass */
  override def open(): Boolean = js.native
  
  /* CompleteClass */
  override def setCursor(cursor: String): String = js.native
  
  /* CompleteClass */
  override def setIcon(icon: typingsJapgolly.baidumapWebSdk.BMap.Icon): typingsJapgolly.baidumapWebSdk.BMap.Icon = js.native
}
