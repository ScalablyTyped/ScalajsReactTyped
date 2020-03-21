package typingsJapgolly.dojo.dojox.atom.io.model

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model._actions.html
  *
  * Container for tag handling functions.
  * Container for tag handling functions.  Each child of this container is
  * a handler function for the given type of node. Each accepts two parameters:
  *
  */
trait actions extends js.Object {
  /**
    * The dom node containing the data
    *
    */
  var node: js.Object
  /**
    * The object to insert data into.
    *
    */
  var obj: js.Object
  /**
    *
    * @param obj
    * @param node
    */
  def author(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def category(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def content(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def contributor(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def email(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def entry(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def generator(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def icon(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def id(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def issued(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def link(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def modified(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def name(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def published(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def rights(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def subtitle(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def summary(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def title(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def updated(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def uri(obj: js.Any, node: js.Any): Unit
}

object actions {
  @scala.inline
  def apply(
    author: (js.Any, js.Any) => Callback,
    category: (js.Any, js.Any) => Callback,
    content: (js.Any, js.Any) => Callback,
    contributor: (js.Any, js.Any) => Callback,
    email: (js.Any, js.Any) => Callback,
    entry: (js.Any, js.Any) => Callback,
    generator: (js.Any, js.Any) => Callback,
    icon: (js.Any, js.Any) => Callback,
    id: (js.Any, js.Any) => Callback,
    issued: (js.Any, js.Any) => Callback,
    link: (js.Any, js.Any) => Callback,
    modified: (js.Any, js.Any) => Callback,
    name: (js.Any, js.Any) => Callback,
    node: js.Object,
    obj: js.Object,
    published: (js.Any, js.Any) => Callback,
    rights: (js.Any, js.Any) => Callback,
    subtitle: (js.Any, js.Any) => Callback,
    summary: (js.Any, js.Any) => Callback,
    title: (js.Any, js.Any) => Callback,
    updated: (js.Any, js.Any) => Callback,
    uri: (js.Any, js.Any) => Callback
  ): actions = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
    __obj.updateDynamic("author")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => author(t0, t1).runNow()))
    __obj.updateDynamic("category")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => category(t0, t1).runNow()))
    __obj.updateDynamic("content")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => content(t0, t1).runNow()))
    __obj.updateDynamic("contributor")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => contributor(t0, t1).runNow()))
    __obj.updateDynamic("email")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => email(t0, t1).runNow()))
    __obj.updateDynamic("entry")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => entry(t0, t1).runNow()))
    __obj.updateDynamic("generator")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => generator(t0, t1).runNow()))
    __obj.updateDynamic("icon")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => icon(t0, t1).runNow()))
    __obj.updateDynamic("id")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => id(t0, t1).runNow()))
    __obj.updateDynamic("issued")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => issued(t0, t1).runNow()))
    __obj.updateDynamic("link")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => link(t0, t1).runNow()))
    __obj.updateDynamic("modified")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => modified(t0, t1).runNow()))
    __obj.updateDynamic("name")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => name(t0, t1).runNow()))
    __obj.updateDynamic("published")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => published(t0, t1).runNow()))
    __obj.updateDynamic("rights")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => rights(t0, t1).runNow()))
    __obj.updateDynamic("subtitle")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => subtitle(t0, t1).runNow()))
    __obj.updateDynamic("summary")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => summary(t0, t1).runNow()))
    __obj.updateDynamic("title")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => title(t0, t1).runNow()))
    __obj.updateDynamic("updated")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => updated(t0, t1).runNow()))
    __obj.updateDynamic("uri")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => uri(t0, t1).runNow()))
    __obj.asInstanceOf[actions]
  }
}

