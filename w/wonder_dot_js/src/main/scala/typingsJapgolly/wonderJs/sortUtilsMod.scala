package typingsJapgolly.wonderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/utils/SortUtils", JSImport.Namespace)
@js.native
object sortUtilsMod extends js.Object {
  @js.native
  class SortUtils () extends js.Object
  
  /* static members */
  @js.native
  object SortUtils extends js.Object {
    def insertSort(targetArr: js.Array[_], compareFunc: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): js.Array[_] = js.native
    def insertSort(
      targetArr: js.Array[_],
      compareFunc: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean],
      isChangeSelf: Boolean
    ): js.Array[_] = js.native
    def quickSort(targetArr: js.Array[_], compareFunc: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): js.Array[_] = js.native
    def quickSort(
      targetArr: js.Array[_],
      compareFunc: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean],
      isChangeSelf: Boolean
    ): js.Array[_] = js.native
  }
  
}

