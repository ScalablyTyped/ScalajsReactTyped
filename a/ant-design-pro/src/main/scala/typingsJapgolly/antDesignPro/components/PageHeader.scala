package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.antDesignPro.libPageHeaderMod.PageHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageHeader {
  
  inline def apply(itemRender: Any => Node): SharedBuilder_PageHeaderProps973534749[typingsJapgolly.antDesignPro.mod.PageHeader] = {
    val __props = js.Dynamic.literal(itemRender = js.Any.fromFunction1(itemRender))
    new SharedBuilder_PageHeaderProps973534749[typingsJapgolly.antDesignPro.mod.PageHeader](js.Array(this.component, __props.asInstanceOf[PageHeaderProps]))
  }
  
  @JSImport("ant-design-pro", "PageHeader")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PageHeaderProps): SharedBuilder_PageHeaderProps973534749[typingsJapgolly.antDesignPro.mod.PageHeader] = new SharedBuilder_PageHeaderProps973534749[typingsJapgolly.antDesignPro.mod.PageHeader](js.Array(this.component, p.asInstanceOf[js.Any]))
}
