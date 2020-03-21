package typingsJapgolly.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inversify.inversifyStrings.Singleton
  - typingsJapgolly.inversify.inversifyStrings.Transient
  - typingsJapgolly.inversify.inversifyStrings.Request
*/
trait BindingScope extends js.Object

object BindingScope {
  @scala.inline
  def Request: typingsJapgolly.inversify.inversifyStrings.Request = this.cast("Request")
  @scala.inline
  def Singleton: typingsJapgolly.inversify.inversifyStrings.Singleton = this.cast("Singleton")
  @scala.inline
  def Transient: typingsJapgolly.inversify.inversifyStrings.Transient = this.cast("Transient")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

