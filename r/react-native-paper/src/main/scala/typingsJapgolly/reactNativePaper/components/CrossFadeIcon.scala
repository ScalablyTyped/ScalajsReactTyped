package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativePaper.anon.DeepPartialTheme
import typingsJapgolly.reactNativePaper.anon.PickPropssourcecolorsizet
import typingsJapgolly.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CrossFadeIcon {
  
  inline def apply(color: String, size: Double, source: IconSource): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickPropssourcecolorsizet]))
  }
  
  @JSImport("react-native-paper/lib/typescript/components/CrossFadeIcon", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def theme(value: DeepPartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropssourcecolorsizet): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
