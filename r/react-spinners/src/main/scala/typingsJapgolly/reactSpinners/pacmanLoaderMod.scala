package typingsJapgolly.reactSpinners

import typingsJapgolly.emotionSerialize.mod.Keyframes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSpinners.interfacesMod.CalcFunction
import typingsJapgolly.reactSpinners.interfacesMod.LoaderSizeMarginProps
import typingsJapgolly.reactSpinners.interfacesMod.StyleFunction
import typingsJapgolly.reactSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/PacmanLoader", JSImport.Namespace)
@js.native
object pacmanLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeMarginProps, js.Object, js.Any] {
    var ball: CalcFunction[Keyframes] = js.native
    var ballStyle: StyleFunctionWithIndex = js.native
    var man: StyleFunction = js.native
    var pac: StyleFunction = js.native
    var pacmanStyle: StyleFunctionWithIndex = js.native
    var s1: CalcFunction[String] = js.native
    var s2: CalcFunction[String] = js.native
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderSizeMarginProps = js.native
  }
  
}

