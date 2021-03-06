package typingsJapgolly.materialUiCore

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.materialUiCore.modalModalMod.ModalProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/Modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  @js.native
  class ModalManager ()
    extends typingsJapgolly.materialUiCore.modalManagerMod.default {
    def this(opts: AnonHandleContainerOverflow) = this()
  }
  
  @js.native
  class default protected ()
    extends Component[ModalProps, ComponentState, js.Any] {
    def this(props: ModalProps) = this()
    def this(props: ModalProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[ModalProps]]
  
}

