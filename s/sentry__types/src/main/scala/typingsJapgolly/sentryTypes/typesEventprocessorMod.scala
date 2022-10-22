package typingsJapgolly.sentryTypes

import typingsJapgolly.sentryTypes.typesEventMod.Event
import typingsJapgolly.sentryTypes.typesEventMod.EventHint
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventprocessorMod {
  
  @js.native
  trait EventProcessor extends StObject {
    
    def apply(event: Event, hint: EventHint): (PromiseLike[Event | Null]) | Event | Null = js.native
    
    var id: js.UndefOr[String] = js.native
  }
}
