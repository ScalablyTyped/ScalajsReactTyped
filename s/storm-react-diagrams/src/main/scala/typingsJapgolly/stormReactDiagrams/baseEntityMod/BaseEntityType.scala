package typingsJapgolly.stormReactDiagrams.baseEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.node
  - typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.link
  - typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.port
  - typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.point
*/
trait BaseEntityType extends js.Object

object BaseEntityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def link: typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.link = this.cast("link")
  @scala.inline
  def node: typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.node = this.cast("node")
  @scala.inline
  def point: typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.point = this.cast("point")
  @scala.inline
  def port: typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.port = this.cast("port")
}

