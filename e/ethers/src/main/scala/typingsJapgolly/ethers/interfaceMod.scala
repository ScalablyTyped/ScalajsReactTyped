package typingsJapgolly.ethers

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ethers.typesMod.DeployDescription
import typingsJapgolly.ethers.typesMod.EventDescription
import typingsJapgolly.ethers.typesMod.EventFragment
import typingsJapgolly.ethers.typesMod.FunctionDescription
import typingsJapgolly.ethers.typesMod.FunctionFragment
import typingsJapgolly.ethers.typesMod.LogDescription
import typingsJapgolly.ethers.typesMod.ParamType
import typingsJapgolly.ethers.typesMod.TransactionDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/contracts/interface", JSImport.Namespace)
@js.native
object interfaceMod extends js.Object {
  @js.native
  class Interface protected () extends js.Object {
    def this(abi: String) = this()
    def this(abi: js.Array[String | ParamType]) = this()
    val abi: js.Array[EventFragment | FunctionFragment] = js.native
    val deployFunction: DeployDescription = js.native
    val events: StringDictionary[EventDescription] = js.native
    val functions: StringDictionary[FunctionDescription] = js.native
    def parseLog(log: AnonTopics): LogDescription = js.native
    def parseTransaction(tx: AnonData): TransactionDescription = js.native
  }
  
}

