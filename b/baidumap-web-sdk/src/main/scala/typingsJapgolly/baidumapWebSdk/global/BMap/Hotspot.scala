package typingsJapgolly.baidumapWebSdk.global.BMap

import typingsJapgolly.baidumapWebSdk.BMap.HotspotOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.Hotspot")
@js.native
open class Hotspot protected ()
  extends StObject
     with typingsJapgolly.baidumapWebSdk.BMap.Hotspot {
  def this(position: typingsJapgolly.baidumapWebSdk.BMap.Point) = this()
  def this(position: typingsJapgolly.baidumapWebSdk.BMap.Point, opts: HotspotOptions) = this()
  
  /* CompleteClass */
  override def getPosition(): typingsJapgolly.baidumapWebSdk.BMap.Point = js.native
  
  /* CompleteClass */
  override def getText(): String = js.native
  
  /* CompleteClass */
  override def getUserData(): Any = js.native
  
  /* CompleteClass */
  override def setPosition(position: typingsJapgolly.baidumapWebSdk.BMap.Point): Unit = js.native
  
  /* CompleteClass */
  override def setText(text: String): Unit = js.native
  
  /* CompleteClass */
  override def setUserData(data: Any): Unit = js.native
}
