package typingsJapgolly.grommet.paragraphMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.grommetStrings.color
import typingsJapgolly.grommet.utilsMod.Omit
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.HTMLParagraphElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Paragraph", "Paragraph")
@js.native
object Paragraph extends TopLevel[
      FC[
        ParagraphProps with (Omit[
          DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
          color
        ])
      ]
    ]

