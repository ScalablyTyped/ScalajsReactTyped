package typingsJapgolly.activexAdodb.ADODB

import typingsJapgolly.activexAdodb.activexAdodbNumbers.`-1`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`1`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`256`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`2`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`4`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`512`
import typingsJapgolly.activexAdodb.activexAdodbNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`256`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`4`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`2`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`512`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`1`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`8`
  - typingsJapgolly.activexAdodb.activexAdodbNumbers.`-1`
*/
trait CommandTypeEnum extends js.Object

object CommandTypeEnum {
  @scala.inline
  def adCmdFile: `256` = this.cast(256)
  @scala.inline
  def adCmdStoredProc: `4` = this.cast(4)
  @scala.inline
  def adCmdTable: `2` = this.cast(2)
  @scala.inline
  def adCmdTableDirect: `512` = this.cast(512)
  @scala.inline
  def adCmdText: `1` = this.cast(1)
  @scala.inline
  def adCmdUnknown: `8` = this.cast(8)
  @scala.inline
  def adCmdUnspecified: `-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

