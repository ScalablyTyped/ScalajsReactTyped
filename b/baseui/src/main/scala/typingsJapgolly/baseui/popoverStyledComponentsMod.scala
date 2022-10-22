package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.ArrowStylePropsArgthemeTh
import typingsJapgolly.baseui.anon.BodyStylePropsArgthemeThe
import typingsJapgolly.baseui.anon.ThemeTheme
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.popoverTypesMod.ArrowStylePropsArg
import typingsJapgolly.baseui.popoverTypesMod.BodyStylePropsArg
import typingsJapgolly.baseui.popoverTypesMod.InnerStylePropsArg
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverStyledComponentsMod {
  
  @JSImport("baseui/popover/styled-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/popover/styled-components", "Arrow")
  @js.native
  val Arrow: StyletronComponent[div, ArrowStylePropsArg] = js.native
  
  @JSImport("baseui/popover/styled-components", "Body")
  @js.native
  val Body: StyletronComponent[div, BodyStylePropsArg] = js.native
  
  @JSImport("baseui/popover/styled-components", "Hidden")
  @js.native
  val Hidden: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/popover/styled-components", "Inner")
  @js.native
  val Inner: StyletronComponent[div, InnerStylePropsArg] = js.native
  
  @JSImport("baseui/popover/styled-components", "Padding")
  @js.native
  val Padding: StyletronComponent[div, js.Object] = js.native
  
  inline def getArrowStyles(props: ArrowStylePropsArgthemeTh): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getArrowStyles")(props.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  
  inline def getBodyStyles(props: BodyStylePropsArgthemeThe): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getBodyStyles")(props.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  
  inline def getInnerStyles(has$theme: ThemeTheme): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getInnerStyles")(has$theme.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
}
