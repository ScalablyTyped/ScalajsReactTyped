package typingsJapgolly.tabris.mod

import typingsJapgolly.tabris.tabrisStrings.down
import typingsJapgolly.tabris.tabrisStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppKeyPressEvent[Target] extends EventObject[Target] {
  
  val action: up | down = js.native
  
  val altKey: Boolean = js.native
  
  val character: String = js.native
  
  val ctrlKey: Boolean = js.native
  
  val deviceId: Double = js.native
  
  val functionKey: Boolean = js.native
  
  val keyCode: Double = js.native
  
  def preventDefault(): Unit = js.native
  
  val shiftKey: Boolean = js.native
  
  val time: Double = js.native
}
