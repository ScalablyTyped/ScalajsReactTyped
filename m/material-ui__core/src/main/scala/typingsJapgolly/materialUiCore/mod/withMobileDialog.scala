package typingsJapgolly.materialUiCore.mod

import typingsJapgolly.materialUiCore.PartialWithWidth
import typingsJapgolly.materialUiCore.withMobileDialogWithMobileDialogMod.InjectedProps
import typingsJapgolly.materialUiCore.withMobileDialogWithMobileDialogMod.WithMobileDialogOptions
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core", "withMobileDialog")
@js.native
object withMobileDialog extends js.Object {
  def apply[P](): js.Function1[
    /* component */ ComponentType[P with InjectedProps with PartialWithWidth], 
    ComponentType[P with PartialWithWidth]
  ] = js.native
  def apply[P](options: WithMobileDialogOptions): js.Function1[
    /* component */ ComponentType[P with InjectedProps with PartialWithWidth], 
    ComponentType[P with PartialWithWidth]
  ] = js.native
}

