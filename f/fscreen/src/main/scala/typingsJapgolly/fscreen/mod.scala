package typingsJapgolly.fscreen

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import typingsJapgolly.std.AddEventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fscreen", JSImport.Default)
  @js.native
  val default: Fscreen = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fscreen.fscreenStrings.fullscreenEnabled
    - typingsJapgolly.fscreen.fscreenStrings.fullscreenElement
    - typingsJapgolly.fscreen.fscreenStrings.requestFullscreen
    - typingsJapgolly.fscreen.fscreenStrings.exitFullscreen
    - typingsJapgolly.fscreen.fscreenStrings.fullscreenchange
    - typingsJapgolly.fscreen.fscreenStrings.fullscreenerror
  */
  trait EventName extends StObject
  object EventName {
    
    inline def exitFullscreen: typingsJapgolly.fscreen.fscreenStrings.exitFullscreen = "exitFullscreen".asInstanceOf[typingsJapgolly.fscreen.fscreenStrings.exitFullscreen]
    
    inline def fullscreenElement: typingsJapgolly.fscreen.fscreenStrings.fullscreenElement = "fullscreenElement".asInstanceOf[typingsJapgolly.fscreen.fscreenStrings.fullscreenElement]
    
    inline def fullscreenEnabled: typingsJapgolly.fscreen.fscreenStrings.fullscreenEnabled = "fullscreenEnabled".asInstanceOf[typingsJapgolly.fscreen.fscreenStrings.fullscreenEnabled]
    
    inline def fullscreenchange: typingsJapgolly.fscreen.fscreenStrings.fullscreenchange = "fullscreenchange".asInstanceOf[typingsJapgolly.fscreen.fscreenStrings.fullscreenchange]
    
    inline def fullscreenerror: typingsJapgolly.fscreen.fscreenStrings.fullscreenerror = "fullscreenerror".asInstanceOf[typingsJapgolly.fscreen.fscreenStrings.fullscreenerror]
    
    inline def requestFullscreen: typingsJapgolly.fscreen.fscreenStrings.requestFullscreen = "requestFullscreen".asInstanceOf[typingsJapgolly.fscreen.fscreenStrings.requestFullscreen]
  }
  
  @js.native
  trait Fscreen extends StObject {
    
    def addEventListener(`type`: EventName, handler: Handler): Unit = js.native
    def addEventListener(`type`: EventName, handler: Handler, options: Boolean): Unit = js.native
    def addEventListener(`type`: EventName, handler: Handler, options: AddEventListenerOptions): Unit = js.native
    
    def exitFullscreen(): Unit = js.native
    def exitFullscreen(e: Event): Unit = js.native
    
    val fullscreenElement: js.UndefOr[Element] = js.native
    
    val fullscreenEnabled: Boolean = js.native
    
    def onfullscreenchange(): Unit = js.native
    def onfullscreenchange(e: Event): Unit = js.native
    @JSName("onfullscreenchange")
    var onfullscreenchange_Original: Handler = js.native
    
    def onfullscreenerror(): Unit = js.native
    def onfullscreenerror(e: Event): Unit = js.native
    @JSName("onfullscreenerror")
    var onfullscreenerror_Original: Handler = js.native
    
    def removeEventListener(`type`: EventName, handler: Handler): Unit = js.native
    def removeEventListener(`type`: EventName, handler: Handler, options: Boolean): Unit = js.native
    def removeEventListener(`type`: EventName, handler: Handler, options: AddEventListenerOptions): Unit = js.native
    
    def requestFullscreen(element: Element): Unit = js.native
    
    def requestFullscreenFunction(element: Element): RequestFullScreenFunction = js.native
  }
  
  type Handler = js.Function1[/* e */ js.UndefOr[Event], Unit]
  
  type RequestFullScreenFunction = js.Function1[/* element */ Element, Unit]
  
  type _To = Fscreen
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Fscreen = default
}
