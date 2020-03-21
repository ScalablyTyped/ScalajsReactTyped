package typingsJapgolly.routeNode

import typingsJapgolly.routeNode.mod.BuildOptions
import typingsJapgolly.routeNode.mod.MatchResponse
import typingsJapgolly.routeNode.mod.RouteNodeState
import typingsJapgolly.routeNode.mod.RouteNodeStateMeta
import typingsJapgolly.routeNode.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("route-node/typings/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def buildPathFromSegments(): String = js.native
  def buildPathFromSegments(segments: js.Array[default]): String = js.native
  def buildPathFromSegments(segments: js.Array[default], params: js.Object): String = js.native
  def buildPathFromSegments(segments: js.Array[default], params: js.Object, options: BuildOptions): String = js.native
  def buildStateFromMatch(`match`: MatchResponse): RouteNodeState = js.native
  def getMetaFromSegments(segments: js.Array[default]): RouteNodeStateMeta = js.native
  def getPathFromSegments(segments: js.Array[default]): String = js.native
}

