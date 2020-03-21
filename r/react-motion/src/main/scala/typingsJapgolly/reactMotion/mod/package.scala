package typingsJapgolly.reactMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InterpolateFunction = js.Function1[
    /* previousInterpolatedStyles */ js.UndefOr[js.Array[typingsJapgolly.reactMotion.mod.TransitionPlainStyle]], 
    js.Array[typingsJapgolly.reactMotion.mod.TransitionStyle]
  ]
  type PlainStyle = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type Style = org.scalablytyped.runtime.StringDictionary[scala.Double | typingsJapgolly.reactMotion.mod.OpaqueConfig]
  type Velocity = org.scalablytyped.runtime.StringDictionary[scala.Double]
}
