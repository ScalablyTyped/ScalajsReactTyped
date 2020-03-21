package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lokijs {
  type LokiQuery[E] = typingsJapgolly.lokijs.PartialModel[E with typingsJapgolly.lokijs.AnonAnd, typingsJapgolly.lokijs.YinkeyofLokiOpsany]
  type PartialModel[E, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]:? T | E[P]}
    */ typingsJapgolly.lokijs.lokijsStrings.PartialModel with E
}
