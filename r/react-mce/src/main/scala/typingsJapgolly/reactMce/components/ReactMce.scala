package typingsJapgolly.reactMce.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMce.mod.ReactMCEProps
import typingsJapgolly.reactMce.mod.^
import typingsJapgolly.tinymce.mod.Editor
import typingsJapgolly.tinymce.mod.Settings_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMce {
  def apply(
    config: Settings_,
    content: String = null,
    onActivate: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onAddUndo: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onBeforeAddUndo: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onBeforeExecCommand: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onBeforeGetContent: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onBeforeRenderUI: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onBeforeSetContent: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onBeforepaste: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onBlur: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onChange: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onClearUndos: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onClick: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onContextmenu: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onCopy: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onCut: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onDblclick: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onDeactivate: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onDirty: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onDrag: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onDragdrop: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onDragend: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onDraggesture: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onDragover: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onDrop: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onExecCommand: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onFocus: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onFocusin: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onFocusout: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onGetContent: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onHide: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onInit: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onKeydown: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onKeypress: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onKeyup: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onLoadContent: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onMousedown: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onMouseenter: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onMouseleave: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onMousemove: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onMouseout: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onMouseover: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onMouseup: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onNodeChange: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onObjectResizeStart: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onObjectResized: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onObjectSelected: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onPaste: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onPostProcess: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onPostRender: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onPreInit: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onPreProcess: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onProgressState: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onRedo: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onRemove: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onReset: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onSaveContent: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onSelectionchange: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onSetAttrib: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onSetContent: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onShow: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onSubmit: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onUndo: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    onVisualAid: (/* event */ js.Any, /* editor */ Editor) => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactMCEProps, ^, Unit, ReactMCEProps] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
  
      if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onActivate(t0, t1).runNow()))
    if (onAddUndo != null) __obj.updateDynamic("onAddUndo")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onAddUndo(t0, t1).runNow()))
    if (onBeforeAddUndo != null) __obj.updateDynamic("onBeforeAddUndo")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onBeforeAddUndo(t0, t1).runNow()))
    if (onBeforeExecCommand != null) __obj.updateDynamic("onBeforeExecCommand")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onBeforeExecCommand(t0, t1).runNow()))
    if (onBeforeGetContent != null) __obj.updateDynamic("onBeforeGetContent")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onBeforeGetContent(t0, t1).runNow()))
    if (onBeforeRenderUI != null) __obj.updateDynamic("onBeforeRenderUI")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onBeforeRenderUI(t0, t1).runNow()))
    if (onBeforeSetContent != null) __obj.updateDynamic("onBeforeSetContent")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onBeforeSetContent(t0, t1).runNow()))
    if (onBeforepaste != null) __obj.updateDynamic("onBeforepaste")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onBeforepaste(t0, t1).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onBlur(t0, t1).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onChange(t0, t1).runNow()))
    if (onClearUndos != null) __obj.updateDynamic("onClearUndos")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onClearUndos(t0, t1).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onClick(t0, t1).runNow()))
    if (onContextmenu != null) __obj.updateDynamic("onContextmenu")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onContextmenu(t0, t1).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onCopy(t0, t1).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onCut(t0, t1).runNow()))
    if (onDblclick != null) __obj.updateDynamic("onDblclick")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onDblclick(t0, t1).runNow()))
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onDeactivate(t0, t1).runNow()))
    if (onDirty != null) __obj.updateDynamic("onDirty")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onDirty(t0, t1).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onDrag(t0, t1).runNow()))
    if (onDragdrop != null) __obj.updateDynamic("onDragdrop")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onDragdrop(t0, t1).runNow()))
    if (onDragend != null) __obj.updateDynamic("onDragend")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onDragend(t0, t1).runNow()))
    if (onDraggesture != null) __obj.updateDynamic("onDraggesture")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onDraggesture(t0, t1).runNow()))
    if (onDragover != null) __obj.updateDynamic("onDragover")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onDragover(t0, t1).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onDrop(t0, t1).runNow()))
    if (onExecCommand != null) __obj.updateDynamic("onExecCommand")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onExecCommand(t0, t1).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onFocus(t0, t1).runNow()))
    if (onFocusin != null) __obj.updateDynamic("onFocusin")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onFocusin(t0, t1).runNow()))
    if (onFocusout != null) __obj.updateDynamic("onFocusout")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onFocusout(t0, t1).runNow()))
    if (onGetContent != null) __obj.updateDynamic("onGetContent")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onGetContent(t0, t1).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onHide(t0, t1).runNow()))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onInit(t0, t1).runNow()))
    if (onKeydown != null) __obj.updateDynamic("onKeydown")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onKeydown(t0, t1).runNow()))
    if (onKeypress != null) __obj.updateDynamic("onKeypress")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onKeypress(t0, t1).runNow()))
    if (onKeyup != null) __obj.updateDynamic("onKeyup")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onKeyup(t0, t1).runNow()))
    if (onLoadContent != null) __obj.updateDynamic("onLoadContent")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onLoadContent(t0, t1).runNow()))
    if (onMousedown != null) __obj.updateDynamic("onMousedown")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onMousedown(t0, t1).runNow()))
    if (onMouseenter != null) __obj.updateDynamic("onMouseenter")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onMouseenter(t0, t1).runNow()))
    if (onMouseleave != null) __obj.updateDynamic("onMouseleave")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onMouseleave(t0, t1).runNow()))
    if (onMousemove != null) __obj.updateDynamic("onMousemove")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onMousemove(t0, t1).runNow()))
    if (onMouseout != null) __obj.updateDynamic("onMouseout")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onMouseout(t0, t1).runNow()))
    if (onMouseover != null) __obj.updateDynamic("onMouseover")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onMouseover(t0, t1).runNow()))
    if (onMouseup != null) __obj.updateDynamic("onMouseup")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onMouseup(t0, t1).runNow()))
    if (onNodeChange != null) __obj.updateDynamic("onNodeChange")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onNodeChange(t0, t1).runNow()))
    if (onObjectResizeStart != null) __obj.updateDynamic("onObjectResizeStart")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onObjectResizeStart(t0, t1).runNow()))
    if (onObjectResized != null) __obj.updateDynamic("onObjectResized")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onObjectResized(t0, t1).runNow()))
    if (onObjectSelected != null) __obj.updateDynamic("onObjectSelected")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onObjectSelected(t0, t1).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onPaste(t0, t1).runNow()))
    if (onPostProcess != null) __obj.updateDynamic("onPostProcess")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onPostProcess(t0, t1).runNow()))
    if (onPostRender != null) __obj.updateDynamic("onPostRender")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onPostRender(t0, t1).runNow()))
    if (onPreInit != null) __obj.updateDynamic("onPreInit")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onPreInit(t0, t1).runNow()))
    if (onPreProcess != null) __obj.updateDynamic("onPreProcess")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onPreProcess(t0, t1).runNow()))
    if (onProgressState != null) __obj.updateDynamic("onProgressState")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onProgressState(t0, t1).runNow()))
    if (onRedo != null) __obj.updateDynamic("onRedo")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onRedo(t0, t1).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onRemove(t0, t1).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onReset(t0, t1).runNow()))
    if (onSaveContent != null) __obj.updateDynamic("onSaveContent")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onSaveContent(t0, t1).runNow()))
    if (onSelectionchange != null) __obj.updateDynamic("onSelectionchange")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onSelectionchange(t0, t1).runNow()))
    if (onSetAttrib != null) __obj.updateDynamic("onSetAttrib")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onSetAttrib(t0, t1).runNow()))
    if (onSetContent != null) __obj.updateDynamic("onSetContent")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onSetContent(t0, t1).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onShow(t0, t1).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onSubmit(t0, t1).runNow()))
    if (onUndo != null) __obj.updateDynamic("onUndo")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onUndo(t0, t1).runNow()))
    if (onVisualAid != null) __obj.updateDynamic("onVisualAid")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ typingsJapgolly.tinymce.mod.Editor) => onVisualAid(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMce.mod.ReactMCEProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMce.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMce.mod.ReactMCEProps])(children: _*)
  }
  @JSImport("react-mce", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

