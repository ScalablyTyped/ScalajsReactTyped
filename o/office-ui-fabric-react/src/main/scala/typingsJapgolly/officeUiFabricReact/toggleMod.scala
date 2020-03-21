package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.toggleTypesMod.IToggleProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Toggle", JSImport.Namespace)
@js.native
object toggleMod extends js.Object {
  @js.native
  class ToggleBase protected ()
    extends typingsJapgolly.officeUiFabricReact.toggleBaseMod.ToggleBase {
    def this(props: IToggleProps) = this()
  }
  
  val Toggle: FunctionComponent[IToggleProps] = js.native
  /* static members */
  @js.native
  object ToggleBase extends js.Object {
    def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = js.native
  }
  
}

