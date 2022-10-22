package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClearfixMod {
  
  @JSImport("react-bootstrap/lib/Clearfix", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ClearfixProps, js.Object, Any]
  
  type Clearfix = japgolly.scalajs.react.facade.React.Component[ClearfixProps & js.Object, js.Object]
  
  trait ClearfixProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[ClearfixProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
    
    var visibleLgBlock: js.UndefOr[Boolean] = js.undefined
    
    var visibleMdBlock: js.UndefOr[Boolean] = js.undefined
    
    var visibleSmBlock: js.UndefOr[Boolean] = js.undefined
    
    var visibleXsBlock: js.UndefOr[Boolean] = js.undefined
  }
  object ClearfixProps {
    
    inline def apply(): ClearfixProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearfixProps]
    }
    
    extension [Self <: ClearfixProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      inline def setVisibleLgBlock(value: Boolean): Self = StObject.set(x, "visibleLgBlock", value.asInstanceOf[js.Any])
      
      inline def setVisibleLgBlockUndefined: Self = StObject.set(x, "visibleLgBlock", js.undefined)
      
      inline def setVisibleMdBlock(value: Boolean): Self = StObject.set(x, "visibleMdBlock", value.asInstanceOf[js.Any])
      
      inline def setVisibleMdBlockUndefined: Self = StObject.set(x, "visibleMdBlock", js.undefined)
      
      inline def setVisibleSmBlock(value: Boolean): Self = StObject.set(x, "visibleSmBlock", value.asInstanceOf[js.Any])
      
      inline def setVisibleSmBlockUndefined: Self = StObject.set(x, "visibleSmBlock", js.undefined)
      
      inline def setVisibleXsBlock(value: Boolean): Self = StObject.set(x, "visibleXsBlock", value.asInstanceOf[js.Any])
      
      inline def setVisibleXsBlockUndefined: Self = StObject.set(x, "visibleXsBlock", js.undefined)
    }
  }
}
