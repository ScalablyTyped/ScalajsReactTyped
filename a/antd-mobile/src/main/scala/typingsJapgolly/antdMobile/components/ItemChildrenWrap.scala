package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.esComponentsDropdownItemMod.DropdownItemChildrenWrapProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ItemChildrenWrap {
  
  @JSImport("antd-mobile/es/components/dropdown/item", "ItemChildrenWrap")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def destroyOnClose(value: Boolean): this.type = set("destroyOnClose", value.asInstanceOf[js.Any])
    
    inline def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    inline def onClick(value: Callback): this.type = set("onClick", value.toJsFn)
  }
  
  implicit def make(companion: ItemChildrenWrap.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownItemChildrenWrapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
