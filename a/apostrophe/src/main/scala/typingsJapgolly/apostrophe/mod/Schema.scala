package typingsJapgolly.apostrophe.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  def addFieldType(`type`: AposType): Unit
  def addFilters(schema: Schema, options: js.Any, cursor: js.Any): Unit
  def addJoinSlugFilter(field: js.Any, cursor: js.Any, suffix: js.Any): Unit
  def afterInit(): Unit
  def compose(options: AposObject): Unit
  def convert(
    req: js.Any,
    schema: Schema,
    to: js.Any,
    `object`: AposObject,
    output: js.Any,
    callback: js.Function0[_]
  ): Unit
  def createRoutes(): js.Array[_]
  def cursorFilterInterested(cursor: js.Any, name: String): Unit
  def empty(schema: Schema, `object`: AposObject): Unit
  def export(
    req: js.Any,
    schema: Schema,
    to: js.Any,
    `object`: AposObject,
    output: js.Any,
    callback: js.Function0[_]
  ): Unit
  def getFieldType(typeName: String): Unit
  def indexFields(schema: Schema, `object`: AposObject, texts: js.Any): Unit
  def isVisible(schema: Schema, `object`: AposObject, name: String): Unit
  def join(req: js.Any, schema: Schema, objectOrArray: js.Any, withJoins: js.Any, callback: js.Function0[_]): Unit
  def joinDriver(
    req: js.Any,
    method: js.Any,
    reverse: js.Any,
    items: js.Any,
    idField: js.Any,
    relationshipsField: js.Any,
    objectField: js.Any,
    options: js.Any,
    callback: js.Function0[_]
  ): Unit
  def joinFilterChoices(field: js.Any, cursor: js.Any, valueField: js.Any): Unit
  def newInstance(schema: Schema): js.Any
  def pageServe(req: js.Any): Unit
  def pushAssets(): Unit
  def pushCreateSingleton(): Unit
  def refine(schema: Schema, options: AposObject): Unit
  def sortedDistinct(property: js.Any, cursor: js.Any, callback: js.Function0[_]): Unit
  def subset(schema: Schema, fields: Fields): Schema
  def subsetInstance(schema: Schema, instance: AposObject): js.Any
  def toGroups(fields: Fields): Unit
  def validate(schema: Schema, options: js.Any): Unit
}

