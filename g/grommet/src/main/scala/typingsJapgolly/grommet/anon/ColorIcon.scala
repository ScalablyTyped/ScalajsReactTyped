package typingsJapgolly.grommet.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorIcon extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var icon: js.UndefOr[
    Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
  ] = js.undefined
}
object ColorIcon {
  
  inline def apply(): ColorIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorIcon]
  }
  
  extension [Self <: ColorIcon](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIcon(
      value: Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
    ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
  }
}
