package typingsJapgolly.recompose

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#nest
@JSImport("recompose/nest", JSImport.Namespace)
@js.native
object nestMod extends js.Object {
  def default(Components: (String | ComponentType[_])*): ComponentClassP[js.Object] = js.native
}

