package typingsJapgolly.reactNativeChartsWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChartChangeEvent = japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]
  type ChartSelectEvent = japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]
  type Color = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.largeValue
    - typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.percent
    - typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.date
    - java.lang.String
    - js.Array[java.lang.String]
  */
  type ValueFormatter = typingsJapgolly.reactNativeChartsWrapper.mod._ValueFormatter | js.Array[java.lang.String] | java.lang.String
}
