package typingsJapgolly.stellarSdk.horizonApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Horizon {
  type BalanceLine[T /* <: typingsJapgolly.stellarBase.mod.AssetType */] = typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BalanceLineNative | (typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BalanceLineAsset[
    T | typingsJapgolly.stellarBase.mod.AssetType.credit12 | typingsJapgolly.stellarBase.mod.AssetType.credit4
  ])
  type ErrorResponseData = typingsJapgolly.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.RateLimitExceeded | typingsJapgolly.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.InternalServerError | typingsJapgolly.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.TransactionFailed
  type InflationOperationResponse = typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse[
    typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseType.inflation, 
    typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.inflation
  ]
  type TransactionResponseCollection = typingsJapgolly.stellarSdk.horizonApiMod.Horizon.ResponseCollection[typingsJapgolly.stellarSdk.horizonApiMod.Horizon.TransactionResponse]
}
