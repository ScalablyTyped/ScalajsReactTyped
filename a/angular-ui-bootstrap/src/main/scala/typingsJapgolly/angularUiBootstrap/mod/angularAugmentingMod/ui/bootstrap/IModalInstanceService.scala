package typingsJapgolly.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModalInstanceService extends StObject {
  
  /**
    * A method that can be used to close a modal, passing a result. If `preventDefault` is called on the `modal.closing` event then the modal will remain open.
    */
  def close(): Unit = js.native
  def close(result: Any): Unit = js.native
  
  /**
    * A promise that is resolved when a modal is closed and the animation completes.
    */
  var closed: IPromise[Any] = js.native
  
  /**
    * A method that can be used to dismiss a modal, passing a reason. If `preventDefault` is called on the `modal.closing` event then the modal will remain open.
    */
  def dismiss(): Unit = js.native
  def dismiss(reason: Any): Unit = js.native
  
  /**
    * A promise that is resolved when a modal gets opened after downloading content's template and resolving all variables.
    */
  var opened: IPromise[Any] = js.native
  
  /**
    * A promise that is resolved when a modal is rendered.
    */
  var rendered: IPromise[Any] = js.native
  
  /**
    * A promise that is resolved when a modal is closed and rejected when a modal is dismissed.
    */
  var result: IPromise[Any] = js.native
}
