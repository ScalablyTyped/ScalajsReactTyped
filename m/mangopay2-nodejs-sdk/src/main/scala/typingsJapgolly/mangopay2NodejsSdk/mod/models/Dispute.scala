package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.anon.PartialDisputeData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsDisputeMod.dispute.DisputeData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsDisputeMod.dispute.DisputeStatus
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.Dispute")
@js.native
open class Dispute protected ()
  extends EntityBase[DisputeData]
     with DisputeData {
  def this(data: PartialDisputeData) = this()
  
  /**
    * The deadline by which you must contest the dispute (if you wish to contest it)
    */
  /* CompleteClass */
  var ContestDeadlineDate: Timestamp = js.native
  
  /**
    * The amount you wish to contest
    */
  /* CompleteClass */
  var ContestedFunds: MoneyData = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * Info about the reason for the dispute
    */
  /* CompleteClass */
  var DisputeReason: typingsJapgolly.mangopay2NodejsSdk.typingsModelsDisputeMod.dispute.DisputeReason = js.native
  
  /**
    * The type of dispute
    */
  /* CompleteClass */
  var DisputeType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsDisputeMod.dispute.DisputeType = js.native
  
  /**
    * The amount of funds that were disputed
    */
  /* CompleteClass */
  var DisputedFunds: MoneyData = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * The initial transaction ID
    */
  /* CompleteClass */
  var InitialTransactionId: String = js.native
  
  /**
    * The initial transaction type
    */
  /* CompleteClass */
  var InitialTransactionType: TransactionType = js.native
  
  /**
    * The ID of the associated repudiation transaction
    */
  /* CompleteClass */
  var RepudiationId: String = js.native
  
  /**
    * The result code
    */
  /* CompleteClass */
  var ResultCode: String = js.native
  
  /**
    * A verbal explanation of the ResultCode
    */
  /* CompleteClass */
  var ResultMessage: String = js.native
  
  /**
    * The status of the dispute
    */
  /* CompleteClass */
  var Status: DisputeStatus = js.native
  
  /**
    * Used to communicate information about the dispute status to you
    */
  /* CompleteClass */
  var StatusMessage: String = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
}
