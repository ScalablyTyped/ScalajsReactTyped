package typingsJapgolly.grommet.textMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.grommetStrings.color
import typingsJapgolly.grommet.utilsMod.Omit
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Text", "Text")
@js.native
object Text extends TopLevel[
      FC[
        TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
      ]
    ]

