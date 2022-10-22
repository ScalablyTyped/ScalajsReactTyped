package typingsJapgolly.openlayers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureloader {
  
  @JSImport("openlayers", "featureloader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create an XHR feature loader for a `url` and `format`. The feature loader
    * loads features (with XHR), parses the features, and adds them to the
    * vector tile.
    * @param url Feature URL service.
    * @param format Feature format.
    * @return The feature loader.
    * @api
    */
  inline def tile(url: String, format: typingsJapgolly.openlayers.mod.format.Feature): FeatureLoader_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tile")(url.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FeatureLoader_]
  inline def tile(url: FeatureUrlFunction, format: typingsJapgolly.openlayers.mod.format.Feature): FeatureLoader_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tile")(url.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FeatureLoader_]
  
  /**
    * Create an XHR feature loader for a `url` and `format`. The feature loader
    * loads features (with XHR), parses the features, and adds them to the
    * vector source.
    * @param url Feature URL service.
    * @param format Feature format.
    * @return The feature loader.
    * @api
    */
  inline def xhr(url: String, format: typingsJapgolly.openlayers.mod.format.Feature): FeatureLoader_ = (^.asInstanceOf[js.Dynamic].applyDynamic("xhr")(url.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FeatureLoader_]
  inline def xhr(url: FeatureUrlFunction, format: typingsJapgolly.openlayers.mod.format.Feature): FeatureLoader_ = (^.asInstanceOf[js.Dynamic].applyDynamic("xhr")(url.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FeatureLoader_]
}
