package typingsJapgolly.reactJoyride.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactJoyride.reactJoyrideStrings.auto
import typingsJapgolly.reactJoyride.reactJoyrideStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step
  extends StObject
     with CommonProps {
  
  var content: Node
  
  var disableBeacon: js.UndefOr[Boolean] = js.undefined
  
  var event: js.UndefOr[String] = js.undefined
  
  var hideFooter: js.UndefOr[Boolean] = js.undefined
  
  var isFixed: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var placement: js.UndefOr[Placement | auto | center] = js.undefined
  
  var placementBeacon: js.UndefOr[Placement] = js.undefined
  
  var target: String | HTMLElement
  
  var title: js.UndefOr[Node] = js.undefined
}
object Step {
  
  inline def apply(target: String | HTMLElement): Step = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], content = null)
    __obj.asInstanceOf[Step]
  }
  
  extension [Self <: Step](x: Self) {
    
    inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDisableBeacon(value: Boolean): Self = StObject.set(x, "disableBeacon", value.asInstanceOf[js.Any])
    
    inline def setDisableBeaconUndefined: Self = StObject.set(x, "disableBeacon", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setHideFooter(value: Boolean): Self = StObject.set(x, "hideFooter", value.asInstanceOf[js.Any])
    
    inline def setHideFooterUndefined: Self = StObject.set(x, "hideFooter", js.undefined)
    
    inline def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    inline def setIsFixedUndefined: Self = StObject.set(x, "isFixed", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPlacement(value: Placement | auto | center): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementBeacon(value: Placement): Self = StObject.set(x, "placementBeacon", value.asInstanceOf[js.Any])
    
    inline def setPlacementBeaconUndefined: Self = StObject.set(x, "placementBeacon", js.undefined)
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
  }
}
