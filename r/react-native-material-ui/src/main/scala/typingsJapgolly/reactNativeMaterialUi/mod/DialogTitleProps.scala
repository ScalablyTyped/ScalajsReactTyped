package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeMaterialUi.anon.TitleContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogTitleProps extends StObject {
  
  var children: Element
  
  var style: js.UndefOr[TitleContainer] = js.undefined
}
object DialogTitleProps {
  
  inline def apply(children: VdomElement): DialogTitleProps = {
    val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogTitleProps]
  }
  
  extension [Self <: DialogTitleProps](x: Self) {
    
    inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setStyle(value: TitleContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
