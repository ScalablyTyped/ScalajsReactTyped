package typingsJapgolly.grommet.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.grommet.es6ComponentsBoxMod.BoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerIcon extends StObject {
  
  var container: js.UndefOr[BoxProps | `7` | `33`] = js.undefined
  
  var icon: js.UndefOr[
    Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
  ] = js.undefined
  
  var size: js.UndefOr[Small] = js.undefined
}
object ContainerIcon {
  
  inline def apply(): ContainerIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerIcon]
  }
  
  extension [Self <: ContainerIcon](x: Self) {
    
    inline def setContainer(value: BoxProps | `7` | `33`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setIcon(
      value: Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Icon */ Any)
    ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSize(value: Small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
