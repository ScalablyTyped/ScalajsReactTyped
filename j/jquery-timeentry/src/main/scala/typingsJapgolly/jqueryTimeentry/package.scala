package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqueryTimeentry {
  type ITimeEntry = js.Function3[
    /* configOrFnName */ js.UndefOr[typingsJapgolly.jqueryTimeentry.ITimeEntryOptions | java.lang.String], 
    /* nameOrOption */ js.UndefOr[js.Any], 
    /* value */ js.UndefOr[js.Any], 
    js.Any
  ]
  type ITimeEntryLocales = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.jqueryTimeentry.ITimeEntryRegionalOptions]
}
