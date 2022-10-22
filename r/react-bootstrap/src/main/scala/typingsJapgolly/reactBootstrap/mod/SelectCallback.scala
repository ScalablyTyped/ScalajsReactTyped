package typingsJapgolly.reactBootstrap.mod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.EventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectCallback extends EventHandler[Any] {
  
  /**
    * @deprecated
    * This signature is a hack so can still derive from HTMLProps.
    * It does not reflect the underlying event and should not be used.
    */
  def apply(e: ReactMouseEventFrom[js.Object & Element]): Unit = js.native
  def apply(eventKey: Any, e: ReactEventFrom[js.Object & Element]): Unit = js.native
}
