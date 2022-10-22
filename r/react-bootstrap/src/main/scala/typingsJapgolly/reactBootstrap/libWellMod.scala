package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWellMod {
  
  @JSImport("react-bootstrap/lib/Well", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[WellProps, js.Object, Any]
  
  type Well = japgolly.scalajs.react.facade.React.Component[WellProps & js.Object, js.Object]
  
  trait WellProps
    extends StObject
       with HTMLProps[japgolly.scalajs.react.facade.React.Component[WellProps & js.Object, js.Object]] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
  }
  object WellProps {
    
    inline def apply(): WellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WellProps]
    }
    
    extension [Self <: WellProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
    }
  }
}
