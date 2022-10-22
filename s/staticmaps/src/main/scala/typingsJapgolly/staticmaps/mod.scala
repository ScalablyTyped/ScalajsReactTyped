package typingsJapgolly.staticmaps

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.sharp.mod.JpegOptions
import typingsJapgolly.sharp.mod.OutputOptions
import typingsJapgolly.sharp.mod.PngOptions
import typingsJapgolly.sharp.mod.WebpOptions
import typingsJapgolly.staticmaps.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("staticmaps", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StaticMaps {
    def this(options: StaticMapsOptions) = this()
  }
  
  trait AddLineOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var coords: js.Array[js.Tuple2[Double, Double]]
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object AddLineOptions {
    
    inline def apply(coords: js.Array[js.Tuple2[Double, Double]]): AddLineOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddLineOptions]
    }
    
    extension [Self <: AddLineOptions](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCoords(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "coords", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AddMarkerOptions extends StObject {
    
    var coord: js.Tuple2[Double, Double]
    
    var height: Double
    
    var img: String
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var width: Double
  }
  object AddMarkerOptions {
    
    inline def apply(coord: js.Tuple2[Double, Double], height: Double, img: String, width: Double): AddMarkerOptions = {
      val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddMarkerOptions]
    }
    
    extension [Self <: AddMarkerOptions](x: Self) {
      
      inline def setCoord(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait AddMultiPolygonOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var coords: js.Array[js.Array[js.Tuple2[Double, Double]]]
    
    var fill: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object AddMultiPolygonOptions {
    
    inline def apply(coords: js.Array[js.Array[js.Tuple2[Double, Double]]]): AddMultiPolygonOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddMultiPolygonOptions]
    }
    
    extension [Self <: AddMultiPolygonOptions](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCoords(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsVarargs(value: (js.Array[js.Tuple2[Double, Double]])*): Self = StObject.set(x, "coords", js.Array(value*))
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AddPolygonOptions
    extends StObject
       with AddLineOptions {
    
    var fill: js.UndefOr[String] = js.undefined
  }
  object AddPolygonOptions {
    
    inline def apply(coords: js.Array[js.Tuple2[Double, Double]]): AddPolygonOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddPolygonOptions]
    }
    
    extension [Self <: AddPolygonOptions](x: Self) {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    }
  }
  
  trait AddTextOptions extends StObject {
    
    /**
      * Anchor of the text
      * @default 'start'
      */
    var anchor: js.UndefOr[TextAnchor] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var coord: js.Tuple2[Double, Double]
    
    var fill: js.UndefOr[String] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var text: String
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object AddTextOptions {
    
    inline def apply(coord: js.Tuple2[Double, Double], text: String): AddTextOptions = {
      val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddTextOptions]
    }
    
    extension [Self <: AddTextOptions](x: Self) {
      
      inline def setAnchor(value: TextAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCoord(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait StaticMaps extends StObject {
    
    def addLine(options: AddLineOptions): Unit = js.native
    
    def addMarker(options: AddMarkerOptions): Unit = js.native
    
    def addMultiPolygon(options: AddMultiPolygonOptions): Unit = js.native
    
    def addPolygon(options: AddPolygonOptions): Unit = js.native
    
    def addText(options: AddTextOptions): Unit = js.native
    
    var image: StaticMapsImage = js.native
    
    def render(): js.Promise[Unit] = js.native
    def render(center: js.Array[Double]): js.Promise[Unit] = js.native
    def render(center: js.Array[Double], zoom: Double): js.Promise[Unit] = js.native
    def render(center: Unit, zoom: Double): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait StaticMapsImage extends StObject {
    
    def buffer(): js.Promise[Buffer] = js.native
    def buffer(mime: String): js.Promise[Buffer] = js.native
    def buffer(mime: String, outputOptions: JpegOptions): js.Promise[Buffer] = js.native
    def buffer(mime: String, outputOptions: OutputOptions): js.Promise[Buffer] = js.native
    def buffer(mime: String, outputOptions: PngOptions): js.Promise[Buffer] = js.native
    def buffer(mime: String, outputOptions: WebpOptions): js.Promise[Buffer] = js.native
    def buffer(mime: Unit, outputOptions: JpegOptions): js.Promise[Buffer] = js.native
    def buffer(mime: Unit, outputOptions: OutputOptions): js.Promise[Buffer] = js.native
    def buffer(mime: Unit, outputOptions: PngOptions): js.Promise[Buffer] = js.native
    def buffer(mime: Unit, outputOptions: WebpOptions): js.Promise[Buffer] = js.native
    
    var image: Buffer = js.native
    
    def save(): js.Promise[Unit] = js.native
    def save(fileName: String): js.Promise[Unit] = js.native
    def save(fileName: String, outputOptions: JpegOptions): js.Promise[Unit] = js.native
    def save(fileName: String, outputOptions: OutputOptions): js.Promise[Unit] = js.native
    def save(fileName: String, outputOptions: PngOptions): js.Promise[Unit] = js.native
    def save(fileName: String, outputOptions: WebpOptions): js.Promise[Unit] = js.native
    def save(fileName: Unit, outputOptions: JpegOptions): js.Promise[Unit] = js.native
    def save(fileName: Unit, outputOptions: OutputOptions): js.Promise[Unit] = js.native
    def save(fileName: Unit, outputOptions: PngOptions): js.Promise[Unit] = js.native
    def save(fileName: Unit, outputOptions: WebpOptions): js.Promise[Unit] = js.native
  }
  
  trait StaticMapsOptions extends StObject {
    
    var height: Double
    
    /** @deprecated Use zoomRange.max instead: */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var paddingX: js.UndefOr[Double] = js.undefined
    
    var paddingY: js.UndefOr[Double] = js.undefined
    
    var reverseY: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Subdomains of tile server
      * @default []
      */
    var subdomains: js.UndefOr[js.Array[String]] = js.undefined
    
    var tileRequestHeader: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Limit concurrent connections to the tiles server
      * @default 2
      */
    var tileRequestLimit: js.UndefOr[Double] = js.undefined
    
    var tileRequestTimeout: js.UndefOr[Double] = js.undefined
    
    var tileSize: js.UndefOr[Double] = js.undefined
    
    var tileUrl: js.UndefOr[String] = js.undefined
    
    var width: Double
    
    /**
      * Defines the range of zoom levels to try
      */
    var zoomRange: js.UndefOr[Max] = js.undefined
  }
  object StaticMapsOptions {
    
    inline def apply(height: Double, width: Double): StaticMapsOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticMapsOptions]
    }
    
    extension [Self <: StaticMapsOptions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setReverseY(value: Boolean): Self = StObject.set(x, "reverseY", value.asInstanceOf[js.Any])
      
      inline def setReverseYUndefined: Self = StObject.set(x, "reverseY", js.undefined)
      
      inline def setSubdomains(value: js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
      
      inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
      
      inline def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value*))
      
      inline def setTileRequestHeader(value: js.Object): Self = StObject.set(x, "tileRequestHeader", value.asInstanceOf[js.Any])
      
      inline def setTileRequestHeaderUndefined: Self = StObject.set(x, "tileRequestHeader", js.undefined)
      
      inline def setTileRequestLimit(value: Double): Self = StObject.set(x, "tileRequestLimit", value.asInstanceOf[js.Any])
      
      inline def setTileRequestLimitUndefined: Self = StObject.set(x, "tileRequestLimit", js.undefined)
      
      inline def setTileRequestTimeout(value: Double): Self = StObject.set(x, "tileRequestTimeout", value.asInstanceOf[js.Any])
      
      inline def setTileRequestTimeoutUndefined: Self = StObject.set(x, "tileRequestTimeout", js.undefined)
      
      inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTileUrl(value: String): Self = StObject.set(x, "tileUrl", value.asInstanceOf[js.Any])
      
      inline def setTileUrlUndefined: Self = StObject.set(x, "tileUrl", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setZoomRange(value: Max): Self = StObject.set(x, "zoomRange", value.asInstanceOf[js.Any])
      
      inline def setZoomRangeUndefined: Self = StObject.set(x, "zoomRange", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.staticmaps.staticmapsStrings.start
    - typingsJapgolly.staticmaps.staticmapsStrings.middle
    - typingsJapgolly.staticmaps.staticmapsStrings.end
  */
  trait TextAnchor extends StObject
  object TextAnchor {
    
    inline def end: typingsJapgolly.staticmaps.staticmapsStrings.end = "end".asInstanceOf[typingsJapgolly.staticmaps.staticmapsStrings.end]
    
    inline def middle: typingsJapgolly.staticmaps.staticmapsStrings.middle = "middle".asInstanceOf[typingsJapgolly.staticmaps.staticmapsStrings.middle]
    
    inline def start: typingsJapgolly.staticmaps.staticmapsStrings.start = "start".asInstanceOf[typingsJapgolly.staticmaps.staticmapsStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.staticmaps.staticmapsInts.`1`
    - typingsJapgolly.staticmaps.staticmapsInts.`2`
    - typingsJapgolly.staticmaps.staticmapsInts.`3`
    - typingsJapgolly.staticmaps.staticmapsInts.`4`
    - typingsJapgolly.staticmaps.staticmapsInts.`5`
    - typingsJapgolly.staticmaps.staticmapsInts.`6`
    - typingsJapgolly.staticmaps.staticmapsInts.`7`
    - typingsJapgolly.staticmaps.staticmapsInts.`8`
    - typingsJapgolly.staticmaps.staticmapsInts.`9`
    - typingsJapgolly.staticmaps.staticmapsInts.`10`
    - typingsJapgolly.staticmaps.staticmapsInts.`11`
    - typingsJapgolly.staticmaps.staticmapsInts.`12`
    - typingsJapgolly.staticmaps.staticmapsInts.`13`
    - typingsJapgolly.staticmaps.staticmapsInts.`14`
    - typingsJapgolly.staticmaps.staticmapsInts.`15`
    - typingsJapgolly.staticmaps.staticmapsInts.`16`
    - typingsJapgolly.staticmaps.staticmapsInts.`17`
    - typingsJapgolly.staticmaps.staticmapsInts.`18`
    - typingsJapgolly.staticmaps.staticmapsInts.`19`
    - typingsJapgolly.staticmaps.staticmapsInts.`20`
    - typingsJapgolly.staticmaps.staticmapsInts.`21`
    - typingsJapgolly.staticmaps.staticmapsInts.`22`
    - typingsJapgolly.staticmaps.staticmapsInts.`23`
  */
  trait ZoomLevel extends StObject
  object ZoomLevel {
    
    inline def `1`: typingsJapgolly.staticmaps.staticmapsInts.`1` = 1.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`1`]
    
    inline def `10`: typingsJapgolly.staticmaps.staticmapsInts.`10` = 10.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`10`]
    
    inline def `11`: typingsJapgolly.staticmaps.staticmapsInts.`11` = 11.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`11`]
    
    inline def `12`: typingsJapgolly.staticmaps.staticmapsInts.`12` = 12.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`12`]
    
    inline def `13`: typingsJapgolly.staticmaps.staticmapsInts.`13` = 13.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`13`]
    
    inline def `14`: typingsJapgolly.staticmaps.staticmapsInts.`14` = 14.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`14`]
    
    inline def `15`: typingsJapgolly.staticmaps.staticmapsInts.`15` = 15.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`15`]
    
    inline def `16`: typingsJapgolly.staticmaps.staticmapsInts.`16` = 16.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`16`]
    
    inline def `17`: typingsJapgolly.staticmaps.staticmapsInts.`17` = 17.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`17`]
    
    inline def `18`: typingsJapgolly.staticmaps.staticmapsInts.`18` = 18.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`18`]
    
    inline def `19`: typingsJapgolly.staticmaps.staticmapsInts.`19` = 19.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`19`]
    
    inline def `2`: typingsJapgolly.staticmaps.staticmapsInts.`2` = 2.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`2`]
    
    inline def `20`: typingsJapgolly.staticmaps.staticmapsInts.`20` = 20.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`20`]
    
    inline def `21`: typingsJapgolly.staticmaps.staticmapsInts.`21` = 21.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`21`]
    
    inline def `22`: typingsJapgolly.staticmaps.staticmapsInts.`22` = 22.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`22`]
    
    inline def `23`: typingsJapgolly.staticmaps.staticmapsInts.`23` = 23.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`23`]
    
    inline def `3`: typingsJapgolly.staticmaps.staticmapsInts.`3` = 3.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`3`]
    
    inline def `4`: typingsJapgolly.staticmaps.staticmapsInts.`4` = 4.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`4`]
    
    inline def `5`: typingsJapgolly.staticmaps.staticmapsInts.`5` = 5.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`5`]
    
    inline def `6`: typingsJapgolly.staticmaps.staticmapsInts.`6` = 6.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`6`]
    
    inline def `7`: typingsJapgolly.staticmaps.staticmapsInts.`7` = 7.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`7`]
    
    inline def `8`: typingsJapgolly.staticmaps.staticmapsInts.`8` = 8.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`8`]
    
    inline def `9`: typingsJapgolly.staticmaps.staticmapsInts.`9` = 9.asInstanceOf[typingsJapgolly.staticmaps.staticmapsInts.`9`]
  }
}
