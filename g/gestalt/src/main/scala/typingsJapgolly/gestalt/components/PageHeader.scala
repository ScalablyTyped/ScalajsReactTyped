package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.OnClick
import typingsJapgolly.gestalt.gestaltStrings.none
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.mod.PageHeaderAction
import typingsJapgolly.gestalt.mod.PageHeaderBadge
import typingsJapgolly.gestalt.mod.PageHeaderHelperIconButton
import typingsJapgolly.gestalt.mod.PageHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageHeader {
  
  inline def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PageHeaderProps]))
  }
  
  @JSImport("gestalt", "PageHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def badge(value: PageHeaderBadge): this.type = set("badge", value.asInstanceOf[js.Any])
    
    inline def borderStyle(value: sm | none): this.type = set("borderStyle", value.asInstanceOf[js.Any])
    
    inline def dropdownAccessibilityLabel(value: String): this.type = set("dropdownAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def helperIconButton(value: PageHeaderHelperIconButton): this.type = set("helperIconButton", value.asInstanceOf[js.Any])
    
    inline def helperLink(value: OnClick): this.type = set("helperLink", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[Node]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: Node*): this.type = set("items", js.Array(value*))
    
    inline def maxWidth(value: Double | String): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def primaryAction(value: PageHeaderAction): this.type = set("primaryAction", value.asInstanceOf[js.Any])
    
    inline def secondaryAction(value: PageHeaderAction): this.type = set("secondaryAction", value.asInstanceOf[js.Any])
    
    inline def subtext(value: String): this.type = set("subtext", value.asInstanceOf[js.Any])
    
    inline def thumbnail(value: VdomElement): this.type = set("thumbnail", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: PageHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
