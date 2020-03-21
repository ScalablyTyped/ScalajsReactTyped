package typingsJapgolly.vegaTypings.dataMod

import typingsJapgolly.vegaTypings.runtimeMod.TypeInference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.boolean
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.number
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.date
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.string
*/
trait DataType extends TypeInference

object DataType {
  @scala.inline
  def boolean: typingsJapgolly.vegaTypings.vegaTypingsStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsJapgolly.vegaTypings.vegaTypingsStrings.date = this.cast("date")
  @scala.inline
  def number: typingsJapgolly.vegaTypings.vegaTypingsStrings.number = this.cast("number")
  @scala.inline
  def string: typingsJapgolly.vegaTypings.vegaTypingsStrings.string = this.cast("string")
}

