package typingsJapgolly.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/operators/partition", JSImport.Namespace)
@js.native
object operatorsPartitionMod extends js.Object {
  def partition[T](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]
  ): js.Tuple2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
  ] = js.native
  def partition[T](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean],
    thisArg: js.Any
  ): js.Tuple2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
  ] = js.native
}

