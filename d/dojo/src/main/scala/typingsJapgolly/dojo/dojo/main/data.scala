package typingsJapgolly.dojo.dojo.main

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.data.html
  *
  *
  */
trait data extends js.Object {
  /**
    *
    */
  var api: js.Object
  /**
    *
    */
  var util: js.Object
  /**
    *
    */
  def ItemFileReadStore(): Unit
  /**
    *
    */
  def ItemFileWriteStore(): Unit
  /**
    *
    */
  def ObjectStore(): Unit
}

object data {
  @scala.inline
  def apply(
    ItemFileReadStore: Callback,
    ItemFileWriteStore: Callback,
    ObjectStore: Callback,
    api: js.Object,
    util: js.Object
  ): data = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
    __obj.updateDynamic("ItemFileReadStore")(ItemFileReadStore.toJsFn)
    __obj.updateDynamic("ItemFileWriteStore")(ItemFileWriteStore.toJsFn)
    __obj.updateDynamic("ObjectStore")(ObjectStore.toJsFn)
    __obj.asInstanceOf[data]
  }
}

