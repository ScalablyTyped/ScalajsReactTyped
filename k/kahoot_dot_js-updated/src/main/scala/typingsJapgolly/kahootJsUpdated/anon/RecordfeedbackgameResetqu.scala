package typingsJapgolly.kahootJsUpdated.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.kahootJsUpdated.srcAssetsLiveBaseMessageMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'feedback' | 'gameReset' | 'quizStart' | 'quizEnd' | 'podium' | 'timeOver' | 'QuestionReady' | 'questionStart' | 'questionEnd' | 'nameAccept' | 'teamAccept' | 'teamTalk' | 'PingChecker' | 'timetrack' | 'Disconnect' | 'JoinFinish', (message : kahoot.js-updated.kahoot.js-updated/src/assets/LiveBaseMessage.^): void> */
trait RecordfeedbackgameResetqu extends StObject {
  
  def Disconnect(message: ^): Unit
  @JSName("Disconnect")
  var Disconnect_Original: js.Function1[/* message */ ^, Unit]
  
  def JoinFinish(message: ^): Unit
  @JSName("JoinFinish")
  var JoinFinish_Original: js.Function1[/* message */ ^, Unit]
  
  def PingChecker(message: ^): Unit
  @JSName("PingChecker")
  var PingChecker_Original: js.Function1[/* message */ ^, Unit]
  
  def QuestionReady(message: ^): Unit
  @JSName("QuestionReady")
  var QuestionReady_Original: js.Function1[/* message */ ^, Unit]
  
  def feedback(message: ^): Unit
  @JSName("feedback")
  var feedback_Original: js.Function1[/* message */ ^, Unit]
  
  def gameReset(message: ^): Unit
  @JSName("gameReset")
  var gameReset_Original: js.Function1[/* message */ ^, Unit]
  
  def nameAccept(message: ^): Unit
  @JSName("nameAccept")
  var nameAccept_Original: js.Function1[/* message */ ^, Unit]
  
  def podium(message: ^): Unit
  @JSName("podium")
  var podium_Original: js.Function1[/* message */ ^, Unit]
  
  def questionEnd(message: ^): Unit
  @JSName("questionEnd")
  var questionEnd_Original: js.Function1[/* message */ ^, Unit]
  
  def questionStart(message: ^): Unit
  @JSName("questionStart")
  var questionStart_Original: js.Function1[/* message */ ^, Unit]
  
  def quizEnd(message: ^): Unit
  @JSName("quizEnd")
  var quizEnd_Original: js.Function1[/* message */ ^, Unit]
  
  def quizStart(message: ^): Unit
  @JSName("quizStart")
  var quizStart_Original: js.Function1[/* message */ ^, Unit]
  
  def teamAccept(message: ^): Unit
  @JSName("teamAccept")
  var teamAccept_Original: js.Function1[/* message */ ^, Unit]
  
  def teamTalk(message: ^): Unit
  @JSName("teamTalk")
  var teamTalk_Original: js.Function1[/* message */ ^, Unit]
  
  def timeOver(message: ^): Unit
  @JSName("timeOver")
  var timeOver_Original: js.Function1[/* message */ ^, Unit]
  
  def timetrack(message: ^): Unit
  @JSName("timetrack")
  var timetrack_Original: js.Function1[/* message */ ^, Unit]
}
object RecordfeedbackgameResetqu {
  
