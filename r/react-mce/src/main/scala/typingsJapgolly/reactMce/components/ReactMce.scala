package typingsJapgolly.reactMce.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMce.mod.ReactMCEProps
import typingsJapgolly.reactMce.mod.^
import typingsJapgolly.tinymce.mod.Editor
import typingsJapgolly.tinymce.mod.Settings_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMce {
  
  inline def apply(config: Settings_): Builder = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactMCEProps]))
  }
  
  @JSImport("react-mce", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def onActivate(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onActivate", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onAddUndo(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onAddUndo", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onBeforeAddUndo(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onBeforeAddUndo", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onBeforeExecCommand(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onBeforeExecCommand", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onBeforeGetContent(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onBeforeGetContent", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onBeforeRenderUI(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onBeforeRenderUI", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onBeforeSetContent(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onBeforeSetContent", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onBeforepaste(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onBeforepaste", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onBlur(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onBlur", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onChange(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onClearUndos(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onClearUndos", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onClick(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onContextmenu(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onContextmenu", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onCopy(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onCopy", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onCut(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onCut", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onDblclick(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onDblclick", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onDeactivate(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onDeactivate", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onDirty(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onDirty", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onDrag(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onDrag", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onDragdrop(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onDragdrop", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onDragend(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onDragend", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onDraggesture(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onDraggesture", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onDragover(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onDragover", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onDrop(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onDrop", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onExecCommand(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onExecCommand", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onFocus(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onFocus", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onFocusin(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onFocusin", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onFocusout(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onFocusout", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onGetContent(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onGetContent", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onHide(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onHide", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onInit(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onInit", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onKeydown(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onKeydown", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onKeypress(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onKeypress", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onKeyup(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onKeyup", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onLoadContent(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onLoadContent", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onMousedown(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onMousedown", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onMouseenter(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onMouseenter", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onMouseleave(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onMouseleave", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onMousemove(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onMousemove", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onMouseout(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onMouseout", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onMouseover(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onMouseover", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onMouseup(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onMouseup", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onNodeChange(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onNodeChange", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onObjectResizeStart(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onObjectResizeStart", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onObjectResized(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onObjectResized", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onObjectSelected(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onObjectSelected", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onPaste(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onPaste", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onPostProcess(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onPostProcess", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onPostRender(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onPostRender", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onPreInit(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onPreInit", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onPreProcess(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onPreProcess", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onProgressState(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onProgressState", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onRedo(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onRedo", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onRemove(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onRemove", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onReset(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onReset", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onSaveContent(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onSaveContent", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onSelectionchange(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onSelectionchange", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onSetAttrib(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onSetAttrib", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onSetContent(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onSetContent", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onShow(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onShow", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onSubmit(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onSubmit", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onUndo(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onUndo", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
    
    inline def onVisualAid(value: (/* event */ Any, /* editor */ Editor) => Callback): this.type = set("onVisualAid", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ Editor) => (value(t0, t1)).runNow()))
  }
  
  def withProps(p: ReactMCEProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
