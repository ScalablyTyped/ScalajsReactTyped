package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.modalTypesMod.IModalProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Modal", JSImport.Namespace)
@js.native
object libModalMod extends js.Object {
  @js.native
  class ModalBase protected ()
    extends typingsJapgolly.officeUiFabricReact.modalMod.ModalBase {
    def this(props: IModalProps) = this()
  }
  
  val Modal: FunctionComponent[IModalProps] = js.native
  val default: FunctionComponent[IModalProps] = js.native
  /* static members */
  @js.native
  object ModalBase extends js.Object {
    var defaultProps: IModalProps = js.native
  }
  
}

