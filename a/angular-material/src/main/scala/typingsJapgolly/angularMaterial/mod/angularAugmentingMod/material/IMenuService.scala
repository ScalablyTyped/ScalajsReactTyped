package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import org.scalajs.dom.MouseEvent
import typingsJapgolly.angular.JQueryEventObject
import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMenuService extends StObject {
  
  def close(): Unit = js.native
  
  def hide(): IPromise[Any] = js.native
  def hide(response: Any): IPromise[Any] = js.native
  def hide(response: Any, options: Any): IPromise[Any] = js.native
  def hide(response: Unit, options: Any): IPromise[Any] = js.native
  
  def open(): Unit = js.native
  def open(event: MouseEvent): Unit = js.native
  def open(event: JQueryEventObject): Unit = js.native
}
