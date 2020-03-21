package typingsJapgolly.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cachefactory.cachefactoryStrings.memory
  - typingsJapgolly.cachefactory.cachefactoryStrings.localStorage
  - typingsJapgolly.cachefactory.cachefactoryStrings.sessionStorage
*/
trait StorageMode extends js.Object

object StorageMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localStorage: typingsJapgolly.cachefactory.cachefactoryStrings.localStorage = this.cast("localStorage")
  @scala.inline
  def memory: typingsJapgolly.cachefactory.cachefactoryStrings.memory = this.cast("memory")
  @scala.inline
  def sessionStorage: typingsJapgolly.cachefactory.cachefactoryStrings.sessionStorage = this.cast("sessionStorage")
}

