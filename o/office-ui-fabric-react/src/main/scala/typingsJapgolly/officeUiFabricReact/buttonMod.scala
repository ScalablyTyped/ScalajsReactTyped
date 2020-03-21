package typingsJapgolly.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.officeUiFabricReact.baseButtonMod.IBaseButtonProps
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  @js.native
  class ActionButton ()
    extends typingsJapgolly.officeUiFabricReact.actionButtonMod.ActionButton
  
  @js.native
  class BaseButton protected ()
    extends typingsJapgolly.officeUiFabricReact.baseButtonMod.BaseButton {
    def this(props: IBaseButtonProps, rootClassName: String) = this()
  }
  
  @js.native
  class Button protected ()
    extends typingsJapgolly.officeUiFabricReact.buttonButtonMod.Button {
    def this(props: IButtonProps) = this()
  }
  
  @js.native
  class CommandBarButton ()
    extends typingsJapgolly.officeUiFabricReact.commandBarButtonMod.CommandBarButton
  
  @js.native
  class CompoundButton ()
    extends typingsJapgolly.officeUiFabricReact.compoundButtonMod.CompoundButton
  
  @js.native
  class DefaultButton ()
    extends typingsJapgolly.officeUiFabricReact.defaultButtonMod.DefaultButton
  
  @js.native
  class IconButton ()
    extends typingsJapgolly.officeUiFabricReact.iconButtonMod.IconButton
  
  @js.native
  class MessageBarButton ()
    extends typingsJapgolly.officeUiFabricReact.messageBarButtonMod.MessageBarButton
  
  @js.native
  class PrimaryButton ()
    extends typingsJapgolly.officeUiFabricReact.primaryButtonMod.PrimaryButton
  
  val CommandButton: Instantiable0[typingsJapgolly.officeUiFabricReact.actionButtonMod.ActionButton] = js.native
  /* static members */
  @js.native
  object BaseButton extends js.Object {
    var defaultProps: PartialIBaseButtonProps = js.native
  }
  
  @js.native
  object ButtonType extends js.Object {
    /* 4 */ val command: typingsJapgolly.officeUiFabricReact.buttonTypesMod.ButtonType.command with Double = js.native
    /* 3 */ val compound: typingsJapgolly.officeUiFabricReact.buttonTypesMod.ButtonType.compound with Double = js.native
    /* 6 */ val default: typingsJapgolly.officeUiFabricReact.buttonTypesMod.ButtonType.default with Double = js.native
    /* 2 */ val hero: typingsJapgolly.officeUiFabricReact.buttonTypesMod.ButtonType.hero with Double = js.native
    /* 5 */ val icon: typingsJapgolly.officeUiFabricReact.buttonTypesMod.ButtonType.icon with Double = js.native
    /* 0 */ val normal: typingsJapgolly.officeUiFabricReact.buttonTypesMod.ButtonType.normal with Double = js.native
    /* 1 */ val primary: typingsJapgolly.officeUiFabricReact.buttonTypesMod.ButtonType.primary with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.ButtonType with Double] = js.native
  }
  
  @js.native
  object ElementType extends js.Object {
    /* 1 */ val anchor: typingsJapgolly.officeUiFabricReact.buttonTypesMod.ElementType.anchor with Double = js.native
    /* 0 */ val button: typingsJapgolly.officeUiFabricReact.buttonTypesMod.ElementType.button with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.ElementType with Double] = js.native
  }
  
}

