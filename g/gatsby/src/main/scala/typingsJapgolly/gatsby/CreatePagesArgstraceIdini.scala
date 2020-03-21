package typingsJapgolly.gatsby

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gatsby.gatsbyStrings.`initial-createPages`
import typingsJapgolly.gatsby.mod.Actions
import typingsJapgolly.gatsby.mod.NodePluginSchema
import typingsJapgolly.gatsby.mod.Reporter
import typingsJapgolly.gatsby.mod.Store
import typingsJapgolly.gatsby.mod.Tracing
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined gatsby.gatsby.CreatePagesArgs & {  traceId  :'initial-createPages'} */
@js.native
trait CreatePagesArgstraceIdini
  extends /* key */ StringDictionary[js.Any] {
  var actions: Actions = js.native
  var boundActionCreators: Actions = js.native
  var cache: AnonDel = js.native
  var createContentDigest: js.Function1[/* input */ js.Any, String] = js.native
  var createNodeId: js.Function = js.native
  var emitter: EventEmitter = js.native
  var getNode: js.Function = js.native
  var getNodeAndSavePathDependency: js.Function = js.native
  var getNodes: js.Function = js.native
  var getNodesByType: js.Function = js.native
  var hasNodeChanged: js.Function = js.native
  var loadNodeContent: js.Function = js.native
  var parentSpan: js.Object = js.native
  var pathPrefix: String = js.native
  var reporter: Reporter = js.native
  var schema: NodePluginSchema = js.native
  var store: Store = js.native
  var traceId: String with `initial-createPages` = js.native
  var tracing: Tracing = js.native
  var waitForCascadingActions: Boolean = js.native
  def graphql[TData, TVariables](query: String): js.Promise[AnonData[TData]] = js.native
  def graphql[TData, TVariables](query: String, variables: TVariables): js.Promise[AnonData[TData]] = js.native
}

