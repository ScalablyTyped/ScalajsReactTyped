package typingsJapgolly.reactWidgets.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactWidgets.esmListboxMod.ListboxHandle
import typingsJapgolly.reactWidgets.esmListboxMod.ListboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Listbox {
  
  def apply[TDataItem](p: ListboxProps[TDataItem] & RefAttributes[ListboxHandle]): Builder[TDataItem] = new Builder[TDataItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-widgets/esm", "Listbox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TDataItem] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  implicit def make[TDataItem](companion: Listbox.type): Builder[TDataItem] = new Builder[TDataItem](js.Array(this.component, js.Dictionary.empty))()
}
