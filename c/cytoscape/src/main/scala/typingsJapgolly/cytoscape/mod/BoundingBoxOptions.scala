package typingsJapgolly.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundingBoxOptions extends StObject {
  
  /** A boolean indicating whether to include edges in the bounding box (default true). */
  var includeEdges: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean indicating whether to include labels in the bounding box (default true). */
  var includeLabels: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean indicating whether to include main (node or edge) labels in the bounding box (default true). */
  var includeMainLabels: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean indicating whether to include nodes in the bounding box (default true). */
  var includeNodes: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean indicating whether to include overlays (such as the one which appears when a node is clicked) in the bounding box (default true). */
  var includeOverlays: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean indicating whether to include (edge) source-labels in the bounding box (default true). */
  var includeSourceLabels: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean indicating whether to include (edge) target-labels in the bounding box (default true). */
  var includeTargetLabels: js.UndefOr[Boolean] = js.undefined
}
object BoundingBoxOptions {
  
  inline def apply(): BoundingBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundingBoxOptions]
  }
  
  extension [Self <: BoundingBoxOptions](x: Self) {
    
    inline def setIncludeEdges(value: Boolean): Self = StObject.set(x, "includeEdges", value.asInstanceOf[js.Any])
    
    inline def setIncludeEdgesUndefined: Self = StObject.set(x, "includeEdges", js.undefined)
    
    inline def setIncludeLabels(value: Boolean): Self = StObject.set(x, "includeLabels", value.asInstanceOf[js.Any])
    
    inline def setIncludeLabelsUndefined: Self = StObject.set(x, "includeLabels", js.undefined)
    
    inline def setIncludeMainLabels(value: Boolean): Self = StObject.set(x, "includeMainLabels", value.asInstanceOf[js.Any])
    
    inline def setIncludeMainLabelsUndefined: Self = StObject.set(x, "includeMainLabels", js.undefined)
    
    inline def setIncludeNodes(value: Boolean): Self = StObject.set(x, "includeNodes", value.asInstanceOf[js.Any])
    
    inline def setIncludeNodesUndefined: Self = StObject.set(x, "includeNodes", js.undefined)
    
    inline def setIncludeOverlays(value: Boolean): Self = StObject.set(x, "includeOverlays", value.asInstanceOf[js.Any])
    
    inline def setIncludeOverlaysUndefined: Self = StObject.set(x, "includeOverlays", js.undefined)
    
    inline def setIncludeSourceLabels(value: Boolean): Self = StObject.set(x, "includeSourceLabels", value.asInstanceOf[js.Any])
    
    inline def setIncludeSourceLabelsUndefined: Self = StObject.set(x, "includeSourceLabels", js.undefined)
    
    inline def setIncludeTargetLabels(value: Boolean): Self = StObject.set(x, "includeTargetLabels", value.asInstanceOf[js.Any])
    
    inline def setIncludeTargetLabelsUndefined: Self = StObject.set(x, "includeTargetLabels", js.undefined)
  }
}
