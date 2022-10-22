package typingsJapgolly.vueScrollto

import typingsJapgolly.vueScrollto.mod.ElementDescriptor
import typingsJapgolly.vueScrollto.mod.ScrollOptions
import typingsJapgolly.vueScrollto.mod.ScrollToFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ScrollTo extends StObject {
    
    def scrollTo(element: ElementDescriptor): js.Function0[Unit]
    def scrollTo(element: ElementDescriptor, duration: Double): js.Function0[Unit]
    def scrollTo(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit]
    def scrollTo(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit]
    def scrollTo(options: ScrollOptions): js.Function0[Unit]
    @JSName("scrollTo")
    var scrollTo_Original: ScrollToFunction
    
    def setDefaults(element: ElementDescriptor): js.Function0[Unit]
    def setDefaults(element: ElementDescriptor, duration: Double): js.Function0[Unit]
    def setDefaults(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit]
    def setDefaults(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit]
    def setDefaults(options: ScrollOptions): js.Function0[Unit]
    @JSName("setDefaults")
    var setDefaults_Original: ScrollToFunction
  }
  object ScrollTo {
    
    inline def apply(scrollTo: ScrollToFunction, setDefaults: ScrollToFunction): ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = scrollTo.asInstanceOf[js.Any], setDefaults = setDefaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollTo]
    }
    
    extension [Self <: ScrollTo](x: Self) {
      
      inline def setScrollTo(value: ScrollToFunction): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
      
      inline def setSetDefaults(value: ScrollToFunction): Self = StObject.set(x, "setDefaults", value.asInstanceOf[js.Any])
    }
  }
}
