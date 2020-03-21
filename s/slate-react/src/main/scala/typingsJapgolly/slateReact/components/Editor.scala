package typingsJapgolly.slateReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.slate.mod.Command
import typingsJapgolly.slate.mod.CommandFunc
import typingsJapgolly.slate.mod.Node
import typingsJapgolly.slate.mod.Query
import typingsJapgolly.slate.mod.QueryFunc
import typingsJapgolly.slate.mod.SchemaProperties
import typingsJapgolly.slate.mod.SlateError
import typingsJapgolly.slate.mod.Value
import typingsJapgolly.slateReact.mod.EditorProps
import typingsJapgolly.slateReact.mod.OnChangeParam
import typingsJapgolly.slateReact.mod.Plugins
import typingsJapgolly.slateReact.mod.RenderAnnotationProps
import typingsJapgolly.slateReact.mod.RenderBlockProps
import typingsJapgolly.slateReact.mod.RenderDecorationProps
import typingsJapgolly.slateReact.mod.RenderDocumentProps
import typingsJapgolly.slateReact.mod.RenderInlineProps
import typingsJapgolly.slateReact.mod.RenderMarkProps
import typingsJapgolly.slateReact.mod.RenderNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Editor {
  def apply(
    value: Value,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    commands: StringDictionary[CommandFunc[typingsJapgolly.slateReact.mod.Editor]] = null,
    decorateNode: (/* node */ Node, typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    normalizeNode: (/* node */ Node, typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[Unit]) => CallbackTo[(js.Function1[typingsJapgolly.slateReact.mod.Editor, Unit]) | Unit] = null,
    onBeforeInput: (ReactEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onBlur: (ReactFocusEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onChange: /* change */ OnChangeParam => CallbackTo[js.Any] = null,
    onClick: (ReactMouseEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onCommand: (/* command */ Command, typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[Unit]) => Callback = null,
    onCompositionEnd: (ReactCompositionEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onCompositionStart: (ReactCompositionEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onConstruct: (typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[Unit]) => Callback = null,
    onContextMenu: (ReactMouseEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onCopy: (ReactClipboardEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onCut: (ReactClipboardEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDragEnd: (ReactDragEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDragEnter: (ReactDragEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDragExit: (ReactDragEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDragLeave: (ReactDragEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDragOver: (ReactDragEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDragStart: (ReactDragEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onDrop: (ReactDragEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onFocus: (ReactFocusEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onInput: (ReactEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onKeyDown: (ReactKeyboardEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onPaste: (ReactClipboardEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    onQuery: (/* query */ Query, typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[Unit]) => Callback = null,
    onSelect: (ReactEventFrom[Element], /* editor */ typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    placeholder: js.Any = null,
    plugins: Plugins[typingsJapgolly.slateReact.mod.Editor] = null,
    queries: StringDictionary[QueryFunc[typingsJapgolly.slateReact.mod.Editor]] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderAnnotation: (/* props */ RenderAnnotationProps, typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    renderBlock: (/* props */ RenderBlockProps, typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    renderDecoration: (/* props */ RenderDecorationProps, typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    renderDocument: (/* props */ RenderDocumentProps, typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    renderEditor: (/* props */ EditorProps[typingsJapgolly.slateReact.mod.Editor], typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    renderInline: (/* props */ RenderInlineProps, typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    renderMark: (/* props */ RenderMarkProps, typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    role: String = null,
    schema: SchemaProperties = null,
    shouldNodeComponentUpdate: (/* previousProps */ RenderNodeProps, /* props */ RenderNodeProps, /* editor */ typingsJapgolly.slate.mod.Editor, /* next */ js.Function0[js.Any]) => CallbackTo[js.Any] = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    validateNode: (/* node */ Node, typingsJapgolly.slateReact.mod.Editor, /* next */ js.Function0[Unit]) => CallbackTo[SlateError | Unit] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    EditorProps[typingsJapgolly.slateReact.mod.Editor], 
    typingsJapgolly.slateReact.mod.Editor, 
    Unit, 
    EditorProps[typingsJapgolly.slateReact.mod.Editor]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (decorateNode != null) __obj.updateDynamic("decorateNode")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.slate.mod.Node, t1: typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => decorateNode(t0, t1, t2).runNow()))
    if (normalizeNode != null) __obj.updateDynamic("normalizeNode")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.slate.mod.Node, t1: typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[scala.Unit]) => normalizeNode(t0, t1, t2).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onBeforeInput(t0, t1, t2).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onBlur(t0, t1, t2).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* change */ typingsJapgolly.slateReact.mod.OnChangeParam) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onClick(t0, t1, t2).runNow()))
    if (onCommand != null) __obj.updateDynamic("onCommand")(js.Any.fromFunction3((t0: /* command */ typingsJapgolly.slate.mod.Command, t1: typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[scala.Unit]) => onCommand(t0, t1, t2).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onCompositionEnd(t0, t1, t2).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onCompositionStart(t0, t1, t2).runNow()))
    if (onConstruct != null) __obj.updateDynamic("onConstruct")(js.Any.fromFunction2((t0: typingsJapgolly.slateReact.mod.Editor, t1: /* next */ js.Function0[scala.Unit]) => onConstruct(t0, t1).runNow()))
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
    if (onQuery != null) __obj.updateDynamic("onQuery")(js.Any.fromFunction3((t0: /* query */ typingsJapgolly.slate.mod.Query, t1: typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[scala.Unit]) => onQuery(t0, t1, t2).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t1: /* editor */ typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => onSelect(t0, t1, t2).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (renderAnnotation != null) __obj.updateDynamic("renderAnnotation")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.RenderAnnotationProps, t1: typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => renderAnnotation(t0, t1, t2).runNow()))
    if (renderBlock != null) __obj.updateDynamic("renderBlock")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.RenderBlockProps, t1: typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => renderBlock(t0, t1, t2).runNow()))
    if (renderDecoration != null) __obj.updateDynamic("renderDecoration")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.RenderDecorationProps, t1: typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => renderDecoration(t0, t1, t2).runNow()))
    if (renderDocument != null) __obj.updateDynamic("renderDocument")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.RenderDocumentProps, t1: typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => renderDocument(t0, t1, t2).runNow()))
    if (renderEditor != null) __obj.updateDynamic("renderEditor")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.EditorProps[typingsJapgolly.slateReact.mod.Editor], t1: typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => renderEditor(t0, t1, t2).runNow()))
    if (renderInline != null) __obj.updateDynamic("renderInline")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.RenderInlineProps, t1: typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => renderInline(t0, t1, t2).runNow()))
    if (renderMark != null) __obj.updateDynamic("renderMark")(js.Any.fromFunction3((t0: /* props */ typingsJapgolly.slateReact.mod.RenderMarkProps, t1: typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[js.Any]) => renderMark(t0, t1, t2).runNow()))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (shouldNodeComponentUpdate != null) __obj.updateDynamic("shouldNodeComponentUpdate")(js.Any.fromFunction4((t0: /* previousProps */ typingsJapgolly.slateReact.mod.RenderNodeProps, t1: /* props */ typingsJapgolly.slateReact.mod.RenderNodeProps, t2: /* editor */ typingsJapgolly.slate.mod.Editor, t3: /* next */ js.Function0[js.Any]) => shouldNodeComponentUpdate(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (validateNode != null) __obj.updateDynamic("validateNode")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.slate.mod.Node, t1: typingsJapgolly.slateReact.mod.Editor, t2: /* next */ js.Function0[scala.Unit]) => validateNode(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.slateReact.mod.EditorProps[typingsJapgolly.slateReact.mod.Editor], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.slateReact.mod.Editor](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.slateReact.mod.EditorProps[typingsJapgolly.slateReact.mod.Editor]])(children: _*)
  }
  @JSImport("slate-react", "Editor")
  @js.native
  object componentImport extends js.Object
  
}

