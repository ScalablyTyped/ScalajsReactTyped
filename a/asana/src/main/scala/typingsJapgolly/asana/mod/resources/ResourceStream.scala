package typingsJapgolly.asana.mod.resources

import typingsJapgolly.asana.asanaStrings.data
import typingsJapgolly.asana.asanaStrings.end
import typingsJapgolly.asana.asanaStrings.error
import typingsJapgolly.asana.asanaStrings.finish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceStream[T /* <: AnonymousResource */] extends StObject {
  
  def on(command: end | finish | error, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_data(command: data, callback: js.Function1[/* resource */ T, Any]): Unit = js.native
}
