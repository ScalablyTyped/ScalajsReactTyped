package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typingsJapgolly.officeUiFabricReact.dialogFooterTypesMod.IDialogFooterProps
import typingsJapgolly.officeUiFabricReact.dialogTypesMod.IDialogProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Dialog", JSImport.Namespace)
@js.native
object libDialogMod extends js.Object {
  @js.native
  class DialogBase protected ()
    extends typingsJapgolly.officeUiFabricReact.dialogMod.DialogBase {
    def this(props: IDialogProps) = this()
  }
  
  @js.native
  class DialogContentBase protected ()
    extends typingsJapgolly.officeUiFabricReact.dialogMod.DialogContentBase {
    def this(props: IDialogContentProps) = this()
  }
  
  @js.native
  class DialogFooterBase ()
    extends typingsJapgolly.officeUiFabricReact.dialogFooterBaseMod.DialogFooterBase
  
  val Dialog: FunctionComponent[IDialogProps] = js.native
  val DialogContent: FunctionComponent[IDialogContentProps] = js.native
  val DialogFooter: FunctionComponent[IDialogFooterProps] = js.native
  val default: FunctionComponent[IDialogProps] = js.native
  /* static members */
  @js.native
  object DialogBase extends js.Object {
    var defaultProps: IDialogProps = js.native
  }
  
  /* static members */
  @js.native
  object DialogContentBase extends js.Object {
    var defaultProps: IDialogContentProps = js.native
  }
  
  @js.native
  object DialogType extends js.Object {
    /* 2 */ val close: typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.DialogType.close with Double = js.native
    /* 1 */ val largeHeader: typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.DialogType.largeHeader with Double = js.native
    /* 0 */ val normal: typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.DialogType.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.DialogType with Double] = js.native
  }
  
  @js.native
  object ResponsiveMode extends js.Object {
    /* 2 */ val large: typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large with Double = js.native
    /* 1 */ val medium: typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium with Double = js.native
    /* 0 */ val small: typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small with Double = js.native
    /* 999 */ val unknown: typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown with Double = js.native
    /* 3 */ val xLarge: typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge with Double = js.native
    /* 4 */ val xxLarge: typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge with Double = js.native
    /* 5 */ val xxxLarge: typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode with Double
      ] = js.native
  }
  
}

