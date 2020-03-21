package typingsJapgolly.grommet.headingMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.grommetStrings.color
import typingsJapgolly.grommet.utilsMod.Omit
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.HTMLHeadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Heading", "Heading")
@js.native
object Heading extends TopLevel[
      FC[
        HeadingProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color])
      ]
    ]

