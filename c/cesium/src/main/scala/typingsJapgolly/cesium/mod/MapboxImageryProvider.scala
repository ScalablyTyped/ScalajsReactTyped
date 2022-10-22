package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.mod.MapboxImageryProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "MapboxImageryProvider")
@js.native
open class MapboxImageryProvider protected () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
    * the source of the imagery. This function should
    * not be called before {@link MapboxImageryProvider#ready} returns true.
    */
  val credit: Credit = js.native
  
  /**
    * The default alpha blending value of this provider, with 0.0 representing fully transparent and
    * 1.0 representing fully opaque.
    */
  var defaultAlpha: js.UndefOr[Double] = js.native
  
  /**
    * The default brightness of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0
    * makes the imagery darker while greater than 1.0 makes it brighter.
    */
  var defaultBrightness: js.UndefOr[Double] = js.native
  
  /**
    * The default contrast of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0 reduces
    * the contrast while greater than 1.0 increases it.
    */
  var defaultContrast: js.UndefOr[Double] = js.native
  
  /**
    * The default alpha blending value on the day side of the globe of this provider, with 0.0 representing fully transparent and
    * 1.0 representing fully opaque.
    */
  var defaultDayAlpha: js.UndefOr[Double] = js.native
  
  /**
    * The default gamma correction to apply to this provider.  1.0 uses the unmodified imagery color.
    */
  var defaultGamma: js.UndefOr[Double] = js.native
  
  /**
    * The default hue of this provider in radians. 0.0 uses the unmodified imagery color.
    */
  var defaultHue: js.UndefOr[Double] = js.native
  
  /**
    * The default texture magnification filter to apply to this provider.
    */
  var defaultMagnificationFilter: TextureMagnificationFilter = js.native
  
  /**
    * The default texture minification filter to apply to this provider.
    */
  var defaultMinificationFilter: TextureMinificationFilter = js.native
  
  /**
    * The default alpha blending value on the night side of the globe of this provider, with 0.0 representing fully transparent and
    * 1.0 representing fully opaque.
    */
  var defaultNightAlpha: js.UndefOr[Double] = js.native
  
  /**
    * The default saturation of this provider. 1.0 uses the unmodified imagery color. Less than 1.0 reduces the
    * saturation while greater than 1.0 increases it.
    */
  var defaultSaturation: js.UndefOr[Double] = js.native
  
  /**
    * Gets an event that is raised when the imagery provider encounters an asynchronous error..  By subscribing
    * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
    * are passed an instance of {@link TileProviderError}.
    */
  val errorEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the credits to be displayed when a given tile is displayed.
    * @param x - The tile X coordinate.
    * @param y - The tile Y coordinate.
    * @param level - The tile level;
    * @returns The credits to be displayed when the tile is displayed.
    */
  def getTileCredits(x: Double, y: Double, level: Double): js.Array[Credit] = js.native
  
  /**
    * Gets a value indicating whether or not the images provided by this imagery provider
    * include an alpha channel.  If this property is false, an alpha channel, if present, will
    * be ignored.  If this property is true, any images without an alpha channel will be treated
    * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
    * and texture upload time are reduced.
    */
  val hasAlphaChannel: Boolean = js.native
  
  /**
    * Gets the maximum level-of-detail that can be requested.  This function should
    * not be called before {@link MapboxImageryProvider#ready} returns true.
    */
  val maximumLevel: js.UndefOr[Double] = js.native
  
  /**
    * Gets the minimum level-of-detail that can be requested.  This function should
    * not be called before {@link MapboxImageryProvider#ready} returns true. Generally,
    * a minimum level should only be used when the rectangle of the imagery is small
    * enough that the number of tiles at the minimum level is small.  An imagery
    * provider with more than a few tiles at the minimum level will lead to
    * rendering problems.
    */
  val minimumLevel: Double = js.native
  
  /**
    * Asynchronously determines what features, if any, are located at a given longitude and latitude within
    * a tile.  This function should not be called before {@link MapboxImageryProvider#ready} returns true.
    * This function is optional, so it may not exist on all ImageryProviders.
    * @param x - The tile X coordinate.
    * @param y - The tile Y coordinate.
    * @param level - The tile level.
    * @param longitude - The longitude at which to pick features.
    * @param latitude - The latitude at which to pick features.
    * @returns A promise for the picked features that will resolve when the asynchronous
    *                   picking completes.  The resolved value is an array of {@link ImageryLayerFeatureInfo}
    *                   instances.  The array may be empty if no features are found at the given location.
    *                   It may also be undefined if picking is not supported.
    */
  def pickFeatures(x: Double, y: Double, level: Double, longitude: Double, latitude: Double): js.UndefOr[js.Promise[js.Array[ImageryLayerFeatureInfo]]] = js.native
  
  /**
    * Gets the proxy used by this provider.
    */
  val proxy: Proxy = js.native
  
  /**
    * Gets a value indicating whether or not the provider is ready for use.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets a promise that resolves to true when the provider is ready for use.
    */
  val readyPromise: js.Promise[Boolean] = js.native
  
  /**
    * Gets the rectangle, in radians, of the imagery provided by the instance.  This function should
    * not be called before {@link MapboxImageryProvider#ready} returns true.
    */
  val rectangle: Rectangle = js.native
  
  /**
    * Requests the image for a given tile.  This function should
    * not be called before {@link MapboxImageryProvider#ready} returns true.
    * @param x - The tile X coordinate.
    * @param y - The tile Y coordinate.
    * @param level - The tile level.
    * @param [request] - The request object. Intended for internal use only.
    * @returns A promise for the image that will resolve when the image is available, or
    *          undefined if there are too many active requests to the server, and the request should be retried later.
    */
  def requestImage(x: Double, y: Double, level: Double): js.UndefOr[js.Promise[ImageryTypes]] = js.native
  def requestImage(x: Double, y: Double, level: Double, request: Request): js.UndefOr[js.Promise[ImageryTypes]] = js.native
  
  /**
    * Gets the tile discard policy.  If not undefined, the discard policy is responsible
    * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
    * returns undefined, no tiles are filtered.  This function should
    * not be called before {@link MapboxImageryProvider#ready} returns true.
    */
  val tileDiscardPolicy: TileDiscardPolicy = js.native
  
  /**
    * Gets the height of each tile, in pixels.  This function should
    * not be called before {@link MapboxImageryProvider#ready} returns true.
    */
  val tileHeight: Double = js.native
  
  /**
    * Gets the width of each tile, in pixels.  This function should
    * not be called before {@link MapboxImageryProvider#ready} returns true.
    */
  val tileWidth: Double = js.native
  
  /**
    * Gets the tiling scheme used by the provider.  This function should
    * not be called before {@link MapboxImageryProvider#ready} returns true.
    */
  val tilingScheme: TilingScheme = js.native
  
  /**
    * Gets the URL of the Mapbox server.
    */
  val url: String = js.native
}
object MapboxImageryProvider {
  
