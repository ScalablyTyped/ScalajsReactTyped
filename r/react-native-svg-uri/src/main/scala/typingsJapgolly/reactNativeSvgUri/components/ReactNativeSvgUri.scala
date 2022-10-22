package typingsJapgolly.reactNativeSvgUri.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNativeSvgUri.mod.SvgUriProps
import typingsJapgolly.reactNativeSvgUri.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSvgUri {
  
  @JSImport("react-native-svg-uri", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def source(value: ImageURISource): this.type = set("source", value.asInstanceOf[js.Any])
    
    inline def svgXmlData(value: String): this.type = set("svgXmlData", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeSvgUri.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SvgUriProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
