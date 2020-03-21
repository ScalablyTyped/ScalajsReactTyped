package typingsJapgolly.thrift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HttpHeaders = org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double | java.lang.String | js.Array[java.lang.String]]]
  type SeqId2Service = org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  type ServiceMap[TProcessor, THandler] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.thrift.mod.ServerOptions[TProcessor, THandler]]
  type TTransportCallback = js.Function2[
    /* msg */ js.UndefOr[typingsJapgolly.node.Buffer], 
    /* seqid */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}
