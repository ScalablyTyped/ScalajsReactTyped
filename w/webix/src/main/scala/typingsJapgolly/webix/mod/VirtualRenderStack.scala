package typingsJapgolly.webix.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualRenderStack extends StObject {
  
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  
  def render(id: String, data: Any, `type`: String): Unit = js.native
  def render(id: Double, data: Any, `type`: String): Unit = js.native
  
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
}
object VirtualRenderStack {
  
  inline def apply: VirtualRenderStack = ^.asInstanceOf[js.Dynamic].selectDynamic("VirtualRenderStack").asInstanceOf[VirtualRenderStack]
}
