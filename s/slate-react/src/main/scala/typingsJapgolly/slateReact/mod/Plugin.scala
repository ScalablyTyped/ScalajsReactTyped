package typingsJapgolly.slateReact.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.slate.mod.Command
import typingsJapgolly.slate.mod.CommandFunc
import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Node
import typingsJapgolly.slate.mod.Query
import typingsJapgolly.slate.mod.QueryFunc
import typingsJapgolly.slate.mod.SchemaProperties
import typingsJapgolly.slate.mod.SlateError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin[T /* <: Controller */]
  extends typingsJapgolly.slate.mod.Plugin[T]
     with PluginOrPlugins[T] {
  var decorateNode: js.UndefOr[js.Function3[/* node */ Node, /* editor */ T, /* next */ js.Function0[_], _]] = js.undefined
  var onBeforeInput: js.UndefOr[EventHook[ReactEventFrom[Element]]] = js.undefined
  var onBlur: js.UndefOr[EventHook[ReactFocusEventFrom[Element]]] = js.undefined
  var onClick: js.UndefOr[EventHook[ReactMouseEventFrom[Element]]] = js.undefined
  var onCompositionEnd: js.UndefOr[EventHook[ReactCompositionEventFrom[Element]]] = js.undefined
  var onCompositionStart: js.UndefOr[EventHook[ReactCompositionEventFrom[Element]]] = js.undefined
  var onContextMenu: js.UndefOr[EventHook[ReactMouseEventFrom[Element]]] = js.undefined
  var onCopy: js.UndefOr[EventHook[ReactClipboardEventFrom[Element]]] = js.undefined
  var onCut: js.UndefOr[EventHook[ReactClipboardEventFrom[Element]]] = js.undefined
  var onDragEnd: js.UndefOr[EventHook[ReactDragEventFrom[Element]]] = js.undefined
  var onDragEnter: js.UndefOr[EventHook[ReactDragEventFrom[Element]]] = js.undefined
  var onDragExit: js.UndefOr[EventHook[ReactDragEventFrom[Element]]] = js.undefined
  var onDragLeave: js.UndefOr[EventHook[ReactDragEventFrom[Element]]] = js.undefined
  var onDragOver: js.UndefOr[EventHook[ReactDragEventFrom[Element]]] = js.undefined
  var onDragStart: js.UndefOr[EventHook[ReactDragEventFrom[Element]]] = js.undefined
  var onDrop: js.UndefOr[EventHook[ReactDragEventFrom[Element]]] = js.undefined
  var onFocus: js.UndefOr[EventHook[ReactFocusEventFrom[Element]]] = js.undefined
  var onInput: js.UndefOr[EventHook[ReactEventFrom[Element]]] = js.undefined
  var onKeyDown: js.UndefOr[EventHook[ReactKeyboardEventFrom[Element]]] = js.undefined
  var onPaste: js.UndefOr[EventHook[ReactClipboardEventFrom[Element]]] = js.undefined
  var onSelect: js.UndefOr[EventHook[ReactEventFrom[Element]]] = js.undefined
  var renderAnnotation: js.UndefOr[
    js.Function3[/* props */ RenderAnnotationProps, /* editor */ T, /* next */ js.Function0[_], _]
  ] = js.undefined
  var renderBlock: js.UndefOr[
    js.Function3[/* props */ RenderBlockProps, /* editor */ T, /* next */ js.Function0[_], _]
  ] = js.undefined
  var renderDecoration: js.UndefOr[
    js.Function3[/* props */ RenderDecorationProps, /* editor */ T, /* next */ js.Function0[_], _]
  ] = js.undefined
  var renderDocument: js.UndefOr[
    js.Function3[/* props */ RenderDocumentProps, /* editor */ T, /* next */ js.Function0[_], _]
  ] = js.undefined
  var renderEditor: js.UndefOr[
    js.Function3[/* props */ EditorProps[Editor], /* editor */ T, /* next */ js.Function0[_], _]
  ] = js.undefined
  var renderInline: js.UndefOr[
    js.Function3[/* props */ RenderInlineProps, /* editor */ T, /* next */ js.Function0[_], _]
  ] = js.undefined
  var renderMark: js.UndefOr[
    js.Function3[/* props */ RenderMarkProps, /* editor */ T, /* next */ js.Function0[_], _]
  ] = js.undefined
  var shouldNodeComponentUpdate: js.UndefOr[
    js.Function4[
      /* previousProps */ RenderNodeProps, 
      /* props */ RenderNodeProps, 
      /* editor */ typingsJapgolly.slate.mod.Editor, 
      /* next */ js.Function0[_], 
      _
    ]
  ] = js.undefined
}

