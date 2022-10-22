package typingsJapgolly.antDesignIconsVue

import typingsJapgolly.antDesignIconsVue.esComponentsIconFontMod.CustomIconOptions
import typingsJapgolly.antDesignIconsVue.esComponentsIconFontMod.IconFontProps
import typingsJapgolly.antDesignIconsVue.esComponentsIconMod.IconType
import typingsJapgolly.antDesignIconsVue.esComponentsTwoTonePrimaryColorMod.TwoToneColor
import typingsJapgolly.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("@ant-design/icons-vue/es", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/icons-vue/es", JSImport.Default)
  @js.native
  val default: IconType = js.native
  
  inline def createFromIconfontCN(): FunctionalComponent[IconFontProps, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromIconfontCN")().asInstanceOf[FunctionalComponent[IconFontProps, js.Object]]
  inline def createFromIconfontCN(options: CustomIconOptions): FunctionalComponent[IconFontProps, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromIconfontCN")(options.asInstanceOf[js.Any]).asInstanceOf[FunctionalComponent[IconFontProps, js.Object]]
  
  inline def getTwoToneColor(): TwoToneColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwoToneColor")().asInstanceOf[TwoToneColor]
  
  inline def setTwoToneColor(twoToneColor: TwoToneColor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTwoToneColor")(twoToneColor.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
