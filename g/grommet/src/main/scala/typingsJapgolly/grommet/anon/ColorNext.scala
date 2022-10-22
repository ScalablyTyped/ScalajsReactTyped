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

trait ColorNext extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var next: js.UndefOr[
    Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
  ] = js.undefined
  
  var previous: js.UndefOr[
    Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
  ] = js.undefined
}
object ColorNext {
  
  inline def apply(): ColorNext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorNext]
  }
  
  extension [Self <: ColorNext](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setNext(
      value: Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
    ): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setNextVdomElement(value: VdomElement): Self = StObject.set(x, "next", value.rawElement.asInstanceOf[js.Any])
    
    inline def setPrevious(
      value: Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
    ): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousNull: Self = StObject.set(x, "previous", null)
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setPreviousVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "previous", js.Array(value*))
    
    inline def setPreviousVdomElement(value: VdomElement): Self = StObject.set(x, "previous", value.rawElement.asInstanceOf[js.Any])
  }
}
