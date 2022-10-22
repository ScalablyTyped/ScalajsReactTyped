package typingsJapgolly.glaze

import typingsJapgolly.glaze.distTypesThemeMod.Tokens
import typingsJapgolly.glaze.glazeStrings.aliases
import typingsJapgolly.glaze.glazeStrings.hack
import typingsJapgolly.glaze.glazeStrings.shorthands
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Extract
import typingsJapgolly.typeFest.sourceLiteralUnionMod.LiteralUnion
import typingsJapgolly.typeFest.sourceValueOfMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUseStylingMod {
  
  @JSImport("glaze/dist-types/useStyling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyling(): js.Function1[/* themedStyle */ ThemedStyle, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyling")().asInstanceOf[js.Function1[/* themedStyle */ ThemedStyle, String]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['aliases'][T] extends glaze.glaze/dist-types/theme.Tokens<'shorthands'> ? glaze.glaze/dist-types/useStyling.ResolveShorthand</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['aliases'][T]> : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['aliases'][T]
    }}}
    */
  @js.native
  trait ResolveAlias[T /* <: Tokens[aliases] */] extends StObject
  
  type ResolveShorthand[T /* <: Tokens[shorthands] */] = ValueOf[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['shorthands'][T] */ js.Any, 
    Double
  ]
  
  type ScaleKeys[Property] = LiteralUnion[
    Extract[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['scales'][/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['matchers'][std.Extract<Property, glaze.glaze/dist-types/theme.Tokens<'matchers'>>]] */ js.Any, 
      ValueOf[CSSProperties, hack]
    ], 
    ValueOf[CSSProperties, hack]
  ]
  
  type ThemedStyle = CSSProperties & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in glaze.glaze/dist-types/theme.Tokens<'matchers'> ]:? glaze.glaze/dist-types/useStyling.ScaleKeys<key>} */ js.Any)
}
