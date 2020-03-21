package typingsJapgolly.officeUiFabricReact.toggleBaseMod

import typingsJapgolly.officeUiFabricReact.PartialIToggleState
import typingsJapgolly.officeUiFabricReact.ReadonlyIToggleProps
import typingsJapgolly.officeUiFabricReact.ReadonlyIToggleState
import typingsJapgolly.officeUiFabricReact.toggleTypesMod.IToggle
import typingsJapgolly.officeUiFabricReact.toggleTypesMod.IToggleProps
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
@js.native
class ToggleBase protected ()
  extends BaseComponent[IToggleProps, IToggleState]
     with IToggle {
  def this(props: IToggleProps) = this()
  var _id: js.Any = js.native
  var _noop: js.Any = js.native
  var _onClick: js.Any = js.native
  var _toggleButton: js.Any = js.native
  /**
    * Gets the current checked state of the toggle.
    */
  val checked: Boolean = js.native
  /* CompleteClass */
  override def focus(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
@js.native
object ToggleBase extends js.Object {
  def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = js.native
}

