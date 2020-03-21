package typingsJapgolly.azureKustoData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Client {
  type KustoResultRow[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P]}
    */ typingsJapgolly.azureKustoData.azureKustoDataStrings.KustoResultRow with T
}
