package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.baseui.stylesStyledMod.StyleFn
import typingsJapgolly.baseui.stylesStyledMod.UseStyletronFn
import typingsJapgolly.baseui.stylesStyledMod.WithStyleFn
import typingsJapgolly.baseui.stylesThemeProviderMod.ThemeProviderProps
import typingsJapgolly.baseui.stylesTypesMod.Theme
import typingsJapgolly.baseui.themesTypesMod.Border
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.FC
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("baseui/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/styles", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[Theme] = js.native
  
  @JSImport("baseui/styles", "ThemeProvider")
  @js.native
  val ThemeProvider: FC[ThemeProviderProps] = js.native
  
  inline def createThemedStyled[Theme](): StyleFn[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createThemedStyled")().asInstanceOf[StyleFn[Theme]]
  
  inline def createThemedUseStyletron[Theme](): UseStyletronFn[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createThemedUseStyletron")().asInstanceOf[UseStyletronFn[Theme]]
  
  inline def createThemedWithStyle[Theme](): WithStyleFn[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createThemedWithStyle")().asInstanceOf[WithStyleFn[Theme]]
  
  inline def expandBorderStyles(borderStyles: Border): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("expandBorderStyles")(borderStyles.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  
  inline def hexToRgb(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")().asInstanceOf[String]
  inline def hexToRgb(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexToRgb(hex: String, alpha: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexToRgb(hex: Unit, alpha: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("baseui/styles", "styled")
  @js.native
  val styled: StyleFn[Theme] = js.native
  
  @JSImport("baseui/styles", "useStyletron")
  @js.native
  val useStyletron: UseStyletronFn[Theme] = js.native
  
  @JSImport("baseui/styles", "withStyle")
  @js.native
  val withStyle: WithStyleFn[Theme] = js.native
  
  inline def withWrapper[C /* <: StyletronComponent[Any, Any] */, Props](
    StyledElement: C,
    wrapperFn: js.Function1[
      /* component */ C, 
      js.Function1[
        /* props */ Props & (/* import warning: importer.ImportType#apply Failed type conversion: C extends styletron-react.styletron-react/lib/types.StyletronComponent<any, infer CP> ? CP : never */ js.Any), 
        Element
      ]
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: C extends styletron-react.styletron-react/lib/types.StyletronComponent<infer D, infer P> ? styletron-react.styletron-react/lib/types.StyletronComponent<D, P & Props> : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("withWrapper")(StyledElement.asInstanceOf[js.Any], wrapperFn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends styletron-react.styletron-react/lib/types.StyletronComponent<infer D, infer P> ? styletron-react.styletron-react/lib/types.StyletronComponent<D, P & Props> : never */ js.Any]
}
