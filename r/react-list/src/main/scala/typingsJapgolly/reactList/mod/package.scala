package typingsJapgolly.reactList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ItemRenderer = js.Function2[
    /* index */ scala.Double, 
    /* key */ scala.Double | java.lang.String, 
    japgolly.scalajs.react.raw.React.Element
  ]
  type ItemSizeEstimator = js.Function2[/* index */ scala.Double, /* cache */ js.Object, scala.Double]
  type ItemSizeGetter = js.Function1[/* index */ scala.Double, scala.Double]
  type ItemsRenderer = js.Function2[
    /* items */ js.Array[japgolly.scalajs.react.raw.React.Element], 
    /* ref */ java.lang.String, 
    japgolly.scalajs.react.raw.React.Element
  ]
  type ScrollParentGetter = js.Function0[japgolly.scalajs.react.raw.React.Element]
}
