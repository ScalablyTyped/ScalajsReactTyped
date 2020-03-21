package typingsJapgolly.reactMarkdown.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactMarkdown.PartialRemarkParseOptions
import typingsJapgolly.reactMarkdown.mod.LinkTargetResolver
import typingsJapgolly.reactMarkdown.mod.MarkdownAbstractSyntaxTree
import typingsJapgolly.reactMarkdown.mod.MdastPlugin
import typingsJapgolly.reactMarkdown.mod.NodeType
import typingsJapgolly.reactMarkdown.mod.ReactMarkdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ReactMarkdownProps_799377156[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    allowNode: (/* node */ MarkdownAbstractSyntaxTree, /* index */ Double, /* parent */ NodeType) => CallbackTo[Boolean] = null,
    allowedTypes: js.Array[NodeType] = null,
    astPlugins: js.Array[MdastPlugin] = null,
    className: String = null,
    disallowedTypes: js.Array[NodeType] = null,
    escapeHtml: js.UndefOr[Boolean] = js.undefined,
    includeNodeIndex: js.UndefOr[Boolean] = js.undefined,
    linkTarget: String | LinkTargetResolver = null,
    parserOptions: PartialRemarkParseOptions = null,
    plugins: js.Array[_] | js.Function0[Unit] = null,
    rawSourcePos: js.UndefOr[Boolean] = js.undefined,
    renderers: StringDictionary[ReactType[_]] = null,
    skipHtml: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    sourcePos: js.UndefOr[Boolean] = js.undefined,
    transformImageUri: (/* uri */ String, /* children */ js.UndefOr[Node], /* title */ js.UndefOr[String], /* alt */ js.UndefOr[String]) => CallbackTo[String] = null,
    transformLinkUri: (/* uri */ String, /* children */ js.UndefOr[Node], /* title */ js.UndefOr[String]) => CallbackTo[String] = null,
    unwrapDisallowed: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactMarkdownProps, ComponentRef, Unit, ReactMarkdownProps] = {
    val __obj = js.Dynamic.literal()
  
      if (allowNode != null) __obj.updateDynamic("allowNode")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.reactMarkdown.mod.MarkdownAbstractSyntaxTree, t1: /* index */ scala.Double, t2: /* parent */ typingsJapgolly.reactMarkdown.mod.NodeType) => allowNode(t0, t1, t2).runNow()))
    if (allowedTypes != null) __obj.updateDynamic("allowedTypes")(allowedTypes.asInstanceOf[js.Any])
    if (astPlugins != null) __obj.updateDynamic("astPlugins")(astPlugins.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (disallowedTypes != null) __obj.updateDynamic("disallowedTypes")(disallowedTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeHtml)) __obj.updateDynamic("escapeHtml")(escapeHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNodeIndex)) __obj.updateDynamic("includeNodeIndex")(includeNodeIndex.asInstanceOf[js.Any])
    if (linkTarget != null) __obj.updateDynamic("linkTarget")(linkTarget.asInstanceOf[js.Any])
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(rawSourcePos)) __obj.updateDynamic("rawSourcePos")(rawSourcePos.asInstanceOf[js.Any])
    if (renderers != null) __obj.updateDynamic("renderers")(renderers.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHtml)) __obj.updateDynamic("skipHtml")(skipHtml.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcePos)) __obj.updateDynamic("sourcePos")(sourcePos.asInstanceOf[js.Any])
    if (transformImageUri != null) __obj.updateDynamic("transformImageUri")(js.Any.fromFunction4((t0: /* uri */ java.lang.String, t1: /* children */ js.UndefOr[japgolly.scalajs.react.raw.React.Node], t2: /* title */ js.UndefOr[java.lang.String], t3: /* alt */ js.UndefOr[java.lang.String]) => transformImageUri(t0, t1, t2, t3).runNow()))
    if (transformLinkUri != null) __obj.updateDynamic("transformLinkUri")(js.Any.fromFunction3((t0: /* uri */ java.lang.String, t1: /* children */ js.UndefOr[japgolly.scalajs.react.raw.React.Node], t2: /* title */ js.UndefOr[java.lang.String]) => transformLinkUri(t0, t1, t2).runNow()))
    if (!js.isUndefined(unwrapDisallowed)) __obj.updateDynamic("unwrapDisallowed")(unwrapDisallowed.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMarkdown.mod.ReactMarkdownProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMarkdown.mod.ReactMarkdownProps])(children: _*)
  }
}

