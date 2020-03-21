package typingsJapgolly.reactDates.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.moment.mod.MomentFormatSpecification
import typingsJapgolly.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// utils/toISODateString.js
@JSImport("react-dates", "toISODateString")
@js.native
object toISODateString
  extends TopLevel[
      js.Function2[/* date */ MomentInput, /* currentFormat */ MomentFormatSpecification, String | Null]
    ]

