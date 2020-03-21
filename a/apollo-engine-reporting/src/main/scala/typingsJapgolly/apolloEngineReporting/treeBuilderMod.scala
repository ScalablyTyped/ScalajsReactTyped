package typingsJapgolly.apolloEngineReporting

import typingsJapgolly.apolloEngineReportingProtobuf.mod.Trace
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/treeBuilder", JSImport.Namespace)
@js.native
object treeBuilderMod extends js.Object {
  @js.native
  class EngineReportingTreeBuilder protected () extends js.Object {
    def this(options: AnonRewriteError) = this()
    var addProtobufError: js.Any = js.native
    var ensureParentNode: js.Any = js.native
    var newNode: js.Any = js.native
    var nodes: js.Any = js.native
    var rewriteAndNormalizeError: js.Any = js.native
    var rewriteError: js.UndefOr[js.Any] = js.native
    var rootNode: js.Any = js.native
    var startHrTime: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    var stopped: js.Any = js.native
    var trace: Trace = js.native
    def didEncounterErrors(errors: js.Array[GraphQLError]): Unit = js.native
    def startTiming(): Unit = js.native
    def stopTiming(): Unit = js.native
    def willResolveField(info: GraphQLResolveInfo): js.Function0[Unit] = js.native
  }
  
}

