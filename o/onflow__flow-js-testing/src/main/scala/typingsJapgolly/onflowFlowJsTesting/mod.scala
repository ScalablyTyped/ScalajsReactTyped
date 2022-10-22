package typingsJapgolly.onflowFlowJsTesting

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.onflowFlowJsTesting.anon.AddressMap
import typingsJapgolly.onflowFlowJsTesting.anon.Args
import typingsJapgolly.onflowFlowJsTesting.anon.Keys
import typingsJapgolly.onflowFlowJsTesting.anon.Name
import typingsJapgolly.onflowFlowJsTesting.anon.Pkey
import typingsJapgolly.onflowFlowJsTesting.srcAccountMod.Address
import typingsJapgolly.onflowFlowJsTesting.srcAccountMod.KeyObject
import typingsJapgolly.onflowFlowJsTesting.srcAccountMod.SignerInfo
import typingsJapgolly.onflowFlowJsTesting.srcInteractionMod.Interaction
import typingsJapgolly.onflowFlowJsTesting.srcInteractionMod.ScriptProps
import typingsJapgolly.onflowFlowJsTesting.srcInteractionMod.ScriptResponse
import typingsJapgolly.onflowFlowJsTesting.srcInteractionMod.TransactionProps
import typingsJapgolly.onflowFlowJsTesting.srcInteractionMod.TransactionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@onflow/flow-js-testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@onflow/flow-js-testing", "Emulator")
  @js.native
  open class Emulator_ ()
    extends typingsJapgolly.onflowFlowJsTesting.srcEmulatorMod.Emulator_
  
  @JSImport("@onflow/flow-js-testing", "HashAlgorithm")
  @js.native
  val HashAlgorithm: typingsJapgolly.onflowFlowJsTesting.srcCryptoMod.HashAlgorithm = js.native
  
  @JSImport("@onflow/flow-js-testing", "SignatureAlgorithm")
  @js.native
  val SignatureAlgorithm: typingsJapgolly.onflowFlowJsTesting.srcCryptoMod.SignatureAlgorithm = js.native
  
  inline def createAccount(props: Keys): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def deployContract(props: AddressMap): js.Promise[TransactionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("deployContract")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransactionResponse]]
  
  inline def deployContractByName(props: Args): js.Promise[TransactionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("deployContractByName")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransactionResponse]]
  
  @JSImport("@onflow/flow-js-testing", "emulator")
  @js.native
  val emulator: typingsJapgolly.onflowFlowJsTesting.srcEmulatorMod.Emulator_ = js.native
  
  inline def executeScript(name: String): js.Promise[ScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ScriptResponse]]
  inline def executeScript(name: String, args: js.Array[Any]): js.Promise[ScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ScriptResponse]]
  inline def executeScript(props: ScriptProps): js.Promise[ScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ScriptResponse]]
  
  inline def getAccountAddress(alias: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountAddress")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getBlockOffset(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockOffset")().asInstanceOf[js.Promise[String]]
  
  inline def getContractAddress(name: String): js.Promise[Address] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractAddress")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Address]]
  
  inline def getContractCode(props: Name): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractCode")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getFlowBalance(address: Address): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlowBalance")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getScriptCode(props: Name): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScriptCode")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getTemplate(file: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getTemplate(file: String, addressMap: Unit, byAddress: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(file.asInstanceOf[js.Any], addressMap.asInstanceOf[js.Any], byAddress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getTemplate(file: String, addressMap: typingsJapgolly.onflowFlowJsTesting.srcAccountMod.AddressMap): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(file.asInstanceOf[js.Any], addressMap.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getTemplate(
    file: String,
    addressMap: typingsJapgolly.onflowFlowJsTesting.srcAccountMod.AddressMap,
    byAddress: Boolean
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(file.asInstanceOf[js.Any], addressMap.asInstanceOf[js.Any], byAddress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getTimestampOffset(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimestampOffset")().asInstanceOf[js.Promise[String]]
  
  inline def getTransactionCode(props: Name): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransactionCode")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def init(bastPath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(bastPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def init(bastPath: String, options: Pkey): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(bastPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def isAddress(address: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mintFlow(recipient: Address, amount: String): js.Promise[TransactionResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("mintFlow")(recipient.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResponse]]
  
  inline def pubFlowKey(keyObject: KeyObject): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("pubFlowKey")(keyObject.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def sendTransaction(name: String, signers: js.Array[Address | SignerInfo]): js.Promise[TransactionResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTransaction")(name.asInstanceOf[js.Any], signers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResponse]]
  inline def sendTransaction(name: String, signers: js.Array[Address | SignerInfo], args: js.Array[Any]): js.Promise[TransactionResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTransaction")(name.asInstanceOf[js.Any], signers.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResponse]]
  inline def sendTransaction(props: TransactionProps): js.Promise[TransactionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendTransaction")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransactionResponse]]
  
  inline def setBlockOffset(offset: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBlockOffset")(offset.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def setTimestampOffset(offset: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimestampOffset")(offset.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def shallPass(ix: Interaction): js.Promise[TransactionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallPass")(ix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransactionResponse]]
  
  inline def shallResolve(ix: Interaction): js.Promise[ScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallResolve")(ix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ScriptResponse]]
  
  inline def shallRevert(ix: Interaction): js.Promise[TransactionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallRevert")(ix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransactionResponse]]
  inline def shallRevert(ix: Interaction, message: String): js.Promise[TransactionResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallRevert")(ix.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResponse]]
  inline def shallRevert(ix: Interaction, message: js.RegExp): js.Promise[TransactionResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallRevert")(ix.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResponse]]
}