object Schema {
  @scala.inline
  def apply(
    addFieldType: AposType => Callback,
    addFilters: (Schema, js.Any, js.Any) => Callback,
    addJoinSlugFilter: (js.Any, js.Any, js.Any) => Callback,
    afterInit: Callback,
    compose: AposObject => Callback,
    convert: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[js.Any]) => Callback,
    createRoutes: CallbackTo[js.Array[js.Any]],
    cursorFilterInterested: (js.Any, String) => Callback,
    empty: (Schema, AposObject) => Callback,
    export: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[js.Any]) => Callback,
    getFieldType: String => Callback,
    indexFields: (Schema, AposObject, js.Any) => Callback,
    isVisible: (Schema, AposObject, String) => Callback,
    join: (js.Any, Schema, js.Any, js.Any, js.Function0[js.Any]) => Callback,
    joinDriver: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Function0[js.Any]) => Callback,
    joinFilterChoices: (js.Any, js.Any, js.Any) => Callback,
    newInstance: Schema => CallbackTo[js.Any],
    pageServe: js.Any => Callback,
    pushAssets: Callback,
    pushCreateSingleton: Callback,
    refine: (Schema, AposObject) => Callback,
    sortedDistinct: (js.Any, js.Any, js.Function0[js.Any]) => Callback,
    subset: (Schema, Fields) => CallbackTo[Schema],
    subsetInstance: (Schema, AposObject) => CallbackTo[js.Any],
    toGroups: Fields => Callback,
    validate: (Schema, js.Any) => Callback
  ): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addFieldType")(js.Any.fromFunction1((t0: typingsJapgolly.apostrophe.mod.AposType) => addFieldType(t0).runNow()))
    __obj.updateDynamic("addFilters")(js.Any.fromFunction3((t0: typingsJapgolly.apostrophe.mod.Schema, t1: js.Any, t2: js.Any) => addFilters(t0, t1, t2).runNow()))
    __obj.updateDynamic("addJoinSlugFilter")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => addJoinSlugFilter(t0, t1, t2).runNow()))
    __obj.updateDynamic("afterInit")(afterInit.toJsFn)
    __obj.updateDynamic("compose")(js.Any.fromFunction1((t0: typingsJapgolly.apostrophe.mod.AposObject) => compose(t0).runNow()))
    __obj.updateDynamic("convert")(js.Any.fromFunction6((t0: js.Any, t1: typingsJapgolly.apostrophe.mod.Schema, t2: js.Any, t3: typingsJapgolly.apostrophe.mod.AposObject, t4: js.Any, t5: js.Function0[js.Any]) => convert(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("createRoutes")(createRoutes.toJsFn)
    __obj.updateDynamic("cursorFilterInterested")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => cursorFilterInterested(t0, t1).runNow()))
    __obj.updateDynamic("empty")(js.Any.fromFunction2((t0: typingsJapgolly.apostrophe.mod.Schema, t1: typingsJapgolly.apostrophe.mod.AposObject) => empty(t0, t1).runNow()))
    __obj.updateDynamic("export")(js.Any.fromFunction6((t0: js.Any, t1: typingsJapgolly.apostrophe.mod.Schema, t2: js.Any, t3: typingsJapgolly.apostrophe.mod.AposObject, t4: js.Any, t5: js.Function0[js.Any]) => export(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("getFieldType")(js.Any.fromFunction1((t0: java.lang.String) => getFieldType(t0).runNow()))
    __obj.updateDynamic("indexFields")(js.Any.fromFunction3((t0: typingsJapgolly.apostrophe.mod.Schema, t1: typingsJapgolly.apostrophe.mod.AposObject, t2: js.Any) => indexFields(t0, t1, t2).runNow()))
    __obj.updateDynamic("isVisible")(js.Any.fromFunction3((t0: typingsJapgolly.apostrophe.mod.Schema, t1: typingsJapgolly.apostrophe.mod.AposObject, t2: java.lang.String) => isVisible(t0, t1, t2).runNow()))
    __obj.updateDynamic("join")(js.Any.fromFunction5((t0: js.Any, t1: typingsJapgolly.apostrophe.mod.Schema, t2: js.Any, t3: js.Any, t4: js.Function0[js.Any]) => join(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("joinDriver")(js.Any.fromFunction9((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any, t4: js.Any, t5: js.Any, t6: js.Any, t7: js.Any, t8: js.Function0[js.Any]) => joinDriver(t0, t1, t2, t3, t4, t5, t6, t7, t8).runNow()))
    __obj.updateDynamic("joinFilterChoices")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => joinFilterChoices(t0, t1, t2).runNow()))
    __obj.updateDynamic("newInstance")(js.Any.fromFunction1((t0: typingsJapgolly.apostrophe.mod.Schema) => newInstance(t0).runNow()))
    __obj.updateDynamic("pageServe")(js.Any.fromFunction1((t0: js.Any) => pageServe(t0).runNow()))
    __obj.updateDynamic("pushAssets")(pushAssets.toJsFn)
    __obj.updateDynamic("pushCreateSingleton")(pushCreateSingleton.toJsFn)
    __obj.updateDynamic("refine")(js.Any.fromFunction2((t0: typingsJapgolly.apostrophe.mod.Schema, t1: typingsJapgolly.apostrophe.mod.AposObject) => refine(t0, t1).runNow()))
    __obj.updateDynamic("sortedDistinct")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Function0[js.Any]) => sortedDistinct(t0, t1, t2).runNow()))
    __obj.updateDynamic("subset")(js.Any.fromFunction2((t0: typingsJapgolly.apostrophe.mod.Schema, t1: typingsJapgolly.apostrophe.mod.Fields) => subset(t0, t1).runNow()))
    __obj.updateDynamic("subsetInstance")(js.Any.fromFunction2((t0: typingsJapgolly.apostrophe.mod.Schema, t1: typingsJapgolly.apostrophe.mod.AposObject) => subsetInstance(t0, t1).runNow()))
    __obj.updateDynamic("toGroups")(js.Any.fromFunction1((t0: typingsJapgolly.apostrophe.mod.Fields) => toGroups(t0).runNow()))
    __obj.updateDynamic("validate")(js.Any.fromFunction2((t0: typingsJapgolly.apostrophe.mod.Schema, t1: js.Any) => validate(t0, t1).runNow()))
    __obj.asInstanceOf[Schema]
  }
}

