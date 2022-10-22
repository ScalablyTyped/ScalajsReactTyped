package typingsJapgolly.reactResponsiveMasonry.components

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactResponsiveMasonry.mod.ResponsiveMasonryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveMasonry {
  
  @JSImport("react-responsive-masonry", "ResponsiveMasonry")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columnsCountBreakPoints(value: NumberDictionary[Double]): this.type = set("columnsCountBreakPoints", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ResponsiveMasonry.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ResponsiveMasonryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
