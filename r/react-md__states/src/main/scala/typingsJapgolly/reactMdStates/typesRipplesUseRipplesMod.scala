package typingsJapgolly.reactMdStates

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactMdStates.typesRipplesTypesMod.MergableRippleHandlers
import typingsJapgolly.reactMdStates.typesRipplesTypesMod.RipplesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRipplesUseRipplesMod {
  
  @JSImport("@react-md/states/types/ripples/useRipples", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRipples[E /* <: HTMLElement */](
    hasRippleTimeoutRippleClassNamesRippleContainerClassNameRippleClassNameDisableRippleDisableSpacebarClickOptions: RipplesOptions[E]
  ): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRipples")(hasRippleTimeoutRippleClassNamesRippleContainerClassNameRippleClassNameDisableRippleDisableSpacebarClickOptions.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  
  trait ReturnValue[E /* <: HTMLElement */] extends StObject {
    
    var handlers: MergableRippleHandlers[E]
    
    var ripples: Node
  }
  object ReturnValue {
    
    inline def apply[E /* <: HTMLElement */](handlers: MergableRippleHandlers[E]): ReturnValue[E] = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], ripples = null)
      __obj.asInstanceOf[ReturnValue[E]]
    }
    
    extension [Self <: ReturnValue[?], E /* <: HTMLElement */](x: Self & ReturnValue[E]) {
      
      inline def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setRipples(value: VdomNode): Self = StObject.set(x, "ripples", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRipplesNull: Self = StObject.set(x, "ripples", null)
      
      inline def setRipplesVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "ripples", js.Array(value*))
      
      inline def setRipplesVdomElement(value: VdomElement): Self = StObject.set(x, "ripples", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
