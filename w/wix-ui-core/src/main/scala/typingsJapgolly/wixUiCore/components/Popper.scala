package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.popperJs.mod.Boundary
import typingsJapgolly.popperJs.mod.Placement
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverNextComponentsPopperMod.PopperProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverUtilsGetModifiersMod.MoveBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popper {
  
  inline def apply(
    grabScheduleUpdater: /* import warning: importer.ImportType#apply Failed type conversion: react-popper.react-popper.PopperChildrenProps['scheduleUpdate'] */ js.Any => Callback,
    isTestEnv: Boolean,
    placement: Placement,
    shouldAnimate: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(grabScheduleUpdater = js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: react-popper.react-popper.PopperChildrenProps['scheduleUpdate'] */ js.Any) => grabScheduleUpdater(t0).runNow()), isTestEnv = isTestEnv.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldAnimate = shouldAnimate.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PopperProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/popover-next/components/Popper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def appendTo(value: Boundary | Element): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def contentHook(value: String): this.type = set("contentHook", value.asInstanceOf[js.Any])
    
    inline def customArrow(value: (/* placement */ Placement, /* arrowProps */ js.Object) => Node): this.type = set("customArrow", js.Any.fromFunction2(value))
    
    inline def dynamicWidth(value: Boolean): this.type = set("dynamicWidth", value.asInstanceOf[js.Any])
    
    inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: Double | String): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: String | Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def moveArrowTo(value: Double): this.type = set("moveArrowTo", value.asInstanceOf[js.Any])
    
    inline def moveBy(value: MoveBy): this.type = set("moveBy", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
