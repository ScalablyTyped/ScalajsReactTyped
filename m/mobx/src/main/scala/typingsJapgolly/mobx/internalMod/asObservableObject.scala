package typingsJapgolly.mobx.internalMod

import typingsJapgolly.mobx.modifiersMod.IEnhancer
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "asObservableObject")
@js.native
object asObservableObject extends js.Object {
  def apply(target: js.Any): typingsJapgolly.mobx.observableobjectMod.ObservableObjectAdministration = js.native
  def apply(target: js.Any, name: PropertyKey): typingsJapgolly.mobx.observableobjectMod.ObservableObjectAdministration = js.native
  def apply(target: js.Any, name: PropertyKey, defaultEnhancer: IEnhancer[_]): typingsJapgolly.mobx.observableobjectMod.ObservableObjectAdministration = js.native
}

