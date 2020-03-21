package typingsJapgolly.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What kind of object an ObjC.Object represents.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.instance
  - typingsJapgolly.fridaGum.fridaGumStrings.`class`
  - typingsJapgolly.fridaGum.fridaGumStrings.`meta-class`
*/
trait ObjectKind extends js.Object

object ObjectKind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `class`: typingsJapgolly.fridaGum.fridaGumStrings.`class` = this.cast("class")
  @scala.inline
  def instance: typingsJapgolly.fridaGum.fridaGumStrings.instance = this.cast("instance")
  @scala.inline
  def `meta-class`: typingsJapgolly.fridaGum.fridaGumStrings.`meta-class` = this.cast("meta-class")
}

