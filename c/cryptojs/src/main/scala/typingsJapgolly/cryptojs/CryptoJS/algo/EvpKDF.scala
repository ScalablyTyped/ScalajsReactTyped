package typingsJapgolly.cryptojs.CryptoJS.algo

import typingsJapgolly.cryptojs.CryptoJS.lib.Base
import typingsJapgolly.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvpKDF extends Base {
  var cfg: IEvpKDFCfg = js.native
  def compute(password: String, salt: String): WordArray = js.native
  def compute(password: String, salt: WordArray): WordArray = js.native
  def compute(password: WordArray, salt: String): WordArray = js.native
  def compute(password: WordArray, salt: WordArray): WordArray = js.native
  def create(): EvpKDF = js.native
  def create(cfg: IEvpKDFCfg): EvpKDF = js.native
  def init(): Unit = js.native
  def init(cfg: IEvpKDFCfg): Unit = js.native
}

