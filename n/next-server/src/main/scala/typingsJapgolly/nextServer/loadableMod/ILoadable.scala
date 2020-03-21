package typingsJapgolly.nextServer.loadableMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoadable extends js.Object {
  def apply[P](opts: js.Any): ComponentClassP[P with js.Object] = js.native
  def Map[P](opts: js.Any): ComponentType[P] = js.native
  def preloadAll(): js.Promise[_] = js.native
}

