package typingsJapgolly.popoto

import japgolly.scalajs.react.Callback
import org.scalajs.dom.SVGGElement
import typingsJapgolly.popoto.anon.ReadonlyRELATION0VALUE1SE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphLinkMod {
  
  trait Link extends StObject {
    
    /**
      * Defines the different type of link.
      * RELATION is a relation link between two nodes.
      * VALUE is a link between a generic node and a value.
      */
    var LinkTypes: ReadonlyRELATION0VALUE1SE
    
    /**
      * Define whether or not to display path markers.
      */
    var SHOW_MARKER: Boolean
    
    /**
      * Offset added to text displayed on links.
      */
    var TEXT_DY: Double
    
    /**
      * Create new elements.
      */
    def addNewElements(enteringData: js.Array[SVGGElement]): Unit
    
    // Delete all related nodes from this link
    def clickLink(): Unit
    
    // ID of the g element in SVG graph containing all the link elements.
    var gID: String
    
    /**
      * Function called when mouse goes out of the link.
      * This function is used to reinitialize the CSS class of the link and query viewer element.
      */
    def mouseOutLink(): Unit
    
    /**
      * Function called when mouse is over the link.
      * This function is used to change the CSS class on hover of the link and query viewer element.
      *
      * TODO try to introduce event instead of directly access query spans here. This could be used in future extensions.
      */
    def mouseOverLink(): Unit
    
    /**
      * Clean links elements removed from the list.
      */
    def removeElements(exitingData: js.Array[SVGGElement]): Unit
    
    /**
      * Update the links element with data coming from dataModel.links.
      */
    def updateData(): Unit
    
    /**
      * Update all the elements (new + modified)
      */
    def updateElements(): Unit
    
    /**
      * Function to call to update the links after modification in the model.
      * This function will update the graph with all removed, modified or added links using d3.js mechanisms.
      */
    def updateLinks(): Unit
  }
  object Link {
    
    inline def apply(
      LinkTypes: ReadonlyRELATION0VALUE1SE,
      SHOW_MARKER: Boolean,
      TEXT_DY: Double,
      addNewElements: js.Array[SVGGElement] => Callback,
      clickLink: Callback,
      gID: String,
      mouseOutLink: Callback,
      mouseOverLink: Callback,
      removeElements: js.Array[SVGGElement] => Callback,
      updateData: Callback,
      updateElements: Callback,
      updateLinks: Callback
    ): Link = {
      val __obj = js.Dynamic.literal(LinkTypes = LinkTypes.asInstanceOf[js.Any], SHOW_MARKER = SHOW_MARKER.asInstanceOf[js.Any], TEXT_DY = TEXT_DY.asInstanceOf[js.Any], addNewElements = js.Any.fromFunction1((t0: js.Array[SVGGElement]) => addNewElements(t0).runNow()), clickLink = clickLink.toJsFn, gID = gID.asInstanceOf[js.Any], mouseOutLink = mouseOutLink.toJsFn, mouseOverLink = mouseOverLink.toJsFn, removeElements = js.Any.fromFunction1((t0: js.Array[SVGGElement]) => removeElements(t0).runNow()), updateData = updateData.toJsFn, updateElements = updateElements.toJsFn, updateLinks = updateLinks.toJsFn)
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setAddNewElements(value: js.Array[SVGGElement] => Callback): Self = StObject.set(x, "addNewElements", js.Any.fromFunction1((t0: js.Array[SVGGElement]) => value(t0).runNow()))
      
      inline def setClickLink(value: Callback): Self = StObject.set(x, "clickLink", value.toJsFn)
      
      inline def setGID(value: String): Self = StObject.set(x, "gID", value.asInstanceOf[js.Any])
      
      inline def setLinkTypes(value: ReadonlyRELATION0VALUE1SE): Self = StObject.set(x, "LinkTypes", value.asInstanceOf[js.Any])
      
      inline def setMouseOutLink(value: Callback): Self = StObject.set(x, "mouseOutLink", value.toJsFn)
      
      inline def setMouseOverLink(value: Callback): Self = StObject.set(x, "mouseOverLink", value.toJsFn)
      
      inline def setRemoveElements(value: js.Array[SVGGElement] => Callback): Self = StObject.set(x, "removeElements", js.Any.fromFunction1((t0: js.Array[SVGGElement]) => value(t0).runNow()))
      
      inline def setSHOW_MARKER(value: Boolean): Self = StObject.set(x, "SHOW_MARKER", value.asInstanceOf[js.Any])
      
      inline def setTEXT_DY(value: Double): Self = StObject.set(x, "TEXT_DY", value.asInstanceOf[js.Any])
      
      inline def setUpdateData(value: Callback): Self = StObject.set(x, "updateData", value.toJsFn)
      
      inline def setUpdateElements(value: Callback): Self = StObject.set(x, "updateElements", value.toJsFn)
      
      inline def setUpdateLinks(value: Callback): Self = StObject.set(x, "updateLinks", value.toJsFn)
    }
  }
}
