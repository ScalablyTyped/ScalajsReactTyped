package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.checkboxBaseMod.ICheckboxState
import typingsJapgolly.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Checkbox", JSImport.Namespace)
@js.native
object checkboxMod extends js.Object {
  @js.native
  class CheckboxBase protected ()
    extends typingsJapgolly.officeUiFabricReact.checkboxBaseMod.CheckboxBase {
    /**
      * Initialize a new instance of the Checkbox
      * @param props - Props for the component
      * @param context - Context or initial state for the base component.
      */
    def this(props: ICheckboxProps) = this()
    def this(props: ICheckboxProps, context: js.Any) = this()
  }
  
  val Checkbox: FunctionComponent[ICheckboxProps] = js.native
  /* static members */
  @js.native
  object CheckboxBase extends js.Object {
    var defaultProps: ICheckboxProps = js.native
    def getDerivedStateFromProps(nextProps: ReadonlyICheckboxProps, prevState: ReadonlyICheckboxState): ICheckboxState | Null = js.native
  }
  
}

