package typingsJapgolly.reactNativeModals.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativeModals.anon.Width
import typingsJapgolly.reactNativeModals.reactNativeModalsStrings.auto
import typingsJapgolly.reactNativeModals.reactNativeModalsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modal
  extends Component[ModalProps, js.Object, Any] {
  
  def dismiss(): Unit = js.native
  
  var modalSize: Width = js.native
  
  var pointerEvents: auto | none = js.native
  
  def show(): Unit = js.native
}
