package typingsJapgolly.treat

import typingsJapgolly.treat.distDeclarationsSrcBuilderMod.MakeStyleTree
import typingsJapgolly.treat.distDeclarationsSrcBuilderMod.StyleMapParam
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.ClassRef
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.GlobalStyle
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.Style
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.StylesMap
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.ThemeRef
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.ThemedStyle
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.TreatModuleObject
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.TreatModuleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTreatDotcjsMod {
  
  @JSImport("treat/dist/treat.cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("treat/dist/treat.cjs", "createTheme")
  @js.native
  val createTheme: js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ /* tokens */ Any, 
    /* localDebugName */ js.UndefOr[String], 
    ThemeRef
  ] = js.native
  
  @JSImport("treat/dist/treat.cjs", "globalStyle")
  @js.native
  val globalStyle: js.Function2[
    /* selector */ String, 
    /* style */ ThemedStyle[
      GlobalStyle, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any
    ], 
    Unit
  ] = js.native
  
  inline def resolveClassName(themeRef: ThemeRef, classRef: ClassRef): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveClassName")(themeRef.asInstanceOf[js.Any], classRef.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveStyles(themeRef: ThemeRef, styles: js.Array[TreatModuleValue]): js.Array[TreatModuleValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyles")(themeRef.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreatModuleValue]]
  inline def resolveStyles(themeRef: ThemeRef, styles: TreatModuleObject): TreatModuleObject = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyles")(themeRef.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[TreatModuleObject]
  
  @JSImport("treat/dist/treat.cjs", "style")
  @js.native
  val style: js.Function2[
    /* style */ ThemedStyle[
      Style, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any
    ], 
    /* localDebugName */ js.UndefOr[String], 
    ClassRef
  ] = js.native
  
  inline def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName]): StylesMap[StyleName] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(stylesheet.asInstanceOf[js.Any]).asInstanceOf[StylesMap[StyleName]]
  inline def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName], localDebugName: String): StylesMap[StyleName] = (^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(stylesheet.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[StylesMap[StyleName]]
  
  inline def styleTree[ReturnType](makeStyleTree: MakeStyleTree[ReturnType]): ReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("styleTree")(makeStyleTree.asInstanceOf[js.Any]).asInstanceOf[ReturnType]
}
