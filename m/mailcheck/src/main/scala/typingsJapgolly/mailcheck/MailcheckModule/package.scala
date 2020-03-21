package typingsJapgolly.mailcheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MailcheckModule {
  type IDistanceFunction = js.Function2[/* s1 */ java.lang.String, /* s2 */ java.lang.String, scala.Double]
  type IEmpty = js.Function0[scala.Unit]
  type IJQueryEmpty = js.Function1[/* element */ typingsJapgolly.mailcheck.JQuery, scala.Unit]
  type IJQuerySuggested = js.Function2[
    /* element */ typingsJapgolly.mailcheck.JQuery, 
    /* suggested */ typingsJapgolly.mailcheck.MailcheckModule.ISuggestion, 
    scala.Unit
  ]
  type ISuggestFunction = js.Function4[
    /* email */ java.lang.String, 
    /* domains */ js.UndefOr[js.Array[java.lang.String]], 
    /* topLevelDomains */ js.UndefOr[js.Array[java.lang.String]], 
    /* distanceFunction */ js.UndefOr[typingsJapgolly.mailcheck.MailcheckModule.IDistanceFunction], 
    scala.Unit
  ]
  type ISuggested = js.Function1[/* suggested */ typingsJapgolly.mailcheck.MailcheckModule.ISuggestion, scala.Unit]
}
