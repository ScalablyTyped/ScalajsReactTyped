package typingsJapgolly.heremaps.H.service.metaInfo

import typingsJapgolly.heremaps.H.map.layer.TileLayer
import typingsJapgolly.heremaps.H.service.IConfigurable
import typingsJapgolly.heremaps.H.service.ServiceParameters
import typingsJapgolly.heremaps.H.service.metaInfo.Service.Info
import typingsJapgolly.heremaps.H.service.metaInfo.Service.Options
import typingsJapgolly.heremaps.H.util.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class encapsulates a Metainfo Tile end point of the HERE Map Tile API.
  */
@JSGlobal("H.service.metaInfo.Service")
@js.native
/**
  * Constructor
  * @param opt_options {H.service.metaInfo.Service.Options=} - additional service parameters
  */
class Service_ ()
  extends EventTarget
     with IConfigurable {
  def this(opt_options: Options) = this()
  /**
    * This method creates a tile layer. This layer can be used as a layer on a map's data model.
    * @param tileSize {number} - The tile size
    * @param pixelRatio {number} - The tile's pixel ratio, should be aligned with base map tile
    * @param opt_categoryFilter {Array<string>=} - A list of meta-info category names which should be suppressed. See Metainfo Tile for valid category names.
    * @param opt_additionalParameters {H.service.ServiceParameters=} - Additional parameters for the meta info service
    * @param opt_tileType {string=} - the tile type (default is 'maptile')
    * @param opt_scheme {string=} - the scheme for which the meta info tiles a requested (default is 'normal.day')
    * @returns {H.map.layer.TileLayer} - the tile layer
    */
  def createTileLayer(tileSize: Double, pixelRatio: Double): TileLayer = js.native
  def createTileLayer(tileSize: Double, pixelRatio: Double, opt_categoryFilter: js.Array[String]): TileLayer = js.native
  def createTileLayer(
    tileSize: Double,
    pixelRatio: Double,
    opt_categoryFilter: js.Array[String],
    opt_additionalParameters: ServiceParameters
  ): TileLayer = js.native
  def createTileLayer(
    tileSize: Double,
    pixelRatio: Double,
    opt_categoryFilter: js.Array[String],
    opt_additionalParameters: ServiceParameters,
    opt_tileType: String
  ): TileLayer = js.native
  def createTileLayer(
    tileSize: Double,
    pixelRatio: Double,
    opt_categoryFilter: js.Array[String],
    opt_additionalParameters: ServiceParameters,
    opt_tileType: String,
    opt_scheme: String
  ): TileLayer = js.native
  /**
    * This method creates a tile provider which uses the meta info tile backend. This provider can be used as a data source for an TileLayer.
    * @param tileSize {number} - The tile size
    * @param pixelRatio {number} - The tile's pixel ratio, should be aligned with base map tile
    * @param opt_categoryFilter {Array<string>=} - A list of meta-info category names which should be suppressed. See Metainfo Tile for valid category names.
    * @param opt_additionalParameters {H.service.ServiceParameters=} - Additional parameters for the meta info service
    * @param opt_tileType {string=} - the tile type (default is 'maptile')
    * @param opt_scheme {string=} - the scheme for which the meta info tiles a requested (default is 'normal.day')
    * @returns {H.map.provider.TileProvider} - the tile provider
    */
  def createTileProvider(tileSize: Double, pixelRatio: Double): typingsJapgolly.heremaps.H.map.provider.TileProvider = js.native
  def createTileProvider(tileSize: Double, pixelRatio: Double, opt_categoryFilter: js.Array[String]): typingsJapgolly.heremaps.H.map.provider.TileProvider = js.native
  def createTileProvider(
    tileSize: Double,
    pixelRatio: Double,
    opt_categoryFilter: js.Array[String],
    opt_additionalParameters: ServiceParameters
  ): typingsJapgolly.heremaps.H.map.provider.TileProvider = js.native
  def createTileProvider(
    tileSize: Double,
    pixelRatio: Double,
    opt_categoryFilter: js.Array[String],
    opt_additionalParameters: ServiceParameters,
    opt_tileType: String
  ): typingsJapgolly.heremaps.H.map.provider.TileProvider = js.native
  def createTileProvider(
    tileSize: Double,
    pixelRatio: Double,
    opt_categoryFilter: js.Array[String],
    opt_additionalParameters: ServiceParameters,
    opt_tileType: String,
    opt_scheme: String
  ): typingsJapgolly.heremaps.H.map.provider.TileProvider = js.native
  /**
    * This method returns the meta info tile service's meta information. The method will return an object once the map tile service's data has been fetched.
    * @returns {(H.service.metaInfo.Service.Info | undefined)} - meta information for this meta info tile service
    */
  def getInfo(): Info | Unit = js.native
  /**
    * This method returns the meta info tile service's newest version hash.
    * @returns {string} - meta information for this map tile service
    */
  def getVersion(): String = js.native
}

