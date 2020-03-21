package typingsJapgolly.poi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.poi.poiStrings.production
  - typingsJapgolly.poi.poiStrings.development
  - typingsJapgolly.poi.poiStrings.test
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def development: typingsJapgolly.poi.poiStrings.development = this.cast("development")
  @scala.inline
  def production: typingsJapgolly.poi.poiStrings.production = this.cast("production")
  @scala.inline
  def test: typingsJapgolly.poi.poiStrings.test = this.cast("test")
}

