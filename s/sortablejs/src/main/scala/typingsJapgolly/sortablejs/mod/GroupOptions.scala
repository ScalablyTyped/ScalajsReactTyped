package typingsJapgolly.sortablejs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.sortablejs.sortablejsStrings.clone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  /**
    * a canonical version of pull, created by Sortable
    */
  var checkPull: js.UndefOr[
    js.Function4[
      /* sortable */ Sortable, 
      /* activeSortable */ Sortable, 
      /* dragEl */ HTMLElement, 
      /* event */ SortableEvent, 
      Boolean | String | js.Array[String]
    ]
  ] = js.undefined
  /**
    * a canonical version of put, created by Sortable
    */
  var checkPut: js.UndefOr[
    js.Function4[
      /* sortable */ Sortable, 
      /* activeSortable */ Sortable, 
      /* dragEl */ HTMLElement, 
      /* event */ SortableEvent, 
      Boolean | String | clone | js.Array[String]
    ]
  ] = js.undefined
  /**
    * group name
    */
  var name: String
  /**
    * ability to move from the list. clone — copy the item, rather than move.
    */
  var pull: js.UndefOr[PullResult | (js.Function2[/* to */ Sortable, /* from */ Sortable, PullResult])] = js.undefined
  /**
    * whether elements can be added from other lists, or an array of group names from which elements can be taken.
    */
  var put: js.UndefOr[PutResult | (js.Function1[/* to */ Sortable, PullResult])] = js.undefined
  /**
    * revert cloned element to initial position after moving to a another list.
    */
  var revertClone: js.UndefOr[Boolean] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    name: String,
    checkPull: (/* sortable */ Sortable, /* activeSortable */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => CallbackTo[Boolean | String | js.Array[String]] = null,
    checkPut: (/* sortable */ Sortable, /* activeSortable */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => CallbackTo[Boolean | String | clone | js.Array[String]] = null,
    pull: PullResult | (js.Function2[/* to */ Sortable, /* from */ Sortable, PullResult]) = null,
    put: PutResult | (js.Function1[/* to */ Sortable, PullResult]) = null,
    revertClone: js.UndefOr[Boolean] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (checkPull != null) __obj.updateDynamic("checkPull")(js.Any.fromFunction4((t0: /* sortable */ typingsJapgolly.sortablejs.mod.Sortable, t1: /* activeSortable */ typingsJapgolly.sortablejs.mod.Sortable, t2: /* dragEl */ org.scalajs.dom.raw.HTMLElement, t3: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => checkPull(t0, t1, t2, t3).runNow()))
    if (checkPut != null) __obj.updateDynamic("checkPut")(js.Any.fromFunction4((t0: /* sortable */ typingsJapgolly.sortablejs.mod.Sortable, t1: /* activeSortable */ typingsJapgolly.sortablejs.mod.Sortable, t2: /* dragEl */ org.scalajs.dom.raw.HTMLElement, t3: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => checkPut(t0, t1, t2, t3).runNow()))
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (put != null) __obj.updateDynamic("put")(put.asInstanceOf[js.Any])
    if (!js.isUndefined(revertClone)) __obj.updateDynamic("revertClone")(revertClone.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

