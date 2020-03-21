package typingsJapgolly.coinlist.mod

import typingsJapgolly.coinlist.coinlistStrings.id
import typingsJapgolly.coinlist.coinlistStrings.name
import typingsJapgolly.coinlist.coinlistStrings.symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoinsAPI extends js.Object {
  def get(symbol: String): js.UndefOr[Coin] = js.native
  @JSName("get")
  def get_id(symbol: String, property: id): js.UndefOr[String] = js.native
  @JSName("get")
  def get_name(symbol: String, property: name): js.UndefOr[String] = js.native
  @JSName("get")
  def get_symbol(symbol: String, property: symbol): js.UndefOr[String] = js.native
}

