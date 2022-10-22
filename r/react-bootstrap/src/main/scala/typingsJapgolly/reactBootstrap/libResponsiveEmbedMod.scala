package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResponsiveEmbedMod {
  
  @JSImport("react-bootstrap/lib/ResponsiveEmbed", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ResponsiveEmbedProps, js.Object, Any]
  
  type ResponsiveEmbed = japgolly.scalajs.react.facade.React.Component[ResponsiveEmbedProps & js.Object, js.Object]
  
  trait ResponsiveEmbedProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[ResponsiveEmbedProps & js.Object, js.Object]
        ] {
    
    var a16by9: js.UndefOr[Boolean] = js.undefined
    
    var a4by3: js.UndefOr[Boolean] = js.undefined
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object ResponsiveEmbedProps {
    
    inline def apply(): ResponsiveEmbedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveEmbedProps]
    }
    
    extension [Self <: ResponsiveEmbedProps](x: Self) {
      
      inline def setA16by9(value: Boolean): Self = StObject.set(x, "a16by9", value.asInstanceOf[js.Any])
      
      inline def setA16by9Undefined: Self = StObject.set(x, "a16by9", js.undefined)
      
      inline def setA4by3(value: Boolean): Self = StObject.set(x, "a4by3", value.asInstanceOf[js.Any])
      
      inline def setA4by3Undefined: Self = StObject.set(x, "a4by3", js.undefined)
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
