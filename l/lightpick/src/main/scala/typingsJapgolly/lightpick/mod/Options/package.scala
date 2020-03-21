package typingsJapgolly.lightpick.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Options {
  type Dropdowns = typingsJapgolly.lightpick.mod.Options.Dropdowns_
  type Locale = typingsJapgolly.lightpick.mod.Options.Locale_
  /**
    * Callback function for when the picker is hidden.
    */
  type OnCloseFn = js.ThisFunction0[/* this */ typingsJapgolly.lightpick.mod.Lightpick, scala.Unit]
  type OnErrorFn = js.ThisFunction1[
    /* this */ typingsJapgolly.lightpick.mod.Lightpick, 
    /* message */ java.lang.String, 
    scala.Unit
  ]
  /**
    * Callback function for when the months select is changed.
    */
  type OnMonthsChangeFn = js.ThisFunction1[
    /* this */ typingsJapgolly.lightpick.mod.Lightpick, 
    /* month */ scala.Double, 
    scala.Unit
  ]
  /**
    * Callback function for when the picker becomes visible.
    */
  type OnOpenFn = js.ThisFunction0[/* this */ typingsJapgolly.lightpick.mod.Lightpick, scala.Unit]
  /**
    * Callback function for when a date is selected.
    */
  type OnSelectFn = js.ThisFunction2[
    /* this */ typingsJapgolly.lightpick.mod.Lightpick, 
    /* startDate */ typingsJapgolly.lightpick.mod.OutputDate, 
    /* endDate */ typingsJapgolly.lightpick.mod.OutputDate, 
    scala.Unit
  ]
  /**
    * Callback function for when either a start or an end date is selected.
    */
  type OnSelectStartEndFn = js.ThisFunction1[
    /* this */ typingsJapgolly.lightpick.mod.Lightpick, 
    /* date */ typingsJapgolly.lightpick.mod.OutputDate, 
    scala.Unit
  ]
  /**
    * Callback function for when the years select is changed.
    */
  type OnYearsChangeFn = js.ThisFunction1[
    /* this */ typingsJapgolly.lightpick.mod.Lightpick, 
    /* year */ scala.Double, 
    scala.Unit
  ]
}
