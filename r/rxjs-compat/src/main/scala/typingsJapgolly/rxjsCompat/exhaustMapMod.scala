package typingsJapgolly.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operators/exhaustMap", JSImport.Namespace)
@js.native
object exhaustMapMod extends js.Object {
  def exhaustMap[T, R](
    project: js.Function2[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ]
  ): js.Any = js.native
}

