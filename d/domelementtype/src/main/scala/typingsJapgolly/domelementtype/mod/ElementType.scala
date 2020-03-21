package typingsJapgolly.domelementtype.mod

import typingsJapgolly.domelementtype.domelementtypeStrings.cdata
import typingsJapgolly.domelementtype.domelementtypeStrings.comment
import typingsJapgolly.domelementtype.domelementtypeStrings.directive
import typingsJapgolly.domelementtype.domelementtypeStrings.doctype
import typingsJapgolly.domelementtype.domelementtypeStrings.script
import typingsJapgolly.domelementtype.domelementtypeStrings.style
import typingsJapgolly.domelementtype.domelementtypeStrings.tag
import typingsJapgolly.domelementtype.domelementtypeStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.domelementtype.domelementtypeStrings.text
  - typingsJapgolly.domelementtype.domelementtypeStrings.directive
  - typingsJapgolly.domelementtype.domelementtypeStrings.comment
  - typingsJapgolly.domelementtype.domelementtypeStrings.script
  - typingsJapgolly.domelementtype.domelementtypeStrings.style
  - typingsJapgolly.domelementtype.domelementtypeStrings.tag
  - typingsJapgolly.domelementtype.domelementtypeStrings.cdata
  - typingsJapgolly.domelementtype.domelementtypeStrings.doctype
*/
trait ElementType extends js.Object

object ElementType {
  @scala.inline
  def CDATA: cdata = this.cast("cdata")
  @scala.inline
  def Comment: comment = this.cast("comment")
  @scala.inline
  def Directive: directive = this.cast("directive")
  @scala.inline
  def Doctype: doctype = this.cast("doctype")
  @scala.inline
  def Script: script = this.cast("script")
  @scala.inline
  def Style: style = this.cast("style")
  @scala.inline
  def Tag: tag = this.cast("tag")
  @scala.inline
  def Text: text = this.cast("text")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

