package typingsJapgolly.kahootJsUpdated.mod

import typingsJapgolly.kahootJsUpdated.anon.LiveClientHandshake
import typingsJapgolly.kahootJsUpdated.anon.Rank
import typingsJapgolly.kahootJsUpdated.anon.RecordfeedbackgameResetqu
import typingsJapgolly.kahootJsUpdated.anon.RequiredKahootOptions
import typingsJapgolly.kahootJsUpdated.kahootJsUpdatedBooleans.`false`
import typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.Disconnect
import typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.Feedback
import typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.GameReset
import typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.Joined
import typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TwoFactorCorrect
import typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TwoFactorReset
import typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TwoFactorWrong
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The main Kahoot class */
@js.native
trait Kahoot
  extends typingsJapgolly.node.eventsMod.^ {
  
  @JSName("addListener")
  def addListener_Disconnect(eventName: Disconnect, listener: js.Function1[/* ev */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_Feedback(eventName: Feedback, listener: js.Function1[/* ev */ js.Object, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_GameReset(eventName: GameReset, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_Joined(eventName: Joined, listener: js.Function1[/* ev */ JoinResponse, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_NameAccept(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.NameAccept,
    listener: js.Function1[/* ev */ NameAccept, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_Podium(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.Podium,
    listener: js.Function1[/* ev */ Podium, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_QuestionEnd(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionEnd,
    listener: js.Function1[/* ev */ QuestionEnd, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_QuestionReady(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionReady,
    listener: js.Function1[/* ev */ QuestionReady, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_QuestionStart(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionStart,
    listener: js.Function1[/* ev */ QuestionStart, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_QuizEnd(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuizEnd,
    listener: js.Function1[/* ev */ QuizEnd, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_QuizStart(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuizStart,
    listener: js.Function1[/* ev */ QuizStart, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_RecoveryData(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.RecoveryData,
    listener: js.Function1[/* ev */ RecoveryData, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_TeamAccept(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TeamAccept,
    listener: js.Function1[/* ev */ TeamAccept, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_TeamTalk(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TeamTalk,
    listener: js.Function1[/* ev */ TeamTalk, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_TimeOver(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TimeOver,
    listener: js.Function1[/* ev */ TimeOver, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_TwoFactorCorrect(eventName: TwoFactorCorrect, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_TwoFactorReset(eventName: TwoFactorReset, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_TwoFactorWrong(eventName: TwoFactorWrong, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  
  /**
    * Answer a question
    * @param choice The index of the choice
    */
  def answer(choice: Double): js.Promise[LiveEventTimetrack] = js.native
  
  /**
    * Answer the 2FA question
    * @param steps A list of four numbers.
    * Each number represents one of the four colors in the 2FA code (red, blue, yellow, green)
    */
  def answerTwoFactorAuth(steps: js.Tuple4[Double, Double, Double, Double]): js.Promise[LiveEventTimetrack] = js.native
  
  var cid: Double = js.native
  
  var classes: LiveClientHandshake = js.native
  
  var connected: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[Rank] = js.native
  
  var defaults: RequiredKahootOptions = js.native
  
  var disconnectReason: js.UndefOr[String] = js.native
  
  /** The game's pin */
  var gameid: js.UndefOr[Double] = js.native
  
  var handlers: RecordfeedbackgameResetqu = js.native
  
  /**
    * Join a game
    * @param pin The game pin
    * @param name The player name to join with
    * @param team The team member names. If set to false, team members will not be automatically added
    * @fires Kahoot#Joined
    * @fires Kahoot#TwoFactorReset
    */
  def join(pin: String, name: String): js.Promise[JoinResponse] = js.native
  def join(pin: String, name: String, team: js.Array[String]): js.Promise[JoinResponse] = js.native
  def join(pin: Double, name: String): js.Promise[JoinResponse] = js.native
  def join(pin: Double, name: String, team: js.Array[String]): js.Promise[JoinResponse] = js.native
  
  /**
    *
    * @param team The team member names. If set to false, team members will not be automatically added
    * @param emit Whether to emit the Join and TwoFactorReset events
    * @fires Kahoot#Joined
    * @fires Kahoot#TwoFactorReset
    */
  def joinTeam(team: js.Array[String]): js.Promise[LiveEventTimetrack] = js.native
  def joinTeam(team: js.Array[String], emit: Boolean): js.Promise[LiveEventTimetrack] = js.native
  @JSName("joinTeam")
  def joinTeam_false(team: `false`): js.Promise[LiveEventTimetrack] = js.native
  @JSName("joinTeam")
  def joinTeam_false(team: `false`, emit: Boolean): js.Promise[LiveEventTimetrack] = js.native
  
  @JSName("join")
  def join_false(pin: String, name: String, team: `false`): js.Promise[JoinResponse] = js.native
  @JSName("join")
  def join_false(pin: Double, name: String, team: `false`): js.Promise[JoinResponse] = js.native
  
  var lastEvent: Unit = js.native
  
  var messageId: Double = js.native
  
  /** Player name */
  var name: js.UndefOr[String] = js.native
  
  @JSName("on")
  def on_Disconnect(eventName: Disconnect, listener: js.Function1[/* ev */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_Feedback(eventName: Feedback, listener: js.Function1[/* ev */ js.Object, Unit]): this.type = js.native
  @JSName("on")
  def on_GameReset(eventName: GameReset, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  // Events
  @JSName("on")
  def on_Joined(eventName: Joined, listener: js.Function1[/* ev */ JoinResponse, Unit]): this.type = js.native
  @JSName("on")
  def on_NameAccept(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.NameAccept,
    listener: js.Function1[/* ev */ NameAccept, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_Podium(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.Podium,
    listener: js.Function1[/* ev */ Podium, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_QuestionEnd(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionEnd,
    listener: js.Function1[/* ev */ QuestionEnd, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_QuestionReady(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionReady,
    listener: js.Function1[/* ev */ QuestionReady, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_QuestionStart(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionStart,
    listener: js.Function1[/* ev */ QuestionStart, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_QuizEnd(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuizEnd,
    listener: js.Function1[/* ev */ QuizEnd, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_QuizStart(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuizStart,
    listener: js.Function1[/* ev */ QuizStart, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_RecoveryData(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.RecoveryData,
    listener: js.Function1[/* ev */ RecoveryData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_TeamAccept(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TeamAccept,
    listener: js.Function1[/* ev */ TeamAccept, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_TeamTalk(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TeamTalk,
    listener: js.Function1[/* ev */ TeamTalk, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_TimeOver(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TimeOver,
    listener: js.Function1[/* ev */ TimeOver, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_TwoFactorCorrect(eventName: TwoFactorCorrect, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("on")
  def on_TwoFactorReset(eventName: TwoFactorReset, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("on")
  def on_TwoFactorWrong(eventName: TwoFactorWrong, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_Disconnect(eventName: Disconnect, listener: js.Function1[/* ev */ String, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_Feedback(eventName: Feedback, listener: js.Function1[/* ev */ js.Object, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_GameReset(eventName: GameReset, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_Joined(eventName: Joined, listener: js.Function1[/* ev */ JoinResponse, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_NameAccept(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.NameAccept,
    listener: js.Function1[/* ev */ NameAccept, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_Podium(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.Podium,
    listener: js.Function1[/* ev */ Podium, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_QuestionEnd(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionEnd,
    listener: js.Function1[/* ev */ QuestionEnd, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_QuestionReady(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionReady,
    listener: js.Function1[/* ev */ QuestionReady, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_QuestionStart(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionStart,
    listener: js.Function1[/* ev */ QuestionStart, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_QuizEnd(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuizEnd,
    listener: js.Function1[/* ev */ QuizEnd, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_QuizStart(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuizStart,
    listener: js.Function1[/* ev */ QuizStart, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_RecoveryData(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.RecoveryData,
    listener: js.Function1[/* ev */ RecoveryData, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_TeamAccept(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TeamAccept,
    listener: js.Function1[/* ev */ TeamAccept, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_TeamTalk(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TeamTalk,
    listener: js.Function1[/* ev */ TeamTalk, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_TimeOver(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TimeOver,
    listener: js.Function1[/* ev */ TimeOver, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_TwoFactorCorrect(eventName: TwoFactorCorrect, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_TwoFactorReset(eventName: TwoFactorReset, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_TwoFactorWrong(eventName: TwoFactorWrong, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_Disconnect(eventName: Disconnect, listener: js.Function1[/* ev */ String, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_Feedback(eventName: Feedback, listener: js.Function1[/* ev */ js.Object, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_GameReset(eventName: GameReset, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_Joined(eventName: Joined, listener: js.Function1[/* ev */ JoinResponse, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_NameAccept(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.NameAccept,
    listener: js.Function1[/* ev */ NameAccept, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_Podium(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.Podium,
    listener: js.Function1[/* ev */ Podium, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_QuestionEnd(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionEnd,
    listener: js.Function1[/* ev */ QuestionEnd, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_QuestionReady(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionReady,
    listener: js.Function1[/* ev */ QuestionReady, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_QuestionStart(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionStart,
    listener: js.Function1[/* ev */ QuestionStart, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_QuizEnd(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuizEnd,
    listener: js.Function1[/* ev */ QuizEnd, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_QuizStart(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuizStart,
    listener: js.Function1[/* ev */ QuizStart, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_RecoveryData(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.RecoveryData,
    listener: js.Function1[/* ev */ RecoveryData, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_TeamAccept(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TeamAccept,
    listener: js.Function1[/* ev */ TeamAccept, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_TeamTalk(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TeamTalk,
    listener: js.Function1[/* ev */ TeamTalk, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_TimeOver(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TimeOver,
    listener: js.Function1[/* ev */ TimeOver, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_TwoFactorCorrect(eventName: TwoFactorCorrect, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_TwoFactorReset(eventName: TwoFactorReset, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_TwoFactorWrong(eventName: TwoFactorWrong, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  
  var quiz: js.UndefOr[QuizInfo] = js.native
  
  @JSName("removeListener")
  def removeListener_Disconnect(eventName: Disconnect, listener: js.Function1[/* ev */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_Feedback(eventName: Feedback, listener: js.Function1[/* ev */ js.Object, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_GameReset(eventName: GameReset, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_Joined(eventName: Joined, listener: js.Function1[/* ev */ JoinResponse, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_NameAccept(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.NameAccept,
    listener: js.Function1[/* ev */ NameAccept, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_Podium(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.Podium,
    listener: js.Function1[/* ev */ Podium, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_QuestionEnd(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionEnd,
    listener: js.Function1[/* ev */ QuestionEnd, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_QuestionReady(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionReady,
    listener: js.Function1[/* ev */ QuestionReady, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_QuestionStart(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuestionStart,
    listener: js.Function1[/* ev */ QuestionStart, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_QuizEnd(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuizEnd,
    listener: js.Function1[/* ev */ QuizEnd, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_QuizStart(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.QuizStart,
    listener: js.Function1[/* ev */ QuizStart, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_RecoveryData(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.RecoveryData,
    listener: js.Function1[/* ev */ RecoveryData, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_TeamAccept(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TeamAccept,
    listener: js.Function1[/* ev */ TeamAccept, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_TeamTalk(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TeamTalk,
    listener: js.Function1[/* ev */ TeamTalk, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_TimeOver(
    eventName: typingsJapgolly.kahootJsUpdated.kahootJsUpdatedStrings.TimeOver,
    listener: js.Function1[/* ev */ TimeOver, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_TwoFactorCorrect(eventName: TwoFactorCorrect, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_TwoFactorReset(eventName: TwoFactorReset, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_TwoFactorWrong(eventName: TwoFactorWrong, listener: js.Function1[/* ev */ Unit, Unit]): this.type = js.native
  
  var settings: js.UndefOr[JoinResponse] = js.native
  
  var socket: WebSocket = js.native
  
  var userAgent: String = js.native
}
