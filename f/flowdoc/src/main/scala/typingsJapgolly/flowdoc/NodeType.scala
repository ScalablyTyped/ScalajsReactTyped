package typingsJapgolly.flowdoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.flowdoc.flowdocStrings.DOCUMENT
  - typingsJapgolly.flowdoc.flowdocStrings.PAGE
  - typingsJapgolly.flowdoc.flowdocStrings.SCREEN
  - typingsJapgolly.flowdoc.flowdocStrings.IMAGE
  - typingsJapgolly.flowdoc.flowdocStrings.RECT
  - typingsJapgolly.flowdoc.flowdocStrings.ELLIPSE
  - typingsJapgolly.flowdoc.flowdocStrings.DIAMOND
  - typingsJapgolly.flowdoc.flowdocStrings.HOTSPOT
  - typingsJapgolly.flowdoc.flowdocStrings.LAYER
*/
trait NodeType extends js.Object

object NodeType {
  @scala.inline
  def DIAMOND: typingsJapgolly.flowdoc.flowdocStrings.DIAMOND = this.cast("DIAMOND")
  @scala.inline
  def DOCUMENT: typingsJapgolly.flowdoc.flowdocStrings.DOCUMENT = this.cast("DOCUMENT")
  @scala.inline
  def ELLIPSE: typingsJapgolly.flowdoc.flowdocStrings.ELLIPSE = this.cast("ELLIPSE")
  @scala.inline
  def HOTSPOT: typingsJapgolly.flowdoc.flowdocStrings.HOTSPOT = this.cast("HOTSPOT")
  @scala.inline
  def IMAGE: typingsJapgolly.flowdoc.flowdocStrings.IMAGE = this.cast("IMAGE")
  @scala.inline
  def LAYER: typingsJapgolly.flowdoc.flowdocStrings.LAYER = this.cast("LAYER")
  @scala.inline
  def PAGE: typingsJapgolly.flowdoc.flowdocStrings.PAGE = this.cast("PAGE")
  @scala.inline
  def RECT: typingsJapgolly.flowdoc.flowdocStrings.RECT = this.cast("RECT")
  @scala.inline
  def SCREEN: typingsJapgolly.flowdoc.flowdocStrings.SCREEN = this.cast("SCREEN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

