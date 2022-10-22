package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.RefreshIndicatorProps
import typingsJapgolly.materialUi.materialUiStrings.hide
import typingsJapgolly.materialUi.materialUiStrings.loading
import typingsJapgolly.materialUi.materialUiStrings.ready
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RefreshIndicator {
  
  inline def apply(left: Double, top: Double): Builder = {
    val __props = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RefreshIndicatorProps]))
  }
  
  @JSImport("material-ui", "RefreshIndicator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.RefreshIndicator] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def loadingColor(value: String): this.type = set("loadingColor", value.asInstanceOf[js.Any])
    
    inline def percentage(value: Double): this.type = set("percentage", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def status(value: ready | loading | hide): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RefreshIndicatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
