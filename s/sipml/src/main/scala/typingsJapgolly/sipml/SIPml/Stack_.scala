package typingsJapgolly.sipml.SIPml

import typingsJapgolly.sipml.SIPml.Stack.Configuration
import typingsJapgolly.sipml.SIPml.Stack.EventSubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml.Stack")
@js.native
class Stack_ ()
  extends EventTarget[EventSubscriptionType, typingsJapgolly.sipml.SIPml.Stack.Event] {
  def this(configuration: Configuration) = this()
  def newSession(`type`: String): js.Any = js.native
  def newSession(`type`: String, configuration: typingsJapgolly.sipml.SIPml.Session.Configuration): js.Any = js.native
  def setConfiguration(configuration: Configuration): Double = js.native
  def start(): Double = js.native
  def stop(): Double = js.native
  def stop(timeout: Double): Double = js.native
}

