package typingsJapgolly.officeUiFabricReact.indexBundleMod

import typingsJapgolly.officeUiFabricReact.ReadonlyICheckboxProps
import typingsJapgolly.officeUiFabricReact.ReadonlyICheckboxState
import typingsJapgolly.officeUiFabricReact.checkboxBaseMod.ICheckboxState
import typingsJapgolly.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/index.bundle", "CheckboxBase")
@js.native
class CheckboxBase protected ()
  extends typingsJapgolly.officeUiFabricReact.mod.CheckboxBase {
  /**
    * Initialize a new instance of the Checkbox
    * @param props - Props for the component
    * @param context - Context or initial state for the base component.
    */
  def this(props: ICheckboxProps) = this()
  def this(props: ICheckboxProps, context: js.Any) = this()
}

/* static members */
@JSImport("office-ui-fabric-react/lib/index.bundle", "CheckboxBase")
@js.native
object CheckboxBase extends js.Object {
  var defaultProps: ICheckboxProps = js.native
  def getDerivedStateFromProps(nextProps: ReadonlyICheckboxProps, prevState: ReadonlyICheckboxState): ICheckboxState | Null = js.native
}

