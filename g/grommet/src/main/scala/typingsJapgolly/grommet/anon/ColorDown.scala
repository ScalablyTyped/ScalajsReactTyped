package typingsJapgolly.grommet.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorDown extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var down: js.UndefOr[
    Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
  ] = js.undefined
  
  var margin: js.UndefOr[MarginType] = js.undefined
  
  var up: js.UndefOr[
    Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
  ] = js.undefined
}
object ColorDown {
  
  inline def apply(): ColorDown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorDown]
  }
  
  extension [Self <: ColorDown](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDown(
      value: Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
    ): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownNull: Self = StObject.set(x, "down", null)
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setDownVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "down", js.Array(value*))
    
    inline def setDownVdomElement(value: VdomElement): Self = StObject.set(x, "down", value.rawElement.asInstanceOf[js.Any])
    
    inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setUp(
      value: Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
    ): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpNull: Self = StObject.set(x, "up", null)
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    
    inline def setUpVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "up", js.Array(value*))
    
    inline def setUpVdomElement(value: VdomElement): Self = StObject.set(x, "up", value.rawElement.asInstanceOf[js.Any])
  }
}
