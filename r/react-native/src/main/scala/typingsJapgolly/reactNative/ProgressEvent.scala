package typingsJapgolly.reactNative

import org.scalajs.dom.EventTarget
import typingsJapgolly.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// XMLHttpRequest
//
@js.native
trait ProgressEvent[T /* <: EventTarget */]
  extends StObject
     with Event {
  
  val lengthComputable: Boolean = js.native
  
  val loaded: Double = js.native
  
  @JSName("target")
  val target_ProgressEvent: T | Null = js.native
  
  val total: Double = js.native
}
