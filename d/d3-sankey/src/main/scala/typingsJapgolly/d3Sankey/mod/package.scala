package typingsJapgolly.d3Sankey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SankeyExtraProperties = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SankeyLink[N /* <: typingsJapgolly.d3Sankey.mod.SankeyExtraProperties */, L /* <: typingsJapgolly.d3Sankey.mod.SankeyExtraProperties */] = L with (typingsJapgolly.d3Sankey.mod.SankeyLinkMinimal[N, L])
  type SankeyNode[N /* <: typingsJapgolly.d3Sankey.mod.SankeyExtraProperties */, L /* <: typingsJapgolly.d3Sankey.mod.SankeyExtraProperties */] = N with (typingsJapgolly.d3Sankey.mod.SankeyNodeMinimal[N, L])
}
