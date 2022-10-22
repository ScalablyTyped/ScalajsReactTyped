package typingsJapgolly.grommet.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.grommet.es6ComponentsVideoMod.controlsItems
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait A11yTitle
  extends StObject
     with controlsItems {
  
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  
  var icon: js.UndefOr[Node] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
}
object A11yTitle {
  
  inline def apply(): A11yTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[A11yTitle]
  }
  
  extension [Self <: A11yTitle](x: Self) {
    
    inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
    
    inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
    
    inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnClick(value: /* repeated */ Any => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
