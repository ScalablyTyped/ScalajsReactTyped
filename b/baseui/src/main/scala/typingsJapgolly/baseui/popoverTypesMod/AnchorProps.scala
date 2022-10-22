package typingsJapgolly.baseui.popoverTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorProps extends StObject {
  
  var `aria-controls`: js.UndefOr[String | Null] = js.undefined
  
  var `aria-describedby`: js.UndefOr[String | Null] = js.undefined
  
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-haspopup`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-owns`: js.UndefOr[String | Null] = js.undefined
  
  var id: js.UndefOr[String | Null] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.undefined
  
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.undefined
  
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.undefined
  
  var ref: js.UndefOr[Ref[HTMLElement]] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
}
object AnchorProps {
  
  inline def apply(): AnchorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorProps]
  }
  
  extension [Self <: AnchorProps](x: Self) {
    
    inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    inline def `setAria-controlsNull`: Self = StObject.set(x, "aria-controls", null)
    
    inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyNull`: Self = StObject.set(x, "aria-describedby", null)
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    inline def `setAria-haspopup`(value: Boolean): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    inline def `setAria-ownsNull`: Self = StObject.set(x, "aria-owns", null)
    
    inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOnBlur(value: /* e */ ReactFocusEventFrom[Element] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClick(value: /* e */ ReactMouseEventFrom[Element] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnFocus(value: /* e */ ReactFocusEventFrom[Element] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnMouseEnter(value: /* e */ ReactMouseEventFrom[Element] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* e */ ReactMouseEventFrom[Element] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setRef(value: Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
