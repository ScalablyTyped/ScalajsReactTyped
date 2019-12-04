package typingsJapgolly.expoDashLinearDashGradient

import typingsJapgolly.expoDashLinearDashGradient.buildNativeLinearGradientDotAndroidMod.NativeLinearGradient
import typingsJapgolly.expoDashLinearDashGradient.buildNativeLinearGradientDotAndroidMod.Props
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-linear-gradient/build/NativeLinearGradient.android", JSImport.Namespace)
@js.native
object buildNativeLinearGradientDotAndroidMod extends js.Object {
  @js.native
  trait NativeLinearGradient
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends NativeLinearGradient
  
  type Point = js.Tuple2[Double, Double]
  type Props = Anon_ColorsEndPoint with ComponentProps[TypeofClassView]
}

