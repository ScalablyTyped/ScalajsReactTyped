package typingsJapgolly.reactMixin.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.Mixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMixin extends js.Object {
  def apply[S](clazz: js.Any, mixin: Mixin[_, _]): ComponentClassP[S with js.Object] = js.native
  def decorate(mixin: Mixin[_, _]): ClassDecorator = js.native
  def onClass[S](clazz: js.Any, mixin: Mixin[_, _]): ComponentClassP[S with js.Object] = js.native
}

