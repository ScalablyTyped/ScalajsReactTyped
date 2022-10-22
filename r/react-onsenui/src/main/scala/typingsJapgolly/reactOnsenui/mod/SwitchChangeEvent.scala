package typingsJapgolly.reactOnsenui.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchChangeEvent
  extends StObject
     with Event {
  
  var isInteractive: Boolean = js.native
  
  var switch: HTMLElement = js.native
  
  var value: Boolean = js.native
}
