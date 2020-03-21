package typingsJapgolly.reactTether.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactTether {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.reactTether.reactTetherStrings.window
    - typingsJapgolly.reactTether.reactTetherStrings.scrollParent
    - typingsJapgolly.std.HTMLElement
  */
  type ContraintsTo = typingsJapgolly.reactTether.mod.ReactTether._ContraintsTo | java.lang.String | org.scalajs.dom.raw.HTMLElement
  type RenderProp = js.Function1[
    /* ref */ japgolly.scalajs.react.raw.React.RefHandle[org.scalajs.dom.raw.Element], 
    japgolly.scalajs.react.raw.React.Node
  ]
}
