package typingsJapgolly.reactSelect

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactSelect.componentsInputMod.InputProps
import typingsJapgolly.reactSelect.transitionsMod.fn
import typingsJapgolly.reactSelect.typesMod.ClassNamesState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/Input", JSImport.Namespace)
@js.native
object inputMod extends js.Object {
  /* Inlined react-select.react-select/src/animated/transitions.BaseTransition & react-select.react-select/src/types.PropsWithInnerRef & react-select.react-select/src/components/Input.InputProps */
  @js.native
  trait AnimatedInputProps extends js.Object {
    var className: js.UndefOr[String] = js.native
    /** Whether we are in a transition. */
    var in: Boolean = js.native
    /** The inner reference. */
    var innerRef: Ref = js.native
    /** Whether the input is disabled */
    var isDisabled: js.UndefOr[Boolean] = js.native
    /** Set whether the input should be visible. Does not affect input size. */
    var isHidden: Boolean = js.native
    /** Function to be called once transition finishes. */
    var onExited: fn = js.native
    def cx(a: String, b: ClassNamesState, c: String): String | Unit = js.native
    def cx(a: Null, b: ClassNamesState, c: String): String | Unit = js.native
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    /** Reference to the internal element */
    def innerRef(element: typingsJapgolly.react.mod.Ref[_]): Unit = js.native
  }
  
  def AnimatedInput(WrappedComponent: ComponentType[InputProps]): ComponentType[AnimatedInputProps] = js.native
  def default(WrappedComponent: ComponentType[InputProps]): ComponentType[AnimatedInputProps] = js.native
}

