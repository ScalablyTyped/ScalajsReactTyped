package typingsJapgolly.reactSpinners

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSpinners.interfacesMod.CalcFunction
import typingsJapgolly.reactSpinners.interfacesMod.LoaderSizeProps
import typingsJapgolly.reactSpinners.interfacesMod.PrecompiledCss
import typingsJapgolly.reactSpinners.interfacesMod.StyleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/MoonLoader", JSImport.Namespace)
@js.native
object moonLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeProps, js.Object, js.Any] {
    var ball: CalcFunction[PrecompiledCss] = js.native
    var ballStyle: BallStyleFunction = js.native
    var circle: CalcFunction[PrecompiledCss] = js.native
    var moonSize: CalcFunction[Double] = js.native
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderSizeProps = js.native
  }
  
  type BallStyleFunction = js.Function1[/* size */ Double, PrecompiledCss]
}

