package typingsJapgolly.dojo.dojox.dtl.filter

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/lists.html
  *
  *
  */
trait lists extends js.Object {
  /**
    * Takes a list of dicts, returns that list sorted by the property given in the argument.
    *
    * @param value
    * @param arg
    */
  def dictsort(value: js.Any, arg: js.Any): js.Any
  /**
    * Takes a list of dicts, returns that list sorted in reverse order by the property given in the argument.
    *
    * @param value
    * @param arg
    */
  def dictsortreversed(value: js.Any, arg: js.Any): js.Any
  /**
    * Returns the first item in a list
    *
    * @param value
    */
  def first(value: js.Any): String
  /**
    * Joins a list with a string, like Python's str.join(list)
    * Django throws a compile error, but JS can't do arg checks
    * so we're left with run time errors, which aren't wise for something
    * as trivial here as an empty arg.
    *
    * @param value
    * @param arg
    */
  def join(value: js.Any, arg: js.Any): js.Any
  /**
    * Returns the length of the value - useful for lists
    *
    * @param value
    */
  def length(value: js.Any): js.Any
  /**
    * Returns a boolean of whether the value's length is the argument
    *
    * @param value
    * @param arg
    */
  def length_is(value: js.Any, arg: js.Any): Boolean
  /**
    * Returns a random item from the list
    *
    * @param value
    */
  def random(value: js.Any): js.Any
  /**
    * Returns a slice of the list.
    * Uses the same syntax as Python's list slicing; see
    * http://www.diveintopython.net/native_data_types/lists.html#odbchelper.list.slice
    * for an introduction.
    * Also uses the optional third value to denote every X item.
    *
    * @param value
    * @param arg
    */
  def slice(value: js.Any, arg: js.Any): js.Any
  /**
    * Recursively takes a self-nested list and returns an HTML unordered list --
    * WITHOUT opening and closing <ul> tags.
    * The list is assumed to be in the proper format. For example, if var contains
    * ['States', [['Kansas', [['Lawrence', []], ['Topeka', []]]], ['Illinois', []]]],
    * then {{ var|unordered_list }} would return::
    *
    * <li>States
    * <ul>
    *     <li>Kansas
    *     <ul>
    *         <li>Lawrence</li>
    *         <li>Topeka</li>
    *     </ul>
    *     </li>
    *     <li>Illinois</li>
    * </ul>
    * </li>
    *
    * @param value
    */
  def unordered_list(value: js.Any): js.Any
}

object lists {
  @scala.inline
  def apply(
    dictsort: (js.Any, js.Any) => CallbackTo[js.Any],
    dictsortreversed: (js.Any, js.Any) => CallbackTo[js.Any],
    first: js.Any => CallbackTo[String],
    join: (js.Any, js.Any) => CallbackTo[js.Any],
    length: js.Any => CallbackTo[js.Any],
    length_is: (js.Any, js.Any) => CallbackTo[Boolean],
    random: js.Any => CallbackTo[js.Any],
    slice: (js.Any, js.Any) => CallbackTo[js.Any],
    unordered_list: js.Any => CallbackTo[js.Any]
  ): lists = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dictsort")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => dictsort(t0, t1).runNow()))
    __obj.updateDynamic("dictsortreversed")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => dictsortreversed(t0, t1).runNow()))
    __obj.updateDynamic("first")(js.Any.fromFunction1((t0: js.Any) => first(t0).runNow()))
    __obj.updateDynamic("join")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => join(t0, t1).runNow()))
    __obj.updateDynamic("length")(js.Any.fromFunction1((t0: js.Any) => length(t0).runNow()))
    __obj.updateDynamic("length_is")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => length_is(t0, t1).runNow()))
    __obj.updateDynamic("random")(js.Any.fromFunction1((t0: js.Any) => random(t0).runNow()))
    __obj.updateDynamic("slice")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => slice(t0, t1).runNow()))
    __obj.updateDynamic("unordered_list")(js.Any.fromFunction1((t0: js.Any) => unordered_list(t0).runNow()))
    __obj.asInstanceOf[lists]
  }
}

