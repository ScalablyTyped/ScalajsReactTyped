package typingsJapgolly.vexdb

import typingsJapgolly.vexdb.requestObjectsMod.AwardsRequestObject
import typingsJapgolly.vexdb.requestObjectsMod.EventsRequestObject
import typingsJapgolly.vexdb.requestObjectsMod.MatchesRequestObject
import typingsJapgolly.vexdb.requestObjectsMod.RankingsRequestObject
import typingsJapgolly.vexdb.requestObjectsMod.RequestObject
import typingsJapgolly.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typingsJapgolly.vexdb.requestObjectsMod.SkillsRequestObject
import typingsJapgolly.vexdb.requestObjectsMod.TeamsRequestObject
import typingsJapgolly.vexdb.responseObjectsMod.AwardsResponseObject
import typingsJapgolly.vexdb.responseObjectsMod.EventsResponseObject
import typingsJapgolly.vexdb.responseObjectsMod.MatchesResponseObject
import typingsJapgolly.vexdb.responseObjectsMod.RankingsResponseObject
import typingsJapgolly.vexdb.responseObjectsMod.ResponseObject
import typingsJapgolly.vexdb.responseObjectsMod.SeasonRankingsResponseObject
import typingsJapgolly.vexdb.responseObjectsMod.SkillsResponseObject
import typingsJapgolly.vexdb.responseObjectsMod.TeamsResponseObject
import typingsJapgolly.vexdb.vexdbStrings.awards
import typingsJapgolly.vexdb.vexdbStrings.events
import typingsJapgolly.vexdb.vexdbStrings.matches
import typingsJapgolly.vexdb.vexdbStrings.rankings
import typingsJapgolly.vexdb.vexdbStrings.season_rankings
import typingsJapgolly.vexdb.vexdbStrings.skills
import typingsJapgolly.vexdb.vexdbStrings.teams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/get", JSImport.Namespace)
@js.native
object getMod extends js.Object {
  def get(endpoint: String, params: RequestObject): js.Promise[js.Array[ResponseObject]] = js.native
  @JSName("get")
  def get_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[js.Array[AwardsResponseObject]] = js.native
  @JSName("get")
  def get_events(endpoint: events, params: EventsRequestObject): js.Promise[js.Array[EventsResponseObject]] = js.native
  @JSName("get")
  def get_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[js.Array[MatchesResponseObject]] = js.native
  @JSName("get")
  def get_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[js.Array[RankingsResponseObject]] = js.native
  @JSName("get")
  def get_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[js.Array[SeasonRankingsResponseObject]] = js.native
  @JSName("get")
  def get_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[js.Array[SkillsResponseObject]] = js.native
  @JSName("get")
  def get_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[js.Array[TeamsResponseObject]] = js.native
  def size(endpoint: String, params: RequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_events(endpoint: events, params: EventsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[Double] = js.native
}

