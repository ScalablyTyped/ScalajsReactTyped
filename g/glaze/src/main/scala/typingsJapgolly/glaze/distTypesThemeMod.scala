package typingsJapgolly.glaze

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.glaze.anon.AnimationDelay
import typingsJapgolly.glaze.anon.Bg
import typingsJapgolly.glaze.anon.Border
import typingsJapgolly.glaze.anon.BorderWidth
import typingsJapgolly.glaze.anon.Inset
import typingsJapgolly.glaze.anon.propertyinkeyofCSSPropert
import typingsJapgolly.glaze.glazeInts.`1024`
import typingsJapgolly.glaze.glazeInts.`1280`
import typingsJapgolly.glaze.glazeInts.`640`
import typingsJapgolly.glaze.glazeInts.`768`
import typingsJapgolly.glaze.glazeStrings.hack
import typingsJapgolly.glaze.glazeStrings.shorthands
import typingsJapgolly.std.Extract
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThemeMod {
  
  @JSImport("glaze/dist-types/theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTheme(
    tokens: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any) & StaticTheme
  ): RuntimeTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(tokens.asInstanceOf[js.Any]).asInstanceOf[RuntimeTheme]
  inline def createTheme(
    tokens: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any) & StaticTheme,
    localDebugName: String
  ): RuntimeTheme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(tokens.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[RuntimeTheme]
  
  object defaultTokens {
    
    @JSImport("glaze/dist-types/theme", "defaultTokens.aliases")
    @js.native
    val aliases: Bg = js.native
    
    @JSImport("glaze/dist-types/theme", "defaultTokens.breakpoints")
    @js.native
    val breakpoints: js.Tuple4[`640`, `768`, `1024`, `1280`] = js.native
    
    @JSImport("glaze/dist-types/theme", "defaultTokens.matchers")
    @js.native
    val matchers: AnimationDelay = js.native
    
    @JSImport("glaze/dist-types/theme", "defaultTokens.scales")
    @js.native
    val scales: Border = js.native
    
    @JSImport("glaze/dist-types/theme", "defaultTokens.shorthands")
    @js.native
    val shorthands: Inset = js.native
  }
  
  trait CommonTheme extends StObject {
    
    var aliases: StringDictionary[hack | Tokens[shorthands]]
    
    var breakpoints: js.Array[Double]
    
    var shorthands: StringDictionary[js.Array[hack]]
  }
  object CommonTheme {
    
    inline def apply(
      aliases: StringDictionary[hack | Tokens[shorthands]],
      breakpoints: js.Array[Double],
      shorthands: StringDictionary[js.Array[hack]]
    ): CommonTheme = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonTheme]
    }
    
    extension [Self <: CommonTheme](x: Self) {
      
      inline def setAliases(value: StringDictionary[hack | Tokens[shorthands]]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setBreakpoints(value: js.Array[Double]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsVarargs(value: Double*): Self = StObject.set(x, "breakpoints", js.Array(value*))
      
      inline def setShorthands(value: StringDictionary[js.Array[hack]]): Self = StObject.set(x, "shorthands", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuntimeTheme
    extends StObject
       with CommonTheme {
    
    var ref: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeRef */ Any
  }
  object RuntimeTheme {
    
    inline def apply(
      aliases: StringDictionary[hack | Tokens[shorthands]],
      breakpoints: js.Array[Double],
      ref: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeRef */ Any,
      shorthands: StringDictionary[js.Array[hack]]
    ): RuntimeTheme = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeTheme]
    }
    
    extension [Self <: RuntimeTheme](x: Self) {
      
      inline def setRef(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeRef */ Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  type ScaleTokens[T /* <: hack */] = StringDictionary[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties[T] */ js.Any
    ]
  ]
  
  trait StaticTheme
    extends StObject
       with CommonTheme {
    
    var matchers: propertyinkeyofCSSPropert
    
    var scales: BorderWidth
  }
  object StaticTheme {
    
    inline def apply(
      aliases: StringDictionary[hack | Tokens[shorthands]],
      breakpoints: js.Array[Double],
      matchers: propertyinkeyofCSSPropert,
      scales: BorderWidth,
      shorthands: StringDictionary[js.Array[hack]]
    ): StaticTheme = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], matchers = matchers.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticTheme]
    }
    
    extension [Self <: StaticTheme](x: Self) {
      
      inline def setMatchers(value: propertyinkeyofCSSPropert): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      inline def setScales(value: BorderWidth): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    }
  }
  
  type Tokens[T /* <: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any */ String */] = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any[T] */ js.Any, 
    String | Double
  ]
}
