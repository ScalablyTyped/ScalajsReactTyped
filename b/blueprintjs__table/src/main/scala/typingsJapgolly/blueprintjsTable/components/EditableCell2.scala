package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmComponentsEditableTextEditableTextMod.EditableTextProps
import typingsJapgolly.blueprintjsTable.libEsmCellEditableCell2Mod.EditableCell2Props
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditableCell2 {
  
  @JSImport("@blueprintjs/table", "EditableCell2")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.mod.EditableCell2] {
    
    inline def cellRef(value: Ref[HTMLDivElement]): this.type = set("cellRef", value.asInstanceOf[js.Any])
    
    inline def cellRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("cellRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def cellRefNull: this.type = set("cellRef", null)
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columnIndex(value: Double): this.type = set("columnIndex", value.asInstanceOf[js.Any])
    
    inline def editableTextProps(value: EditableTextProps): this.type = set("editableTextProps", value.asInstanceOf[js.Any])
    
    inline def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    inline def interactive(value: Boolean): this.type = set("interactive", value.asInstanceOf[js.Any])
    
    inline def isFocused(value: Boolean): this.type = set("isFocused", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def onCancel(
      value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Callback
    ): this.type = set("onCancel", js.Any.fromFunction3((t0: /* value */ String, t1: /* rowIndex */ js.UndefOr[Double], t2: /* columnIndex */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def onChange(
      value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: /* value */ String, t1: /* rowIndex */ js.UndefOr[Double], t2: /* columnIndex */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def onConfirm(
      value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Callback
    ): this.type = set("onConfirm", js.Any.fromFunction3((t0: /* value */ String, t1: /* rowIndex */ js.UndefOr[Double], t2: /* columnIndex */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLElement & Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def rowIndex(value: Double): this.type = set("rowIndex", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: String): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def truncated(value: Boolean): this.type = set("truncated", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def wrapText(value: Boolean): this.type = set("wrapText", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: EditableCell2.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EditableCell2Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
