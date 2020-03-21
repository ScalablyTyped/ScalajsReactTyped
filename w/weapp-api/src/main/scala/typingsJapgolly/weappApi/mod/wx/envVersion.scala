package typingsJapgolly.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weappApi.weappApiStrings.develop
  - typingsJapgolly.weappApi.weappApiStrings.trial
  - typingsJapgolly.weappApi.weappApiStrings.release
*/
trait envVersion extends js.Object

object envVersion {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def develop: typingsJapgolly.weappApi.weappApiStrings.develop = this.cast("develop")
  @scala.inline
  def release: typingsJapgolly.weappApi.weappApiStrings.release = this.cast("release")
  @scala.inline
  def trial: typingsJapgolly.weappApi.weappApiStrings.trial = this.cast("trial")
}

