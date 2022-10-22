package typingsJapgolly.reactResponsiveMasonry.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactResponsiveMasonry.mod.MasonryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactResponsiveMasonry {
  
  @JSImport("react-responsive-masonry", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columnsCount(value: Double): this.type = set("columnsCount", value.asInstanceOf[js.Any])
    
    inline def gutter(value: String): this.type = set("gutter", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactResponsiveMasonry.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MasonryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
