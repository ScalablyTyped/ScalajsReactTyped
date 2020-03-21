package typingsJapgolly.transliteration

import typingsJapgolly.transliteration.typesMod.SlugifyFunction
import typingsJapgolly.transliteration.typesMod.TransliterateFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transliteration", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val slugify: SlugifyFunction = js.native
  val transliterate: TransliterateFunction = js.native
}

