package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.PartialToasterProps
import typingsJapgolly.baseui.toastTypesMod.PlacementType
import typingsJapgolly.baseui.toastTypesMod.ToasterOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToasterContainer {
  
  @JSImport("baseui/toast", "ToasterContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.toastMod.ToasterContainer] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoHideDuration(value: Double): this.type = set("autoHideDuration", value.asInstanceOf[js.Any])
    
    inline def closeable(value: Boolean): this.type = set("closeable", value.asInstanceOf[js.Any])
    
    inline def overrides(value: ToasterOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def placement(value: PlacementType): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def resetAutoHideTimerOnUpdate(value: Boolean): this.type = set("resetAutoHideTimerOnUpdate", value.asInstanceOf[js.Any])
    
    inline def usePortal(value: Boolean): this.type = set("usePortal", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ToasterContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialToasterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
