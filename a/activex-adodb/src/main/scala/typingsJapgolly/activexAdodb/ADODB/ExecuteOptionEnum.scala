package typingsJapgolly.activexAdodb.ADODB

import typingsJapgolly.activexAdodb.activexAdodbNumbers.`-1`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`1024`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`128`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`16`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`2048`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`32`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`64`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`16`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`32`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`64`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`128`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`2048`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`1024`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`-1`
*/
trait ExecuteOptionEnum extends js.Object

object ExecuteOptionEnum {
  @scala.inline
  def adAsyncExecute: `16` = this.cast(16)
  @scala.inline
  def adAsyncFetch: `32` = this.cast(32)
  @scala.inline
  def adAsyncFetchNonBlocking: `64` = this.cast(64)
  @scala.inline
  def adExecuteNoRecords: `128` = this.cast(128)
  @scala.inline
  def adExecuteRecord: `2048` = this.cast(2048)
  @scala.inline
  def adExecuteStream: `1024` = this.cast(1024)
  @scala.inline
  def adOptionUnspecified: `-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

