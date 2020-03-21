package typingsJapgolly.fastMemoize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  type MemoizeFunc = js.Function2[
    /* fn */ typingsJapgolly.fastMemoize.mod.Func, 
    /* options */ js.UndefOr[typingsJapgolly.fastMemoize.mod.Options[typingsJapgolly.fastMemoize.mod.Func]], 
    typingsJapgolly.fastMemoize.mod.Func
  ]
  type Serializer = js.Function1[/* args */ js.Array[js.Any], java.lang.String]
}
