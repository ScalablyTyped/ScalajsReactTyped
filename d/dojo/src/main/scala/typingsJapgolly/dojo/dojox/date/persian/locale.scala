package typingsJapgolly.dojo.dojox.date.persian

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/persian/locale.html
  *
  *
  */
trait locale extends js.Object {
  /**
    *
    */
  var months: js.Object
  /**
    *
    */
  var weekDays: js.Object
  /**
    * Add a reference to a bundle containing localized custom formats to be
    * used by date/time formatting and parsing routines.
    *
    * @param packageName
    * @param bundleName
    */
  def addCustomFormats(packageName: String, bundleName: String): Unit
  /**
    * Format a Date object as a String, using  settings.
    *
    * @param dateObject
    * @param options               Optional
    */
  def format(dateObject: Date, options: js.Object): Unit
  /**
    * Used to get localized strings from dojo.cldr for day or month names.
    *
    * @param item
    * @param type
    * @param context               Optional
    * @param locale               Optional
    * @param date               Optional
    */
  def getNames(item: String, `type`: String, context: String, locale: String, date: Date): js.Any
  /**
    * This function parse string date value according to options
    *
    * @param value
    * @param options               Optional
    */
  def parse(value: String, options: js.Object): Unit
  /**
    * Builds the regular needed to parse a persian.Date
    *
    * @param options               Optional
    */
  def regexp(options: js.Object): Unit
}

object locale {
  @scala.inline
  def apply(
    addCustomFormats: (String, String) => Callback,
    format: (Date, js.Object) => Callback,
    getNames: (String, String, String, String, Date) => CallbackTo[js.Any],
    months: js.Object,
    parse: (String, js.Object) => Callback,
    regexp: js.Object => Callback,
    weekDays: js.Object
  ): locale = {
    val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekDays = weekDays.asInstanceOf[js.Any])
    __obj.updateDynamic("addCustomFormats")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addCustomFormats(t0, t1).runNow()))
    __obj.updateDynamic("format")(js.Any.fromFunction2((t0: typingsJapgolly.dojo.dojox.date.persian.Date, t1: js.Object) => format(t0, t1).runNow()))
    __obj.updateDynamic("getNames")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: typingsJapgolly.dojo.dojox.date.persian.Date) => getNames(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => parse(t0, t1).runNow()))
    __obj.updateDynamic("regexp")(js.Any.fromFunction1((t0: js.Object) => regexp(t0).runNow()))
    __obj.asInstanceOf[locale]
  }
}

