package typingsJapgolly.pulumiPulumi.dynamicMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceProvider extends js.Object {
  /**
    * Check validates that the given property bag is valid for a resource of the given type.
    *
    * @param olds The old input properties to use for validation.
    * @param news The new input properties to use for validation.
    */
  var check: js.UndefOr[js.Function2[/* olds */ js.Any, /* news */ js.Any, js.Promise[CheckResult]]] = js.undefined
  /**
    * Delete tears down an existing resource with the given ID.  If it fails, the resource is assumed to still exist.
    *
    * @param id The ID of the resource to delete.
    * @param props The current properties on the resource.
    */
  var delete: js.UndefOr[js.Function2[/* id */ ID, /* props */ js.Any, js.Promise[Unit]]] = js.undefined
  /**
    * Diff checks what impacts a hypothetical update will have on the resource's properties.
    *
    * @param id The ID of the resource to diff.
    * @param olds The old values of properties to diff.
    * @param news The new values of properties to diff.
    */
  var diff: js.UndefOr[
    js.Function3[/* id */ ID, /* olds */ js.Any, /* news */ js.Any, js.Promise[DiffResult]]
  ] = js.undefined
  /**
    * Reads the current live state associated with a resource.  Enough state must be included in the inputs to uniquely
    * identify the resource; this is typically just the resource ID, but it may also include some properties.
    */
  var read: js.UndefOr[
    js.Function2[/* id */ ID, /* props */ js.UndefOr[js.Any], js.Promise[ReadResult]]
  ] = js.undefined
  /**
    * Update updates an existing resource with new values.
    *
    * @param id The ID of the resource to update.
    * @param olds The old values of properties to update.
    * @param news The new values of properties to update.
    */
  var update: js.UndefOr[
    js.Function3[/* id */ ID, /* olds */ js.Any, /* news */ js.Any, js.Promise[UpdateResult]]
  ] = js.undefined
  /**
    * Create allocates a new instance of the provided resource and returns its unique ID afterwards.
    * If this call fails, the resource must not have been created (i.e., it is "transactional").
    *
    * @param inputs The properties to set during creation.
    */
  def create(inputs: js.Any): js.Promise[CreateResult]
}

object ResourceProvider {
  @scala.inline
  def apply(
    create: js.Any => CallbackTo[js.Promise[CreateResult]],
    check: (/* olds */ js.Any, /* news */ js.Any) => CallbackTo[js.Promise[CheckResult]] = null,
    delete: (/* id */ ID, /* props */ js.Any) => CallbackTo[js.Promise[Unit]] = null,
    diff: (/* id */ ID, /* olds */ js.Any, /* news */ js.Any) => CallbackTo[js.Promise[DiffResult]] = null,
    read: (/* id */ ID, /* props */ js.UndefOr[js.Any]) => CallbackTo[js.Promise[ReadResult]] = null,
    update: (/* id */ ID, /* olds */ js.Any, /* news */ js.Any) => CallbackTo[js.Promise[UpdateResult]] = null
  ): ResourceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: js.Any) => create(t0).runNow()))
    if (check != null) __obj.updateDynamic("check")(js.Any.fromFunction2((t0: /* olds */ js.Any, t1: /* news */ js.Any) => check(t0, t1).runNow()))
    if (delete != null) __obj.updateDynamic("delete")(js.Any.fromFunction2((t0: /* id */ typingsJapgolly.pulumiPulumi.resourceMod.ID, t1: /* props */ js.Any) => delete(t0, t1).runNow()))
    if (diff != null) __obj.updateDynamic("diff")(js.Any.fromFunction3((t0: /* id */ typingsJapgolly.pulumiPulumi.resourceMod.ID, t1: /* olds */ js.Any, t2: /* news */ js.Any) => diff(t0, t1, t2).runNow()))
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction2((t0: /* id */ typingsJapgolly.pulumiPulumi.resourceMod.ID, t1: /* props */ js.UndefOr[js.Any]) => read(t0, t1).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3((t0: /* id */ typingsJapgolly.pulumiPulumi.resourceMod.ID, t1: /* olds */ js.Any, t2: /* news */ js.Any) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ResourceProvider]
  }
}

