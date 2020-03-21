package typingsJapgolly.gatsby.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gatsby.AnonDel
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWebpackConfigArgs extends ParentSpanPluginArgs {
  var getConfig: js.Function
  var loaders: WebpackLoaders
  var plugins: WebpackPlugins
  var rules: WebpackRules
  var stage: GatsbyStages
}

object CreateWebpackConfigArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: AnonDel,
    createContentDigest: /* input */ js.Any => CallbackTo[String],
    createNodeId: js.Function,
    emitter: EventEmitter,
    getConfig: js.Function,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    loaders: WebpackLoaders,
    parentSpan: js.Object,
    pathPrefix: String,
    plugins: WebpackPlugins,
    reporter: Reporter,
    rules: WebpackRules,
    schema: NodePluginSchema,
    stage: GatsbyStages,
    store: Store,
    tracing: Tracing
  ): CreateWebpackConfigArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getConfig = getConfig.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], parentSpan = parentSpan.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    __obj.updateDynamic("createContentDigest")(js.Any.fromFunction1((t0: /* input */ js.Any) => createContentDigest(t0).runNow()))
    __obj.asInstanceOf[CreateWebpackConfigArgs]
  }
}

