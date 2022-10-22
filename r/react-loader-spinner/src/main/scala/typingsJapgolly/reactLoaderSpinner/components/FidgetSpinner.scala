package typingsJapgolly.reactLoaderSpinner.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactLoaderSpinner.distLoaderFidgetSpinnerMod.FidgetSpinnerProps
import typingsJapgolly.reactLoaderSpinner.distTypeMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FidgetSpinner {
  
  @JSImport("react-loader-spinner", "FidgetSpinner")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def ballColors(value: js.Tuple3[String, String, String]): this.type = set("ballColors", value.asInstanceOf[js.Any])
    
    inline def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wrapperClass(value: String): this.type = set("wrapperClass", value.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: Style): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FidgetSpinner.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FidgetSpinnerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