  inline def apply(
    Disconnect: /* message */ ^ => Callback,
    JoinFinish: /* message */ ^ => Callback,
    PingChecker: /* message */ ^ => Callback,
    QuestionReady: /* message */ ^ => Callback,
    feedback: /* message */ ^ => Callback,
    gameReset: /* message */ ^ => Callback,
    nameAccept: /* message */ ^ => Callback,
    podium: /* message */ ^ => Callback,
    questionEnd: /* message */ ^ => Callback,
    questionStart: /* message */ ^ => Callback,
    quizEnd: /* message */ ^ => Callback,
    quizStart: /* message */ ^ => Callback,
    teamAccept: /* message */ ^ => Callback,
    teamTalk: /* message */ ^ => Callback,
    timeOver: /* message */ ^ => Callback,
    timetrack: /* message */ ^ => Callback
  ): RecordfeedbackgameResetqu = {
    val __obj = js.Dynamic.literal(Disconnect = js.Any.fromFunction1((t0: /* message */ ^) => Disconnect(t0).runNow()), JoinFinish = js.Any.fromFunction1((t0: /* message */ ^) => JoinFinish(t0).runNow()), PingChecker = js.Any.fromFunction1((t0: /* message */ ^) => PingChecker(t0).runNow()), QuestionReady = js.Any.fromFunction1((t0: /* message */ ^) => QuestionReady(t0).runNow()), feedback = js.Any.fromFunction1((t0: /* message */ ^) => feedback(t0).runNow()), gameReset = js.Any.fromFunction1((t0: /* message */ ^) => gameReset(t0).runNow()), nameAccept = js.Any.fromFunction1((t0: /* message */ ^) => nameAccept(t0).runNow()), podium = js.Any.fromFunction1((t0: /* message */ ^) => podium(t0).runNow()), questionEnd = js.Any.fromFunction1((t0: /* message */ ^) => questionEnd(t0).runNow()), questionStart = js.Any.fromFunction1((t0: /* message */ ^) => questionStart(t0).runNow()), quizEnd = js.Any.fromFunction1((t0: /* message */ ^) => quizEnd(t0).runNow()), quizStart = js.Any.fromFunction1((t0: /* message */ ^) => quizStart(t0).runNow()), teamAccept = js.Any.fromFunction1((t0: /* message */ ^) => teamAccept(t0).runNow()), teamTalk = js.Any.fromFunction1((t0: /* message */ ^) => teamTalk(t0).runNow()), timeOver = js.Any.fromFunction1((t0: /* message */ ^) => timeOver(t0).runNow()), timetrack = js.Any.fromFunction1((t0: /* message */ ^) => timetrack(t0).runNow()))
    __obj.asInstanceOf[RecordfeedbackgameResetqu]
  }
  
  extension [Self <: RecordfeedbackgameResetqu](x: Self) {
    
    inline def setDisconnect(value: /* message */ ^ => Callback): Self = StObject.set(x, "Disconnect", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setFeedback(value: /* message */ ^ => Callback): Self = StObject.set(x, "feedback", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setGameReset(value: /* message */ ^ => Callback): Self = StObject.set(x, "gameReset", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setJoinFinish(value: /* message */ ^ => Callback): Self = StObject.set(x, "JoinFinish", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setNameAccept(value: /* message */ ^ => Callback): Self = StObject.set(x, "nameAccept", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setPingChecker(value: /* message */ ^ => Callback): Self = StObject.set(x, "PingChecker", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setPodium(value: /* message */ ^ => Callback): Self = StObject.set(x, "podium", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setQuestionEnd(value: /* message */ ^ => Callback): Self = StObject.set(x, "questionEnd", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setQuestionReady(value: /* message */ ^ => Callback): Self = StObject.set(x, "QuestionReady", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setQuestionStart(value: /* message */ ^ => Callback): Self = StObject.set(x, "questionStart", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setQuizEnd(value: /* message */ ^ => Callback): Self = StObject.set(x, "quizEnd", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setQuizStart(value: /* message */ ^ => Callback): Self = StObject.set(x, "quizStart", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setTeamAccept(value: /* message */ ^ => Callback): Self = StObject.set(x, "teamAccept", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setTeamTalk(value: /* message */ ^ => Callback): Self = StObject.set(x, "teamTalk", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setTimeOver(value: /* message */ ^ => Callback): Self = StObject.set(x, "timeOver", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
    
    inline def setTimetrack(value: /* message */ ^ => Callback): Self = StObject.set(x, "timetrack", js.Any.fromFunction1((t0: /* message */ ^) => value(t0).runNow()))
  }
}
