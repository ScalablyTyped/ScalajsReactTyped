package typingsJapgolly.vexdb.requestObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vexdb.vexdbStrings.events
  - typingsJapgolly.vexdb.vexdbStrings.teams
  - typingsJapgolly.vexdb.vexdbStrings.matches
  - typingsJapgolly.vexdb.vexdbStrings.rankings
  - typingsJapgolly.vexdb.vexdbStrings.season_rankings
  - typingsJapgolly.vexdb.vexdbStrings.awards
  - typingsJapgolly.vexdb.vexdbStrings.skills
*/
trait Endpoint extends js.Object

object Endpoint {
  @scala.inline
  def awards: typingsJapgolly.vexdb.vexdbStrings.awards = this.cast("awards")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def events: typingsJapgolly.vexdb.vexdbStrings.events = this.cast("events")
  @scala.inline
  def matches: typingsJapgolly.vexdb.vexdbStrings.matches = this.cast("matches")
  @scala.inline
  def rankings: typingsJapgolly.vexdb.vexdbStrings.rankings = this.cast("rankings")
  @scala.inline
  def season_rankings: typingsJapgolly.vexdb.vexdbStrings.season_rankings = this.cast("season_rankings")
  @scala.inline
  def skills: typingsJapgolly.vexdb.vexdbStrings.skills = this.cast("skills")
  @scala.inline
  def teams: typingsJapgolly.vexdb.vexdbStrings.teams = this.cast("teams")
}

