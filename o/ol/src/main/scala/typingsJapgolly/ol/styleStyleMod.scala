package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.renderMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleStyleMod {
  
  @JSImport("ol/style/Style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/style/Style", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Style {
    def this(opt_options: Options) = this()
  }
  
  inline def createDefaultStyle(feature: FeatureLike, resolution: Double): js.Array[Style] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultStyle")(feature.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any])).asInstanceOf[js.Array[Style]]
  
  inline def createEditingStyle(): /* import warning: importer.ImportType#apply Failed type conversion: {[ key in ol.ol/geom/GeometryType.GeometryType ]: std.Array<ol.ol/style/Style.Style>} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditingStyle")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ key in ol.ol/geom/GeometryType.GeometryType ]: std.Array<ol.ol/style/Style.Style>} */ js.Any]
  
  inline def toFunction(obj: js.Array[Style]): StyleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[StyleFunction]
  inline def toFunction(obj: Style): StyleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[StyleFunction]
  inline def toFunction(obj: StyleFunction): StyleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[StyleFunction]
  
  type GeometryFunction = js.Function1[
    /* p0 */ FeatureLike, 
    js.UndefOr[
      typingsJapgolly.ol.geomGeometryMod.default | typingsJapgolly.ol.renderFeatureMod.default
    ]
  ]
  
  trait Options extends StObject {
    
    var fill: js.UndefOr[typingsJapgolly.ol.styleFillMod.default] = js.undefined
    
    var geometry: js.UndefOr[String | typingsJapgolly.ol.geomGeometryMod.default | GeometryFunction] = js.undefined
    
    var image: js.UndefOr[typingsJapgolly.ol.styleImageMod.default] = js.undefined
    
    var renderer: js.UndefOr[RenderFunction] = js.undefined
    
    var stroke: js.UndefOr[typingsJapgolly.ol.styleStrokeMod.default] = js.undefined
    
    var text: js.UndefOr[typingsJapgolly.ol.styleTextMod.default] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFill(value: typingsJapgolly.ol.styleFillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGeometry(value: String | typingsJapgolly.ol.geomGeometryMod.default | GeometryFunction): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryFunction1(
        value: /* p0 */ FeatureLike => js.UndefOr[
              typingsJapgolly.ol.geomGeometryMod.default | typingsJapgolly.ol.renderFeatureMod.default
            ]
      ): Self = StObject.set(x, "geometry", js.Any.fromFunction1(value))
      
      inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      inline def setImage(value: typingsJapgolly.ol.styleImageMod.default): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setRenderer(
        value: (/* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), /* p1 */ State) => Callback
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction2((t0: /* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), t1: /* p1 */ State) => (value(t0, t1)).runNow()))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setStroke(value: typingsJapgolly.ol.styleStrokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setText(value: typingsJapgolly.ol.styleTextMod.default): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type RenderFunction = js.Function2[
    /* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), 
    /* p1 */ State, 
    Unit
  ]
  
  @js.native
  trait Style extends StObject {
    
    /**
      * Get the fill style.
      */
    def getFill(): typingsJapgolly.ol.styleFillMod.default = js.native
    
    /**
      * Get the geometry to be rendered.
      */
    def getGeometry(): String | typingsJapgolly.ol.geomGeometryMod.default | GeometryFunction = js.native
    
    /**
      * Get the function used to generate a geometry for rendering.
      */
    def getGeometryFunction(): GeometryFunction = js.native
    
    /**
      * Get the image style.
      */
    def getImage(): typingsJapgolly.ol.styleImageMod.default = js.native
    
    /**
      * Get the custom renderer function that was configured with
      * {@link #setRenderer} or the renderer constructor option.
      */
    def getRenderer(): RenderFunction | Null = js.native
    
    /**
      * Get the stroke style.
      */
    def getStroke(): typingsJapgolly.ol.styleStrokeMod.default = js.native
    
    /**
      * Get the text style.
      */
    def getText(): typingsJapgolly.ol.styleTextMod.default = js.native
    
    /**
      * Get the z-index for the style.
      */
    def getZIndex(): js.UndefOr[Double] = js.native
    
    /**
      * Set the fill style.
      */
    def setFill(fill: typingsJapgolly.ol.styleFillMod.default): Unit = js.native
    
    /**
      * Set a geometry that is rendered instead of the feature's geometry.
      */
    def setGeometry(geometry: String): Unit = js.native
    def setGeometry(geometry: typingsJapgolly.ol.geomGeometryMod.default): Unit = js.native
    def setGeometry(geometry: GeometryFunction): Unit = js.native
    
    /**
      * Set the image style.
      */
    def setImage(image: typingsJapgolly.ol.styleImageMod.default): Unit = js.native
    
    /**
      * Sets a custom renderer function for this style. When set, fill, stroke
      * and image options of the style will be ignored.
      */
    def setRenderer(): Unit = js.native
    def setRenderer(renderer: RenderFunction): Unit = js.native
    
    /**
      * Set the stroke style.
      */
    def setStroke(stroke: typingsJapgolly.ol.styleStrokeMod.default): Unit = js.native
    
    /**
      * Set the text style.
      */
    def setText(text: typingsJapgolly.ol.styleTextMod.default): Unit = js.native
    
    /**
      * Set the z-index.
      */
    def setZIndex(): Unit = js.native
    def setZIndex(zIndex: Double): Unit = js.native
  }
  
  type StyleFunction = js.Function2[/* p0 */ FeatureLike, /* p1 */ Double, Style | js.Array[Style]]
  
  type StyleLike = Style | js.Array[Style] | StyleFunction
}
