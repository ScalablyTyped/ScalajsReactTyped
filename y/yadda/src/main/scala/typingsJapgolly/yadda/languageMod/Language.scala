package typingsJapgolly.yadda.languageMod

import typingsJapgolly.yadda.yaddaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language[TLibrary /* <: Library */] extends js.Object {
  var is_language: `true` = js.native
  def library(): TLibrary = js.native
  def library(dictionary: typingsJapgolly.yadda.dictionaryMod.^): TLibrary = js.native
  def localise(keyword: String): String = js.native
  def localise_library(library: Library): TLibrary = js.native
}

