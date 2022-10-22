package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Image
import typingsJapgolly.reactNativeMaterialUi.anon.ContainerContentContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawerHeaderProps extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[Element] = js.undefined
  
  var image: js.UndefOr[js.Array[Image]] = js.undefined
  
  var style: js.UndefOr[ContainerContentContainer] = js.undefined
}
object DrawerHeaderProps {
  
  inline def apply(): DrawerHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerHeaderProps]
  }
  
  extension [Self <: DrawerHeaderProps](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setImage(value: js.Array[Image]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setImageVarargs(value: Image*): Self = StObject.set(x, "image", js.Array(value*))
    
    inline def setStyle(value: ContainerContentContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
