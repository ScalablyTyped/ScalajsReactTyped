package typingsJapgolly.reactBreadcrumbsDynamic.components

import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumbs {
  
  @JSImport("react-breadcrumbs-dynamic", "Breadcrumbs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBreadcrumbsDynamic.mod.Breadcrumbs] {
    
    inline def container(value: String | Element | js.Object): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def containerProps(value: js.Object): this.type = set("containerProps", value.asInstanceOf[js.Any])
    
    inline def duplicateProps(value: js.Object): this.type = set("duplicateProps", value.asInstanceOf[js.Any])
    
    inline def finalItem(value: String | Element | js.Object): this.type = set("finalItem", value.asInstanceOf[js.Any])
    
    inline def finalProps(value: js.Object): this.type = set("finalProps", value.asInstanceOf[js.Any])
    
    inline def item(value: String | Element | js.Object): this.type = set("item", value.asInstanceOf[js.Any])
    
    inline def renameProps(value: js.Object): this.type = set("renameProps", value.asInstanceOf[js.Any])
    
    inline def separator(value: String | Element | js.Object): this.type = set("separator", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Breadcrumbs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BreadcrumbsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
