package typingsJapgolly.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inversify.inversifyStrings.ConstructorArgument
  - typingsJapgolly.inversify.inversifyStrings.ClassProperty
  - typingsJapgolly.inversify.inversifyStrings.Variable
*/
trait TargetType extends js.Object

object TargetType {
  @scala.inline
  def ClassProperty: typingsJapgolly.inversify.inversifyStrings.ClassProperty = this.cast("ClassProperty")
  @scala.inline
  def ConstructorArgument: typingsJapgolly.inversify.inversifyStrings.ConstructorArgument = this.cast("ConstructorArgument")
  @scala.inline
  def Variable: typingsJapgolly.inversify.inversifyStrings.Variable = this.cast("Variable")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

