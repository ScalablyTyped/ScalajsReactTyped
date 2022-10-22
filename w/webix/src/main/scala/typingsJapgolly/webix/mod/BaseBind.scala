package typingsJapgolly.webix.mod

import typingsJapgolly.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBind extends StObject {
  
  def bind(target: Any): Unit = js.native
  def bind(target: Any, rule: Unit, format: String): Unit = js.native
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def unbind(): Unit = js.native
}
object BaseBind {
  
  inline def apply: BaseBind = ^.asInstanceOf[js.Dynamic].selectDynamic("BaseBind").asInstanceOf[BaseBind]
}
