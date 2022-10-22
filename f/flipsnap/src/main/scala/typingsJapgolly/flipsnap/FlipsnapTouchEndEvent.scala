package typingsJapgolly.flipsnap

import typingsJapgolly.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlipsnapTouchEndEvent
  extends StObject
     with Event {
  
  var cancelled: Boolean = js.native
  
  var moved: Boolean = js.native
  
  var newPoint: Double = js.native
  
  var originalPoint: Double = js.native
}
