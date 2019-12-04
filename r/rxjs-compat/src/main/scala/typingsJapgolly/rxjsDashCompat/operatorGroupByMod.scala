package typingsJapgolly.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/groupBy", JSImport.Namespace)
@js.native
object operatorGroupByMod extends js.Object {
  def groupBy[T, K](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    keySelector: js.Function1[/* value */ T, K]
  ): js.Any = js.native
  def groupBy[T, K](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]
  ): js.Any = js.native
  def groupBy[T, K, R](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R]
  ): js.Any = js.native
  def groupBy[T, K, R](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]
  ): js.Any = js.native
  def groupBy[T, K, R](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ],
    subjectSelector: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ _
    ]
  ): js.Any = js.native
  @JSName("groupBy")
  def groupBy_TKR[T, K, R](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    keySelector: js.Function1[/* value */ T, K]
  ): js.Any = js.native
}

