package typingsJapgolly.rcFieldForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formMod {
  type RenderProps = js.Function2[
    /* values */ typingsJapgolly.rcFieldForm.interfaceMod.Store, 
    /* form */ typingsJapgolly.rcFieldForm.interfaceMod.FormInstance, 
    japgolly.scalajs.react.raw.React.Element | japgolly.scalajs.react.raw.React.Node
  ]
}
