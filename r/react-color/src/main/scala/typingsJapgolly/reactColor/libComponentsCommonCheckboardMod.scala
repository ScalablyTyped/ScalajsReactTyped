package typingsJapgolly.reactColor

import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCommonCheckboardMod {
  
  @JSImport("react-color/lib/components/common/Checkboard", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CheckboardProps, js.Object, Any]
  
  type Checkboard = japgolly.scalajs.react.facade.React.Component[CheckboardProps & js.Object, js.Object]
  
  trait CheckboardProps
    extends StObject
       with ClassAttributes[
          japgolly.scalajs.react.facade.React.Component[CheckboardProps & js.Object, js.Object]
        ] {
    
    var grey: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var white: js.UndefOr[String] = js.undefined
  }
  object CheckboardProps {
    
    inline def apply(): CheckboardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboardProps]
    }
    
    extension [Self <: CheckboardProps](x: Self) {
      
      inline def setGrey(value: String): Self = StObject.set(x, "grey", value.asInstanceOf[js.Any])
      
      inline def setGreyUndefined: Self = StObject.set(x, "grey", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
      
      inline def setWhiteUndefined: Self = StObject.set(x, "white", js.undefined)
    }
  }
}
