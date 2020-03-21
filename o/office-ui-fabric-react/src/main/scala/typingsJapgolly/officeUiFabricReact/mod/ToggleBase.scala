package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.PartialIToggleState
import typingsJapgolly.officeUiFabricReact.ReadonlyIToggleProps
import typingsJapgolly.officeUiFabricReact.ReadonlyIToggleState
import typingsJapgolly.officeUiFabricReact.toggleTypesMod.IToggleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "ToggleBase")
@js.native
class ToggleBase protected ()
  extends typingsJapgolly.officeUiFabricReact.libToggleMod.ToggleBase {
  def this(props: IToggleProps) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "ToggleBase")
@js.native
object ToggleBase extends js.Object {
  def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = js.native
}

