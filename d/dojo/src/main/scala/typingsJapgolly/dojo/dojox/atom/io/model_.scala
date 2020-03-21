package typingsJapgolly.dojo.dojox.atom.io

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model.html
  *
  *
  */
trait model_ extends js.Object {
  /**
    *
    */
  var util: js.Object
  /**
    *
    */
  def AtomItem(): Unit
  /**
    *
    */
  def Category(): Unit
  /**
    *
    */
  def Collection(): Unit
  /**
    *
    */
  def Content(): Unit
  /**
    *
    */
  def Entry(): Unit
  /**
    *
    */
  def Feed(): Unit
  /**
    *
    */
  def Generator(): Unit
  /**
    *
    */
  def Link(): Unit
  /**
    *
    */
  def Node(): Unit
  /**
    *
    */
  def Person(): Unit
  /**
    *
    */
  def Service(): Unit
  /**
    *
    */
  def Workspace(): Unit
}

object model_ {
  @scala.inline
  def apply(
    AtomItem: Callback,
    Category: Callback,
    Collection: Callback,
    Content: Callback,
    Entry: Callback,
    Feed: Callback,
    Generator: Callback,
    Link: Callback,
    Node: Callback,
    Person: Callback,
    Service: Callback,
    Workspace: Callback,
    util: js.Object
  ): model_ = {
    val __obj = js.Dynamic.literal(util = util.asInstanceOf[js.Any])
    __obj.updateDynamic("AtomItem")(AtomItem.toJsFn)
    __obj.updateDynamic("Category")(Category.toJsFn)
    __obj.updateDynamic("Collection")(Collection.toJsFn)
    __obj.updateDynamic("Content")(Content.toJsFn)
    __obj.updateDynamic("Entry")(Entry.toJsFn)
    __obj.updateDynamic("Feed")(Feed.toJsFn)
    __obj.updateDynamic("Generator")(Generator.toJsFn)
    __obj.updateDynamic("Link")(Link.toJsFn)
    __obj.updateDynamic("Node")(Node.toJsFn)
    __obj.updateDynamic("Person")(Person.toJsFn)
    __obj.updateDynamic("Service")(Service.toJsFn)
    __obj.updateDynamic("Workspace")(Workspace.toJsFn)
    __obj.asInstanceOf[model_]
  }
}

