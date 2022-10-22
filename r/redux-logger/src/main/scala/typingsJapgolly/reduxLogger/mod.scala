package typingsJapgolly.reduxLogger

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.reduxLogger.reduxLoggerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-logger", JSImport.Default)
  @js.native
  val default: Middleware[js.Object, Any, Dispatch[AnyAction]] = js.native
  
  inline def createLogger(): Middleware[js.Object, Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")().asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def createLogger(options: ReduxLoggerOptions): Middleware[js.Object, Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  
  @JSImport("redux-logger", "logger")
  @js.native
  val logger: Middleware[js.Object, Any, Dispatch[AnyAction]] = js.native
  
  type ActionToString = js.Function1[/* action */ Any, String]
  
  trait ColorsObject extends StObject {
    
    var action: js.UndefOr[Boolean | ActionToString] = js.undefined
    
    var error: js.UndefOr[Boolean | ErrorToString] = js.undefined
    
    var nextState: js.UndefOr[Boolean | StateToString] = js.undefined
    
    var prevState: js.UndefOr[Boolean | StateToString] = js.undefined
    
    var title: js.UndefOr[Boolean | ActionToString] = js.undefined
  }
  object ColorsObject {
    
    inline def apply(): ColorsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorsObject]
    }
    
    extension [Self <: ColorsObject](x: Self) {
      
      inline def setAction(value: Boolean | ActionToString): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionFunction1(value: /* action */ Any => String): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setError(value: Boolean | ErrorToString): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorFunction2(value: (/* error */ Any, /* prevState */ Any) => String): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNextState(value: Boolean | StateToString): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
      
      inline def setNextStateFunction1(value: /* state */ Any => String): Self = StObject.set(x, "nextState", js.Any.fromFunction1(value))
      
      inline def setNextStateUndefined: Self = StObject.set(x, "nextState", js.undefined)
      
      inline def setPrevState(value: Boolean | StateToString): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
      
      inline def setPrevStateFunction1(value: /* state */ Any => String): Self = StObject.set(x, "prevState", js.Any.fromFunction1(value))
      
      inline def setPrevStateUndefined: Self = StObject.set(x, "prevState", js.undefined)
      
      inline def setTitle(value: Boolean | ActionToString): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction1(value: /* action */ Any => String): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type ErrorToString = js.Function2[/* error */ Any, /* prevState */ Any, String]
  
  trait LevelObject extends StObject {
    
    var action: js.UndefOr[String | Boolean | ActionToString] = js.undefined
    
    var error: js.UndefOr[String | Boolean | ErrorToString] = js.undefined
    
    var nextState: js.UndefOr[String | Boolean | StateToString] = js.undefined
    
    var prevState: js.UndefOr[String | Boolean | StateToString] = js.undefined
  }
  object LevelObject {
    
    inline def apply(): LevelObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelObject]
    }
    
    extension [Self <: LevelObject](x: Self) {
      
      inline def setAction(value: String | Boolean | ActionToString): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionFunction1(value: /* action */ Any => String): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setError(value: String | Boolean | ErrorToString): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorFunction2(value: (/* error */ Any, /* prevState */ Any) => String): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNextState(value: String | Boolean | StateToString): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
      
      inline def setNextStateFunction1(value: /* state */ Any => String): Self = StObject.set(x, "nextState", js.Any.fromFunction1(value))
      
      inline def setNextStateUndefined: Self = StObject.set(x, "nextState", js.undefined)
      
      inline def setPrevState(value: String | Boolean | StateToString): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
      
      inline def setPrevStateFunction1(value: /* state */ Any => String): Self = StObject.set(x, "prevState", js.Any.fromFunction1(value))
      
      inline def setPrevStateUndefined: Self = StObject.set(x, "prevState", js.undefined)
    }
  }
  
  trait LogEntryObject extends StObject {
    
    var action: js.UndefOr[String | Boolean | ActionToString] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ Any, Any]] = js.undefined
    
    var nextState: js.UndefOr[js.Function1[/* state */ Any, Any]] = js.undefined
    
    var prevState: js.UndefOr[js.Function1[/* state */ Any, Any]] = js.undefined
    
    var started: js.UndefOr[Double] = js.undefined
    
    var startedTime: js.UndefOr[js.Date] = js.undefined
    
    var took: js.UndefOr[Double] = js.undefined
  }
  object LogEntryObject {
    
    inline def apply(): LogEntryObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogEntryObject]
    }
    
    extension [Self <: LogEntryObject](x: Self) {
      
      inline def setAction(value: String | Boolean | ActionToString): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionFunction1(value: /* action */ Any => String): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setError(value: /* error */ Any => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNextState(value: /* state */ Any => Any): Self = StObject.set(x, "nextState", js.Any.fromFunction1(value))
      
      inline def setNextStateUndefined: Self = StObject.set(x, "nextState", js.undefined)
      
      inline def setPrevState(value: /* state */ Any => Any): Self = StObject.set(x, "prevState", js.Any.fromFunction1(value))
      
      inline def setPrevStateUndefined: Self = StObject.set(x, "prevState", js.undefined)
      
      inline def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setStartedTime(value: js.Date): Self = StObject.set(x, "startedTime", value.asInstanceOf[js.Any])
      
      inline def setStartedTimeUndefined: Self = StObject.set(x, "startedTime", js.undefined)
      
      inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
      
      inline def setTook(value: Double): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
      
      inline def setTookUndefined: Self = StObject.set(x, "took", js.undefined)
    }
  }
  
  type LoggerPredicate = js.Function3[
    /* getState */ js.Function0[Any], 
    /* action */ Any, 
    /* logEntry */ js.UndefOr[LogEntryObject], 
    Boolean
  ]
  
  trait ReduxLoggerOptions extends StObject {
    
    var actionTransformer: js.UndefOr[js.Function1[/* action */ Any, Any]] = js.undefined
    
    var collapsed: js.UndefOr[Boolean | LoggerPredicate] = js.undefined
    
    var colors: js.UndefOr[ColorsObject | `false`] = js.undefined
    
    var diff: js.UndefOr[Boolean] = js.undefined
    
    var diffPredicate: js.UndefOr[LoggerPredicate] = js.undefined
    
    var duration: js.UndefOr[Boolean] = js.undefined
    
    var errorTransformer: js.UndefOr[js.Function1[/* error */ Any, Any]] = js.undefined
    
    var level: js.UndefOr[String | ActionToString | LevelObject] = js.undefined
    
    var logErrors: js.UndefOr[Boolean] = js.undefined
    
    var logger: js.UndefOr[Any] = js.undefined
    
    var predicate: js.UndefOr[LoggerPredicate] = js.undefined
    
    var stateTransformer: js.UndefOr[js.Function1[/* state */ Any, Any]] = js.undefined
    
    var timestamp: js.UndefOr[Boolean] = js.undefined
    
    var titleFormatter: js.UndefOr[
        js.Function3[/* formattedAction */ Any, /* formattedTime */ String, /* took */ Double, String]
      ] = js.undefined
  }
  object ReduxLoggerOptions {
    
    inline def apply(): ReduxLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReduxLoggerOptions]
    }
    
    extension [Self <: ReduxLoggerOptions](x: Self) {
      
      inline def setActionTransformer(value: /* action */ Any => Any): Self = StObject.set(x, "actionTransformer", js.Any.fromFunction1(value))
      
      inline def setActionTransformerUndefined: Self = StObject.set(x, "actionTransformer", js.undefined)
      
      inline def setCollapsed(value: Boolean | LoggerPredicate): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedFunction3(
        value: (/* getState */ js.Function0[Any], /* action */ Any, /* logEntry */ js.UndefOr[LogEntryObject]) => Boolean
      ): Self = StObject.set(x, "collapsed", js.Any.fromFunction3(value))
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setColors(value: ColorsObject | `false`): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setDiff(value: Boolean): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      inline def setDiffPredicate(
        value: (/* getState */ js.Function0[Any], /* action */ Any, /* logEntry */ js.UndefOr[LogEntryObject]) => Boolean
      ): Self = StObject.set(x, "diffPredicate", js.Any.fromFunction3(value))
      
      inline def setDiffPredicateUndefined: Self = StObject.set(x, "diffPredicate", js.undefined)
      
      inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
      
      inline def setDuration(value: Boolean): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setErrorTransformer(value: /* error */ Any => Any): Self = StObject.set(x, "errorTransformer", js.Any.fromFunction1(value))
      
      inline def setErrorTransformerUndefined: Self = StObject.set(x, "errorTransformer", js.undefined)
      
      inline def setLevel(value: String | ActionToString | LevelObject): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelFunction1(value: /* action */ Any => String): Self = StObject.set(x, "level", js.Any.fromFunction1(value))
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLogErrors(value: Boolean): Self = StObject.set(x, "logErrors", value.asInstanceOf[js.Any])
      
      inline def setLogErrorsUndefined: Self = StObject.set(x, "logErrors", js.undefined)
      
      inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setPredicate(
        value: (/* getState */ js.Function0[Any], /* action */ Any, /* logEntry */ js.UndefOr[LogEntryObject]) => Boolean
      ): Self = StObject.set(x, "predicate", js.Any.fromFunction3(value))
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      inline def setStateTransformer(value: /* state */ Any => Any): Self = StObject.set(x, "stateTransformer", js.Any.fromFunction1(value))
      
      inline def setStateTransformerUndefined: Self = StObject.set(x, "stateTransformer", js.undefined)
      
      inline def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTitleFormatter(value: (/* formattedAction */ Any, /* formattedTime */ String, /* took */ Double) => String): Self = StObject.set(x, "titleFormatter", js.Any.fromFunction3(value))
      
      inline def setTitleFormatterUndefined: Self = StObject.set(x, "titleFormatter", js.undefined)
    }
  }
  
  type StateToString = js.Function1[/* state */ Any, String]
}
