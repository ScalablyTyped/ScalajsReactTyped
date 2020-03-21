package typingsJapgolly.crossStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.crossStorage.crossStorageStrings.get
  - typingsJapgolly.crossStorage.crossStorageStrings.set
  - typingsJapgolly.crossStorage.crossStorageStrings.del
  - typingsJapgolly.crossStorage.crossStorageStrings.getKeys
  - typingsJapgolly.crossStorage.crossStorageStrings.clear
*/
trait CrossStorageMethod extends js.Object

object CrossStorageMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear: typingsJapgolly.crossStorage.crossStorageStrings.clear = this.cast("clear")
  @scala.inline
  def del: typingsJapgolly.crossStorage.crossStorageStrings.del = this.cast("del")
  @scala.inline
  def get: typingsJapgolly.crossStorage.crossStorageStrings.get = this.cast("get")
  @scala.inline
  def getKeys: typingsJapgolly.crossStorage.crossStorageStrings.getKeys = this.cast("getKeys")
  @scala.inline
  def set: typingsJapgolly.crossStorage.crossStorageStrings.set = this.cast("set")
}

