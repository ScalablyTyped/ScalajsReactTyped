package typingsJapgolly.antDesignIconsReactNative.components

import typingsJapgolly.antDesignIconsReactNative.esFillMod.FillGlyphMapType
import typingsJapgolly.antDesignIconsReactNative.esFillMod.IconFillProps
import typingsJapgolly.antDesignIconsReactNative.esFillMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fill {
  
  inline def apply(name: FillGlyphMapType): SharedBuilder_IconFillProps130361955[default] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconFillProps130361955[default](js.Array(this.component, __props.asInstanceOf[IconFillProps]))
  }
  
  @JSImport("@ant-design/icons-react-native/es/fill", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconFillProps): SharedBuilder_IconFillProps130361955[default] = new SharedBuilder_IconFillProps130361955[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
