package typingsJapgolly.intlMessageformatParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parserMod {
  type ParseFunction = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[typingsJapgolly.intlMessageformatParser.parserMod.IParseOptions], 
    js.Array[typingsJapgolly.intlMessageformatParser.typesMod.MessageFormatElement]
  ]
}
