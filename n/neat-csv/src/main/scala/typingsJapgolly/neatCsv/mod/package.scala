package typingsJapgolly.neatCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** The CSV data to parse. */
  type Input = java.lang.String | typingsJapgolly.node.Buffer | typingsJapgolly.node.streamMod.Readable
  /** A representation of one row of the input CSV. */
  type Row = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
