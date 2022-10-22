package typingsJapgolly.reactWidgets.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.reactWidgets.esmFocusListContextMod.FocusListContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("react-widgets/esm/FocusListContext", "FocusListContext.Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def value(value: FocusListContext): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
  }
  
  implicit def make(companion: Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProviderProps[FocusListContext | Null]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
