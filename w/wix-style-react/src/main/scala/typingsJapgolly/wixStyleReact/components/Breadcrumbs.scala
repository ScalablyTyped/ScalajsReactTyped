package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.MaxWidth
import typingsJapgolly.wixStyleReact.distTypesBreadcrumbsMod.BreadcrumbsItem
import typingsJapgolly.wixStyleReact.distTypesBreadcrumbsMod.BreadcrumbsProps
import typingsJapgolly.wixStyleReact.distTypesBreadcrumbsMod.BreadcrumbsSize
import typingsJapgolly.wixStyleReact.distTypesBreadcrumbsMod.BreadcrumbsTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumbs {
  
  inline def apply(items: js.Array[BreadcrumbsItem]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BreadcrumbsProps]))
  }
  
  @JSImport("wix-style-react", "Breadcrumbs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Breadcrumbs] {
    
    inline def activeId(value: String | Double): this.type = set("activeId", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def itemMaxWidth(value: MaxWidth[String | Double]): this.type = set("itemMaxWidth", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* item */ BreadcrumbsItem => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def size(value: BreadcrumbsSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def theme(value: BreadcrumbsTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BreadcrumbsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
