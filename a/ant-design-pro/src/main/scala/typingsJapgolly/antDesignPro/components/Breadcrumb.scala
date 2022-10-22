package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.antDesignPro.libPageHeaderBreadcrumbMod.default
import typingsJapgolly.antDesignPro.libPageHeaderMod.PageHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumb {
  
  inline def apply(itemRender: Any => Node): SharedBuilder_PageHeaderProps973534749[default] = {
    val __props = js.Dynamic.literal(itemRender = js.Any.fromFunction1(itemRender))
    new SharedBuilder_PageHeaderProps973534749[default](js.Array(this.component, __props.asInstanceOf[PageHeaderProps]))
  }
  
  @JSImport("ant-design-pro/lib/PageHeader/breadcrumb", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PageHeaderProps): SharedBuilder_PageHeaderProps973534749[default] = new SharedBuilder_PageHeaderProps973534749[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
