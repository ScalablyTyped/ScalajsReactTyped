package typingsJapgolly.antDesignIcons

import typingsJapgolly.antDesignIcons.anon.PickIconComponentPropsmax
import typingsJapgolly.antDesignIcons.esComponentsContextMod.IconContextProps
import typingsJapgolly.antDesignIcons.esComponentsIconFontMod.CustomIconOptions
import typingsJapgolly.antDesignIcons.esComponentsIconFontMod.IconFontProps
import typingsJapgolly.antDesignIcons.esComponentsTwoTonePrimaryColorMod.TwoToneColor
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("@ant-design/icons/es", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/icons/es", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PickIconComponentPropsmax] = js.native
  
  @JSImport("@ant-design/icons/es", "IconProvider")
  @js.native
  val IconProvider: Provider[IconContextProps] = js.native
  
  inline def createFromIconfontCN[T /* <: String */](): FC[IconFontProps[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromIconfontCN")().asInstanceOf[FC[IconFontProps[T]]]
  inline def createFromIconfontCN[T /* <: String */](options: CustomIconOptions): FC[IconFontProps[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromIconfontCN")(options.asInstanceOf[js.Any]).asInstanceOf[FC[IconFontProps[T]]]
  
  inline def getTwoToneColor(): TwoToneColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwoToneColor")().asInstanceOf[TwoToneColor]
  
  inline def setTwoToneColor(twoToneColor: TwoToneColor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTwoToneColor")(twoToneColor.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
