package typingsJapgolly.sequelize.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Hooks
// ~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/hooks.js
//
/**
  * Options for Sequelize.define. We mostly duplicate the Hooks here, since there is no way to combine the two
  * interfaces.
  *
  * beforeValidate, afterValidate, beforeBulkCreate, beforeBulkDestroy, beforeBulkUpdate, beforeCreate,
  * beforeDestroy, beforeSave, beforeUpdate, afterCreate, afterDestroy, afterSave, afterUpdate, afterBulkCreate,
  * afterBulkDestroy and afterBulkUpdate.
  */
trait HooksDefineOptions[TInstance] extends js.Object {
  var afterBulkCreate: js.UndefOr[
    js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.undefined
  var afterBulkDelete: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var afterBulkDestroy: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var afterBulkUpdate: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var afterCreate: js.UndefOr[
    js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.undefined
  var afterDelete: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var afterDestroy: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var afterFind: js.UndefOr[
    js.Function3[
      /* instancesOrInstance */ js.Array[TInstance] | TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.undefined
  var afterSave: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var afterUpdate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var afterValidate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var beforeBulkCreate: js.UndefOr[
    js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.undefined
  var beforeBulkDelete: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var beforeBulkDestroy: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var beforeBulkUpdate: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var beforeCreate: js.UndefOr[
    js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      _
    ]
  ] = js.undefined
  var beforeDelete: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var beforeDestroy: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var beforeFind: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var beforeFindAfterExpandIncludeAll: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var beforeFindAfterOptions: js.UndefOr[js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]] = js.undefined
  var beforeSave: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var beforeUpdate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
  var beforeValidate: js.UndefOr[
    js.Function3[/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function], _]
  ] = js.undefined
}

object HooksDefineOptions {
  @scala.inline
  def apply[TInstance](
    afterBulkCreate: (/* instances */ js.Array[TInstance], /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    afterBulkDelete: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    afterBulkDestroy: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    afterBulkUpdate: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    afterCreate: (/* attributes */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    afterDelete: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    afterDestroy: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    afterFind: (/* instancesOrInstance */ js.Array[TInstance] | TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    afterSave: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    afterUpdate: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    afterValidate: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeBulkCreate: (/* instances */ js.Array[TInstance], /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeBulkDelete: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeBulkDestroy: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeBulkUpdate: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeCreate: (/* attributes */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeDelete: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeDestroy: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeFind: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeFindAfterExpandIncludeAll: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeFindAfterOptions: (/* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeSave: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeUpdate: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null,
    beforeValidate: (/* instance */ TInstance, /* options */ js.Object, /* fn */ js.UndefOr[js.Function]) => CallbackTo[js.Any] = null
  ): HooksDefineOptions[TInstance] = {
    val __obj = js.Dynamic.literal()
    if (afterBulkCreate != null) __obj.updateDynamic("afterBulkCreate")(js.Any.fromFunction3((t0: /* instances */ js.Array[TInstance], t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => afterBulkCreate(t0, t1, t2).runNow()))
    if (afterBulkDelete != null) __obj.updateDynamic("afterBulkDelete")(js.Any.fromFunction2((t0: /* options */ js.Object, t1: /* fn */ js.UndefOr[js.Function]) => afterBulkDelete(t0, t1).runNow()))
    if (afterBulkDestroy != null) __obj.updateDynamic("afterBulkDestroy")(js.Any.fromFunction2((t0: /* options */ js.Object, t1: /* fn */ js.UndefOr[js.Function]) => afterBulkDestroy(t0, t1).runNow()))
    if (afterBulkUpdate != null) __obj.updateDynamic("afterBulkUpdate")(js.Any.fromFunction2((t0: /* options */ js.Object, t1: /* fn */ js.UndefOr[js.Function]) => afterBulkUpdate(t0, t1).runNow()))
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(js.Any.fromFunction3((t0: /* attributes */ TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => afterCreate(t0, t1, t2).runNow()))
    if (afterDelete != null) __obj.updateDynamic("afterDelete")(js.Any.fromFunction3((t0: /* instance */ TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => afterDelete(t0, t1, t2).runNow()))
    if (afterDestroy != null) __obj.updateDynamic("afterDestroy")(js.Any.fromFunction3((t0: /* instance */ TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => afterDestroy(t0, t1, t2).runNow()))
    if (afterFind != null) __obj.updateDynamic("afterFind")(js.Any.fromFunction3((t0: /* instancesOrInstance */ js.Array[TInstance] | TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => afterFind(t0, t1, t2).runNow()))
    if (afterSave != null) __obj.updateDynamic("afterSave")(js.Any.fromFunction3((t0: /* instance */ TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => afterSave(t0, t1, t2).runNow()))
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(js.Any.fromFunction3((t0: /* instance */ TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => afterUpdate(t0, t1, t2).runNow()))
    if (afterValidate != null) __obj.updateDynamic("afterValidate")(js.Any.fromFunction3((t0: /* instance */ TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => afterValidate(t0, t1, t2).runNow()))
    if (beforeBulkCreate != null) __obj.updateDynamic("beforeBulkCreate")(js.Any.fromFunction3((t0: /* instances */ js.Array[TInstance], t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => beforeBulkCreate(t0, t1, t2).runNow()))
    if (beforeBulkDelete != null) __obj.updateDynamic("beforeBulkDelete")(js.Any.fromFunction2((t0: /* options */ js.Object, t1: /* fn */ js.UndefOr[js.Function]) => beforeBulkDelete(t0, t1).runNow()))
    if (beforeBulkDestroy != null) __obj.updateDynamic("beforeBulkDestroy")(js.Any.fromFunction2((t0: /* options */ js.Object, t1: /* fn */ js.UndefOr[js.Function]) => beforeBulkDestroy(t0, t1).runNow()))
    if (beforeBulkUpdate != null) __obj.updateDynamic("beforeBulkUpdate")(js.Any.fromFunction2((t0: /* options */ js.Object, t1: /* fn */ js.UndefOr[js.Function]) => beforeBulkUpdate(t0, t1).runNow()))
    if (beforeCreate != null) __obj.updateDynamic("beforeCreate")(js.Any.fromFunction3((t0: /* attributes */ TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => beforeCreate(t0, t1, t2).runNow()))
    if (beforeDelete != null) __obj.updateDynamic("beforeDelete")(js.Any.fromFunction3((t0: /* instance */ TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => beforeDelete(t0, t1, t2).runNow()))
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(js.Any.fromFunction3((t0: /* instance */ TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => beforeDestroy(t0, t1, t2).runNow()))
    if (beforeFind != null) __obj.updateDynamic("beforeFind")(js.Any.fromFunction2((t0: /* options */ js.Object, t1: /* fn */ js.UndefOr[js.Function]) => beforeFind(t0, t1).runNow()))
    if (beforeFindAfterExpandIncludeAll != null) __obj.updateDynamic("beforeFindAfterExpandIncludeAll")(js.Any.fromFunction2((t0: /* options */ js.Object, t1: /* fn */ js.UndefOr[js.Function]) => beforeFindAfterExpandIncludeAll(t0, t1).runNow()))
    if (beforeFindAfterOptions != null) __obj.updateDynamic("beforeFindAfterOptions")(js.Any.fromFunction2((t0: /* options */ js.Object, t1: /* fn */ js.UndefOr[js.Function]) => beforeFindAfterOptions(t0, t1).runNow()))
    if (beforeSave != null) __obj.updateDynamic("beforeSave")(js.Any.fromFunction3((t0: /* instance */ TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => beforeSave(t0, t1, t2).runNow()))
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(js.Any.fromFunction3((t0: /* instance */ TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => beforeUpdate(t0, t1, t2).runNow()))
    if (beforeValidate != null) __obj.updateDynamic("beforeValidate")(js.Any.fromFunction3((t0: /* instance */ TInstance, t1: /* options */ js.Object, t2: /* fn */ js.UndefOr[js.Function]) => beforeValidate(t0, t1, t2).runNow()))
    __obj.asInstanceOf[HooksDefineOptions[TInstance]]
  }
}

