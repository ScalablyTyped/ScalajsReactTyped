package typingsJapgolly.nodeSpriteGenerator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.nodeSpriteGenerator.anon.xnumberynumberImage
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(option: Option): Unit = ^.asInstanceOf[js.Dynamic].apply(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(option: Option, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(option.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("node-sprite-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def middleware(option: Option): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(option.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.canvas
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.gm
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.jimp
  */
  trait BuiltinCompositors extends StObject
  object BuiltinCompositors {
    
    inline def canvas: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.canvas = "canvas".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.canvas]
    
    inline def gm: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.gm = "gm".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.gm]
    
    inline def jimp: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.jimp = "jimp".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.jimp]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal
  */
  trait BuiltinLayouts extends StObject
  object BuiltinLayouts {
    
    inline def diagonal: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal = "diagonal".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal]
    
    inline def horizontal: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal]
    
    inline def packed: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed = "packed".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed]
    
    inline def vertical: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.stylus
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.less
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sass
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.scss
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.css
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.`prefixed-css`
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.javascript
  */
  trait BuiltinStylesheetFormats extends StObject
  object BuiltinStylesheetFormats {
    
    inline def css: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.css = "css".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.css]
    
    inline def javascript: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.javascript = "javascript".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.javascript]
    
    inline def less: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.less = "less".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.less]
    
    inline def `prefixed-css`: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.`prefixed-css` = "prefixed-css".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.`prefixed-css`]
    
    inline def sass: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sass = "sass".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sass]
    
    inline def scss: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.scss = "scss".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.scss]
    
    inline def stylus: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.stylus = "stylus".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.stylus]
  }
  
  trait Compositor extends StObject {
    
    def readImages(
      files: js.Array[String],
      callback: js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]
    ): Unit
    
    def render(
      layout: Layout,
      spritePath: String,
      options: CompositorOption,
      callback: js.Function1[/* error */ js.Error, Unit]
    ): Unit
  }
  object Compositor {
    
    inline def apply(
      readImages: (js.Array[String], js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]) => Callback,
      render: (Layout, String, CompositorOption, js.Function1[/* error */ js.Error, Unit]) => Callback
    ): Compositor = {
      val __obj = js.Dynamic.literal(readImages = js.Any.fromFunction2((t0: js.Array[String], t1: js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]) => (readImages(t0, t1)).runNow()), render = js.Any.fromFunction4((t0: Layout, t1: String, t2: CompositorOption, t3: js.Function1[/* error */ js.Error, Unit]) => (render(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[Compositor]
    }
    
    extension [Self <: Compositor](x: Self) {
      
      inline def setReadImages(
        value: (js.Array[String], js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]) => Callback
      ): Self = StObject.set(x, "readImages", js.Any.fromFunction2((t0: js.Array[String], t1: js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]) => (value(t0, t1)).runNow()))
      
      inline def setRender(value: (Layout, String, CompositorOption, js.Function1[/* error */ js.Error, Unit]) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction4((t0: Layout, t1: String, t2: CompositorOption, t3: js.Function1[/* error */ js.Error, Unit]) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.all
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.none
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sub
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.up
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.average
    - typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.paeth
  */
  trait CompositorFilters extends StObject
  object CompositorFilters {
    
    inline def all: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.all = "all".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.all]
    
    inline def average: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.average = "average".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.average]
    
    inline def none: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.none = "none".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.none]
    
    inline def paeth: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.paeth = "paeth".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.paeth]
    
    inline def sub: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sub = "sub".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sub]
    
    inline def up: typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.up = "up".asInstanceOf[typingsJapgolly.nodeSpriteGenerator.nodeSpriteGeneratorStrings.up]
  }
  
  trait CompositorOption extends StObject {
    
    var compressionLevel: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[CompositorFilters] = js.undefined
  }
  object CompositorOption {
    
    inline def apply(): CompositorOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositorOption]
    }
    
    extension [Self <: CompositorOption](x: Self) {
      
      inline def setCompressionLevel(value: Double): Self = StObject.set(x, "compressionLevel", value.asInstanceOf[js.Any])
      
      inline def setCompressionLevelUndefined: Self = StObject.set(x, "compressionLevel", js.undefined)
      
      inline def setFilter(value: CompositorFilters): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  trait Image extends StObject {
    
    var data: Any
    
    var height: Double
    
    var width: Double
  }
  object Image {
    
    inline def apply(data: Any, height: Double, width: Double): Image = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Layout extends StObject {
    
    var height: Double
    
    var images: js.Array[xnumberynumberImage]
    
    var width: Double
  }
  object Layout {
    
    inline def apply(height: Double, images: js.Array[xnumberynumberImage], width: Double): Layout = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    extension [Self <: Layout](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[xnumberynumberImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: xnumberynumberImage*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type LayoutFunc = js.Function3[
    /* images */ js.Array[Image], 
    /* options */ LayoutOption, 
    /* callback */ js.Function2[/* error */ js.Error, /* layout */ Layout, Unit], 
    Unit
  ]
  
  trait LayoutOption extends StObject {
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var scaling: js.UndefOr[Double] = js.undefined
  }
  object LayoutOption {
    
    inline def apply(): LayoutOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutOption]
    }
    
    extension [Self <: LayoutOption](x: Self) {
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setScaling(value: Double): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
      
      inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    }
  }
  
  trait Option extends StObject {
    
    var compositor: js.UndefOr[BuiltinCompositors | Compositor] = js.undefined
    
    var compositorOptions: js.UndefOr[CompositorOption] = js.undefined
    
    var layout: js.UndefOr[BuiltinLayouts | LayoutFunc] = js.undefined
    
    var layoutOptions: js.UndefOr[LayoutOption] = js.undefined
    
    var spritePath: js.UndefOr[String] = js.undefined
    
    var src: js.UndefOr[js.Array[String]] = js.undefined
    
    var stylesheet: js.UndefOr[BuiltinStylesheetFormats | StylesheetFunc | String] = js.undefined
    
    var stylesheetOptions: js.UndefOr[StylesheetOption] = js.undefined
    
    var stylesheetPath: js.UndefOr[String] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setCompositor(value: BuiltinCompositors | Compositor): Self = StObject.set(x, "compositor", value.asInstanceOf[js.Any])
      
      inline def setCompositorOptions(value: CompositorOption): Self = StObject.set(x, "compositorOptions", value.asInstanceOf[js.Any])
      
      inline def setCompositorOptionsUndefined: Self = StObject.set(x, "compositorOptions", js.undefined)
      
      inline def setCompositorUndefined: Self = StObject.set(x, "compositor", js.undefined)
      
      inline def setLayout(value: BuiltinLayouts | LayoutFunc): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutFunction3(
        value: (/* images */ js.Array[Image], /* options */ LayoutOption, /* callback */ js.Function2[/* error */ js.Error, /* layout */ Layout, Unit]) => Callback
      ): Self = StObject.set(x, "layout", js.Any.fromFunction3((t0: /* images */ js.Array[Image], t1: /* options */ LayoutOption, t2: /* callback */ js.Function2[/* error */ js.Error, /* layout */ Layout, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setLayoutOptions(value: LayoutOption): Self = StObject.set(x, "layoutOptions", value.asInstanceOf[js.Any])
      
      inline def setLayoutOptionsUndefined: Self = StObject.set(x, "layoutOptions", js.undefined)
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setSpritePath(value: String): Self = StObject.set(x, "spritePath", value.asInstanceOf[js.Any])
      
      inline def setSpritePathUndefined: Self = StObject.set(x, "spritePath", js.undefined)
      
      inline def setSrc(value: js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value*))
      
      inline def setStylesheet(value: BuiltinStylesheetFormats | StylesheetFunc | String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      inline def setStylesheetFunction5(
        value: (/* layout */ Layout, /* stylesheetPath */ String, /* spritePath */ String, /* options */ StylesheetOption, /* callback */ js.Function1[/* error */ js.Error, Unit]) => Callback
      ): Self = StObject.set(x, "stylesheet", js.Any.fromFunction5((t0: /* layout */ Layout, t1: /* stylesheetPath */ String, t2: /* spritePath */ String, t3: /* options */ StylesheetOption, t4: /* callback */ js.Function1[/* error */ js.Error, Unit]) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setStylesheetOptions(value: StylesheetOption): Self = StObject.set(x, "stylesheetOptions", value.asInstanceOf[js.Any])
      
      inline def setStylesheetOptionsUndefined: Self = StObject.set(x, "stylesheetOptions", js.undefined)
      
      inline def setStylesheetPath(value: String): Self = StObject.set(x, "stylesheetPath", value.asInstanceOf[js.Any])
      
      inline def setStylesheetPathUndefined: Self = StObject.set(x, "stylesheetPath", js.undefined)
      
      inline def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
    }
  }
  
  type StylesheetFunc = js.Function5[
    /* layout */ Layout, 
    /* stylesheetPath */ String, 
    /* spritePath */ String, 
    /* options */ StylesheetOption, 
    /* callback */ js.Function1[/* error */ js.Error, Unit], 
    Unit
  ]
  
  trait StylesheetOption extends StObject {
    
    var nameMapping: js.UndefOr[js.Function0[String]] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var spritePath: js.UndefOr[String] = js.undefined
  }
  object StylesheetOption {
    
    inline def apply(): StylesheetOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylesheetOption]
    }
    
    extension [Self <: StylesheetOption](x: Self) {
      
      inline def setNameMapping(value: CallbackTo[String]): Self = StObject.set(x, "nameMapping", value.toJsFn)
      
      inline def setNameMappingUndefined: Self = StObject.set(x, "nameMapping", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSpritePath(value: String): Self = StObject.set(x, "spritePath", value.asInstanceOf[js.Any])
      
      inline def setSpritePathUndefined: Self = StObject.set(x, "spritePath", js.undefined)
    }
  }
}
