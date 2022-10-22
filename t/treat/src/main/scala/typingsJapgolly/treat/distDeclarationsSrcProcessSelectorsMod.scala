package typingsJapgolly.treat

import typingsJapgolly.treat.distDeclarationsSrcTypesMod.ClassRef
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.Style
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.ThemeRef
import typingsJapgolly.treat.distDeclarationsSrcTypesMod.TreatTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcProcessSelectorsMod {
  
  @JSImport("treat/dist/declarations/src/processSelectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addLocalClassRef(classRef: ClassRef): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("addLocalClassRef")(classRef.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def combinedThemeSelector(
    selector: String,
    themes: js.Array[
      TreatTheme[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any
      ]
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("combinedThemeSelector")(selector.asInstanceOf[js.Any], themes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def interpolateSelector(selector: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def interpolateSelector(selector: String, themeRef: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateSelector")(selector.asInstanceOf[js.Any], themeRef.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isThemedSelector(selector: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThemedSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def processSelectors(hasStyleThemeRefThemes: ProcessSelectorsParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("processSelectors")(hasStyleThemeRefThemes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ProcessSelectorsParams extends StObject {
    
    var style: Style
    
    var themeRef: js.UndefOr[ThemeRef] = js.undefined
    
    var themes: js.Array[
        TreatTheme[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any
        ]
      ]
  }
  object ProcessSelectorsParams {
    
    inline def apply(
      style: Style,
      themes: js.Array[
          TreatTheme[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any
          ]
        ]
    ): ProcessSelectorsParams = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessSelectorsParams]
    }
    
    extension [Self <: ProcessSelectorsParams](x: Self) {
      
      inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setThemeRef(value: ThemeRef): Self = StObject.set(x, "themeRef", value.asInstanceOf[js.Any])
      
      inline def setThemeRefUndefined: Self = StObject.set(x, "themeRef", js.undefined)
      
      inline def setThemes(
        value: js.Array[
              TreatTheme[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any
              ]
            ]
      ): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
      
      inline def setThemesVarargs(
        value: (TreatTheme[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any
            ])*
      ): Self = StObject.set(x, "themes", js.Array(value*))
    }
  }
}
