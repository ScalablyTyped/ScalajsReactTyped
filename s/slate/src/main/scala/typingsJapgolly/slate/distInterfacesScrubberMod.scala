package typingsJapgolly.slate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesScrubberMod {
  
  @JSImport("slate/dist/interfaces/scrubber", "Scrubber")
  @js.native
  val Scrubber: ScrubberInterface = js.native
  type Scrubber = js.Function2[/* key */ String, /* value */ Any, Any]
  
  @js.native
  trait ScrubberInterface extends StObject {
    
    def setScrubber(): Unit = js.native
    def setScrubber(scrubber: typingsJapgolly.slate.distInterfacesScrubberMod.Scrubber): Unit = js.native
    
    def stringify(value: Any): String = js.native
  }
}
