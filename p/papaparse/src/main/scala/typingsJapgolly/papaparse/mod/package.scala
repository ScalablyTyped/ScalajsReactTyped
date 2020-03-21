package typingsJapgolly.papaparse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // The possible values for the ParseConfig property delimitersToGuess
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.papaparse.papaparseStrings.Comma
    - typingsJapgolly.papaparse.papaparseStrings.Charactertabulation
    - typingsJapgolly.papaparse.papaparseStrings.Verticalline
    - typingsJapgolly.papaparse.papaparseStrings.Semicolon
    - typingsJapgolly.papaparse.mod.RECORD_SEP_TYPE
    - typingsJapgolly.papaparse.mod.UNIT_SEP_TYPE
  */
  type GuessableDelimiters = typingsJapgolly.papaparse.mod._GuessableDelimiters | typingsJapgolly.papaparse.mod.RECORD_SEP_TYPE | typingsJapgolly.papaparse.mod.UNIT_SEP_TYPE
  // When passed to Papa Parse a Readable stream is returned.
  type NODE_STREAM_INPUT_TYPE = typingsJapgolly.papaparse.papaparseNumbers.`1`
  // The true delimiter. Invisible. ASCII code 30. Should be doing the job we strangely rely upon commas and tabs for.
  type RECORD_SEP_TYPE = typingsJapgolly.papaparse.papaparseStrings.Informationseparatortwo
  // Also sometimes used as a delimiting character. ASCII code 31.
  type UNIT_SEP_TYPE = typingsJapgolly.papaparse.papaparseStrings.Informationseparatorone
}
