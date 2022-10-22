package typingsJapgolly.ol

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.renderMod.OrderFunction
import typingsJapgolly.ol.tileStateMod.TileState
import typingsJapgolly.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorRenderTileMod {
  
  @JSImport("ol/VectorRenderTile", JSImport.Default)
  @js.native
  open class default protected () extends VectorRenderTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      urlTileCoord: TileCoord,
      getSourceTiles: js.Function1[/* p0 */ VectorRenderTile, js.Array[typingsJapgolly.ol.vectorTileMod.default]]
    ) = this()
  }
  
  trait ReplayState extends StObject {
    
    var dirty: Boolean
    
    var renderedRenderOrder: Null | OrderFunction
    
    var renderedResolution: Double
    
    var renderedRevision: Double
    
    var renderedTileResolution: Double
    
    var renderedTileRevision: Double
    
    var renderedTileZ: Double
    
    var renderedZ: Double
  }
  object ReplayState {
    
    inline def apply(
      dirty: Boolean,
      renderedResolution: Double,
      renderedRevision: Double,
      renderedTileResolution: Double,
      renderedTileRevision: Double,
      renderedTileZ: Double,
      renderedZ: Double
    ): ReplayState = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], renderedResolution = renderedResolution.asInstanceOf[js.Any], renderedRevision = renderedRevision.asInstanceOf[js.Any], renderedTileResolution = renderedTileResolution.asInstanceOf[js.Any], renderedTileRevision = renderedTileRevision.asInstanceOf[js.Any], renderedTileZ = renderedTileZ.asInstanceOf[js.Any], renderedZ = renderedZ.asInstanceOf[js.Any], renderedRenderOrder = null)
      __obj.asInstanceOf[ReplayState]
    }
    
    extension [Self <: ReplayState](x: Self) {
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setRenderedRenderOrder(value: (/* p0 */ FeatureLike, /* p1 */ FeatureLike) => Double): Self = StObject.set(x, "renderedRenderOrder", js.Any.fromFunction2(value))
      
      inline def setRenderedRenderOrderNull: Self = StObject.set(x, "renderedRenderOrder", null)
      
      inline def setRenderedResolution(value: Double): Self = StObject.set(x, "renderedResolution", value.asInstanceOf[js.Any])
      
      inline def setRenderedRevision(value: Double): Self = StObject.set(x, "renderedRevision", value.asInstanceOf[js.Any])
      
      inline def setRenderedTileResolution(value: Double): Self = StObject.set(x, "renderedTileResolution", value.asInstanceOf[js.Any])
      
      inline def setRenderedTileRevision(value: Double): Self = StObject.set(x, "renderedTileRevision", value.asInstanceOf[js.Any])
      
      inline def setRenderedTileZ(value: Double): Self = StObject.set(x, "renderedTileZ", value.asInstanceOf[js.Any])
      
      inline def setRenderedZ(value: Double): Self = StObject.set(x, "renderedZ", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VectorRenderTile
    extends typingsJapgolly.ol.tileMod.default {
    
    def getContext(layer: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]): CanvasRenderingContext2D = js.native
    
    /**
      * Get the Canvas for this tile.
      */
    def getImage(layer: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]): HTMLCanvasElement = js.native
    
    def getReplayState(layer: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]): ReplayState = js.native
    
    def hasContext(layer: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]): Boolean = js.native
  }
}
