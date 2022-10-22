package typingsJapgolly.reactElemental.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactElemental.anon.Primary
import typingsJapgolly.reactElemental.anon.PrimaryDark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementalProps extends StObject {
  
  val children: Node
  
  val colorOpts: js.UndefOr[PrimaryDark] = js.undefined
  
  val fontOpts: js.UndefOr[Primary] = js.undefined
}
object ElementalProps {
  
  inline def apply(): ElementalProps = {
    val __obj = js.Dynamic.literal(children = null)
    __obj.asInstanceOf[ElementalProps]
  }
  
  extension [Self <: ElementalProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColorOpts(value: PrimaryDark): Self = StObject.set(x, "colorOpts", value.asInstanceOf[js.Any])
    
    inline def setColorOptsUndefined: Self = StObject.set(x, "colorOpts", js.undefined)
    
    inline def setFontOpts(value: Primary): Self = StObject.set(x, "fontOpts", value.asInstanceOf[js.Any])
    
    inline def setFontOptsUndefined: Self = StObject.set(x, "fontOpts", js.undefined)
  }
}
