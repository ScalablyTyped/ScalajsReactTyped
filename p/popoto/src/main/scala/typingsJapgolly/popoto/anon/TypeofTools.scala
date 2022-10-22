package typingsJapgolly.popoto.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTools extends StObject {
  
  val CENTER_GRAPH: Boolean
  
  val RESET_GRAPH: Boolean
  
  val SAVE_GRAPH: Boolean
  
  val TOGGLE_FIT_TEXT: Boolean
  
  val TOGGLE_FULL_SCREEN: Boolean
  
  val TOGGLE_TAXONOMY: Boolean
  
  val TOGGLE_VIEW_RELATION: Boolean
  
  /**
    * Reset zoom and center the view on svg center.
    */
  def center(): Unit
  
  /**
    * Reset the graph to display the root node only.
    */
  def reset(): Unit
  
  /**
    * Enable, disable text fitting on nodes.
    */
  def toggleFitText(): Unit
  
  def toggleFullScreen(): Unit
  
  /**
    * Show, hide taxonomy panel.
    */
  def toggleTaxonomy(): Unit
  
  /**
    * Show, hide relation donuts.
    */
  def toggleViewRelation(): Unit
}
object TypeofTools {
  
  inline def apply(
    CENTER_GRAPH: Boolean,
    RESET_GRAPH: Boolean,
    SAVE_GRAPH: Boolean,
    TOGGLE_FIT_TEXT: Boolean,
    TOGGLE_FULL_SCREEN: Boolean,
    TOGGLE_TAXONOMY: Boolean,
    TOGGLE_VIEW_RELATION: Boolean,
    center: Callback,
    reset: Callback,
    toggleFitText: Callback,
    toggleFullScreen: Callback,
    toggleTaxonomy: Callback,
    toggleViewRelation: Callback
  ): TypeofTools = {
    val __obj = js.Dynamic.literal(CENTER_GRAPH = CENTER_GRAPH.asInstanceOf[js.Any], RESET_GRAPH = RESET_GRAPH.asInstanceOf[js.Any], SAVE_GRAPH = SAVE_GRAPH.asInstanceOf[js.Any], TOGGLE_FIT_TEXT = TOGGLE_FIT_TEXT.asInstanceOf[js.Any], TOGGLE_FULL_SCREEN = TOGGLE_FULL_SCREEN.asInstanceOf[js.Any], TOGGLE_TAXONOMY = TOGGLE_TAXONOMY.asInstanceOf[js.Any], TOGGLE_VIEW_RELATION = TOGGLE_VIEW_RELATION.asInstanceOf[js.Any], center = center.toJsFn, reset = reset.toJsFn, toggleFitText = toggleFitText.toJsFn, toggleFullScreen = toggleFullScreen.toJsFn, toggleTaxonomy = toggleTaxonomy.toJsFn, toggleViewRelation = toggleViewRelation.toJsFn)
    __obj.asInstanceOf[TypeofTools]
  }
  
  extension [Self <: TypeofTools](x: Self) {
    
    inline def setCENTER_GRAPH(value: Boolean): Self = StObject.set(x, "CENTER_GRAPH", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: Callback): Self = StObject.set(x, "center", value.toJsFn)
    
    inline def setRESET_GRAPH(value: Boolean): Self = StObject.set(x, "RESET_GRAPH", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSAVE_GRAPH(value: Boolean): Self = StObject.set(x, "SAVE_GRAPH", value.asInstanceOf[js.Any])
    
    inline def setTOGGLE_FIT_TEXT(value: Boolean): Self = StObject.set(x, "TOGGLE_FIT_TEXT", value.asInstanceOf[js.Any])
    
    inline def setTOGGLE_FULL_SCREEN(value: Boolean): Self = StObject.set(x, "TOGGLE_FULL_SCREEN", value.asInstanceOf[js.Any])
    
    inline def setTOGGLE_TAXONOMY(value: Boolean): Self = StObject.set(x, "TOGGLE_TAXONOMY", value.asInstanceOf[js.Any])
    
    inline def setTOGGLE_VIEW_RELATION(value: Boolean): Self = StObject.set(x, "TOGGLE_VIEW_RELATION", value.asInstanceOf[js.Any])
    
    inline def setToggleFitText(value: Callback): Self = StObject.set(x, "toggleFitText", value.toJsFn)
    
    inline def setToggleFullScreen(value: Callback): Self = StObject.set(x, "toggleFullScreen", value.toJsFn)
    
    inline def setToggleTaxonomy(value: Callback): Self = StObject.set(x, "toggleTaxonomy", value.toJsFn)
    
    inline def setToggleViewRelation(value: Callback): Self = StObject.set(x, "toggleViewRelation", value.toJsFn)
  }
}
