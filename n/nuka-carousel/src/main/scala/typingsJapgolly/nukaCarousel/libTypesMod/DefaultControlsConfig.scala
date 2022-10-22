package typingsJapgolly.nukaCarousel.libTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultControlsConfig extends StObject {
  
  var containerClassName: js.UndefOr[String] = js.undefined
  
  var nextButtonClassName: js.UndefOr[String] = js.undefined
  
  var nextButtonOnClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var nextButtonStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var nextButtonText: js.UndefOr[Node] = js.undefined
  
  var pagingDotsClassName: js.UndefOr[String] = js.undefined
  
  var pagingDotsContainerClassName: js.UndefOr[String] = js.undefined
  
  var pagingDotsOnClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var pagingDotsStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var prevButtonClassName: js.UndefOr[String] = js.undefined
  
  var prevButtonOnClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var prevButtonStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var prevButtonText: js.UndefOr[Node] = js.undefined
}
object DefaultControlsConfig {
  
  inline def apply(): DefaultControlsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultControlsConfig]
  }
  
  extension [Self <: DefaultControlsConfig](x: Self) {
    
    inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
    
    inline def setNextButtonClassName(value: String): Self = StObject.set(x, "nextButtonClassName", value.asInstanceOf[js.Any])
    
    inline def setNextButtonClassNameUndefined: Self = StObject.set(x, "nextButtonClassName", js.undefined)
    
    inline def setNextButtonOnClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "nextButtonOnClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setNextButtonOnClickUndefined: Self = StObject.set(x, "nextButtonOnClick", js.undefined)
    
    inline def setNextButtonStyle(value: CSSProperties): Self = StObject.set(x, "nextButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setNextButtonStyleUndefined: Self = StObject.set(x, "nextButtonStyle", js.undefined)
    
    inline def setNextButtonText(value: VdomNode): Self = StObject.set(x, "nextButtonText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setNextButtonTextNull: Self = StObject.set(x, "nextButtonText", null)
    
    inline def setNextButtonTextUndefined: Self = StObject.set(x, "nextButtonText", js.undefined)
    
    inline def setNextButtonTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "nextButtonText", js.Array(value*))
    
    inline def setNextButtonTextVdomElement(value: VdomElement): Self = StObject.set(x, "nextButtonText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setPagingDotsClassName(value: String): Self = StObject.set(x, "pagingDotsClassName", value.asInstanceOf[js.Any])
    
    inline def setPagingDotsClassNameUndefined: Self = StObject.set(x, "pagingDotsClassName", js.undefined)
    
    inline def setPagingDotsContainerClassName(value: String): Self = StObject.set(x, "pagingDotsContainerClassName", value.asInstanceOf[js.Any])
    
    inline def setPagingDotsContainerClassNameUndefined: Self = StObject.set(x, "pagingDotsContainerClassName", js.undefined)
    
    inline def setPagingDotsOnClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "pagingDotsOnClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setPagingDotsOnClickUndefined: Self = StObject.set(x, "pagingDotsOnClick", js.undefined)
    
    inline def setPagingDotsStyle(value: CSSProperties): Self = StObject.set(x, "pagingDotsStyle", value.asInstanceOf[js.Any])
    
    inline def setPagingDotsStyleUndefined: Self = StObject.set(x, "pagingDotsStyle", js.undefined)
    
    inline def setPrevButtonClassName(value: String): Self = StObject.set(x, "prevButtonClassName", value.asInstanceOf[js.Any])
    
    inline def setPrevButtonClassNameUndefined: Self = StObject.set(x, "prevButtonClassName", js.undefined)
    
    inline def setPrevButtonOnClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "prevButtonOnClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setPrevButtonOnClickUndefined: Self = StObject.set(x, "prevButtonOnClick", js.undefined)
    
    inline def setPrevButtonStyle(value: CSSProperties): Self = StObject.set(x, "prevButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setPrevButtonStyleUndefined: Self = StObject.set(x, "prevButtonStyle", js.undefined)
    
    inline def setPrevButtonText(value: VdomNode): Self = StObject.set(x, "prevButtonText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setPrevButtonTextNull: Self = StObject.set(x, "prevButtonText", null)
    
    inline def setPrevButtonTextUndefined: Self = StObject.set(x, "prevButtonText", js.undefined)
    
    inline def setPrevButtonTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "prevButtonText", js.Array(value*))
    
    inline def setPrevButtonTextVdomElement(value: VdomElement): Self = StObject.set(x, "prevButtonText", value.rawElement.asInstanceOf[js.Any])
  }
}
