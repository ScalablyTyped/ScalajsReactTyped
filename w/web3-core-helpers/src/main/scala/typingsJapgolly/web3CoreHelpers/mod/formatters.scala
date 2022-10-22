package typingsJapgolly.web3CoreHelpers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core-helpers", "formatters")
@js.native
open class formatters () extends StObject
/* static members */
object formatters {
  
  @JSImport("web3-core-helpers", "formatters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def inputAddressFormatter(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inputAddressFormatter")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def inputBlockNumberFormatter(blockNumber: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inputBlockNumberFormatter")(blockNumber.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  inline def inputBlockNumberFormatter(blockNumber: Double): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inputBlockNumberFormatter")(blockNumber.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  inline def inputCallFormatter(txObject: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inputCallFormatter")(txObject.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def inputDefaultBlockNumberFormatter(blockNumber: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inputDefaultBlockNumberFormatter")(blockNumber.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def inputLogFormatter(log: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inputLogFormatter")(log.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def inputPostFormatter(post: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inputPostFormatter")(post.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def inputSignFormatter(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inputSignFormatter")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def inputTransactionFormatter(txObject: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inputTransactionFormatter")(txObject.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isPredefinedBlockNumber(blockNumber: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPredefinedBlockNumber")(blockNumber.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def outputBigNumberFormatter(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("outputBigNumberFormatter")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def outputBlockFormatter(block: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("outputBlockFormatter")(block.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def outputLogFormatter(log: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("outputLogFormatter")(log.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  // TODO: Create Post interface
  inline def outputPostFormatter(post: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("outputPostFormatter")(post.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  // TODO: Create Post interface
  inline def outputSyncingFormatter(result: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("outputSyncingFormatter")(result.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def outputTransactionFormatter(receipt: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("outputTransactionFormatter")(receipt.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def outputTransactionReceiptFormatter(receipt: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("outputTransactionReceiptFormatter")(receipt.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  // TODO: Create Block interface
  inline def txInputFormatter(txObject: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("txInputFormatter")(txObject.asInstanceOf[js.Any]).asInstanceOf[Any]
}
