package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.commonMod.common.ICallback
import typingsJapgolly.mendixmodelsdk.commonMod.common.IErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/promiseOrCallbacks", JSImport.Namespace)
@js.native
object promiseOrCallbacksMod extends js.Object {
  def promiseOrCallbacks[T](
    action: js.Function2[
      /* resolve */ js.Function1[/* result */ js.UndefOr[T], Unit], 
      /* reject */ js.Function1[/* err */ js.Any, Unit], 
      Unit
    ]
  ): js.Promise[T] | Unit = js.native
  def promiseOrCallbacks[T](
    action: js.Function2[
      /* resolve */ js.Function1[/* result */ js.UndefOr[T], Unit], 
      /* reject */ js.Function1[/* err */ js.Any, Unit], 
      Unit
    ],
    callback: js.UndefOr[scala.Nothing],
    errorCallback: IErrorCallback
  ): js.Promise[T] | Unit = js.native
  def promiseOrCallbacks[T](
    action: js.Function2[
      /* resolve */ js.Function1[/* result */ js.UndefOr[T], Unit], 
      /* reject */ js.Function1[/* err */ js.Any, Unit], 
      Unit
    ],
    callback: ICallback[T]
  ): js.Promise[T] | Unit = js.native
  def promiseOrCallbacks[T](
    action: js.Function2[
      /* resolve */ js.Function1[/* result */ js.UndefOr[T], Unit], 
      /* reject */ js.Function1[/* err */ js.Any, Unit], 
      Unit
    ],
    callback: ICallback[T],
    errorCallback: IErrorCallback
  ): js.Promise[T] | Unit = js.native
}

