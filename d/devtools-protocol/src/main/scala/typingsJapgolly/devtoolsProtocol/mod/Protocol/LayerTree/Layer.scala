package typingsJapgolly.devtoolsProtocol.mod.Protocol.LayerTree

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer extends StObject {
  
  /**
    * Transform anchor point X, absent if no transform specified
    */
  var anchorX: js.UndefOr[Double] = js.undefined
  
  /**
    * Transform anchor point Y, absent if no transform specified
    */
  var anchorY: js.UndefOr[Double] = js.undefined
  
  /**
    * Transform anchor point Z, absent if no transform specified
    */
  var anchorZ: js.UndefOr[Double] = js.undefined
  
  /**
    * The backend id for the node associated with this layer.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
  /**
    * Indicates whether this layer hosts any content, rather than being used for
    * transform/scrolling purposes only.
    */
  var drawsContent: Boolean
  
  /**
    * Layer height.
    */
  var height: Double
  
  /**
    * Set if layer is not visible.
    */
  var invisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The unique id for this layer.
    */
  var layerId: LayerId
  
  /**
    * Offset from parent layer, X coordinate.
    */
  var offsetX: Double
  
  /**
    * Offset from parent layer, Y coordinate.
    */
  var offsetY: Double
  
  /**
    * Indicates how many time this layer has painted.
    */
  var paintCount: integer
  
  /**
    * The id of parent (not present for root).
    */
  var parentLayerId: js.UndefOr[LayerId] = js.undefined
  
  /**
    * Rectangles scrolling on main thread only.
    */
  var scrollRects: js.UndefOr[js.Array[ScrollRect]] = js.undefined
  
  /**
    * Sticky position constraint information
    */
  var stickyPositionConstraint: js.UndefOr[StickyPositionConstraint] = js.undefined
  
  /**
    * Transformation matrix for layer, default is identity matrix
    */
  var transform: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Layer width.
    */
  var width: Double
}
object Layer {
  
  inline def apply(
    drawsContent: Boolean,
    height: Double,
    layerId: LayerId,
    offsetX: Double,
    offsetY: Double,
    paintCount: integer,
    width: Double
  ): Layer = {
    val __obj = js.Dynamic.literal(drawsContent = drawsContent.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], paintCount = paintCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  extension [Self <: Layer](x: Self) {
    
    inline def setAnchorX(value: Double): Self = StObject.set(x, "anchorX", value.asInstanceOf[js.Any])
    
    inline def setAnchorXUndefined: Self = StObject.set(x, "anchorX", js.undefined)
    
    inline def setAnchorY(value: Double): Self = StObject.set(x, "anchorY", value.asInstanceOf[js.Any])
    
    inline def setAnchorYUndefined: Self = StObject.set(x, "anchorY", js.undefined)
    
    inline def setAnchorZ(value: Double): Self = StObject.set(x, "anchorZ", value.asInstanceOf[js.Any])
    
    inline def setAnchorZUndefined: Self = StObject.set(x, "anchorZ", js.undefined)
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    inline def setDrawsContent(value: Boolean): Self = StObject.set(x, "drawsContent", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setLayerId(value: LayerId): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setPaintCount(value: integer): Self = StObject.set(x, "paintCount", value.asInstanceOf[js.Any])
    
    inline def setParentLayerId(value: LayerId): Self = StObject.set(x, "parentLayerId", value.asInstanceOf[js.Any])
    
    inline def setParentLayerIdUndefined: Self = StObject.set(x, "parentLayerId", js.undefined)
    
    inline def setScrollRects(value: js.Array[ScrollRect]): Self = StObject.set(x, "scrollRects", value.asInstanceOf[js.Any])
    
    inline def setScrollRectsUndefined: Self = StObject.set(x, "scrollRects", js.undefined)
    
    inline def setScrollRectsVarargs(value: ScrollRect*): Self = StObject.set(x, "scrollRects", js.Array(value*))
    
    inline def setStickyPositionConstraint(value: StickyPositionConstraint): Self = StObject.set(x, "stickyPositionConstraint", value.asInstanceOf[js.Any])
    
    inline def setStickyPositionConstraintUndefined: Self = StObject.set(x, "stickyPositionConstraint", js.undefined)
    
    inline def setTransform(value: js.Array[Double]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransformVarargs(value: Double*): Self = StObject.set(x, "transform", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
