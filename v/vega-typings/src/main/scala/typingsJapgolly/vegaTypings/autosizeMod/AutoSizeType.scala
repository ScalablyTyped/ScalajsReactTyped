package typingsJapgolly.vegaTypings.autosizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.pad
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.fit
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.`fit-x`
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.`fit-y`
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.none
*/
trait AutoSizeType extends AutoSize

object AutoSizeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fit: typingsJapgolly.vegaTypings.vegaTypingsStrings.fit = this.cast("fit")
  @scala.inline
  def `fit-x`: typingsJapgolly.vegaTypings.vegaTypingsStrings.`fit-x` = this.cast("fit-x")
  @scala.inline
  def `fit-y`: typingsJapgolly.vegaTypings.vegaTypingsStrings.`fit-y` = this.cast("fit-y")
  @scala.inline
  def none: typingsJapgolly.vegaTypings.vegaTypingsStrings.none = this.cast("none")
  @scala.inline
  def pad: typingsJapgolly.vegaTypings.vegaTypingsStrings.pad = this.cast("pad")
}

