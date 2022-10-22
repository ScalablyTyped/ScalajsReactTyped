package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.large
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.small
import typingsJapgolly.antdMobileRn.libActivityIndicatorIndexDotnativeMod.ActivityIndicatorNativeProps
import typingsJapgolly.antdMobileRn.libActivityIndicatorStyleIndexDotnativeMod.IActivityIndicatorStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActivityIndicator {
  
  @JSImport("antd-mobile-rn", "ActivityIndicator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.ActivityIndicator] {
    
    inline def animating(value: Boolean): this.type = set("animating", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def size(value: large | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def styles(value: IActivityIndicatorStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def toast(value: Boolean): this.type = set("toast", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ActivityIndicator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ActivityIndicatorNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
