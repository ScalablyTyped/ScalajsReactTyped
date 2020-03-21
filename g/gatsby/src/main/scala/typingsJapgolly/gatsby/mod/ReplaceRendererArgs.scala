package typingsJapgolly.gatsby.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.HTMLHtmlElement
import typingsJapgolly.gatsby.AnonDel
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceRendererArgs extends NodePluginArgs {
  var setBodyProps: js.Function
  def replaceBodyHTMLString(str: String): Unit
  def setBodyAttributes(attr: ReactProps[HTMLBodyElement]): Unit
  def setHeadComponents(comp: js.Array[japgolly.scalajs.react.raw.React.Node]): Unit
  def setHtmlAttributes(attr: ReactProps[HTMLHtmlElement]): Unit
  def setPostBodyComponents(comp: js.Array[japgolly.scalajs.react.raw.React.Node]): Unit
  def setPreBodyComponents(comp: js.Array[japgolly.scalajs.react.raw.React.Node]): Unit
}

object ReplaceRendererArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: AnonDel,
    createContentDigest: /* input */ js.Any => CallbackTo[String],
    createNodeId: js.Function,
    emitter: EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    pathPrefix: String,
    replaceBodyHTMLString: String => Callback,
    reporter: Reporter,
    schema: NodePluginSchema,
    setBodyAttributes: ReactProps[HTMLBodyElement] => Callback,
    setBodyProps: js.Function,
    setHeadComponents: js.Array[japgolly.scalajs.react.raw.React.Node] => Callback,
    setHtmlAttributes: ReactProps[HTMLHtmlElement] => Callback,
    setPostBodyComponents: js.Array[japgolly.scalajs.react.raw.React.Node] => Callback,
    setPreBodyComponents: js.Array[japgolly.scalajs.react.raw.React.Node] => Callback,
    store: Store,
    tracing: Tracing
  ): ReplaceRendererArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], setBodyProps = setBodyProps.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    __obj.updateDynamic("createContentDigest")(js.Any.fromFunction1((t0: /* input */ js.Any) => createContentDigest(t0).runNow()))
    __obj.updateDynamic("replaceBodyHTMLString")(js.Any.fromFunction1((t0: java.lang.String) => replaceBodyHTMLString(t0).runNow()))
    __obj.updateDynamic("setBodyAttributes")(js.Any.fromFunction1((t0: typingsJapgolly.gatsby.mod.ReactProps[org.scalajs.dom.raw.HTMLBodyElement]) => setBodyAttributes(t0).runNow()))
    __obj.updateDynamic("setHeadComponents")(js.Any.fromFunction1((t0: js.Array[japgolly.scalajs.react.raw.React.Node]) => setHeadComponents(t0).runNow()))
    __obj.updateDynamic("setHtmlAttributes")(js.Any.fromFunction1((t0: typingsJapgolly.gatsby.mod.ReactProps[org.scalajs.dom.raw.HTMLHtmlElement]) => setHtmlAttributes(t0).runNow()))
    __obj.updateDynamic("setPostBodyComponents")(js.Any.fromFunction1((t0: js.Array[japgolly.scalajs.react.raw.React.Node]) => setPostBodyComponents(t0).runNow()))
    __obj.updateDynamic("setPreBodyComponents")(js.Any.fromFunction1((t0: js.Array[japgolly.scalajs.react.raw.React.Node]) => setPreBodyComponents(t0).runNow()))
    __obj.asInstanceOf[ReplaceRendererArgs]
  }
}

