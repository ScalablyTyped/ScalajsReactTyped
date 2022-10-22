package typingsJapgolly.antd.components

import typingsJapgolly.antd.libBreadcrumbBreadcrumbItemMod.BreadcrumbItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BreadcrumbItem {
  
  @JSImport("antd/lib/breadcrumb/BreadcrumbItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BreadcrumbItem.type): SharedBuilder_BreadcrumbItemProps_603766034 = new SharedBuilder_BreadcrumbItemProps_603766034(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BreadcrumbItemProps): SharedBuilder_BreadcrumbItemProps_603766034 = new SharedBuilder_BreadcrumbItemProps_603766034(js.Array(this.component, p.asInstanceOf[js.Any]))
}
