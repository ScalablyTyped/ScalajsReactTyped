package typingsJapgolly.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * This file creates literal versions of many of the constants
  * It should be kept in sync with constants.ts
  */
// Extras
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.screeps.screepsStrings.plain
  - typingsJapgolly.screeps.screepsStrings.swamp
  - typingsJapgolly.screeps.screepsStrings.wall
*/
trait Terrain extends js.Object

object Terrain {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def plain: typingsJapgolly.screeps.screepsStrings.plain = this.cast("plain")
  @scala.inline
  def swamp: typingsJapgolly.screeps.screepsStrings.swamp = this.cast("swamp")
  @scala.inline
  def wall: typingsJapgolly.screeps.screepsStrings.wall = this.cast("wall")
}

