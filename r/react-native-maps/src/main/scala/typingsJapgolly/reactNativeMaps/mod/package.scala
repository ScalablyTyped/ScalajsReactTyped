package typingsJapgolly.reactNativeMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // =======================================================================
  //  Overlay
  // =======================================================================
  type Coordinate = js.Tuple2[scala.Double, scala.Double]
  type KmlMapEvent = japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]
  type MapEvent[T] = japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]
}
