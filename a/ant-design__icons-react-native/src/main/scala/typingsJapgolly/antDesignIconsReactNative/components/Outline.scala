package typingsJapgolly.antDesignIconsReactNative.components

import typingsJapgolly.antDesignIconsReactNative.esOutlineMod.IconOutlineProps
import typingsJapgolly.antDesignIconsReactNative.esOutlineMod.OutlineGlyphMapType
import typingsJapgolly.antDesignIconsReactNative.esOutlineMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Outline {
  
  inline def apply(name: OutlineGlyphMapType): SharedBuilder_IconOutlineProps_621363868[default] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconOutlineProps_621363868[default](js.Array(this.component, __props.asInstanceOf[IconOutlineProps]))
  }
  
  @JSImport("@ant-design/icons-react-native/es/outline", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconOutlineProps): SharedBuilder_IconOutlineProps_621363868[default] = new SharedBuilder_IconOutlineProps_621363868[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
