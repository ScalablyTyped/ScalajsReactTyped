package typingsJapgolly.moxyNextRouterScroll

import org.scalajs.dom.HTMLElement
import typingsJapgolly.history.mod.Location
import typingsJapgolly.moxyNextRouterScroll.anon.AsPath
import typingsJapgolly.scrollBehavior.mod.LocationBase
import typingsJapgolly.scrollBehavior.mod.ScrollPosition
import typingsJapgolly.scrollBehavior.mod.ShouldUpdateScroll
import typingsJapgolly.std.Map
import typingsJapgolly.std.ScrollRestoration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollBehaviorMod {
  
  @JSImport("@moxy/next-router-scroll/scroll-behavior", JSImport.Default)
  @js.native
  open class default protected () extends NextScrollBehavior {
    def this(shouldUpdateScroll: ShouldUpdateScroll[NextScrollBehaviorContext]) = this()
  }
  
  @js.native
  trait NextScrollBehavior
    extends typingsJapgolly.scrollBehavior.mod.default[Location & LocationBase, NextScrollBehaviorContext] {
    
    def _cleanupDebouncedSavePosition(): Unit = js.native
    
    var _context: NextScrollBehaviorContext = js.native
    
    def _createContext(): NextScrollBehaviorContext = js.native
    
    var _debounceSavePositionMap: Map[String, ScrollPosition] = js.native
    
    var _oldScrollRestoration: ScrollRestoration = js.native
    
    var _prevContext: NextScrollBehaviorContext = js.native
    
    def _savePosition(key: String, element: HTMLElement): Unit = js.native
    
    def _setScrollRestoration(): Unit = js.native
    
    def _setScrollRestorationWithoutUserAgentSniffing(): Unit = js.native
  }
  
  trait NextScrollBehaviorContext extends StObject {
    
    var location: Location & LocationBase
    
    var router: AsPath
  }
  object NextScrollBehaviorContext {
    
    inline def apply(location: Location & LocationBase, router: AsPath): NextScrollBehaviorContext = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextScrollBehaviorContext]
    }
    
    extension [Self <: NextScrollBehaviorContext](x: Self) {
      
      inline def setLocation(value: Location & LocationBase): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setRouter(value: AsPath): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
}
