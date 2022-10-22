package typingsJapgolly.theo

import japgolly.scalajs.react.Callback
import typingsJapgolly.immutable.mod.Map
import typingsJapgolly.immutable.mod.OrderedMap
import typingsJapgolly.theo.theoStrings.aliases
import typingsJapgolly.theo.theoStrings.global
import typingsJapgolly.theo.theoStrings.imports
import typingsJapgolly.theo.theoStrings.meta
import typingsJapgolly.theo.theoStrings.options
import typingsJapgolly.theo.theoStrings.props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("theo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(options: ConvertOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def convertSync(options: ConvertOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertSync")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def registerFormat[T /* <: String */](name: T, format: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFormat")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerFormat[T /* <: String */](name: T, format: FormatResultFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFormat")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerFormat[T /* <: String */](name: Format, format: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFormat")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerFormat[T /* <: String */](name: Format, format: FormatResultFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFormat")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerTransform[T /* <: String */, V /* <: String */](name: T, valueTransforms: js.Array[V | ValueTransform]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTransform")(name.asInstanceOf[js.Any], valueTransforms.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerTransform[T /* <: String */, V /* <: String */](name: Transform, valueTransforms: js.Array[V | ValueTransform]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTransform")(name.asInstanceOf[js.Any], valueTransforms.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerValueTransform[T /* <: String */](
    name: T,
    predicate: js.Function1[/* prop */ Prop, Boolean],
    transform: js.Function1[/* prop */ Prop, String | Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerValueTransform")(name.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerValueTransform[T /* <: String */](
    name: ValueTransform,
    predicate: js.Function1[/* prop */ Prop, Boolean],
    transform: js.Function1[/* prop */ Prop, String | Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerValueTransform")(name.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Aliases = OrderedMap[String, Map[String, String | Double]]
  
  trait ConvertOptions extends StObject {
    
    var format: FormatOptions
    
    var resolveAliases: js.UndefOr[Boolean] = js.undefined
    
    var resolveMetaAliases: js.UndefOr[Boolean] = js.undefined
    
    var transform: TransformOptions[scala.Nothing]
  }
  object ConvertOptions {
    
    inline def apply(format: FormatOptions, transform: TransformOptions[scala.Nothing]): ConvertOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertOptions]
    }
    
    extension [Self <: ConvertOptions](x: Self) {
      
      inline def setFormat(value: FormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setResolveAliases(value: Boolean): Self = StObject.set(x, "resolveAliases", value.asInstanceOf[js.Any])
      
      inline def setResolveAliasesUndefined: Self = StObject.set(x, "resolveAliases", js.undefined)
      
      inline def setResolveMetaAliases(value: Boolean): Self = StObject.set(x, "resolveMetaAliases", value.asInstanceOf[js.Any])
      
      inline def setResolveMetaAliasesUndefined: Self = StObject.set(x, "resolveMetaAliases", js.undefined)
      
      inline def setTransform(value: TransformOptions[scala.Nothing]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.theo.theoStrings.`custom-propertiesDotcss`
    - typingsJapgolly.theo.theoStrings.cssmodulesDotcss
    - typingsJapgolly.theo.theoStrings.scss
    - typingsJapgolly.theo.theoStrings.sass
    - typingsJapgolly.theo.theoStrings.less
    - typingsJapgolly.theo.theoStrings.styl
    - typingsJapgolly.theo.theoStrings.mapDotcss
    - typingsJapgolly.theo.theoStrings.mapDotvariableDotscss
    - typingsJapgolly.theo.theoStrings.listDotscss
    - typingsJapgolly.theo.theoStrings.moduleDotjs
    - typingsJapgolly.theo.theoStrings.commonDotjs
    - typingsJapgolly.theo.theoStrings.html
    - typingsJapgolly.theo.theoStrings.json
    - typingsJapgolly.theo.theoStrings.rawDotjson
    - typingsJapgolly.theo.theoStrings.iosDotjson
    - typingsJapgolly.theo.theoStrings.androidDotxml
    - typingsJapgolly.theo.theoStrings.auraDottokens
  */
  trait Format extends StObject
  object Format {
    
    inline def androidDotxml: typingsJapgolly.theo.theoStrings.androidDotxml = "android.xml".asInstanceOf[typingsJapgolly.theo.theoStrings.androidDotxml]
    
    inline def auraDottokens: typingsJapgolly.theo.theoStrings.auraDottokens = "aura.tokens".asInstanceOf[typingsJapgolly.theo.theoStrings.auraDottokens]
    
    inline def commonDotjs: typingsJapgolly.theo.theoStrings.commonDotjs = "common.js".asInstanceOf[typingsJapgolly.theo.theoStrings.commonDotjs]
    
    inline def cssmodulesDotcss: typingsJapgolly.theo.theoStrings.cssmodulesDotcss = "cssmodules.css".asInstanceOf[typingsJapgolly.theo.theoStrings.cssmodulesDotcss]
    
    inline def `custom-propertiesDotcss`: typingsJapgolly.theo.theoStrings.`custom-propertiesDotcss` = "custom-properties.css".asInstanceOf[typingsJapgolly.theo.theoStrings.`custom-propertiesDotcss`]
    
    inline def html: typingsJapgolly.theo.theoStrings.html = "html".asInstanceOf[typingsJapgolly.theo.theoStrings.html]
    
    inline def iosDotjson: typingsJapgolly.theo.theoStrings.iosDotjson = "ios.json".asInstanceOf[typingsJapgolly.theo.theoStrings.iosDotjson]
    
    inline def json: typingsJapgolly.theo.theoStrings.json = "json".asInstanceOf[typingsJapgolly.theo.theoStrings.json]
    
    inline def less: typingsJapgolly.theo.theoStrings.less = "less".asInstanceOf[typingsJapgolly.theo.theoStrings.less]
    
    inline def listDotscss: typingsJapgolly.theo.theoStrings.listDotscss = "list.scss".asInstanceOf[typingsJapgolly.theo.theoStrings.listDotscss]
    
    inline def mapDotcss: typingsJapgolly.theo.theoStrings.mapDotcss = "map.css".asInstanceOf[typingsJapgolly.theo.theoStrings.mapDotcss]
    
    inline def mapDotvariableDotscss: typingsJapgolly.theo.theoStrings.mapDotvariableDotscss = "map.variable.scss".asInstanceOf[typingsJapgolly.theo.theoStrings.mapDotvariableDotscss]
    
    inline def moduleDotjs: typingsJapgolly.theo.theoStrings.moduleDotjs = "module.js".asInstanceOf[typingsJapgolly.theo.theoStrings.moduleDotjs]
    
    inline def rawDotjson: typingsJapgolly.theo.theoStrings.rawDotjson = "raw.json".asInstanceOf[typingsJapgolly.theo.theoStrings.rawDotjson]
    
    inline def sass: typingsJapgolly.theo.theoStrings.sass = "sass".asInstanceOf[typingsJapgolly.theo.theoStrings.sass]
    
    inline def scss: typingsJapgolly.theo.theoStrings.scss = "scss".asInstanceOf[typingsJapgolly.theo.theoStrings.scss]
    
    inline def styl: typingsJapgolly.theo.theoStrings.styl = "styl".asInstanceOf[typingsJapgolly.theo.theoStrings.styl]
  }
  
  trait FormatOptions extends StObject {
    
    var options: js.UndefOr[
        js.Function2[
          /* options */ js.Object, 
          /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]], 
          Unit
        ]
      ] = js.undefined
    
    var `type`: Format
  }
  object FormatOptions {
    
    inline def apply(`type`: Format): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setOptions(
        value: (/* options */ js.Object, /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]]) => Callback
      ): Self = StObject.set(x, "options", js.Any.fromFunction2((t0: /* options */ js.Object, t1: /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]]) => (value(t0, t1)).runNow()))
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: Format): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type FormatResultFn = js.Function1[/* result */ ImmutableStyleMap, String]
  
  @js.native
  trait ImmutableStyleMap
    extends StObject
       with Map[String, Any] {
    
    @JSName("get")
    def get_aliases(key: aliases): Aliases = js.native
    @JSName("get")
    def get_global(key: global): js.UndefOr[Props] = js.native
    @JSName("get")
    def get_imports(key: imports): js.UndefOr[js.Array[String]] = js.native
    @JSName("get")
    def get_meta(key: meta): Meta = js.native
    @JSName("get")
    def get_options(key: options): js.Object = js.native
    @JSName("get")
    def get_props(key: props): Props = js.native
  }
  
  type Meta = Map[String, String]
  
  type Prop = Map[StyleProperty, String | Double]
  
  type Props = typingsJapgolly.immutable.mod.List[Prop]
  
  trait StyleMap extends StObject {
    
    var aliases: Aliases
    
    var global: js.UndefOr[Props] = js.undefined
    
    var imports: js.UndefOr[js.Array[String]] = js.undefined
    
    var meta: Meta
    
    var options: js.Object
    
    var props: Props
  }
  object StyleMap {
    
    inline def apply(aliases: Aliases, meta: Meta, options: js.Object, props: Props): StyleMap = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleMap]
    }
    
    extension [Self <: StyleMap](x: Self) {
      
      inline def setAliases(value: Aliases): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setGlobal(value: Props): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
      
      inline def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value*))
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.theo.theoStrings.name
    - typingsJapgolly.theo.theoStrings.value
    - typingsJapgolly.theo.theoStrings.`type`
    - typingsJapgolly.theo.theoStrings.originalValue
    - typingsJapgolly.theo.theoStrings.category
    - typingsJapgolly.theo.theoStrings.comment
    - typingsJapgolly.theo.theoStrings.meta
  */
  trait StyleProperty extends StObject
  object StyleProperty {
    
    inline def category: typingsJapgolly.theo.theoStrings.category = "category".asInstanceOf[typingsJapgolly.theo.theoStrings.category]
    
    inline def comment: typingsJapgolly.theo.theoStrings.comment = "comment".asInstanceOf[typingsJapgolly.theo.theoStrings.comment]
    
    inline def meta: typingsJapgolly.theo.theoStrings.meta = "meta".asInstanceOf[typingsJapgolly.theo.theoStrings.meta]
    
    inline def name: typingsJapgolly.theo.theoStrings.name = "name".asInstanceOf[typingsJapgolly.theo.theoStrings.name]
    
    inline def originalValue: typingsJapgolly.theo.theoStrings.originalValue = "originalValue".asInstanceOf[typingsJapgolly.theo.theoStrings.originalValue]
    
    inline def `type`: typingsJapgolly.theo.theoStrings.`type` = "type".asInstanceOf[typingsJapgolly.theo.theoStrings.`type`]
    
    inline def value: typingsJapgolly.theo.theoStrings.value = "value".asInstanceOf[typingsJapgolly.theo.theoStrings.value]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.theo.theoStrings.raw
    - typingsJapgolly.theo.theoStrings.ios
    - typingsJapgolly.theo.theoStrings.android
    - typingsJapgolly.theo.theoStrings.web
  */
  trait Transform extends StObject
  object Transform {
    
    inline def android: typingsJapgolly.theo.theoStrings.android = "android".asInstanceOf[typingsJapgolly.theo.theoStrings.android]
    
    inline def ios: typingsJapgolly.theo.theoStrings.ios = "ios".asInstanceOf[typingsJapgolly.theo.theoStrings.ios]
    
    inline def raw: typingsJapgolly.theo.theoStrings.raw = "raw".asInstanceOf[typingsJapgolly.theo.theoStrings.raw]
    
    inline def web: typingsJapgolly.theo.theoStrings.web = "web".asInstanceOf[typingsJapgolly.theo.theoStrings.web]
  }
  
  trait TransformOptions[T /* <: String */] extends StObject {
    
    var data: js.UndefOr[String] = js.undefined
    
    var file: String
    
    var `type`: js.UndefOr[Transform | T] = js.undefined
  }
  object TransformOptions {
    
    inline def apply[T /* <: String */](file: String): TransformOptions[T] = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformOptions[T]]
    }
    
    extension [Self <: TransformOptions[?], T /* <: String */](x: Self & TransformOptions[T]) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setType(value: Transform | T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.theo.theoStrings.colorSlashrgb
    - typingsJapgolly.theo.theoStrings.colorSlashhex
    - typingsJapgolly.theo.theoStrings.colorSlashhex8rgba
    - typingsJapgolly.theo.theoStrings.colorSlashhex8argb
    - typingsJapgolly.theo.theoStrings.percentageSlashfloat
    - typingsJapgolly.theo.theoStrings.relativeSlashpixel
    - typingsJapgolly.theo.theoStrings.relativeSlashpixelValue
  */
  trait ValueTransform extends StObject
  object ValueTransform {
    
    inline def colorSlashhex: typingsJapgolly.theo.theoStrings.colorSlashhex = "color/hex".asInstanceOf[typingsJapgolly.theo.theoStrings.colorSlashhex]
    
    inline def colorSlashhex8argb: typingsJapgolly.theo.theoStrings.colorSlashhex8argb = "color/hex8argb".asInstanceOf[typingsJapgolly.theo.theoStrings.colorSlashhex8argb]
    
    inline def colorSlashhex8rgba: typingsJapgolly.theo.theoStrings.colorSlashhex8rgba = "color/hex8rgba".asInstanceOf[typingsJapgolly.theo.theoStrings.colorSlashhex8rgba]
    
    inline def colorSlashrgb: typingsJapgolly.theo.theoStrings.colorSlashrgb = "color/rgb".asInstanceOf[typingsJapgolly.theo.theoStrings.colorSlashrgb]
    
    inline def percentageSlashfloat: typingsJapgolly.theo.theoStrings.percentageSlashfloat = "percentage/float".asInstanceOf[typingsJapgolly.theo.theoStrings.percentageSlashfloat]
    
    inline def relativeSlashpixel: typingsJapgolly.theo.theoStrings.relativeSlashpixel = "relative/pixel".asInstanceOf[typingsJapgolly.theo.theoStrings.relativeSlashpixel]
    
    inline def relativeSlashpixelValue: typingsJapgolly.theo.theoStrings.relativeSlashpixelValue = "relative/pixelValue".asInstanceOf[typingsJapgolly.theo.theoStrings.relativeSlashpixelValue]
  }
}
