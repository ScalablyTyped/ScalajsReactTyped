package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBottomSheetService extends StObject {
  
  def cancel(): Unit = js.native
  def cancel(response: Any): Unit = js.native
  
  def hide(): Unit = js.native
  def hide(response: Any): Unit = js.native
  
  def show(options: IBottomSheetOptions): IPromise[Any] = js.native
}
