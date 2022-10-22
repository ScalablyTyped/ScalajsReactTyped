package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.internalSlideInMod.SlideInProps
import typingsJapgolly.materialUi.internalSlideInMod.default
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SlideIn {
  
  @JSImport("material-ui/internal/SlideIn", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def childStyle(value: CSSProperties): this.type = set("childStyle", value.asInstanceOf[js.Any])
    
    inline def direction(value: typingsJapgolly.materialUi.MaterialUI.propTypes.direction): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def enterDelay(value: Double): this.type = set("enterDelay", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SlideIn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SlideInProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
