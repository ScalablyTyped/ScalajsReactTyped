package typingsJapgolly.fibjs

import typingsJapgolly.fibjs.fibjsNumbers.`0`
import typingsJapgolly.fibjs.fibjsNumbers.`10`
import typingsJapgolly.fibjs.fibjsNumbers.`1`
import typingsJapgolly.fibjs.fibjsNumbers.`2`
import typingsJapgolly.fibjs.fibjsNumbers.`3`
import typingsJapgolly.fibjs.fibjsNumbers.`4`
import typingsJapgolly.fibjs.fibjsNumbers.`5`
import typingsJapgolly.fibjs.fibjsNumbers.`6`
import typingsJapgolly.fibjs.fibjsNumbers.`7`
import typingsJapgolly.fibjs.fibjsNumbers.`8`
import typingsJapgolly.fibjs.fibjsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief zeroMQ 消息队列模块
	* @detail 基础模块。提供 zeroMQ 消息队列支撑。,```JavaScript,var zmq = require('zmq');,```
	*/
@JSImport("zmq", JSImport.Namespace)
@js.native
object zmqMod extends js.Object {
  @js.native
  class Socket () extends ClassZmqSocket
  
  val DEALER: `5` = js.native
  val PAIR: `0` = js.native
  val PUB: `1` = js.native
  val PULL: `7` = js.native
  val PUSH: `8` = js.native
  val REP: `4` = js.native
  val REQ: `3` = js.native
  val ROUTER: `6` = js.native
  val SUB: `2` = js.native
  val XPUB: `9` = js.native
  val XSUB: `10` = js.native
}

