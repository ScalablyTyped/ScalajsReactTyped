package typingsJapgolly.treat

import typingsJapgolly.treat.distDeclarationsSrcTypesMod.ClassRef
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.GlobalStyle
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.Style
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.StyleMap
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.StylesMap
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.ThemeRef
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.ThemedStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcBuilderMod {
  
  @JSImport("treat/dist/declarations/src/builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTheme(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any
  ): ThemeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(tokens.asInstanceOf[js.Any]).asInstanceOf[ThemeRef]
  inline def createTheme(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any,
    localDebugName: String
  ): ThemeRef = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(tokens.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[ThemeRef]
  
  inline def globalStyle(
    selector: String,
    style: ThemedStyle[
      GlobalStyle, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("globalStyle")(selector.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def style(
    style: ThemedStyle[
      Style, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any
    ]
  ): ClassRef = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(style.asInstanceOf[js.Any]).asInstanceOf[ClassRef]
  inline def style(
    style: ThemedStyle[
      Style, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any
    ],
    localDebugName: String
  ): ClassRef = (^.asInstanceOf[js.Dynamic].applyDynamic("style")(style.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[ClassRef]
  
  inline def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName]): StylesMap[StyleName] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(stylesheet.asInstanceOf[js.Any]).asInstanceOf[StylesMap[StyleName]]
  inline def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName], localDebugName: String): StylesMap[StyleName] = (^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(stylesheet.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[StylesMap[StyleName]]
  
  inline def styleTree[ReturnType](makeStyleTree: MakeStyleTree[ReturnType]): ReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("styleTree")(makeStyleTree.asInstanceOf[js.Any]).asInstanceOf[ReturnType]
  
  type MakeStyleTree[ReturnType] = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ /* theme */ Any, 
    /* styleNode */ js.Function2[/* style */ Style, /* localDebugName */ js.UndefOr[String], ClassRef], 
    ReturnType
  ]
  
  type StyleMapParam[StyleName /* <: String | Double */] = ThemedStyle[
    StyleMap[StyleName, Style], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any
  ]
}
