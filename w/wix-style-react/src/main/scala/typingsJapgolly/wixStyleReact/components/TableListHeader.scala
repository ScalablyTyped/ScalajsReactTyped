package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesTableListHeaderMod.TableListHeaderColumn
import typingsJapgolly.wixStyleReact.distTypesTableListHeaderMod.TableListHeaderProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.checked
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.disabled
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.hasError
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.hidden
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.indeterminate
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableListHeader {
  
  @JSImport("wix-style-react", "TableListHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def checkboxState(value: normal | checked | indeterminate | hasError | disabled | hidden): this.type = set("checkboxState", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def onCheckboxChange(value: Callback): this.type = set("onCheckboxChange", value.toJsFn)
    
    inline def onSortChange(value: (/* colNum */ Double, /* nativeEvent */ ReactMouseEventFrom[HTMLDivElement]) => Callback): this.type = set("onSortChange", js.Any.fromFunction2((t0: /* colNum */ Double, t1: /* nativeEvent */ ReactMouseEventFrom[HTMLDivElement]) => (value(t0, t1)).runNow()))
    
    inline def options(value: js.Array[TableListHeaderColumn]): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsVarargs(value: TableListHeaderColumn*): this.type = set("options", js.Array(value*))
  }
  
  implicit def make(companion: TableListHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableListHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
