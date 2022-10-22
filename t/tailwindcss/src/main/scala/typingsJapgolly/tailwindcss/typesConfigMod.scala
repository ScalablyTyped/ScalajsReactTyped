package typingsJapgolly.tailwindcss

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.tailwindcss.anon.Extract
import typingsJapgolly.tailwindcss.anon.Handler
import typingsJapgolly.tailwindcss.anon.IsOptionsFunction
import typingsJapgolly.tailwindcss.anon.PartialPluginsConfig
import typingsJapgolly.tailwindcss.anon.PartialPluginsConfigAt
import typingsJapgolly.tailwindcss.anon.PartialPresetsConfig
import typingsJapgolly.tailwindcss.anon.PartialPresetsConfigAt
import typingsJapgolly.tailwindcss.anon.PartialRecordCorePluginLi
import typingsJapgolly.tailwindcss.anon.PartialRecordExperimental
import typingsJapgolly.tailwindcss.anon.PartialThemeConfigextendP
import typingsJapgolly.tailwindcss.anon.PartiallineHeightstringle
import typingsJapgolly.tailwindcss.anon.PartialopacityVariablestr
import typingsJapgolly.tailwindcss.anon.PartialrespectPrefixboole
import typingsJapgolly.tailwindcss.anon.PartialscreensScreensConf
import typingsJapgolly.tailwindcss.anon.Pattern
import typingsJapgolly.tailwindcss.anon.RespectImportant
import typingsJapgolly.tailwindcss.tailwindcssStrings.`class`
import typingsJapgolly.tailwindcss.tailwindcssStrings.all
import typingsJapgolly.tailwindcss.tailwindcssStrings.optimizeUniversalDefaults
import typingsJapgolly.tailwindcss.typesGeneratedColorsMod.DefaultColors
import typingsJapgolly.tailwindcss.typesGeneratedCorePluginListMod.CorePluginList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConfigMod {
  
  type CSSRuleObject = RecursiveKeyValuePair[String, String | js.Array[String]]
  
  /* Inlined tailwindcss.tailwindcss/types/config.RequiredConfig & std.Partial<tailwindcss.tailwindcss/types/config.OptionalConfig> */
  trait Config extends StObject {
    
    var content: ContentConfig
    
    var corePlugins: js.UndefOr[Partial[CorePluginsConfig]] = js.undefined
    
    var darkMode: js.UndefOr[Partial[DarkModeConfig]] = js.undefined
    
    var experimental: js.UndefOr[Partial[ExperimentalConfig]] = js.undefined
    
    var future: js.UndefOr[Partial[FutureConfig]] = js.undefined
    
    var important: js.UndefOr[Partial[ImportantConfig]] = js.undefined
    
    var plugins: js.UndefOr[PartialPluginsConfig] = js.undefined
    
    var prefix: js.UndefOr[Partial[PrefixConfig]] = js.undefined
    
    var presets: js.UndefOr[PartialPresetsConfig] = js.undefined
    
    var safelist: js.UndefOr[Partial[SafelistConfig]] = js.undefined
    
    var separator: js.UndefOr[Partial[SeparatorConfig]] = js.undefined
    
    var theme: js.UndefOr[PartialThemeConfigextendP] = js.undefined
  }
  object Config {
    
    inline def apply(content: ContentConfig): Config = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setContent(value: ContentConfig): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: (FilePath | RawFile)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setCorePlugins(value: Partial[CorePluginsConfig]): Self = StObject.set(x, "corePlugins", value.asInstanceOf[js.Any])
      
      inline def setCorePluginsUndefined: Self = StObject.set(x, "corePlugins", js.undefined)
      
      inline def setCorePluginsVarargs(value: CorePluginList*): Self = StObject.set(x, "corePlugins", js.Array(value*))
      
      inline def setDarkMode(value: Partial[DarkModeConfig]): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
      
      inline def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
      
      inline def setExperimental(value: Partial[ExperimentalConfig]): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
      
      inline def setExperimentalVarargs(value: Any*): Self = StObject.set(x, "experimental", js.Array(value*))
      
      inline def setFuture(value: Partial[FutureConfig]): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setFutureUndefined: Self = StObject.set(x, "future", js.undefined)
      
      inline def setFutureVarargs(value: Any*): Self = StObject.set(x, "future", js.Array(value*))
      
      inline def setImportant(value: Partial[ImportantConfig]): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      inline def setPlugins(value: PartialPluginsConfig): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPrefix(value: Partial[PrefixConfig]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPresets(value: PartialPresetsConfig): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setSafelist(value: Partial[SafelistConfig]): Self = StObject.set(x, "safelist", value.asInstanceOf[js.Any])
      
      inline def setSafelistUndefined: Self = StObject.set(x, "safelist", js.undefined)
      
      inline def setSafelistVarargs(value: (Pattern | String)*): Self = StObject.set(x, "safelist", js.Array(value*))
      
      inline def setSeparator(value: Partial[SeparatorConfig]): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setTheme(value: PartialThemeConfigextendP): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type ContentConfig = (js.Array[FilePath | RawFile]) | Extract
  
  // Core plugins related config
  type CorePluginsConfig = js.Array[CorePluginList] | Expand[PartialRecordCorePluginLi]
  
  // DarkMode related config
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tailwindcss.tailwindcssStrings.media
    - typingsJapgolly.tailwindcss.tailwindcssStrings.`class`
    - js.Tuple2[typingsJapgolly.tailwindcss.tailwindcssStrings.`class`, java.lang.String]
  */
  type DarkModeConfig = _DarkModeConfig | (js.Tuple2[`class`, String])
  
  // Helpers
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends object ? T extends infer O ? {[ K in keyof O ]: tailwindcss.tailwindcss/types/config.Expand<O[K]>} : never : T
    }}}
    */
  @js.native
  trait Expand[T] extends StObject
  
  // Replace with 'experimental-feature-1' | 'experimental-feature-2'
  type ExperimentalConfig = (Expand[all | PartialRecordExperimental]) | js.Array[Any]
  
  // Experimental related config
  type ExperimentalConfigValues = optimizeUniversalDefaults
  
  type ExtractorFn = js.Function1[/* content */ String, js.Array[String]]
  
  // Content related config
  type FilePath = String
  
  // Replace with 'future-feature-1' | 'future-feature-2'
  type FutureConfig = (Expand[all | (Partial[Record[FutureConfigValues, Boolean]])]) | js.Array[Any]
  
  // Future related config
  type FutureConfigValues = scala.Nothing
  
  // Important related config
  type ImportantConfig = Boolean | String
  
  type KeyValuePair[K /* <: /* keyof any */ String */, V] = Record[K, V]
  
  trait OptionalConfig
    extends StObject
       with // Custom
  /* key */ StringDictionary[Any] {
    
    var corePlugins: Partial[CorePluginsConfig]
    
    var darkMode: Partial[DarkModeConfig]
    
    var experimental: Partial[ExperimentalConfig]
    
    var future: Partial[FutureConfig]
    
    var important: Partial[ImportantConfig]
    
    var plugins: PartialPluginsConfigAt
    
    var prefix: Partial[PrefixConfig]
    
    var presets: PartialPresetsConfigAt
    
    var safelist: Partial[SafelistConfig]
    
    var separator: Partial[SeparatorConfig]
    
    var theme: PartialThemeConfigextendP
  }
  object OptionalConfig {
    
    inline def apply(
      corePlugins: Partial[CorePluginsConfig],
      darkMode: Partial[DarkModeConfig],
      experimental: Partial[ExperimentalConfig],
      future: Partial[FutureConfig],
      important: Partial[ImportantConfig],
      plugins: PartialPluginsConfigAt,
      prefix: Partial[PrefixConfig],
      presets: PartialPresetsConfigAt,
      safelist: Partial[SafelistConfig],
      separator: Partial[SeparatorConfig],
      theme: PartialThemeConfigextendP
    ): OptionalConfig = {
      val __obj = js.Dynamic.literal(corePlugins = corePlugins.asInstanceOf[js.Any], darkMode = darkMode.asInstanceOf[js.Any], experimental = experimental.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], important = important.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], presets = presets.asInstanceOf[js.Any], safelist = safelist.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionalConfig]
    }
    
    extension [Self <: OptionalConfig](x: Self) {
      
      inline def setCorePlugins(value: Partial[CorePluginsConfig]): Self = StObject.set(x, "corePlugins", value.asInstanceOf[js.Any])
      
      inline def setCorePluginsVarargs(value: CorePluginList*): Self = StObject.set(x, "corePlugins", js.Array(value*))
      
      inline def setDarkMode(value: Partial[DarkModeConfig]): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
      
      inline def setExperimental(value: Partial[ExperimentalConfig]): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setExperimentalVarargs(value: Any*): Self = StObject.set(x, "experimental", js.Array(value*))
      
      inline def setFuture(value: Partial[FutureConfig]): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setFutureVarargs(value: Any*): Self = StObject.set(x, "future", js.Array(value*))
      
      inline def setImportant(value: Partial[ImportantConfig]): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: PartialPluginsConfigAt): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: Partial[PrefixConfig]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPresets(value: PartialPresetsConfigAt): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setSafelist(value: Partial[SafelistConfig]): Self = StObject.set(x, "safelist", value.asInstanceOf[js.Any])
      
      inline def setSafelistVarargs(value: (Pattern | String)*): Self = StObject.set(x, "safelist", js.Array(value*))
      
      inline def setSeparator(value: Partial[SeparatorConfig]): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: PartialThemeConfigextendP): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PluginAPI extends StObject {
    
    def addBase(base: js.Array[CSSRuleObject]): Unit = js.native
    // for registering new base styles
    def addBase(base: CSSRuleObject): Unit = js.native
    
    def addComponents(components: js.Array[CSSRuleObject]): Unit = js.native
    def addComponents(components: js.Array[CSSRuleObject], options: PartialrespectPrefixboole): Unit = js.native
    // for registering new static component styles
    def addComponents(components: CSSRuleObject): Unit = js.native
    def addComponents(components: CSSRuleObject, options: PartialrespectPrefixboole): Unit = js.native
    
    def addUtilities(utilities: js.Array[CSSRuleObject]): Unit = js.native
    def addUtilities(utilities: js.Array[CSSRuleObject], options: PartialrespectPrefixboole): Unit = js.native
    // for registering new static utility styles
    def addUtilities(utilities: CSSRuleObject): Unit = js.native
    def addUtilities(utilities: CSSRuleObject, options: PartialrespectPrefixboole): Unit = js.native
    
    // for registering custom variants
    def addVariant(name: String, definition: String): Unit = js.native
    def addVariant(name: String, definition: js.Array[js.Function0[String] | String]): Unit = js.native
    def addVariant(name: String, definition: js.Function0[String]): Unit = js.native
    
    // for looking up values in the user’s Tailwind configuration
    def config[TDefaultValue](): TDefaultValue = js.native
    def config[TDefaultValue](path: String): TDefaultValue = js.native
    def config[TDefaultValue](path: String, defaultValue: TDefaultValue): TDefaultValue = js.native
    def config[TDefaultValue](path: Unit, defaultValue: TDefaultValue): TDefaultValue = js.native
    
    // for checking if a core plugin is enabled
    def corePlugins(path: String): Boolean = js.native
    
    // for manually escaping strings meant to be used in class names
    def e(className: String): String = js.native
    
    // for registering new dynamic component styles
    def matchComponents[T](components: KeyValuePair[String, js.Function1[/* value */ T, CSSRuleObject]]): Unit = js.native
    def matchComponents[T](
      components: KeyValuePair[String, js.Function1[/* value */ T, CSSRuleObject]],
      options: Partial[RespectImportant[T]]
    ): Unit = js.native
    
    // for registering new dynamic utility styles
    def matchUtilities[T](utilities: KeyValuePair[String, js.Function1[/* value */ T, CSSRuleObject]]): Unit = js.native
    def matchUtilities[T](
      utilities: KeyValuePair[String, js.Function1[/* value */ T, CSSRuleObject]],
      options: Partial[RespectImportant[T]]
    ): Unit = js.native
    
    // for looking up values in the user’s theme configuration
    def theme[TDefaultValue](): TDefaultValue = js.native
    def theme[TDefaultValue](path: String): TDefaultValue = js.native
    def theme[TDefaultValue](path: String, defaultValue: TDefaultValue): TDefaultValue = js.native
    def theme[TDefaultValue](path: Unit, defaultValue: TDefaultValue): TDefaultValue = js.native
  }
  
  type PluginCreator = js.Function1[/* api */ PluginAPI, Unit]
  
  @js.native
  trait PluginUtils extends StObject {
    
    def breakpoints[I, O](arg: I): O = js.native
    
    var colors: DefaultColors = js.native
    
    def hsl(arg: String): js.Function1[/* arg */ PartialopacityVariablestr, String] = js.native
    
    def rgb(arg: String): js.Function1[/* arg */ PartialopacityVariablestr, String] = js.native
    
    def theme(path: String): Any = js.native
    def theme(path: String, defaultValue: Any): Any = js.native
  }
  
  type PluginsConfig = js.Array[PluginCreator | Handler | IsOptionsFunction]
  
  // Prefix related config
  type PrefixConfig = String
  
  // Presets related config
  type PresetsConfig = js.Array[Config]
  
  trait RawFile extends StObject {
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var raw: String
  }
  object RawFile {
    
    inline def apply(raw: String): RawFile = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawFile]
    }
    
    extension [Self <: RawFile](x: Self) {
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecursiveKeyValuePair[K /* <: /* keyof any */ String */, V]
    extends StObject
       with /* key */ StringDictionary[V | (RecursiveKeyValuePair[K, V])]
  object RecursiveKeyValuePair {
    
    inline def apply[K /* <: /* keyof any */ String */, V](): RecursiveKeyValuePair[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecursiveKeyValuePair[K, V]]
    }
  }
  
  // Top level config related
  trait RequiredConfig extends StObject {
    
    var content: ContentConfig
  }
  object RequiredConfig {
    
    inline def apply(content: ContentConfig): RequiredConfig = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredConfig]
    }
    
    extension [Self <: RequiredConfig](x: Self) {
      
      inline def setContent(value: ContentConfig): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: (FilePath | RawFile)*): Self = StObject.set(x, "content", js.Array(value*))
    }
  }
  
  type ResolvableTo[T] = T | (js.Function1[/* utils */ PluginUtils, T])
  
  // Safelist related config
  type SafelistConfig = js.Array[Pattern | String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tailwindcss.anon.Raw
    - typingsJapgolly.tailwindcss.anon.Min
    - typingsJapgolly.tailwindcss.anon.Max
    - typingsJapgolly.tailwindcss.anon.MaxMin
  */
  trait Screen extends StObject
  object Screen {
    
    inline def Max(max: String): typingsJapgolly.tailwindcss.anon.Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.tailwindcss.anon.Max]
    }
    
    inline def MaxMin(max: String, min: String): typingsJapgolly.tailwindcss.anon.MaxMin = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.tailwindcss.anon.MaxMin]
    }
    
    inline def Min(min: String): typingsJapgolly.tailwindcss.anon.Min = {
      val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.tailwindcss.anon.Min]
    }
    
    inline def Raw(raw: String): typingsJapgolly.tailwindcss.anon.Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.tailwindcss.anon.Raw]
    }
  }
  
  type ScreensConfig = js.Array[String] | (KeyValuePair[String, String | Screen | js.Array[Screen]])
  
  // Separator related config
  type SeparatorConfig = String
  
  // Theme related config
  trait ThemeConfig
    extends StObject
       with // Custom
  /* key */ StringDictionary[Any] {
    
    var accentColor: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var animation: ResolvableTo[KeyValuePair[String, String]]
    
    var aspectRatio: ResolvableTo[KeyValuePair[String, String]]
    
    var backdropBlur: ResolvableTo[KeyValuePair[String, String]]
    
    var backdropBrightness: ResolvableTo[KeyValuePair[String, String]]
    
    var backdropContrast: ResolvableTo[KeyValuePair[String, String]]
    
    var backdropGrayscale: ResolvableTo[KeyValuePair[String, String]]
    
    var backdropHueRotate: ResolvableTo[KeyValuePair[String, String]]
    
    var backdropInvert: ResolvableTo[KeyValuePair[String, String]]
    
    var backdropOpacity: ResolvableTo[KeyValuePair[String, String]]
    
    var backdropSaturate: ResolvableTo[KeyValuePair[String, String]]
    
    var backdropSepia: ResolvableTo[KeyValuePair[String, String]]
    
    var backgroundColor: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var backgroundImage: ResolvableTo[KeyValuePair[String, String]]
    
    var backgroundOpacity: ResolvableTo[KeyValuePair[String, String]]
    
    var backgroundPosition: ResolvableTo[KeyValuePair[String, String]]
    
    var backgroundSize: ResolvableTo[KeyValuePair[String, String]]
    
    var blur: ResolvableTo[KeyValuePair[String, String]]
    
    var borderColor: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var borderOpacity: ResolvableTo[KeyValuePair[String, String]]
    
    var borderRadius: ResolvableTo[KeyValuePair[String, String]]
    
    var borderSpacing: ResolvableTo[KeyValuePair[String, String]]
    
    var borderWidth: ResolvableTo[KeyValuePair[String, String]]
    
    var boxShadow: ResolvableTo[KeyValuePair[String, String]]
    
    var boxShadowColor: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var brightness: ResolvableTo[KeyValuePair[String, String]]
    
    var caretColor: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    // Reusable base configs
    var colors: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var columns: ResolvableTo[KeyValuePair[String, String]]
    
    // Components
    var container: ResolvableTo[PartialscreensScreensConf]
    
    var content: ResolvableTo[KeyValuePair[String, String]]
    
    var contrast: ResolvableTo[KeyValuePair[String, String]]
    
    var cursor: ResolvableTo[KeyValuePair[String, String]]
    
    var divideColor: /* import warning: importer.ImportType#apply Failed type conversion: tailwindcss.tailwindcss/types/config.ThemeConfig['colors'] */ js.Any
    
    var divideOpacity: /* import warning: importer.ImportType#apply Failed type conversion: tailwindcss.tailwindcss/types/config.ThemeConfig['opacity'] */ js.Any
    
    var divideWidth: ResolvableTo[KeyValuePair[String, String]]
    
    var dropShadow: ResolvableTo[KeyValuePair[String, String]]
    
    var fill: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var flex: ResolvableTo[KeyValuePair[String, String]]
    
    var flexBasis: ResolvableTo[KeyValuePair[String, String]]
    
    var flexGrow: ResolvableTo[KeyValuePair[String, String]]
    
    var flexShrink: ResolvableTo[KeyValuePair[String, String]]
    
    var fontFamily: ResolvableTo[KeyValuePair[String, js.Array[String]]]
    
    var fontSize: ResolvableTo[
        KeyValuePair[
          String, 
          String | (js.Tuple2[
            /* fontSize */ String, 
            (/* configuration */ PartiallineHeightstringle) | (/* lineHeight */ String)
          ])
        ]
      ]
    
    var fontWeight: ResolvableTo[KeyValuePair[String, String]]
    
    var gap: ResolvableTo[KeyValuePair[String, String]]
    
    var gradientColorStops: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var grayscale: ResolvableTo[KeyValuePair[String, String]]
    
    var gridAutoColumns: ResolvableTo[KeyValuePair[String, String]]
    
    var gridAutoRows: ResolvableTo[KeyValuePair[String, String]]
    
    var gridColumn: ResolvableTo[KeyValuePair[String, String]]
    
    var gridColumnEnd: ResolvableTo[KeyValuePair[String, String]]
    
    var gridColumnStart: ResolvableTo[KeyValuePair[String, String]]
    
    var gridRow: ResolvableTo[KeyValuePair[String, String]]
    
    var gridRowEnd: ResolvableTo[KeyValuePair[String, String]]
    
    var gridRowStart: ResolvableTo[KeyValuePair[String, String]]
    
    var gridTemplateColumns: ResolvableTo[KeyValuePair[String, String]]
    
    var gridTemplateRows: ResolvableTo[KeyValuePair[String, String]]
    
    var height: ResolvableTo[KeyValuePair[String, String]]
    
    var hueRotate: ResolvableTo[KeyValuePair[String, String]]
    
    // Utilities
    var inset: ResolvableTo[KeyValuePair[String, String]]
    
    var invert: ResolvableTo[KeyValuePair[String, String]]
    
    var keyframes: ResolvableTo[KeyValuePair[String, KeyValuePair[String, KeyValuePair[String, String]]]]
    
    var letterSpacing: ResolvableTo[KeyValuePair[String, String]]
    
    var lineHeight: ResolvableTo[KeyValuePair[String, String]]
    
    var listStyleType: ResolvableTo[KeyValuePair[String, String]]
    
    var margin: ResolvableTo[KeyValuePair[String, String]]
    
    var maxHeight: ResolvableTo[KeyValuePair[String, String]]
    
    var maxWidth: ResolvableTo[KeyValuePair[String, String]]
    
    var minHeight: ResolvableTo[KeyValuePair[String, String]]
    
    var minWidth: ResolvableTo[KeyValuePair[String, String]]
    
    var objectPosition: ResolvableTo[KeyValuePair[String, String]]
    
    var opacity: ResolvableTo[KeyValuePair[String, String]]
    
    var order: ResolvableTo[KeyValuePair[String, String]]
    
    var outlineColor: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var outlineOffset: ResolvableTo[KeyValuePair[String, String]]
    
    var outlineWidth: ResolvableTo[KeyValuePair[String, String]]
    
    var padding: ResolvableTo[KeyValuePair[String, String]]
    
    var placeholderColor: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var placeholderOpacity: ResolvableTo[KeyValuePair[String, String]]
    
    var ringColor: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var ringOffsetColor: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var ringOffsetWidth: ResolvableTo[KeyValuePair[String, String]]
    
    var ringOpacity: ResolvableTo[KeyValuePair[String, String]]
    
    var ringWidth: ResolvableTo[KeyValuePair[String, String]]
    
    var rotate: ResolvableTo[KeyValuePair[String, String]]
    
    var saturate: ResolvableTo[KeyValuePair[String, String]]
    
    var scale: ResolvableTo[KeyValuePair[String, String]]
    
    // Responsiveness
    var screens: ResolvableTo[ScreensConfig]
    
    var scrollMargin: ResolvableTo[KeyValuePair[String, String]]
    
    var scrollPadding: ResolvableTo[KeyValuePair[String, String]]
    
    var sepia: ResolvableTo[KeyValuePair[String, String]]
    
    var skew: ResolvableTo[KeyValuePair[String, String]]
    
    var space: ResolvableTo[KeyValuePair[String, String]]
    
    var spacing: ResolvableTo[KeyValuePair[String, String]]
    
    var stroke: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var strokeWidth: ResolvableTo[KeyValuePair[String, String]]
    
    var textColor: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var textDecorationColor: ResolvableTo[RecursiveKeyValuePair[String, String]]
    
    var textDecorationThickness: ResolvableTo[KeyValuePair[String, String]]
    
    var textIndent: ResolvableTo[KeyValuePair[String, String]]
    
    var textOpacity: ResolvableTo[KeyValuePair[String, String]]
    
    var textUnderlineOffset: ResolvableTo[KeyValuePair[String, String]]
    
    var transformOrigin: ResolvableTo[KeyValuePair[String, String]]
    
    var transitionDelay: ResolvableTo[KeyValuePair[String, String]]
    
    var transitionDuration: ResolvableTo[KeyValuePair[String, String]]
    
    var transitionProperty: ResolvableTo[KeyValuePair[String, String]]
    
    var transitionTimingFunction: ResolvableTo[KeyValuePair[String, String]]
    
    var translate: ResolvableTo[KeyValuePair[String, String]]
    
    var width: ResolvableTo[KeyValuePair[String, String]]
    
    var willChange: ResolvableTo[KeyValuePair[String, String]]
    
    var zIndex: ResolvableTo[KeyValuePair[String, String]]
  }
  object ThemeConfig {
    
    inline def apply(
      accentColor: ResolvableTo[RecursiveKeyValuePair[String, String]],
      animation: ResolvableTo[KeyValuePair[String, String]],
      aspectRatio: ResolvableTo[KeyValuePair[String, String]],
      backdropBlur: ResolvableTo[KeyValuePair[String, String]],
      backdropBrightness: ResolvableTo[KeyValuePair[String, String]],
      backdropContrast: ResolvableTo[KeyValuePair[String, String]],
      backdropGrayscale: ResolvableTo[KeyValuePair[String, String]],
      backdropHueRotate: ResolvableTo[KeyValuePair[String, String]],
      backdropInvert: ResolvableTo[KeyValuePair[String, String]],
      backdropOpacity: ResolvableTo[KeyValuePair[String, String]],
      backdropSaturate: ResolvableTo[KeyValuePair[String, String]],
      backdropSepia: ResolvableTo[KeyValuePair[String, String]],
      backgroundColor: ResolvableTo[RecursiveKeyValuePair[String, String]],
      backgroundImage: ResolvableTo[KeyValuePair[String, String]],
      backgroundOpacity: ResolvableTo[KeyValuePair[String, String]],
      backgroundPosition: ResolvableTo[KeyValuePair[String, String]],
      backgroundSize: ResolvableTo[KeyValuePair[String, String]],
      blur: ResolvableTo[KeyValuePair[String, String]],
      borderColor: ResolvableTo[RecursiveKeyValuePair[String, String]],
      borderOpacity: ResolvableTo[KeyValuePair[String, String]],
      borderRadius: ResolvableTo[KeyValuePair[String, String]],
      borderSpacing: ResolvableTo[KeyValuePair[String, String]],
      borderWidth: ResolvableTo[KeyValuePair[String, String]],
      boxShadow: ResolvableTo[KeyValuePair[String, String]],
      boxShadowColor: ResolvableTo[RecursiveKeyValuePair[String, String]],
      brightness: ResolvableTo[KeyValuePair[String, String]],
      caretColor: ResolvableTo[RecursiveKeyValuePair[String, String]],
      colors: ResolvableTo[RecursiveKeyValuePair[String, String]],
      columns: ResolvableTo[KeyValuePair[String, String]],
      container: ResolvableTo[PartialscreensScreensConf],
      content: ResolvableTo[KeyValuePair[String, String]],
      contrast: ResolvableTo[KeyValuePair[String, String]],
      cursor: ResolvableTo[KeyValuePair[String, String]],
      divideColor: /* import warning: importer.ImportType#apply Failed type conversion: tailwindcss.tailwindcss/types/config.ThemeConfig['colors'] */ js.Any,
      divideOpacity: /* import warning: importer.ImportType#apply Failed type conversion: tailwindcss.tailwindcss/types/config.ThemeConfig['opacity'] */ js.Any,
      divideWidth: ResolvableTo[KeyValuePair[String, String]],
      dropShadow: ResolvableTo[KeyValuePair[String, String]],
      fill: ResolvableTo[RecursiveKeyValuePair[String, String]],
      flex: ResolvableTo[KeyValuePair[String, String]],
      flexBasis: ResolvableTo[KeyValuePair[String, String]],
      flexGrow: ResolvableTo[KeyValuePair[String, String]],
      flexShrink: ResolvableTo[KeyValuePair[String, String]],
      fontFamily: ResolvableTo[KeyValuePair[String, js.Array[String]]],
      fontSize: ResolvableTo[
          KeyValuePair[
            String, 
            String | (js.Tuple2[
              /* fontSize */ String, 
              (/* configuration */ PartiallineHeightstringle) | (/* lineHeight */ String)
            ])
          ]
        ],
      fontWeight: ResolvableTo[KeyValuePair[String, String]],
      gap: ResolvableTo[KeyValuePair[String, String]],
      gradientColorStops: ResolvableTo[RecursiveKeyValuePair[String, String]],
      grayscale: ResolvableTo[KeyValuePair[String, String]],
      gridAutoColumns: ResolvableTo[KeyValuePair[String, String]],
      gridAutoRows: ResolvableTo[KeyValuePair[String, String]],
      gridColumn: ResolvableTo[KeyValuePair[String, String]],
      gridColumnEnd: ResolvableTo[KeyValuePair[String, String]],
      gridColumnStart: ResolvableTo[KeyValuePair[String, String]],
      gridRow: ResolvableTo[KeyValuePair[String, String]],
      gridRowEnd: ResolvableTo[KeyValuePair[String, String]],
      gridRowStart: ResolvableTo[KeyValuePair[String, String]],
      gridTemplateColumns: ResolvableTo[KeyValuePair[String, String]],
      gridTemplateRows: ResolvableTo[KeyValuePair[String, String]],
      height: ResolvableTo[KeyValuePair[String, String]],
      hueRotate: ResolvableTo[KeyValuePair[String, String]],
      inset: ResolvableTo[KeyValuePair[String, String]],
      invert: ResolvableTo[KeyValuePair[String, String]],
      keyframes: ResolvableTo[KeyValuePair[String, KeyValuePair[String, KeyValuePair[String, String]]]],
      letterSpacing: ResolvableTo[KeyValuePair[String, String]],
      lineHeight: ResolvableTo[KeyValuePair[String, String]],
      listStyleType: ResolvableTo[KeyValuePair[String, String]],
      margin: ResolvableTo[KeyValuePair[String, String]],
      maxHeight: ResolvableTo[KeyValuePair[String, String]],
      maxWidth: ResolvableTo[KeyValuePair[String, String]],
      minHeight: ResolvableTo[KeyValuePair[String, String]],
      minWidth: ResolvableTo[KeyValuePair[String, String]],
      objectPosition: ResolvableTo[KeyValuePair[String, String]],
      opacity: ResolvableTo[KeyValuePair[String, String]],
      order: ResolvableTo[KeyValuePair[String, String]],
      outlineColor: ResolvableTo[RecursiveKeyValuePair[String, String]],
      outlineOffset: ResolvableTo[KeyValuePair[String, String]],
      outlineWidth: ResolvableTo[KeyValuePair[String, String]],
      padding: ResolvableTo[KeyValuePair[String, String]],
      placeholderColor: ResolvableTo[RecursiveKeyValuePair[String, String]],
      placeholderOpacity: ResolvableTo[KeyValuePair[String, String]],
      ringColor: ResolvableTo[RecursiveKeyValuePair[String, String]],
      ringOffsetColor: ResolvableTo[RecursiveKeyValuePair[String, String]],
      ringOffsetWidth: ResolvableTo[KeyValuePair[String, String]],
      ringOpacity: ResolvableTo[KeyValuePair[String, String]],
      ringWidth: ResolvableTo[KeyValuePair[String, String]],
      rotate: ResolvableTo[KeyValuePair[String, String]],
      saturate: ResolvableTo[KeyValuePair[String, String]],
      scale: ResolvableTo[KeyValuePair[String, String]],
      screens: ResolvableTo[ScreensConfig],
      scrollMargin: ResolvableTo[KeyValuePair[String, String]],
      scrollPadding: ResolvableTo[KeyValuePair[String, String]],
      sepia: ResolvableTo[KeyValuePair[String, String]],
      skew: ResolvableTo[KeyValuePair[String, String]],
      space: ResolvableTo[KeyValuePair[String, String]],
      spacing: ResolvableTo[KeyValuePair[String, String]],
      stroke: ResolvableTo[RecursiveKeyValuePair[String, String]],
      strokeWidth: ResolvableTo[KeyValuePair[String, String]],
      textColor: ResolvableTo[RecursiveKeyValuePair[String, String]],
      textDecorationColor: ResolvableTo[RecursiveKeyValuePair[String, String]],
      textDecorationThickness: ResolvableTo[KeyValuePair[String, String]],
      textIndent: ResolvableTo[KeyValuePair[String, String]],
      textOpacity: ResolvableTo[KeyValuePair[String, String]],
      textUnderlineOffset: ResolvableTo[KeyValuePair[String, String]],
      transformOrigin: ResolvableTo[KeyValuePair[String, String]],
      transitionDelay: ResolvableTo[KeyValuePair[String, String]],
      transitionDuration: ResolvableTo[KeyValuePair[String, String]],
      transitionProperty: ResolvableTo[KeyValuePair[String, String]],
      transitionTimingFunction: ResolvableTo[KeyValuePair[String, String]],
      translate: ResolvableTo[KeyValuePair[String, String]],
      width: ResolvableTo[KeyValuePair[String, String]],
      willChange: ResolvableTo[KeyValuePair[String, String]],
      zIndex: ResolvableTo[KeyValuePair[String, String]]
    ): ThemeConfig = {
      val __obj = js.Dynamic.literal(accentColor = accentColor.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], aspectRatio = aspectRatio.asInstanceOf[js.Any], backdropBlur = backdropBlur.asInstanceOf[js.Any], backdropBrightness = backdropBrightness.asInstanceOf[js.Any], backdropContrast = backdropContrast.asInstanceOf[js.Any], backdropGrayscale = backdropGrayscale.asInstanceOf[js.Any], backdropHueRotate = backdropHueRotate.asInstanceOf[js.Any], backdropInvert = backdropInvert.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropSaturate = backdropSaturate.asInstanceOf[js.Any], backdropSepia = backdropSepia.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], backgroundOpacity = backgroundOpacity.asInstanceOf[js.Any], backgroundPosition = backgroundPosition.asInstanceOf[js.Any], backgroundSize = backgroundSize.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderOpacity = borderOpacity.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderSpacing = borderSpacing.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], boxShadow = boxShadow.asInstanceOf[js.Any], boxShadowColor = boxShadowColor.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], caretColor = caretColor.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], divideColor = divideColor.asInstanceOf[js.Any], divideOpacity = divideOpacity.asInstanceOf[js.Any], divideWidth = divideWidth.asInstanceOf[js.Any], dropShadow = dropShadow.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], flexBasis = flexBasis.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], flexShrink = flexShrink.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], gradientColorStops = gradientColorStops.asInstanceOf[js.Any], grayscale = grayscale.asInstanceOf[js.Any], gridAutoColumns = gridAutoColumns.asInstanceOf[js.Any], gridAutoRows = gridAutoRows.asInstanceOf[js.Any], gridColumn = gridColumn.asInstanceOf[js.Any], gridColumnEnd = gridColumnEnd.asInstanceOf[js.Any], gridColumnStart = gridColumnStart.asInstanceOf[js.Any], gridRow = gridRow.asInstanceOf[js.Any], gridRowEnd = gridRowEnd.asInstanceOf[js.Any], gridRowStart = gridRowStart.asInstanceOf[js.Any], gridTemplateColumns = gridTemplateColumns.asInstanceOf[js.Any], gridTemplateRows = gridTemplateRows.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hueRotate = hueRotate.asInstanceOf[js.Any], inset = inset.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], listStyleType = listStyleType.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], objectPosition = objectPosition.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], outlineColor = outlineColor.asInstanceOf[js.Any], outlineOffset = outlineOffset.asInstanceOf[js.Any], outlineWidth = outlineWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], placeholderColor = placeholderColor.asInstanceOf[js.Any], placeholderOpacity = placeholderOpacity.asInstanceOf[js.Any], ringColor = ringColor.asInstanceOf[js.Any], ringOffsetColor = ringOffsetColor.asInstanceOf[js.Any], ringOffsetWidth = ringOffsetWidth.asInstanceOf[js.Any], ringOpacity = ringOpacity.asInstanceOf[js.Any], ringWidth = ringWidth.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], saturate = saturate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], screens = screens.asInstanceOf[js.Any], scrollMargin = scrollMargin.asInstanceOf[js.Any], scrollPadding = scrollPadding.asInstanceOf[js.Any], sepia = sepia.asInstanceOf[js.Any], skew = skew.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textDecorationColor = textDecorationColor.asInstanceOf[js.Any], textDecorationThickness = textDecorationThickness.asInstanceOf[js.Any], textIndent = textIndent.asInstanceOf[js.Any], textOpacity = textOpacity.asInstanceOf[js.Any], textUnderlineOffset = textUnderlineOffset.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any], transitionDelay = transitionDelay.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionProperty = transitionProperty.asInstanceOf[js.Any], transitionTimingFunction = transitionTimingFunction.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], willChange = willChange.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeConfig]
    }
    
    extension [Self <: ThemeConfig](x: Self) {
      
      inline def setAccentColor(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      inline def setAccentColorFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "accentColor", js.Any.fromFunction1(value))
      
      inline def setAnimation(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "animation", js.Any.fromFunction1(value))
      
      inline def setAspectRatio(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "aspectRatio", js.Any.fromFunction1(value))
      
      inline def setBackdropBlur(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backdropBlur", value.asInstanceOf[js.Any])
      
      inline def setBackdropBlurFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backdropBlur", js.Any.fromFunction1(value))
      
      inline def setBackdropBrightness(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backdropBrightness", value.asInstanceOf[js.Any])
      
      inline def setBackdropBrightnessFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backdropBrightness", js.Any.fromFunction1(value))
      
      inline def setBackdropContrast(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backdropContrast", value.asInstanceOf[js.Any])
      
      inline def setBackdropContrastFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backdropContrast", js.Any.fromFunction1(value))
      
      inline def setBackdropGrayscale(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backdropGrayscale", value.asInstanceOf[js.Any])
      
      inline def setBackdropGrayscaleFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backdropGrayscale", js.Any.fromFunction1(value))
      
      inline def setBackdropHueRotate(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backdropHueRotate", value.asInstanceOf[js.Any])
      
      inline def setBackdropHueRotateFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backdropHueRotate", js.Any.fromFunction1(value))
      
      inline def setBackdropInvert(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backdropInvert", value.asInstanceOf[js.Any])
      
      inline def setBackdropInvertFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backdropInvert", js.Any.fromFunction1(value))
      
      inline def setBackdropOpacity(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backdropOpacity", value.asInstanceOf[js.Any])
      
      inline def setBackdropOpacityFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backdropOpacity", js.Any.fromFunction1(value))
      
      inline def setBackdropSaturate(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backdropSaturate", value.asInstanceOf[js.Any])
      
      inline def setBackdropSaturateFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backdropSaturate", js.Any.fromFunction1(value))
      
      inline def setBackdropSepia(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backdropSepia", value.asInstanceOf[js.Any])
      
      inline def setBackdropSepiaFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backdropSepia", js.Any.fromFunction1(value))
      
      inline def setBackgroundColor(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction1(value))
      
      inline def setBackgroundImage(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backgroundImage", js.Any.fromFunction1(value))
      
      inline def setBackgroundOpacity(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backgroundOpacity", value.asInstanceOf[js.Any])
      
      inline def setBackgroundOpacityFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backgroundOpacity", js.Any.fromFunction1(value))
      
      inline def setBackgroundPosition(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backgroundPosition", js.Any.fromFunction1(value))
      
      inline def setBackgroundSize(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
      
      inline def setBackgroundSizeFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "backgroundSize", js.Any.fromFunction1(value))
      
      inline def setBlur(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "blur", js.Any.fromFunction1(value))
      
      inline def setBorderColor(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "borderColor", js.Any.fromFunction1(value))
      
      inline def setBorderOpacity(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "borderOpacity", value.asInstanceOf[js.Any])
      
      inline def setBorderOpacityFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "borderOpacity", js.Any.fromFunction1(value))
      
      inline def setBorderRadius(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "borderRadius", js.Any.fromFunction1(value))
      
      inline def setBorderSpacing(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "borderSpacing", value.asInstanceOf[js.Any])
      
      inline def setBorderSpacingFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "borderSpacing", js.Any.fromFunction1(value))
      
      inline def setBorderWidth(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "borderWidth", js.Any.fromFunction1(value))
      
      inline def setBoxShadow(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      inline def setBoxShadowColor(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "boxShadowColor", value.asInstanceOf[js.Any])
      
      inline def setBoxShadowColorFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "boxShadowColor", js.Any.fromFunction1(value))
      
      inline def setBoxShadowFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "boxShadow", js.Any.fromFunction1(value))
      
      inline def setBrightness(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      inline def setBrightnessFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "brightness", js.Any.fromFunction1(value))
      
      inline def setCaretColor(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "caretColor", value.asInstanceOf[js.Any])
      
      inline def setCaretColorFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "caretColor", js.Any.fromFunction1(value))
      
      inline def setColors(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColumns(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
      
      inline def setContainer(value: ResolvableTo[PartialscreensScreensConf]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerFunction1(value: /* utils */ PluginUtils => PartialscreensScreensConf): Self = StObject.set(x, "container", js.Any.fromFunction1(value))
      
      inline def setContent(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setContrast(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
      
      inline def setContrastFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "contrast", js.Any.fromFunction1(value))
      
      inline def setCursor(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "cursor", js.Any.fromFunction1(value))
      
      inline def setDivideColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: tailwindcss.tailwindcss/types/config.ThemeConfig['colors'] */ js.Any
      ): Self = StObject.set(x, "divideColor", value.asInstanceOf[js.Any])
      
      inline def setDivideOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: tailwindcss.tailwindcss/types/config.ThemeConfig['opacity'] */ js.Any
      ): Self = StObject.set(x, "divideOpacity", value.asInstanceOf[js.Any])
      
      inline def setDivideWidth(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "divideWidth", value.asInstanceOf[js.Any])
      
      inline def setDivideWidthFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "divideWidth", js.Any.fromFunction1(value))
      
      inline def setDropShadow(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "dropShadow", value.asInstanceOf[js.Any])
      
      inline def setDropShadowFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "dropShadow", js.Any.fromFunction1(value))
      
      inline def setFill(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFlex(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexBasis(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "flexBasis", js.Any.fromFunction1(value))
      
      inline def setFlexFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "flex", js.Any.fromFunction1(value))
      
      inline def setFlexGrow(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "flexGrow", js.Any.fromFunction1(value))
      
      inline def setFlexShrink(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      inline def setFlexShrinkFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "flexShrink", js.Any.fromFunction1(value))
      
      inline def setFontFamily(value: ResolvableTo[KeyValuePair[String, js.Array[String]]]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, js.Array[String]]): Self = StObject.set(x, "fontFamily", js.Any.fromFunction1(value))
      
      inline def setFontSize(
        value: ResolvableTo[
              KeyValuePair[
                String, 
                String | (js.Tuple2[
                  /* fontSize */ String, 
                  (/* configuration */ PartiallineHeightstringle) | (/* lineHeight */ String)
                ])
              ]
            ]
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeFunction1(
        value: /* utils */ PluginUtils => KeyValuePair[
              String, 
              String | (js.Tuple2[
                /* fontSize */ String, 
                (/* configuration */ PartiallineHeightstringle) | (/* lineHeight */ String)
              ])
            ]
      ): Self = StObject.set(x, "fontSize", js.Any.fromFunction1(value))
      
      inline def setFontWeight(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "fontWeight", js.Any.fromFunction1(value))
      
      inline def setGap(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "gap", js.Any.fromFunction1(value))
      
      inline def setGradientColorStops(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "gradientColorStops", value.asInstanceOf[js.Any])
      
      inline def setGradientColorStopsFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "gradientColorStops", js.Any.fromFunction1(value))
      
      inline def setGrayscale(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      inline def setGrayscaleFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "grayscale", js.Any.fromFunction1(value))
      
      inline def setGridAutoColumns(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
      
      inline def setGridAutoColumnsFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "gridAutoColumns", js.Any.fromFunction1(value))
      
      inline def setGridAutoRows(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
      
      inline def setGridAutoRowsFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "gridAutoRows", js.Any.fromFunction1(value))
      
      inline def setGridColumn(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEnd(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "gridColumnEnd", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEndFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "gridColumnEnd", js.Any.fromFunction1(value))
      
      inline def setGridColumnFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "gridColumn", js.Any.fromFunction1(value))
      
      inline def setGridColumnStart(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "gridColumnStart", value.asInstanceOf[js.Any])
      
      inline def setGridColumnStartFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "gridColumnStart", js.Any.fromFunction1(value))
      
      inline def setGridRow(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      inline def setGridRowEnd(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "gridRowEnd", value.asInstanceOf[js.Any])
      
      inline def setGridRowEndFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "gridRowEnd", js.Any.fromFunction1(value))
      
      inline def setGridRowFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "gridRow", js.Any.fromFunction1(value))
      
      inline def setGridRowStart(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "gridRowStart", value.asInstanceOf[js.Any])
      
      inline def setGridRowStartFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "gridRowStart", js.Any.fromFunction1(value))
      
      inline def setGridTemplateColumns(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateColumnsFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "gridTemplateColumns", js.Any.fromFunction1(value))
      
      inline def setGridTemplateRows(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateRowsFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "gridTemplateRows", js.Any.fromFunction1(value))
      
      inline def setHeight(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "height", js.Any.fromFunction1(value))
      
      inline def setHueRotate(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "hueRotate", value.asInstanceOf[js.Any])
      
      inline def setHueRotateFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "hueRotate", js.Any.fromFunction1(value))
      
      inline def setInset(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setInsetFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "inset", js.Any.fromFunction1(value))
      
      inline def setInvert(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "invert", js.Any.fromFunction1(value))
      
      inline def setKeyframes(value: ResolvableTo[KeyValuePair[String, KeyValuePair[String, KeyValuePair[String, String]]]]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      inline def setKeyframesFunction1(
        value: /* utils */ PluginUtils => KeyValuePair[String, KeyValuePair[String, KeyValuePair[String, String]]]
      ): Self = StObject.set(x, "keyframes", js.Any.fromFunction1(value))
      
      inline def setLetterSpacing(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "letterSpacing", js.Any.fromFunction1(value))
      
      inline def setLineHeight(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "lineHeight", js.Any.fromFunction1(value))
      
      inline def setListStyleType(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "listStyleType", value.asInstanceOf[js.Any])
      
      inline def setListStyleTypeFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "listStyleType", js.Any.fromFunction1(value))
      
      inline def setMargin(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "margin", js.Any.fromFunction1(value))
      
      inline def setMaxHeight(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "maxHeight", js.Any.fromFunction1(value))
      
      inline def setMaxWidth(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "maxWidth", js.Any.fromFunction1(value))
      
      inline def setMinHeight(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "minHeight", js.Any.fromFunction1(value))
      
      inline def setMinWidth(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "minWidth", js.Any.fromFunction1(value))
      
      inline def setObjectPosition(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "objectPosition", value.asInstanceOf[js.Any])
      
      inline def setObjectPositionFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "objectPosition", js.Any.fromFunction1(value))
      
      inline def setOpacity(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "opacity", js.Any.fromFunction1(value))
      
      inline def setOrder(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "order", js.Any.fromFunction1(value))
      
      inline def setOutlineColor(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "outlineColor", js.Any.fromFunction1(value))
      
      inline def setOutlineOffset(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "outlineOffset", value.asInstanceOf[js.Any])
      
      inline def setOutlineOffsetFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "outlineOffset", js.Any.fromFunction1(value))
      
      inline def setOutlineWidth(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      inline def setOutlineWidthFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "outlineWidth", js.Any.fromFunction1(value))
      
      inline def setPadding(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "padding", js.Any.fromFunction1(value))
      
      inline def setPlaceholderColor(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "placeholderColor", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderColorFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "placeholderColor", js.Any.fromFunction1(value))
      
      inline def setPlaceholderOpacity(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "placeholderOpacity", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderOpacityFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "placeholderOpacity", js.Any.fromFunction1(value))
      
      inline def setRingColor(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "ringColor", value.asInstanceOf[js.Any])
      
      inline def setRingColorFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "ringColor", js.Any.fromFunction1(value))
      
      inline def setRingOffsetColor(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "ringOffsetColor", value.asInstanceOf[js.Any])
      
      inline def setRingOffsetColorFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "ringOffsetColor", js.Any.fromFunction1(value))
      
      inline def setRingOffsetWidth(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "ringOffsetWidth", value.asInstanceOf[js.Any])
      
      inline def setRingOffsetWidthFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "ringOffsetWidth", js.Any.fromFunction1(value))
      
      inline def setRingOpacity(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "ringOpacity", value.asInstanceOf[js.Any])
      
      inline def setRingOpacityFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "ringOpacity", js.Any.fromFunction1(value))
      
      inline def setRingWidth(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "ringWidth", value.asInstanceOf[js.Any])
      
      inline def setRingWidthFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "ringWidth", js.Any.fromFunction1(value))
      
      inline def setRotate(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      inline def setSaturate(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "saturate", value.asInstanceOf[js.Any])
      
      inline def setSaturateFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "saturate", js.Any.fromFunction1(value))
      
      inline def setScale(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
      
      inline def setScreens(value: ResolvableTo[ScreensConfig]): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
      
      inline def setScreensFunction1(value: /* utils */ PluginUtils => ScreensConfig): Self = StObject.set(x, "screens", js.Any.fromFunction1(value))
      
      inline def setScreensVarargs(value: String*): Self = StObject.set(x, "screens", js.Array(value*))
      
      inline def setScrollMargin(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "scrollMargin", js.Any.fromFunction1(value))
      
      inline def setScrollPadding(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "scrollPadding", js.Any.fromFunction1(value))
      
      inline def setSepia(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "sepia", value.asInstanceOf[js.Any])
      
      inline def setSepiaFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "sepia", js.Any.fromFunction1(value))
      
      inline def setSkew(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
      
      inline def setSkewFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "skew", js.Any.fromFunction1(value))
      
      inline def setSpace(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "space", js.Any.fromFunction1(value))
      
      inline def setSpacing(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "spacing", js.Any.fromFunction1(value))
      
      inline def setStroke(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "stroke", js.Any.fromFunction1(value))
      
      inline def setStrokeWidth(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "strokeWidth", js.Any.fromFunction1(value))
      
      inline def setTextColor(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "textColor", js.Any.fromFunction1(value))
      
      inline def setTextDecorationColor(value: ResolvableTo[RecursiveKeyValuePair[String, String]]): Self = StObject.set(x, "textDecorationColor", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationColorFunction1(value: /* utils */ PluginUtils => RecursiveKeyValuePair[String, String]): Self = StObject.set(x, "textDecorationColor", js.Any.fromFunction1(value))
      
      inline def setTextDecorationThickness(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "textDecorationThickness", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationThicknessFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "textDecorationThickness", js.Any.fromFunction1(value))
      
      inline def setTextIndent(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "textIndent", value.asInstanceOf[js.Any])
      
      inline def setTextIndentFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "textIndent", js.Any.fromFunction1(value))
      
      inline def setTextOpacity(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "textOpacity", value.asInstanceOf[js.Any])
      
      inline def setTextOpacityFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "textOpacity", js.Any.fromFunction1(value))
      
      inline def setTextUnderlineOffset(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "textUnderlineOffset", value.asInstanceOf[js.Any])
      
      inline def setTextUnderlineOffsetFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "textUnderlineOffset", js.Any.fromFunction1(value))
      
      inline def setTransformOrigin(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      inline def setTransformOriginFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "transformOrigin", js.Any.fromFunction1(value))
      
      inline def setTransitionDelay(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
      
      inline def setTransitionDelayFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "transitionDelay", js.Any.fromFunction1(value))
      
      inline def setTransitionDuration(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "transitionDuration", js.Any.fromFunction1(value))
      
      inline def setTransitionProperty(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "transitionProperty", value.asInstanceOf[js.Any])
      
      inline def setTransitionPropertyFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "transitionProperty", js.Any.fromFunction1(value))
      
      inline def setTransitionTimingFunction(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "transitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setTransitionTimingFunctionFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "transitionTimingFunction", js.Any.fromFunction1(value))
      
      inline def setTranslate(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "translate", js.Any.fromFunction1(value))
      
      inline def setWidth(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
      
      inline def setWillChange(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "willChange", value.asInstanceOf[js.Any])
      
      inline def setWillChangeFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "willChange", js.Any.fromFunction1(value))
      
      inline def setZIndex(value: ResolvableTo[KeyValuePair[String, String]]): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexFunction1(value: /* utils */ PluginUtils => KeyValuePair[String, String]): Self = StObject.set(x, "zIndex", js.Any.fromFunction1(value))
    }
  }
  
  type TransformerFn = js.Function1[/* content */ String, String]
  
  // Plugins related config
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tailwindcss.tailwindcssStrings.any
    - typingsJapgolly.tailwindcss.tailwindcssStrings.color
    - typingsJapgolly.tailwindcss.tailwindcssStrings.url
    - typingsJapgolly.tailwindcss.tailwindcssStrings.image
    - typingsJapgolly.tailwindcss.tailwindcssStrings.length
    - typingsJapgolly.tailwindcss.tailwindcssStrings.percentage
    - typingsJapgolly.tailwindcss.tailwindcssStrings.position
    - typingsJapgolly.tailwindcss.tailwindcssStrings.lookup
    - typingsJapgolly.tailwindcss.tailwindcssStrings.`generic-name`
    - typingsJapgolly.tailwindcss.tailwindcssStrings.`family-name`
    - typingsJapgolly.tailwindcss.tailwindcssStrings.number
    - typingsJapgolly.tailwindcss.tailwindcssStrings.`line-width`
    - typingsJapgolly.tailwindcss.tailwindcssStrings.`absolute-size`
    - typingsJapgolly.tailwindcss.tailwindcssStrings.`relative-size`
    - typingsJapgolly.tailwindcss.tailwindcssStrings.shadow
  */
  trait ValueType extends StObject
  object ValueType {
    
    inline def `absolute-size`: typingsJapgolly.tailwindcss.tailwindcssStrings.`absolute-size` = "absolute-size".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.`absolute-size`]
    
    inline def any: typingsJapgolly.tailwindcss.tailwindcssStrings.any = "any".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.any]
    
    inline def color: typingsJapgolly.tailwindcss.tailwindcssStrings.color = "color".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.color]
    
    inline def `family-name`: typingsJapgolly.tailwindcss.tailwindcssStrings.`family-name` = "family-name".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.`family-name`]
    
    inline def `generic-name`: typingsJapgolly.tailwindcss.tailwindcssStrings.`generic-name` = "generic-name".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.`generic-name`]
    
    inline def image: typingsJapgolly.tailwindcss.tailwindcssStrings.image = "image".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.image]
    
    inline def length: typingsJapgolly.tailwindcss.tailwindcssStrings.length = "length".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.length]
    
    inline def `line-width`: typingsJapgolly.tailwindcss.tailwindcssStrings.`line-width` = "line-width".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.`line-width`]
    
    inline def lookup: typingsJapgolly.tailwindcss.tailwindcssStrings.lookup = "lookup".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.lookup]
    
    inline def number: typingsJapgolly.tailwindcss.tailwindcssStrings.number = "number".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.number]
    
    inline def percentage: typingsJapgolly.tailwindcss.tailwindcssStrings.percentage = "percentage".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.percentage]
    
    inline def position: typingsJapgolly.tailwindcss.tailwindcssStrings.position = "position".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.position]
    
    inline def `relative-size`: typingsJapgolly.tailwindcss.tailwindcssStrings.`relative-size` = "relative-size".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.`relative-size`]
    
    inline def shadow: typingsJapgolly.tailwindcss.tailwindcssStrings.shadow = "shadow".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.shadow]
    
    inline def url: typingsJapgolly.tailwindcss.tailwindcssStrings.url = "url".asInstanceOf[typingsJapgolly.tailwindcss.tailwindcssStrings.url]
  }
  
  trait _DarkModeConfig extends StObject
}
