package typingsJapgolly.reactSortableTree

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlatData[T, I /* <: String | Double */, K /* <: String */, P /* <: String */] extends js.Object {
  var flatData: NumberDictionary[T] | StringDictionary[T]
  // tslint:disable-next-line:no-unnecessary-generics
  var getKey: js.UndefOr[
    js.Function1[
      /* item */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.undefined
  // tslint:disable-next-line:no-unnecessary-generics
  var getParentKey: js.UndefOr[
    js.Function1[
      /* item */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ]
  ] = js.undefined
  var rootKey: js.UndefOr[I] = js.undefined
}

object AnonFlatData {
  @scala.inline
  def apply[T, I /* <: String | Double */, K /* <: String */, P /* <: String */](
    flatData: NumberDictionary[T] | StringDictionary[T],
    getKey: /* item */ T => CallbackTo[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ] = null,
    getParentKey: /* item */ T => CallbackTo[
      /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ] = null,
    rootKey: I = null
  ): AnonFlatData[T, I, K, P] = {
    val __obj = js.Dynamic.literal(flatData = flatData.asInstanceOf[js.Any])
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction1((t0: /* item */ T) => getKey(t0).runNow()))
    if (getParentKey != null) __obj.updateDynamic("getParentKey")(js.Any.fromFunction1((t0: /* item */ T) => getParentKey(t0).runNow()))
    if (rootKey != null) __obj.updateDynamic("rootKey")(rootKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlatData[T, I, K, P]]
  }
}

