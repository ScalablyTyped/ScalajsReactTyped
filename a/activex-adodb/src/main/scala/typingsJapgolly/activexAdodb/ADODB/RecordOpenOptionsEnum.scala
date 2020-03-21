package typingsJapgolly.activexAdodb.ADODB

import typingsJapgolly.activexAdodb.activexAdodbNumbers.`-1`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`16384`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`32768`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`4096`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`65536`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`8388608`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`32768`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`16384`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`4096`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`65536`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`8388608`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`-1`
*/
trait RecordOpenOptionsEnum extends js.Object

object RecordOpenOptionsEnum {
  @scala.inline
  def adDelayFetchFields: `32768` = this.cast(32768)
  @scala.inline
  def adDelayFetchStream: `16384` = this.cast(16384)
  @scala.inline
  def adOpenAsync: `4096` = this.cast(4096)
  @scala.inline
  def adOpenExecuteCommand: `65536` = this.cast(65536)
  @scala.inline
  def adOpenOutput: `8388608` = this.cast(8388608)
  @scala.inline
  def adOpenRecordUnspecified: `-1` = this.cast(-1)
  @scala.inline
  def adOpenSource: `8388608` = this.cast(8388608)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