object Plugin {
  @scala.inline
  def apply[T /* <: Controller */](
    commands: StringDictionary[CommandFunc[T]] = null,
    decorateNode: (/* node */ Node, /* editor */ T, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    normalizeNode: (/* node */ Node, T, /* next */ js.Function0[Unit]) => CallbackTo[(js.Function1[T, Unit]) | Unit] = null,
    onBeforeInput: (ReactEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onBlur: (ReactFocusEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onChange: (T, /* next */ js.Function0[Unit]) => Callback = null,
    onClick: (ReactMouseEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onCommand: (/* command */ Command, T, /* next */ js.Function0[Unit]) => Callback = null,
    onCompositionEnd: (ReactCompositionEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onCompositionStart: (ReactCompositionEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onConstruct: (T, /* next */ js.Function0[Unit]) => Callback = null,
    onContextMenu: (ReactMouseEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onCopy: (ReactClipboardEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onCut: (ReactClipboardEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDragEnd: (ReactDragEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDragEnter: (ReactDragEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDragExit: (ReactDragEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDragLeave: (ReactDragEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDragOver: (ReactDragEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDragStart: (ReactDragEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDrop: (ReactDragEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onFocus: (ReactFocusEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onInput: (ReactEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onKeyDown: (ReactKeyboardEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onPaste: (ReactClipboardEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onQuery: (/* query */ Query, T, /* next */ js.Function0[Unit]) => Callback = null,
    onSelect: (ReactEventFrom[Element], /* editor */ Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    queries: StringDictionary[QueryFunc[T]] = null,
    renderAnnotation: (/* props */ RenderAnnotationProps, /* editor */ T, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    renderBlock: (/* props */ RenderBlockProps, /* editor */ T, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    renderDecoration: (/* props */ RenderDecorationProps, /* editor */ T, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    renderDocument: (/* props */ RenderDocumentProps, /* editor */ T, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    renderEditor: (/* props */ EditorProps[Editor], /* editor */ T, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    renderInline: (/* props */ RenderInlineProps, /* editor */ T, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    renderMark: (/* props */ RenderMarkProps, /* editor */ T, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    schema: SchemaProperties = null,
    shouldNodeComponentUpdate: (/* previousProps */ RenderNodeProps, /* props */ RenderNodeProps, /* editor */ typingsJapgolly.slate.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    validateNode: (/* node */ Node, T, /* next */ js.Function0[Unit]) => CallbackTo[SlateError | Unit] = null
  ): Plugin[T] = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (decorateNode != null) __obj.updateDynamic("decorateNode")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.slate.mod.Node, t1: /* editor */ T, t2: /* next */ js.Function0[js.Any]) => decorateNode(t0, t1, t2).runNow()))
    if (normalizeNode != null) __obj.updateDynamic("normalizeNode")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.slate.mod.Node, t1: T, t2: /* next */ js.Function0[scala.Unit]) => normalizeNode(t0, t1, t2).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onBeforeInput(t0, t1, t2).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onBlur(t0, t1, t2).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: T, t1: /* next */ js.Function0[scala.Unit]) => onChange(t0, t1).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onClick(t0, t1, t2).runNow()))
    if (onCommand != null) __obj.updateDynamic("onCommand")(js.Any.fromFunction3((t0: /* command */ typingsJapgolly.slate.mod.Command, t1: T, t2: /* next */ js.Function0[scala.Unit]) => onCommand(t0, t1, t2).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onCompositionEnd(t0, t1, t2).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onCompositionStart(t0, t1, t2).runNow()))
    if (onConstruct != null) __obj.updateDynamic("onConstruct")(js.Any.fromFunction2((t0: T, t1: /* next */ js.Function0[scala.Unit]) => onConstruct(t0, t1).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onContextMenu(t0, t1, t2).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onCopy(t0, t1, t2).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onCut(t0, t1, t2).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onDragEnd(t0, t1, t2).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onDragEnter(t0, t1, t2).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onDragExit(t0, t1, t2).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onDragLeave(t0, t1, t2).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onDragOver(t0, t1, t2).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onDragStart(t0, t1, t2).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onDrop(t0, t1, t2).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onFocus(t0, t1, t2).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onInput(t0, t1, t2).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onKeyDown(t0, t1, t2).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onPaste(t0, t1, t2).runNow()))
    if (onQuery != null) __obj.updateDynamic("onQuery")(js.Any.fromFunction3((t0: /* query */ typingsJapgolly.slate.mod.Query, t1: T, t2: /* next */ js.Function0[scala.Unit]) => onQuery(t0, t1, t2).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onSelect(t0, t1, t2).runNow()))
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (renderAnnotation != null) __obj.updateDynamic("renderAnnotation")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.RenderAnnotationProps, t1: /* editor */ T, t2: /* next */ js.Function0[js.Any]) => renderAnnotation(t0, t1, t2).runNow()))
    if (renderBlock != null) __obj.updateDynamic("renderBlock")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.RenderBlockProps, t1: /* editor */ T, t2: /* next */ js.Function0[js.Any]) => renderBlock(t0, t1, t2).runNow()))
    if (renderDecoration != null) __obj.updateDynamic("renderDecoration")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.RenderDecorationProps, t1: /* editor */ T, t2: /* next */ js.Function0[js.Any]) => renderDecoration(t0, t1, t2).runNow()))
    if (renderDocument != null) __obj.updateDynamic("renderDocument")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.RenderDocumentProps, t1: /* editor */ T, t2: /* next */ js.Function0[js.Any]) => renderDocument(t0, t1, t2).runNow()))
    if (renderEditor != null) __obj.updateDynamic("renderEditor")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.EditorProps[typingsJapgolly.slateReact.mod.Editor], t1: /* editor */ T, t2: /* next */ js.Function0[js.Any]) => renderEditor(t0, t1, t2).runNow()))
    if (renderInline != null) __obj.updateDynamic("renderInline")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.RenderInlineProps, t1: /* editor */ T, t2: /* next */ js.Function0[js.Any]) => renderInline(t0, t1, t2).runNow()))
    if (renderMark != null) __obj.updateDynamic("renderMark")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.RenderMarkProps, t1: /* editor */ T, t2: /* next */ js.Function0[js.Any]) => renderMark(t0, t1, t2).runNow()))
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (shouldNodeComponentUpdate != null) __obj.updateDynamic("shouldNodeComponentUpdate")(js.Any.fromFunction4((t0: /* previousProps */ typingsJapgolly.slateReact.mod.RenderNodeProps, t1: /* props */ typingsJapgolly.slateReact.mod.RenderNodeProps, t2: /* editor */ typingsJapgolly.slate.mod.Editor, t3: /* next */ js.Function0[js.Any]) => shouldNodeComponentUpdate(t0, t1, t2, t3).runNow()))
    if (validateNode != null) __obj.updateDynamic("validateNode")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.slate.mod.Node, t1: T, t2: /* next */ js.Function0[scala.Unit]) => validateNode(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Plugin[T]]
  }
}

