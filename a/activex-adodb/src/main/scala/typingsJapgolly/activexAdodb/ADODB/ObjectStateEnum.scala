package typingsJapgolly.activexAdodb.ADODB

import typingsJapgolly.activexAdodb.activexAdodbNumbers.`0`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`1`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`2`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`4`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`0`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`2`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`4`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`8`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`1`
*/
trait ObjectStateEnum extends js.Object

object ObjectStateEnum {
  @scala.inline
  def adStateClosed: `0` = this.cast(0)
  @scala.inline
  def adStateConnecting: `2` = this.cast(2)
  @scala.inline
  def adStateExecuting: `4` = this.cast(4)
  @scala.inline
  def adStateFetching: `8` = this.cast(8)
  @scala.inline
  def adStateOpen: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

