package typingsJapgolly.kafkaNode.mod

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.kafkaNode.anon.Host
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BrokerMetadataResponse = NumberDictionary[Host]

type CustomPartitioner = js.Function2[/* partitions */ js.Array[Double], /* key */ String | Buffer, Double]
