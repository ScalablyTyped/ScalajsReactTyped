package typingsJapgolly.openlayers.global.ol

import typingsJapgolly.openlayers.mod.Extent_
import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.olx.tilegrid.TileGridOptions
import typingsJapgolly.openlayers.mod.olx.tilegrid.WMTSOptions
import typingsJapgolly.openlayers.mod.olx.tilegrid.XYZOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilegrid {
  
  @JSGlobal("ol.tilegrid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @classdesc
    * Base class for setting the grid pattern for sources accessing tiled-image
    * servers.
    *
    * @param options Tile grid options.
    * @struct
    * @api stable
    */
  @JSGlobal("ol.tilegrid.TileGrid")
  @js.native
  open class TileGrid protected ()
    extends typingsJapgolly.openlayers.mod.tilegrid.TileGrid {
    /**
      * @classdesc
      * Base class for setting the grid pattern for sources accessing tiled-image
      * servers.
      *
      * @param options Tile grid options.
      * @struct
      * @api stable
      */
    def this(options: TileGridOptions) = this()
  }
  
  /**
    * @classdesc
    * Set the grid pattern for sources accessing WMTS tiled-image servers.
    *
    * @param options WMTS options.
    * @struct
    * @api
    */
  @JSGlobal("ol.tilegrid.WMTS")
  @js.native
  open class WMTS protected ()
    extends typingsJapgolly.openlayers.mod.tilegrid.WMTS {
    /**
      * @classdesc
      * Set the grid pattern for sources accessing WMTS tiled-image servers.
      *
      * @param options WMTS options.
      * @struct
      * @api
      */
    def this(options: WMTSOptions) = this()
  }
  object WMTS {
    
    @JSGlobal("ol.tilegrid.WMTS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a tile grid from a WMTS capabilities matrix set.
      * @param matrixSet An object representing a matrixSet in the
      *     capabilities document.
      * @param opt_extent An optional extent to restrict the tile
      *     ranges the server provides.
      * @return WMTS tileGrid instance.
      * @api
      */
    /* static member */
    inline def createFromCapabilitiesMatrixSet(matrixSet: GlobalObject): typingsJapgolly.openlayers.mod.tilegrid.WMTS = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromCapabilitiesMatrixSet")(matrixSet.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openlayers.mod.tilegrid.WMTS]
    inline def createFromCapabilitiesMatrixSet(matrixSet: GlobalObject, opt_extent: Extent_): typingsJapgolly.openlayers.mod.tilegrid.WMTS = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromCapabilitiesMatrixSet")(matrixSet.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openlayers.mod.tilegrid.WMTS]
  }
  
  /**
    * Creates a tile grid with a standard XYZ tiling scheme.
    * @param opt_options Tile grid options.
    * @return Tile grid instance.
    * @api
    */
  inline def createXYZ(): typingsJapgolly.openlayers.mod.tilegrid.TileGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("createXYZ")().asInstanceOf[typingsJapgolly.openlayers.mod.tilegrid.TileGrid]
  inline def createXYZ(opt_options: XYZOptions): typingsJapgolly.openlayers.mod.tilegrid.TileGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("createXYZ")(opt_options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openlayers.mod.tilegrid.TileGrid]
}
