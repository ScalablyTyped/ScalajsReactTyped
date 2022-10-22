package typingsJapgolly.cathoQuantum.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.BaseFontSizeColors
import typingsJapgolly.cathoQuantum.anon.Label
import typingsJapgolly.cathoQuantum.breadcrumbsMod.BreadcrumbsProps
import typingsJapgolly.cathoQuantum.breadcrumbsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumbs {
  
  inline def apply(items: js.Array[Label]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BreadcrumbsProps]))
  }
  
  @JSImport("@catho/quantum/Breadcrumbs", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def theme(value: BaseFontSizeColors): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BreadcrumbsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
