package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPageHeaderMod {
  
  @JSImport("react-bootstrap/lib/PageHeader", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PageHeaderProps, js.Object, Any]
  
  type PageHeader = japgolly.scalajs.react.facade.React.Component[PageHeaderProps & js.Object, js.Object]
  
  trait PageHeaderProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[PageHeaderProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object PageHeaderProps {
    
    inline def apply(): PageHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderProps]
    }
    
    extension [Self <: PageHeaderProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
