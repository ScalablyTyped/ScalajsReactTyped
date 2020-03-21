package typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The primitive types available in a JSON schema.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.array
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.boolean
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`null`
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.number
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`object`
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.string
*/
trait Primitive extends js.Object

object Primitive {
  @scala.inline
  def array: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `null`: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`null` = this.cast("null")
  @scala.inline
  def number: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.string = this.cast("string")
}

