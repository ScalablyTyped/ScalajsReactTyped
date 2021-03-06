package typingsJapgolly.rword.mod

import typingsJapgolly.rword.rwordStrings.big
import typingsJapgolly.rword.rwordStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rword", "rword")
@js.native
class rword () extends js.Object

/* static members */
@JSImport("rword", "rword")
@js.native
object rword extends js.Object {
  var globalPool: js.Array[String] = js.native
  val words: js.Array[String] = js.native
  /**
    * Randomly generates words from the words array
    */
  def generate(): String | js.Array[String] = js.native
  def generate(count: Double): String | js.Array[String] = js.native
  def generate(count: Double, opt: GenerateOptions): String | js.Array[String] = js.native
  /**
    * A simple generator that pulls words from a prefilled global pool. Should
    *  be preferred over `rword.generate()` if custom filters are not needed as
    *  this method can in certain instances be many times faster.
    * @param count - Words to return. Throws error if greater than `10`
    */
  def generateFromPool(): String | js.Array[String] = js.native
  def generateFromPool(count: Double): String | js.Array[String] = js.native
  /**
    * Load and shuffle word list
    */
  @JSName("load")
  def load_big(list: big): Unit = js.native
  @JSName("load")
  def load_small(list: small): Unit = js.native
  /**
    * Shuffles words and globalPool arrays
    */
  def shuffle(): Unit = js.native
}

