package typingsJapgolly.docxTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Query = java.lang.String
  type QueryResolver = js.Function2[
    /* query */ js.UndefOr[typingsJapgolly.docxTemplates.mod.Query], 
    /* queryVars */ js.UndefOr[js.Any], 
    typingsJapgolly.docxTemplates.mod.ReportData | js.Promise[typingsJapgolly.docxTemplates.mod.ReportData]
  ]
  type ReportData = js.Any
}
