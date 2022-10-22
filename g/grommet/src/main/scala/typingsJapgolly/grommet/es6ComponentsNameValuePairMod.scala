package typingsJapgolly.grommet

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsNameValuePairMod {
  
  @JSImport("grommet/es6/components/NameValuePair", "NameValuePair")
  @js.native
  val NameValuePair: FC[NameValuePairProps] = js.native
  
  trait NameValuePairProps extends StObject {
    
    var children: js.UndefOr[String | Double | Element] = js.undefined
    
    var name: js.UndefOr[String | Element] = js.undefined
  }
  object NameValuePairProps {
    
    inline def apply(): NameValuePairProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NameValuePairProps]
    }
    
    extension [Self <: NameValuePairProps](x: Self) {
      
      inline def setChildren(value: String | Double | Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setName(value: String | Element): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNameVdomElement(value: VdomElement): Self = StObject.set(x, "name", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type NameValuePairType = NameValuePairProps
}
