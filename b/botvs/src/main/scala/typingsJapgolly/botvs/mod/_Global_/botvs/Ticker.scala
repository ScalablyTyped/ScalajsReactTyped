package typingsJapgolly.botvs.mod._Global_.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 市场行情
  */
trait Ticker extends js.Object {
  /**
    * 买一价
    */
  var Buy: Double
  /**
    * 最高价
    */
  var High: Double
  /**
    * 最后成交价
    */
  var Last: Double
  /**
    * 最低价
    */
  var Low: Double
  /**
    * 卖一价
    */
  var Sell: Double
  var Time: Double
  /**
    * 最近成交量
    */
  var Volume: Double
}

object Ticker {
  @scala.inline
  def apply(Buy: Double, High: Double, Last: Double, Low: Double, Sell: Double, Time: Double, Volume: Double): Ticker = {
    val __obj = js.Dynamic.literal(Buy = Buy.asInstanceOf[js.Any], High = High.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Sell = Sell.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Volume = Volume.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Ticker]
  }
}

