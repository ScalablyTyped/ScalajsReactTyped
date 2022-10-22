package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsSpinButtonSpinButtonDottypesMod.ISpinButtonProps
import typingsJapgolly.officeUiFabricReact.libComponentsSpinButtonSpinButtonMod.DefaultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSpinButtonMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SpinButton", "KeyboardSpinDirection")
  @js.native
  object KeyboardSpinDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection & Double
      ] = js.native
    
    /* -1 */ val down: typingsJapgolly.officeUiFabricReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.down & Double = js.native
    
    /* 0 */ val notSpinning: typingsJapgolly.officeUiFabricReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.notSpinning & Double = js.native
    
    /* 1 */ val up: typingsJapgolly.officeUiFabricReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.up & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/SpinButton", "SpinButton")
  @js.native
  open class SpinButton protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsSpinButtonSpinButtonMod.SpinButton {
    def this(props: ISpinButtonProps) = this()
  }
  /* static members */
  object SpinButton {
    
    @JSImport("office-ui-fabric-react/lib/components/SpinButton", "SpinButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/SpinButton", "SpinButton.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
