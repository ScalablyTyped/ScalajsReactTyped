package typingsJapgolly.blueprintjsCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.anon.PartialOverflowListPropsB
import typingsJapgolly.blueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbsMod.IBreadcrumbsProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumbs {
  
  inline def apply(items: js.Array[BreadcrumbProps]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IBreadcrumbsProps]))
  }
  
  @JSImport("@blueprintjs/core", "Breadcrumbs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.Breadcrumbs] {
    
    inline def breadcrumbRenderer(value: /* props */ BreadcrumbProps => Element): this.type = set("breadcrumbRenderer", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapseFrom(value: Boundary): this.type = set("collapseFrom", value.asInstanceOf[js.Any])
    
    inline def currentBreadcrumbRenderer(value: /* props */ BreadcrumbProps => Element): this.type = set("currentBreadcrumbRenderer", js.Any.fromFunction1(value))
    
    inline def minVisibleItems(value: Double): this.type = set("minVisibleItems", value.asInstanceOf[js.Any])
    
    inline def overflowListProps(value: PartialOverflowListPropsB): this.type = set("overflowListProps", value.asInstanceOf[js.Any])
    
    inline def popoverProps(value: IPopoverProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IBreadcrumbsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
