package typingsJapgolly.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.buttonMod.ButtonProps
import typingsJapgolly.grommet.grommetStrings.color
import typingsJapgolly.grommet.utilsMod.Omit
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Button")
@js.native
object Button extends TopLevel[
      FC[
        ButtonProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          color
        ])
      ]
    ]

