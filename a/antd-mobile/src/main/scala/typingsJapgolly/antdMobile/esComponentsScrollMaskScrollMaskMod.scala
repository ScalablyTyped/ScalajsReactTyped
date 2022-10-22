package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsScrollMaskScrollMaskMod {
  
  @JSImport("antd-mobile/es/components/scroll-mask/scroll-mask", "ScrollMask")
  @js.native
  val ScrollMask: FC[ScrollMaskProps] = js.native
  
  trait ScrollMaskProps extends StObject {
    
    var scrollTrackRef: RefHandle[HTMLElement]
  }
  object ScrollMaskProps {
    
    inline def apply(scrollTrackRef: RefHandle[HTMLElement]): ScrollMaskProps = {
      val __obj = js.Dynamic.literal(scrollTrackRef = scrollTrackRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollMaskProps]
    }
    
    extension [Self <: ScrollMaskProps](x: Self) {
      
      inline def setScrollTrackRef(value: RefHandle[HTMLElement]): Self = StObject.set(x, "scrollTrackRef", value.asInstanceOf[js.Any])
    }
  }
}
