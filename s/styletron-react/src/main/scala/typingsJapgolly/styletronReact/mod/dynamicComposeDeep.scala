package typingsJapgolly.styletronReact.mod

import typingsJapgolly.std.ReturnType
import typingsJapgolly.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-react", "dynamicComposeDeep")
@js.native
object dynamicComposeDeep extends js.Object {
  def apply(styletron: Styletron, styleArg: js.Function1[/* props */ js.Object, StyleObject]): ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* reducer */ js.Function2[/* style */ StyleObject, /* props */ js.Object, StyleObject], 
      Styletron
    ]
  ] = js.native
}

