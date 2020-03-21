package typingsJapgolly.dagre

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EdgeFn = js.Function1[/* outNodeName */ java.lang.String, js.Array[typingsJapgolly.dagre.mod.GraphEdge]]
  type Label = org.scalablytyped.runtime.StringDictionary[js.Any]
  type WeightFn = js.Function1[/* edge */ typingsJapgolly.dagre.mod.Edge, scala.Double]
}
