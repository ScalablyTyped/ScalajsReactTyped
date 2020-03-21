package typingsJapgolly.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buttonMod {
  type ButtonType = typingsJapgolly.grommet.buttonMod.ButtonProps with (typingsJapgolly.grommet.utilsMod.Omit[
    typingsJapgolly.react.mod.DetailedHTMLProps[
      typingsJapgolly.react.mod.ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement], 
      org.scalajs.dom.raw.HTMLButtonElement
    ], 
    typingsJapgolly.grommet.grommetStrings.color
  ])
}
