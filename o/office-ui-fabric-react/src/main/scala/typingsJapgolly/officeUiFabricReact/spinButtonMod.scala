package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.spinButtonSpinButtonMod.DefaultProps
import typingsJapgolly.officeUiFabricReact.spinButtonTypesMod.ISpinButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SpinButton", JSImport.Namespace)
@js.native
object spinButtonMod extends js.Object {
  @js.native
  class SpinButton protected ()
    extends typingsJapgolly.officeUiFabricReact.spinButtonSpinButtonMod.SpinButton {
    def this(props: ISpinButtonProps) = this()
  }
  
  @js.native
  object KeyboardSpinDirection extends js.Object {
    /* -1 */ val down: typingsJapgolly.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.down with Double = js.native
    /* 0 */ val notSpinning: typingsJapgolly.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.notSpinning with Double = js.native
    /* 1 */ val up: typingsJapgolly.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.up with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object SpinButton extends js.Object {
    var defaultProps: DefaultProps = js.native
  }
  
}

