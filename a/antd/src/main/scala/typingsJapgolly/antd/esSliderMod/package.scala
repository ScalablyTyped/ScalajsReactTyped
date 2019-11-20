package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esSliderMod {
  import japgolly.scalajs.react.raw.React.Node
  import org.scalablytyped.runtime.NumberDictionary
  import typingsJapgolly.antd.Anon_Label

  type HandleGeneratorFn = js.Function2[/* tooltipPrefixCls */ String, /* info */ HandleGeneratorInfo, Node]
  type SliderMarks = NumberDictionary[Node | Anon_Label]
  type SliderValue = Double | (js.Tuple2[Double, Double])
}
