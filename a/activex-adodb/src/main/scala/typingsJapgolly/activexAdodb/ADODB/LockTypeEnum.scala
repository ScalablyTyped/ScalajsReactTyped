package typingsJapgolly.activexAdodb.ADODB

import typingsJapgolly.activexAdodb.activexAdodbNumbers.`-1`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`1`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`2`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`3`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`4`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`3`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`2`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`1`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`-1`
*/
trait LockTypeEnum extends js.Object

object LockTypeEnum {
  @scala.inline
  def adLockBatchOptimistic: `4` = this.cast(4)
  @scala.inline
  def adLockOptimistic: `3` = this.cast(3)
  @scala.inline
  def adLockPessimistic: `2` = this.cast(2)
  @scala.inline
  def adLockReadOnly: `1` = this.cast(1)
  @scala.inline
  def adLockUnspecified: `-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

