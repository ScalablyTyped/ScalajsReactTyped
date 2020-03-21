package typingsJapgolly.web3Eth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockTransactionBase extends BlockHeader {
  var difficulty: Double
  var size: Double
  var totalDifficulty: Double
  var uncles: js.Array[String]
}

object BlockTransactionBase {
  @scala.inline
  def apply(
    difficulty: Double,
    extraData: String,
    gasLimit: Double,
    gasUsed: Double,
    hash: String,
    logsBloom: String,
    miner: String,
    nonce: String,
    number: Double,
    parentHash: String,
    receiptRoot: String,
    sha3Uncles: String,
    size: Double,
    stateRoot: String,
    timestamp: Double | String,
    totalDifficulty: Double,
    transactionRoot: String,
    uncles: js.Array[String]
  ): BlockTransactionBase = {
    val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlockTransactionBase]
  }
}

