package typingsJapgolly.transliteration.typesMod

import typingsJapgolly.transliteration.charmapMod.Charmap_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransliterationFunction[T] extends js.Object {
  /**
    * Used by browser
    */
  var noConflict: js.UndefOr[js.Function0[TransliterationFunction[T]]] = js.native
  def apply(source: String): String = js.native
  def apply(source: String, options: T): String = js.native
  /**
    * Set default config
    * @param options
    * @param reset
    */
  def config(): T = js.native
  def config(options: T): T = js.native
  def config(options: T, reset: Boolean): T = js.native
  /**
    * Set charmap data
    * @param data
    * @param reset
    * @memberof Transliterate
    */
  def setData(): Charmap_ = js.native
  def setData(data: Charmap_): Charmap_ = js.native
  def setData(data: Charmap_, reset: Boolean): Charmap_ = js.native
}

