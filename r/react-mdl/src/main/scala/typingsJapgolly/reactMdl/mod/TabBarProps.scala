package typingsJapgolly.reactMdl.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabBarProps
  extends StObject
     with MDLHTMLAttributes
     with MDLDOMAttributes[TabBar] {
  
  var activeTab: js.UndefOr[Double] = js.undefined
  
  var cssPrefix: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* tabId */ Double, Any]] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[TabBar]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object TabBarProps {
  
  inline def apply(cssPrefix: String): TabBarProps = {
    val __obj = js.Dynamic.literal(cssPrefix = cssPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarProps]
  }
  
  extension [Self <: TabBarProps](x: Self) {
    
    inline def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
    
    inline def setCssPrefix(value: String): Self = StObject.set(x, "cssPrefix", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: /* tabId */ Double => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: ReactMouseEventFrom[TabBar & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[TabBar & Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
