package typingsJapgolly.rxJquery.mod.config

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.rxCore.Rx.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-jquery", "config.Promise")
@js.native
class Promise[T] protected ()
  extends typingsJapgolly.rxLite.Rx.config.Promise[T] {
  def this(resolver: js.Function2[
        /* resolvePromise */ js.Function1[/* value */ T, Unit], 
        /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
        Unit
      ]) = this()
}

@JSImport("rx-jquery", "config.Promise")
@js.native
object Promise
  extends Instantiable1[
      /* resolver */ js.Function2[
        /* resolvePromise */ js.Function1[/* value */ js.Object, Unit], 
        /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
        Unit
      ], 
      IPromise[js.Object]
    ]

