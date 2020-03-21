package typingsJapgolly.gatsby.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gatsby.AnonDel
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreRenderHTMLArgs extends NodePluginArgs {
  def getHeadComponents(): js.Array[japgolly.scalajs.react.raw.React.Node]
  def getPostBodyComponents(): js.Array[japgolly.scalajs.react.raw.React.Node]
  def getPreBodyComponents(): js.Array[japgolly.scalajs.react.raw.React.Node]
  def replaceHeadComponents(comp: js.Array[japgolly.scalajs.react.raw.React.Node]): Unit
  def replacePostBodyComponents(comp: js.Array[japgolly.scalajs.react.raw.React.Node]): Unit
  def replacePreBodyComponents(comp: js.Array[japgolly.scalajs.react.raw.React.Node]): Unit
}

object PreRenderHTMLArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: AnonDel,
    createContentDigest: /* input */ js.Any => CallbackTo[String],
    createNodeId: js.Function,
    emitter: EventEmitter,
    getHeadComponents: CallbackTo[js.Array[japgolly.scalajs.react.raw.React.Node]],
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    getPostBodyComponents: CallbackTo[js.Array[japgolly.scalajs.react.raw.React.Node]],
    getPreBodyComponents: CallbackTo[js.Array[japgolly.scalajs.react.raw.React.Node]],
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    pathPrefix: String,
    replaceHeadComponents: js.Array[japgolly.scalajs.react.raw.React.Node] => Callback,
    replacePostBodyComponents: js.Array[japgolly.scalajs.react.raw.React.Node] => Callback,
    replacePreBodyComponents: js.Array[japgolly.scalajs.react.raw.React.Node] => Callback,
    reporter: Reporter,
    schema: NodePluginSchema,
    store: Store,
    tracing: Tracing
  ): PreRenderHTMLArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    __obj.updateDynamic("createContentDigest")(js.Any.fromFunction1((t0: /* input */ js.Any) => createContentDigest(t0).runNow()))
    __obj.updateDynamic("getHeadComponents")(getHeadComponents.toJsFn)
    __obj.updateDynamic("getPostBodyComponents")(getPostBodyComponents.toJsFn)
    __obj.updateDynamic("getPreBodyComponents")(getPreBodyComponents.toJsFn)
    __obj.updateDynamic("replaceHeadComponents")(js.Any.fromFunction1((t0: js.Array[japgolly.scalajs.react.raw.React.Node]) => replaceHeadComponents(t0).runNow()))
    __obj.updateDynamic("replacePostBodyComponents")(js.Any.fromFunction1((t0: js.Array[japgolly.scalajs.react.raw.React.Node]) => replacePostBodyComponents(t0).runNow()))
    __obj.updateDynamic("replacePreBodyComponents")(js.Any.fromFunction1((t0: js.Array[japgolly.scalajs.react.raw.React.Node]) => replacePreBodyComponents(t0).runNow()))
    __obj.asInstanceOf[PreRenderHTMLArgs]
  }
}

