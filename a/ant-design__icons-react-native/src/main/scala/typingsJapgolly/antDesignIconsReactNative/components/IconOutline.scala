package typingsJapgolly.antDesignIconsReactNative.components

import typingsJapgolly.antDesignIconsReactNative.esOutlineMod.IconOutlineProps
import typingsJapgolly.antDesignIconsReactNative.esOutlineMod.OutlineGlyphMapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconOutline {
  
  inline def apply(name: OutlineGlyphMapType): SharedBuilder_IconOutlineProps_621363868[typingsJapgolly.antDesignIconsReactNative.esMod.IconOutline] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconOutlineProps_621363868[typingsJapgolly.antDesignIconsReactNative.esMod.IconOutline](js.Array(this.component, __props.asInstanceOf[IconOutlineProps]))
  }
  
  @JSImport("@ant-design/icons-react-native/es", "IconOutline")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconOutlineProps): SharedBuilder_IconOutlineProps_621363868[typingsJapgolly.antDesignIconsReactNative.esMod.IconOutline] = new SharedBuilder_IconOutlineProps_621363868[typingsJapgolly.antDesignIconsReactNative.esMod.IconOutline](js.Array(this.component, p.asInstanceOf[js.Any]))
}
