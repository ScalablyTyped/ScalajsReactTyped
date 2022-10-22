package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltStrings.around
import typingsJapgolly.gestalt.gestaltStrings.auto
import typingsJapgolly.gestalt.gestaltStrings.baseline
import typingsJapgolly.gestalt.gestaltStrings.between
import typingsJapgolly.gestalt.gestaltStrings.center
import typingsJapgolly.gestalt.gestaltStrings.end
import typingsJapgolly.gestalt.gestaltStrings.evenly
import typingsJapgolly.gestalt.gestaltStrings.grow
import typingsJapgolly.gestalt.gestaltStrings.none
import typingsJapgolly.gestalt.gestaltStrings.shrink
import typingsJapgolly.gestalt.gestaltStrings.start
import typingsJapgolly.gestalt.gestaltStrings.stretch
import typingsJapgolly.gestalt.mod.RowProps
import typingsJapgolly.gestalt.mod.UnsignedUpTo12
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Row {
  
  @JSImport("gestalt", "Row")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def alignContent(value: start | end | center | between | around | evenly | stretch): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    inline def alignItems(value: start | end | center | baseline | stretch): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: auto | start | end | center | baseline | stretch): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def fit(value: Boolean): this.type = set("fit", value.asInstanceOf[js.Any])
    
    inline def flex(value: grow | shrink | none): this.type = set("flex", value.asInstanceOf[js.Any])
    
    inline def gap(value: UnsignedUpTo12): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def justifyContent(value: start | end | center | between | around | evenly): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double | String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: Double | String): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minHeight(value: Double | String): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: Double | String): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Row.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
