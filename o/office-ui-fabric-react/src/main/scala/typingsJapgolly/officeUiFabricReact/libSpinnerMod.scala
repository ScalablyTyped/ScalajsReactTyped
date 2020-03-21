package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.spinnerTypesMod.ISpinnerProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Spinner", JSImport.Namespace)
@js.native
object libSpinnerMod extends js.Object {
  @js.native
  class SpinnerBase ()
    extends typingsJapgolly.officeUiFabricReact.spinnerMod.SpinnerBase
  
  val Spinner: FunctionComponent[ISpinnerProps] = js.native
  /* static members */
  @js.native
  object SpinnerBase extends js.Object {
    var defaultProps: ISpinnerProps = js.native
  }
  
  @js.native
  object SpinnerSize extends js.Object {
    /* 3 */ val large: typingsJapgolly.officeUiFabricReact.spinnerTypesMod.SpinnerSize.large with Double = js.native
    /* 2 */ val medium: typingsJapgolly.officeUiFabricReact.spinnerTypesMod.SpinnerSize.medium with Double = js.native
    /* 1 */ val small: typingsJapgolly.officeUiFabricReact.spinnerTypesMod.SpinnerSize.small with Double = js.native
    /* 0 */ val xSmall: typingsJapgolly.officeUiFabricReact.spinnerTypesMod.SpinnerSize.xSmall with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.spinnerTypesMod.SpinnerSize with Double] = js.native
  }
  
  @js.native
  object SpinnerType extends js.Object {
    /* 1 */ val large: typingsJapgolly.officeUiFabricReact.spinnerTypesMod.SpinnerType.large with Double = js.native
    /* 0 */ val normal: typingsJapgolly.officeUiFabricReact.spinnerTypesMod.SpinnerType.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.spinnerTypesMod.SpinnerType with Double] = js.native
  }
  
}

