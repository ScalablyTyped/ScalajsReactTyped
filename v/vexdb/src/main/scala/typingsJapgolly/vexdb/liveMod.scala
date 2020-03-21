package typingsJapgolly.vexdb

import typingsJapgolly.node.eventsMod.EventEmitter
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
import typingsJapgolly.vexdb.vexdbStrings.fetch
import typingsJapgolly.vexdb.vexdbStrings.item
import typingsJapgolly.vexdb.vexdbStrings.matches
import typingsJapgolly.vexdb.vexdbStrings.prefetch
import typingsJapgolly.vexdb.vexdbStrings.rankings
import typingsJapgolly.vexdb.vexdbStrings.season_rankings
import typingsJapgolly.vexdb.vexdbStrings.skills
import typingsJapgolly.vexdb.vexdbStrings.teams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/live", JSImport.Namespace)
@js.native
object liveMod extends js.Object {
  @js.native
  trait LiveEventEmitter[Q, R] extends EventEmitter {
    def close(): Unit = js.native
    def current(): js.Array[R] = js.native
    def fetch(): js.Promise[Boolean] = js.native
    @JSName("on")
    def on_fetch(event: fetch, callback: js.Function1[/* newItems */ js.Array[R], Unit]): this.type = js.native
    @JSName("on")
    def on_item(event: item, callback: js.Function1[/* item */ R, Unit]): this.type = js.native
    @JSName("on")
    def on_prefetch(event: prefetch, callback: js.Function1[/* results */ js.Array[R], Unit]): this.type = js.native
    def params(updateParameters: Q): Q = js.native
  }
  
  def live(endpoint: String, params: LiveRequestObject[RequestObject]): LiveEventEmitter[RequestObject, ResponseObject] = js.native
  @JSName("live")
  def live_awards(endpoint: awards, params: LiveRequestObjectAwardsRe): LiveEventEmitter[AwardsRequestObject, AwardsResponseObject] = js.native
  @JSName("live")
  def live_events(endpoint: events, params: LiveRequestObjectEventsRe): LiveEventEmitter[EventsRequestObject, EventsResponseObject] = js.native
  @JSName("live")
  def live_matches(endpoint: matches, params: LiveRequestObjectMatchesR): LiveEventEmitter[MatchesRequestObject, MatchesResponseObject] = js.native
  @JSName("live")
  def live_rankings(endpoint: rankings, params: LiveRequestObjectRankings): LiveEventEmitter[RankingsRequestObject, RankingsResponseObject] = js.native
  @JSName("live")
  def live_seasonrankings(endpoint: season_rankings, params: LiveRequestObjectSeasonRa): LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject] = js.native
  @JSName("live")
  def live_skills(endpoint: skills, params: LiveRequestObjectSkillsRe): LiveEventEmitter[SkillsRequestObject, SkillsResponseObject] = js.native
  @JSName("live")
  def live_teams(endpoint: teams, params: LiveRequestObjectTeamsReq): LiveEventEmitter[TeamsRequestObject, TeamsResponseObject] = js.native
  type LiveRequestObject[T] = T with AnonPrefetch
}

