package typingsJapgolly.w3cWebNfc

import typingsJapgolly.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NDEFReadingEvent
  extends StObject
     with Event {
  
  var message: NDEFMessage = js.native
  
  var serialNumber: String = js.native
}
