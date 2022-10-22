package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesEditableSelectorMod.EditableSelectorOption
import typingsJapgolly.wixStyleReact.distTypesEditableSelectorMod.EditableSelectorProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.checkbox
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.radio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditableSelector {
  
  @JSImport("wix-style-react", "EditableSelector")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.EditableSelector] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def editButtonText(value: String): this.type = set("editButtonText", value.asInstanceOf[js.Any])
    
    inline def newRowLabel(value: String): this.type = set("newRowLabel", value.asInstanceOf[js.Any])
    
    inline def onOptionAdded(value: /* title */ String => Callback): this.type = set("onOptionAdded", js.Any.fromFunction1((t0: /* title */ String) => value(t0).runNow()))
    
    inline def onOptionDelete(value: /* id */ Double => Callback): this.type = set("onOptionDelete", js.Any.fromFunction1((t0: /* id */ Double) => value(t0).runNow()))
    
    inline def onOptionEdit(value: (/* title */ String, /* id */ Double) => Callback): this.type = set("onOptionEdit", js.Any.fromFunction2((t0: /* title */ String, t1: /* id */ Double) => (value(t0, t1)).runNow()))
    
    inline def onOptionToggle(value: /* id */ Double => Callback): this.type = set("onOptionToggle", js.Any.fromFunction1((t0: /* id */ Double) => value(t0).runNow()))
    
    inline def options(value: js.Array[EditableSelectorOption]): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsVarargs(value: EditableSelectorOption*): this.type = set("options", js.Array(value*))
    
    inline def styles(value: String): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def toggleType(value: checkbox | radio): this.type = set("toggleType", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: EditableSelector.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EditableSelectorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
