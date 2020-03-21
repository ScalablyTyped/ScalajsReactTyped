package typingsJapgolly.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataMod {
  type Datum = js.Any
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.dataMod.FormatJSON
    - typingsJapgolly.vegaTypings.dataMod.FormatSV
    - typingsJapgolly.vegaTypings.dataMod.FormatDSV
    - typingsJapgolly.vegaTypings.dataMod.FormatTopoJSON
    - typingsJapgolly.vegaTypings.AnonParse
  */
  type Format = typingsJapgolly.vegaTypings.dataMod._Format | typingsJapgolly.vegaTypings.dataMod.FormatTopoJSON
  type FormatTopoJSON = typingsJapgolly.vegaTypings.AnonProperty with (typingsJapgolly.vegaTypings.AnonFeature | typingsJapgolly.vegaTypings.AnonFilter)
  type Parse = typingsJapgolly.vegaTypings.vegaTypingsStrings.auto | (org.scalablytyped.runtime.StringDictionary[typingsJapgolly.vegaTypings.dataMod.DataType | java.lang.String])
}
