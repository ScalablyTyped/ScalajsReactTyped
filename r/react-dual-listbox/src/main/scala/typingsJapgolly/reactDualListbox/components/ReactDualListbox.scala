package typingsJapgolly.reactDualListbox.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLSelectElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDualListbox.anon.kinavailableFilterHeadera
import typingsJapgolly.reactDualListbox.anon.kinmoveLeftmoveAllLeftmov
import typingsJapgolly.reactDualListbox.mod.DualListBoxProperties
import typingsJapgolly.reactDualListbox.mod.Filter
import typingsJapgolly.reactDualListbox.mod.Option
import typingsJapgolly.reactDualListbox.mod.default
import typingsJapgolly.reactDualListbox.reactDualListboxStrings.middle
import typingsJapgolly.reactDualListbox.reactDualListboxStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDualListbox {
  
  inline def apply[P, F /* <: Boolean */, V /* <: Boolean */](options: js.Array[Option[P]]): Builder[P, F, V] = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder[P, F, V](js.Array(this.component, __props.asInstanceOf[DualListBoxProperties[P, F, V]]))
  }
  
  @JSImport("react-dual-listbox", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P, F /* <: Boolean */, V /* <: Boolean */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[P, F, V]] {
    
    inline def alignActions(value: top | middle): this.type = set("alignActions", value.asInstanceOf[js.Any])
    
    inline def allowDuplicates(value: Boolean): this.type = set("allowDuplicates", value.asInstanceOf[js.Any])
    
    inline def available(value: js.Array[P]): this.type = set("available", value.asInstanceOf[js.Any])
    
    inline def availableRef(value: /* availableInput */ HTMLSelectElement => Callback): this.type = set("availableRef", js.Any.fromFunction1((t0: /* availableInput */ HTMLSelectElement) => value(t0).runNow()))
    
    inline def availableRefNull: this.type = set("availableRef", null)
    
    inline def availableVarargs(value: P*): this.type = set("available", js.Array(value*))
    
    inline def canFilter(value: F): this.type = set("canFilter", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameNull: this.type = set("className", null)
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def filter(value: Filter[P]): this.type = set("filter", value.asInstanceOf[js.Any])
    
    inline def filterCallback(
      value: /* import warning: importer.ImportType#apply Failed type conversion: F extends true ? (option : react-dual-listbox.react-dual-listbox.Option<T>, filterInput : string): boolean : undefined */ js.Any
    ): this.type = set("filterCallback", value.asInstanceOf[js.Any])
    
    inline def filterPlaceholder(
      value: /* import warning: importer.ImportType#apply Failed type conversion: F extends true ? string : undefined */ js.Any
    ): this.type = set("filterPlaceholder", value.asInstanceOf[js.Any])
    
    inline def icons(value: kinmoveLeftmoveAllLeftmov): this.type = set("icons", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idNull: this.type = set("id", null)
    
    inline def lang(value: kinavailableFilterHeadera): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def moveKeyCodes(value: js.Array[Double]): this.type = set("moveKeyCodes", value.asInstanceOf[js.Any])
    
    inline def moveKeyCodesVarargs(value: Double*): this.type = set("moveKeyCodes", js.Array(value*))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nameNull: this.type = set("name", null)
    
    inline def onChange(
      value: /* import warning: importer.ImportType#apply Failed type conversion: V extends true ? std.Array<T> : std.Array<react-dual-listbox.react-dual-listbox.Option<T>> */ /* selected */ js.Any => Callback
    ): this.type = set("onChange", js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: V extends true ? std.Array<T> : std.Array<react-dual-listbox.react-dual-listbox.Option<T>> */ /* selected */ js.Any) => value(t0).runNow()))
    
    inline def onFilterChange(
      value: /* import warning: importer.ImportType#apply Failed type conversion: F extends true ? (filter : string): void : undefined */ js.Any
    ): this.type = set("onFilterChange", value.asInstanceOf[js.Any])
    
    inline def preserveSelectOrder(value: Boolean): this.type = set("preserveSelectOrder", value.asInstanceOf[js.Any])
    
    inline def selected(value: js.Array[P]): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def selectedRef(value: /* availableInput */ HTMLSelectElement => Callback): this.type = set("selectedRef", js.Any.fromFunction1((t0: /* availableInput */ HTMLSelectElement) => value(t0).runNow()))
    
    inline def selectedRefNull: this.type = set("selectedRef", null)
    
    inline def selectedVarargs(value: P*): this.type = set("selected", js.Array(value*))
    
    inline def showHeaderLabels(value: Boolean): this.type = set("showHeaderLabels", value.asInstanceOf[js.Any])
    
    inline def showNoOptionsText(value: Boolean): this.type = set("showNoOptionsText", value.asInstanceOf[js.Any])
    
    inline def showOrderButtons(value: Boolean): this.type = set("showOrderButtons", value.asInstanceOf[js.Any])
    
    inline def simpleValue(value: V): this.type = set("simpleValue", value.asInstanceOf[js.Any])
  }
  
  def withProps[P, F /* <: Boolean */, V /* <: Boolean */](p: DualListBoxProperties[P, F, V]): Builder[P, F, V] = new Builder[P, F, V](js.Array(this.component, p.asInstanceOf[js.Any]))
}
