package typingsJapgolly.stellarSdk.serverApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ServerApi {
  type CallCollectionFunction[T /* <: typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseResponse[scala.Nothing] */] = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.stellarSdk.serverApiMod.ServerApi.CallFunctionTemplateOptions], 
    js.Promise[typingsJapgolly.stellarSdk.serverApiMod.ServerApi.CollectionPage[T]]
  ]
  type CallFunction[T /* <: typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseResponse[scala.Nothing] */] = js.Function0[js.Promise[T]]
}
