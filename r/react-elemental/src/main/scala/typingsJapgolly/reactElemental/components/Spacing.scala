package typingsJapgolly.reactElemental.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.mod.SpacingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spacing {
  
  @JSImport("react-elemental", "Spacing_")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def bottom(value: Boolean): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def left(value: Boolean): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def padding(value: Boolean): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def right(value: Boolean): this.type = set("right", value.asInstanceOf[js.Any])
    
    inline def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Spacing.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SpacingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
