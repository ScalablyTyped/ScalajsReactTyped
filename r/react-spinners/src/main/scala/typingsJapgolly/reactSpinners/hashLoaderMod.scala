package typingsJapgolly.reactSpinners

import typingsJapgolly.emotionSerialize.mod.Keyframes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSpinners.interfacesMod.CalcFunction
import typingsJapgolly.reactSpinners.interfacesMod.LoaderSizeProps
import typingsJapgolly.reactSpinners.interfacesMod.StyleFunction
import typingsJapgolly.reactSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/HashLoader", JSImport.Namespace)
@js.native
object hashLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeProps, js.Object, js.Any] {
    var after: CalcFunction[Keyframes] = js.native
    var before: CalcFunction[Keyframes] = js.native
    var color: CalcFunction[String] = js.native
    var lat: CalcFunction[Double] = js.native
    var offset: CalcFunction[Double] = js.native
    var style: StyleFunctionWithIndex = js.native
    var thickness: CalcFunction[Double] = js.native
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

