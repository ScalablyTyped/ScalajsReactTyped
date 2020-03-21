package typingsJapgolly.ioredis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackFunction[T] = js.Function2[
    /* err */ js.UndefOr[typingsJapgolly.node.NodeJS.ErrnoException | scala.Null], 
    /* result */ js.UndefOr[T], 
    scala.Unit
  ]
  type ClusterNode = java.lang.String | scala.Double | typingsJapgolly.ioredis.mod.NodeConfiguration
  type Command = typingsJapgolly.ioredis.mod._Command
  type DNSLookupFunction = js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function3[
      /* err */ typingsJapgolly.node.NodeJS.ErrnoException, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type KeyType = java.lang.String | typingsJapgolly.node.Buffer
  type NatMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.ioredis.AnonHost]
  type Ok = typingsJapgolly.ioredis.ioredisStrings.OK
  type PreferredSlaves = (js.Function1[
    /* slaves */ js.Array[typingsJapgolly.ioredis.mod.AddressFromResponse], 
    typingsJapgolly.ioredis.mod.AddressFromResponse | scala.Null
  ]) | js.Array[typingsJapgolly.ioredis.AnonIp] | typingsJapgolly.ioredis.AnonIp
  type ValueType = java.lang.String | typingsJapgolly.node.Buffer | scala.Double | js.Array[js.Any]
}
