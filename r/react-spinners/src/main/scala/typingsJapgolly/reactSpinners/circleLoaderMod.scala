package typingsJapgolly.reactSpinners

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSpinners.interfacesMod.LoaderSizeProps
import typingsJapgolly.reactSpinners.interfacesMod.StyleFunction
import typingsJapgolly.reactSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/CircleLoader", JSImport.Namespace)
@js.native
object circleLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeProps, js.Object, js.Any] {
    var style: StyleFunctionWithIndex = js.native
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderSizeProps = js.native
  }
  
}

