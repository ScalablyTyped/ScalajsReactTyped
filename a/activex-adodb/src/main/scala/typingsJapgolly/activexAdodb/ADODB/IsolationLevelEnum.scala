package typingsJapgolly.activexAdodb.ADODB

import typingsJapgolly.activexAdodb.activexAdodbNumbers.`-1`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`1048576`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`16`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`256`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`4096`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`65536`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`256`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`16`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`4096`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`1048576`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`65536`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`-1`
*/
trait IsolationLevelEnum extends js.Object

object IsolationLevelEnum {
  @scala.inline
  def adXactBrowse: `256` = this.cast(256)
  @scala.inline
  def adXactChaos: `16` = this.cast(16)
  @scala.inline
  def adXactCursorStability: `4096` = this.cast(4096)
  @scala.inline
  def adXactIsolated: `1048576` = this.cast(1048576)
  @scala.inline
  def adXactReadCommitted: `4096` = this.cast(4096)
  @scala.inline
  def adXactReadUncommitted: `256` = this.cast(256)
  @scala.inline
  def adXactRepeatableRead: `65536` = this.cast(65536)
  @scala.inline
  def adXactSerializable: `1048576` = this.cast(1048576)
  @scala.inline
  def adXactUnspecified: `-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

