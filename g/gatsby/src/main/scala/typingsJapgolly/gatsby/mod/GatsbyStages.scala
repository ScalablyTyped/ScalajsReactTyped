package typingsJapgolly.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gatsby.gatsbyStrings.develop
  - typingsJapgolly.gatsby.gatsbyStrings.`develop-html`
  - typingsJapgolly.gatsby.gatsbyStrings.`build-javascript`
  - typingsJapgolly.gatsby.gatsbyStrings.`build-html`
*/
trait GatsbyStages extends js.Object

object GatsbyStages {
  @scala.inline
  def `build-html`: typingsJapgolly.gatsby.gatsbyStrings.`build-html` = this.cast("build-html")
  @scala.inline
  def `build-javascript`: typingsJapgolly.gatsby.gatsbyStrings.`build-javascript` = this.cast("build-javascript")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def develop: typingsJapgolly.gatsby.gatsbyStrings.develop = this.cast("develop")
  @scala.inline
  def `develop-html`: typingsJapgolly.gatsby.gatsbyStrings.`develop-html` = this.cast("develop-html")
}

