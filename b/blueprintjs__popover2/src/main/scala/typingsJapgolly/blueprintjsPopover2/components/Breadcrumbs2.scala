package typingsJapgolly.blueprintjsPopover2.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.blueprintjsPopover2.anon.PartialOmitOverflowListPr
import typingsJapgolly.blueprintjsPopover2.anon.PartialOmitPopover2PropsH
import typingsJapgolly.blueprintjsPopover2.libEsmBreadcrumbs2Mod.Breadcrumbs2Props
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumbs2 {
  
  inline def apply(items: js.Array[BreadcrumbProps]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Breadcrumbs2Props]))
  }
  
  @JSImport("@blueprintjs/popover2", "Breadcrumbs2")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsPopover2.mod.Breadcrumbs2] {
    
    inline def breadcrumbRenderer(value: /* props */ BreadcrumbProps => Element): this.type = set("breadcrumbRenderer", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapseFrom(value: Boundary): this.type = set("collapseFrom", value.asInstanceOf[js.Any])
    
    inline def currentBreadcrumbRenderer(value: /* props */ BreadcrumbProps => Element): this.type = set("currentBreadcrumbRenderer", js.Any.fromFunction1(value))
    
    inline def minVisibleItems(value: Double): this.type = set("minVisibleItems", value.asInstanceOf[js.Any])
    
    inline def overflowListProps(value: PartialOmitOverflowListPr): this.type = set("overflowListProps", value.asInstanceOf[js.Any])
    
    inline def popoverProps(value: PartialOmitPopover2PropsH): this.type = set("popoverProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Breadcrumbs2Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
