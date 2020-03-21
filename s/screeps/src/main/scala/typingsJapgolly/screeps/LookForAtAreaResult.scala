package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsStrings.constructionSite
import typingsJapgolly.screeps.screepsStrings.creep
import typingsJapgolly.screeps.screepsStrings.deposit
import typingsJapgolly.screeps.screepsStrings.energy
import typingsJapgolly.screeps.screepsStrings.exit
import typingsJapgolly.screeps.screepsStrings.flag
import typingsJapgolly.screeps.screepsStrings.mineral
import typingsJapgolly.screeps.screepsStrings.nuke
import typingsJapgolly.screeps.screepsStrings.powerCreep
import typingsJapgolly.screeps.screepsStrings.resource
import typingsJapgolly.screeps.screepsStrings.ruin
import typingsJapgolly.screeps.screepsStrings.source
import typingsJapgolly.screeps.screepsStrings.structure
import typingsJapgolly.screeps.screepsStrings.terrain
import typingsJapgolly.screeps.screepsStrings.tombstone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookForAtAreaResult[T, K /* <: exit | structure | source | nuke | deposit | powerCreep | terrain | tombstone | resource | flag | mineral | ruin | constructionSite | creep | energy */] extends js.Object {
  var `type`: K = js.native
}

