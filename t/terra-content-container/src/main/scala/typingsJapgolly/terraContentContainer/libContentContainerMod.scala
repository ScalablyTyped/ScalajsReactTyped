package typingsJapgolly.terraContentContainer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContentContainerMod extends Shortcut {
  
  @JSImport("terra-content-container/lib/ContentContainer", JSImport.Default)
  @js.native
  val default: FC[ContentContainerProps] = js.native
  
  trait ContentContainerProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Whether or not the container should expanded to fill its parent element.
      */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The footer element to be placed within the footer area of the container.
      */
    var footer: js.UndefOr[Node] = js.undefined
    
    /**
      * The header element to be placed within the header area of the container.
      */
    var header: js.UndefOr[Node] = js.undefined
    
    /**
      * Ref callback for the scrollable area of the content container.
      */
    var scrollRefCallback: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  }
  object ContentContainerProps {
    
    inline def apply(): ContentContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentContainerProps]
    }
    
    extension [Self <: ContentContainerProps](x: Self) {
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeader(value: VdomNode): Self = StObject.set(x, "header", value.rawNode.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
      
      inline def setScrollRefCallback(value: Ref[HTMLDivElement]): Self = StObject.set(x, "scrollRefCallback", value.asInstanceOf[js.Any])
      
      inline def setScrollRefCallbackFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "scrollRefCallback", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
      
      inline def setScrollRefCallbackNull: Self = StObject.set(x, "scrollRefCallback", null)
      
      inline def setScrollRefCallbackUndefined: Self = StObject.set(x, "scrollRefCallback", js.undefined)
    }
  }
  
  type _To = FC[ContentContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `libContentContainerMod.foo` */
  override def _to: FC[ContentContainerProps] = default
}
