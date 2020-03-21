package typingsJapgolly.dojo.dojox.grid

import typingsJapgolly.dojo.dijit.tree.ForestStoreModel
import typingsJapgolly.dojo.dojo.data.api.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/LazyTreeGridStoreModel.html
  *
  *
  * @param args
  */
@JSGlobal("dojox.grid.LazyTreeGridStoreModel")
@js.native
class LazyTreeGridStoreModel protected () extends ForestStoreModel {
  def this(args: js.Object) = this()
  /**
    *
    */
  var serverStore: Boolean = js.native
  /**
    *
    * @param parentItem
    * @param onComplete
    * @param onError
    * @param queryObj
    */
  def getChildren(
    parentItem: Item,
    onComplete: js.Function2[/* items */ js.Array[js.Object], /* size */ js.UndefOr[Double], _],
    onError: js.Function
  ): Unit = js.native
  def getChildren(
    parentItem: Item,
    onComplete: js.Function2[/* items */ js.Array[js.Object], /* size */ js.UndefOr[Double], _],
    onError: js.Function,
    queryObj: js.Object
  ): Unit = js.native
  /**
    *
    * @param item
    */
  def onDeleteItem(item: js.Any): Unit = js.native
  /**
    *
    * @param item
    * @param parentInfo
    */
  def onNewItem(item: js.Any, parentInfo: js.Any): Unit = js.native
}

