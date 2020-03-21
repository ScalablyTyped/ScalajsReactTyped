package typingsJapgolly.ckeditor.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor.AnonRemoved
import typingsJapgolly.ckeditor.CKEDITOR.dom.element
import typingsJapgolly.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.image2")
@js.native
object image2 extends js.Object {
  def checkHasNaturalRatio(image: element): Boolean = js.native
  def getLinkAttributesGetter(): js.Function2[/* editor */ editor, /* data */ StringDictionary[String], AnonRemoved] = js.native
  def getLinkAttributesParser(): js.Function2[/* editor */ editor, /* element */ element, StringDictionary[String]] = js.native
  def getNatural(image: element): StringDictionary[String] = js.native
}

