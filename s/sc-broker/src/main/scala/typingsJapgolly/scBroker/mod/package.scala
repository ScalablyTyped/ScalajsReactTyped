package typingsJapgolly.scBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BrokerMessageListener = js.Function3[
    /* brokerId */ java.lang.String, 
    /* data */ js.Any, 
    /* callback */ js.Function2[/* err */ js.Error | scala.Null, /* data */ js.Any, scala.Unit], 
    scala.Unit
  ]
}
