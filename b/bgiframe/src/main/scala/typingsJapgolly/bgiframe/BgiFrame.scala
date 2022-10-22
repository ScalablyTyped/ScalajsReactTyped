package typingsJapgolly.bgiframe

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BgiFrame {
  
  trait IBgiframe extends StObject {
    
    def createIframe(): HTMLElement
    
    def fire(element: HTMLElement): Unit
    
    def getIframe(element: HTMLElement): HTMLElement
    
    def prop(n: Any): String
    
    var s: ISettings
  }
  object IBgiframe {
    
    inline def apply(
      createIframe: CallbackTo[HTMLElement],
      fire: HTMLElement => Callback,
      getIframe: HTMLElement => HTMLElement,
      prop: Any => String,
      s: ISettings
    ): IBgiframe = {
      val __obj = js.Dynamic.literal(createIframe = createIframe.toJsFn, fire = js.Any.fromFunction1((t0: HTMLElement) => fire(t0).runNow()), getIframe = js.Any.fromFunction1(getIframe), prop = js.Any.fromFunction1(prop), s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBgiframe]
    }
    
    extension [Self <: IBgiframe](x: Self) {
      
      inline def setCreateIframe(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "createIframe", value.toJsFn)
      
      inline def setFire(value: HTMLElement => Callback): Self = StObject.set(x, "fire", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
      
      inline def setGetIframe(value: HTMLElement => HTMLElement): Self = StObject.set(x, "getIframe", js.Any.fromFunction1(value))
      
      inline def setProp(value: Any => String): Self = StObject.set(x, "prop", js.Any.fromFunction1(value))
      
      inline def setS(value: ISettings): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISettings extends StObject {
    
    var conditional: Boolean
    
    var height: String
    
    var left: String
    
    var opacity: Boolean
    
    var src: String
    
    var top: String
    
    var width: String
  }
  object ISettings {
    
    inline def apply(
      conditional: Boolean,
      height: String,
      left: String,
      opacity: Boolean,
      src: String,
      top: String,
      width: String
    ): ISettings = {
      val __obj = js.Dynamic.literal(conditional = conditional.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettings]
    }
    
    extension [Self <: ISettings](x: Self) {
      
      inline def setConditional(value: Boolean): Self = StObject.set(x, "conditional", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
