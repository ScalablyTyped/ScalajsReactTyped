package typingsJapgolly.antDesignIconsReactNative.components

import typingsJapgolly.antDesignIconsReactNative.esFillMod.FillGlyphMapType
import typingsJapgolly.antDesignIconsReactNative.esFillMod.IconFillProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconFill {
  
  inline def apply(name: FillGlyphMapType): SharedBuilder_IconFillProps130361955[typingsJapgolly.antDesignIconsReactNative.esMod.IconFill] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconFillProps130361955[typingsJapgolly.antDesignIconsReactNative.esMod.IconFill](js.Array(this.component, __props.asInstanceOf[IconFillProps]))
  }
  
  @JSImport("@ant-design/icons-react-native/es", "IconFill")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconFillProps): SharedBuilder_IconFillProps130361955[typingsJapgolly.antDesignIconsReactNative.esMod.IconFill] = new SharedBuilder_IconFillProps130361955[typingsJapgolly.antDesignIconsReactNative.esMod.IconFill](js.Array(this.component, p.asInstanceOf[js.Any]))
}
