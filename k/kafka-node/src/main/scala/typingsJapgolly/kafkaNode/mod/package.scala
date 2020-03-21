package typingsJapgolly.kafkaNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BrokerMetadataResponse = org.scalablytyped.runtime.NumberDictionary[typingsJapgolly.kafkaNode.AnonHost]
  type CustomPartitioner = js.Function2[
    /* partitions */ js.Array[scala.Double], 
    /* key */ java.lang.String | typingsJapgolly.node.Buffer, 
    scala.Double
  ]
}
