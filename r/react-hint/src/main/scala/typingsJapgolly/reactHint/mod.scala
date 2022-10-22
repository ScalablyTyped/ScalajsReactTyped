package typingsJapgolly.reactHint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactHint.anon.Click
import typingsJapgolly.reactHint.anon.Hide
import typingsJapgolly.reactHint.anon.TypeofReact
import typingsJapgolly.reactHint.reactHintStrings.bottom
import typingsJapgolly.reactHint.reactHintStrings.left
import typingsJapgolly.reactHint.reactHintStrings.right
import typingsJapgolly.reactHint.reactHintStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-hint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(react: TypeofReact): ComponentClassP[ReactHintProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(react.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[ReactHintProps & js.Object]]
  
  trait ReactHintProps extends StObject {
    
    var attribute: js.UndefOr[String] = js.undefined
    
    var autoPosition: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var events: js.UndefOr[Boolean | Click] = js.undefined
    
    var onRenderContent: js.UndefOr[js.Function2[/* target */ HTMLElement, /* content */ Any, Node]] = js.undefined
    
    var persist: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[top | left | right | bottom] = js.undefined
    
    var ref: js.UndefOr[js.Function1[/* ref */ ComponentClassP[this.type & js.Object], Unit]] = js.undefined
  }
  object ReactHintProps {
    
    inline def apply(): ReactHintProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactHintProps]
    }
    
    extension [Self <: ReactHintProps](x: Self) {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setAutoPosition(value: Boolean): Self = StObject.set(x, "autoPosition", value.asInstanceOf[js.Any])
      
      inline def setAutoPositionUndefined: Self = StObject.set(x, "autoPosition", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEvents(value: Boolean | Click): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setOnRenderContent(value: (/* target */ HTMLElement, /* content */ Any) => Node): Self = StObject.set(x, "onRenderContent", js.Any.fromFunction2(value))
      
      inline def setOnRenderContentUndefined: Self = StObject.set(x, "onRenderContent", js.undefined)
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      inline def setPosition(value: top | left | right | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRef(value: /* ref */ ComponentClassP[ReactHintProps & js.Object] => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: /* ref */ ComponentClassP[ReactHintProps & js.Object]) => value(t0).runNow()))
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
