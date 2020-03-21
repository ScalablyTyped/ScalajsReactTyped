package typingsJapgolly.ionicCliFramework.mod

import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionicCliFramework.optionsMod.OptionPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "OptionFilters")
@js.native
object OptionFilters extends js.Object {
  def excludesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = js.native
  def excludesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = js.native
  def includesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = js.native
  def includesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = js.native
}

