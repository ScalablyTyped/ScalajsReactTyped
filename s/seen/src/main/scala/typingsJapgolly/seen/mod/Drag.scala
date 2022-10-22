package typingsJapgolly.seen.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.seen.anon.Inertia
import typingsJapgolly.seen.anon.Offset
import typingsJapgolly.seen.anon.`0`
import typingsJapgolly.seen.mod.Events.Dispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Drag")
@js.native
open class Drag protected () extends StObject {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: `0`) = this()
  def this(elementOrId: HTMLElement, options: `0`) = this()
  
  var defaults: Inertia = js.native
  
  var dispatch: Dispatcher = js.native
  
  var el: HTMLElement = js.native
  
  var inertia: Boolean = js.native
  
  def on(`type`: String, listener: js.Function1[/* e */ Offset, Unit]): Dispatcher = js.native
}
