package typingsJapgolly.domInputevent

import typingsJapgolly.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputEvent
  extends StObject
     with UIEvent {
  
  val data: String | Null = js.native
  
  val isComposing: Boolean = js.native
}
