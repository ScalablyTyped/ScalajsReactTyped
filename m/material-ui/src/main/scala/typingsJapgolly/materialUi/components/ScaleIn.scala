package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.internalScaleInMod.ScaleInProps
import typingsJapgolly.materialUi.internalScaleInMod.default
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScaleIn {
  
  @JSImport("material-ui/internal/ScaleIn", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def childStyle(value: CSSProperties): this.type = set("childStyle", value.asInstanceOf[js.Any])
    
    inline def enterDelay(value: Double): this.type = set("enterDelay", value.asInstanceOf[js.Any])
    
    inline def maxScale(value: Double): this.type = set("maxScale", value.asInstanceOf[js.Any])
    
    inline def minScale(value: Double): this.type = set("minScale", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScaleIn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScaleInProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