  /**
    * Initialization options for the MapboxImageryProvider constructor
    * @property [url = 'https://api.mapbox.com/v4/'] - The Mapbox server url.
    * @property mapId - The Mapbox Map ID.
    * @property accessToken - The public access token for the imagery.
    * @property [format = 'png'] - The format of the image request.
    * @property [ellipsoid] - The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
    * @property [minimumLevel = 0] - The minimum level-of-detail supported by the imagery provider.  Take care when specifying
    *                 this that the number of tiles at the minimum level is small, such as four or less.  A larger number is likely
    *                 to result in rendering problems.
    * @property [maximumLevel] - The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit.
    * @property [rectangle = Rectangle.MAX_VALUE] - The rectangle, in radians, covered by the image.
    * @property [credit] - A credit for the data source, which is displayed on the canvas.
    */
  trait ConstructorOptions extends StObject {
    
    var accessToken: String
    
    var credit: js.UndefOr[Credit | String] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var mapId: String
    
    var maximumLevel: js.UndefOr[Double] = js.undefined
    
    var minimumLevel: js.UndefOr[Double] = js.undefined
    
    var rectangle: js.UndefOr[Rectangle] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(accessToken: String, mapId: String): ConstructorOptions = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setCredit(value: Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      inline def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
      
      inline def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
      
      inline def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
      
      inline def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
      
      inline def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
