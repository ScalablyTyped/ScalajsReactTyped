package typingsJapgolly.ethereumProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BlockParam = typingsJapgolly.ethereumProtocol.mod.BlockParamLiteral | scala.Double
  type ContractAbi = js.Array[typingsJapgolly.ethereumProtocol.mod.AbiDefinition]
  type ContractEventArg = java.lang.String | typingsJapgolly.bignumberJs.mod.default | scala.Double | scala.Boolean
  type DecodedLogArgs = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.ethereumProtocol.mod.ContractEventArg]
  type JSONRPCErrorCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ js.UndefOr[typingsJapgolly.ethereumProtocol.mod.JSONRPCResponsePayload], 
    scala.Unit
  ]
  type LogTopic = scala.Null | java.lang.String | js.Array[java.lang.String]
  type LogWithDecodedArgs[ArgsType /* <: typingsJapgolly.ethereumProtocol.mod.DecodedLogArgs */] = typingsJapgolly.ethereumProtocol.mod.DecodedLogEntry[ArgsType]
  type RawLog = typingsJapgolly.ethereumProtocol.mod.LogEntry
}
