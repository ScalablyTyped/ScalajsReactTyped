package typingsJapgolly.sentryBrowser

import typingsJapgolly.sentryBrowser.anon.ErrorframesToPopnumberund
import typingsJapgolly.sentryTypes.typesEventMod.Event
import typingsJapgolly.sentryTypes.typesEventMod.EventHint
import typingsJapgolly.sentryTypes.typesExceptionMod.Exception
import typingsJapgolly.sentryTypes.typesSeverityMod.Severity
import typingsJapgolly.sentryTypes.typesSeverityMod.SeverityLevel
import typingsJapgolly.sentryTypes.typesStackframeMod.StackFrame
import typingsJapgolly.sentryTypes.typesStacktraceMod.StackParser
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventbuilderMod {
  
  @JSImport("@sentry/browser/types/eventbuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventFromError(stackParser: StackParser, ex: js.Error): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromError")(stackParser.asInstanceOf[js.Any], ex.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def eventFromException(stackParser: StackParser, exception: Any): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromException")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromException(stackParser: StackParser, exception: Any, hint: Unit, attachStacktrace: Boolean): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromException")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromException(stackParser: StackParser, exception: Any, hint: EventHint): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromException")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromException(stackParser: StackParser, exception: Any, hint: EventHint, attachStacktrace: Boolean): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromException")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  
  inline def eventFromMessage(stackParser: StackParser, message: String): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Unit, hint: Unit, attachStacktrace: Boolean): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Unit, hint: EventHint): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Unit, hint: EventHint, attachStacktrace: Boolean): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Severity): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: SeverityLevel): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(
    stackParser: StackParser,
    message: String,
    level: SeverityLevel,
    hint: Unit,
    attachStacktrace: Boolean
  ): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: SeverityLevel, hint: EventHint): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(
    stackParser: StackParser,
    message: String,
    level: SeverityLevel,
    hint: EventHint,
    attachStacktrace: Boolean
  ): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Severity, hint: Unit, attachStacktrace: Boolean): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Severity, hint: EventHint): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  inline def eventFromMessage(
    stackParser: StackParser,
    message: String,
    level: Severity,
    hint: EventHint,
    attachStacktrace: Boolean
  ): PromiseLike[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event]]
  
  inline def eventFromPlainObject(stackParser: StackParser, exception: Record[String, Any]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromPlainObject")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromPlainObject(stackParser: StackParser, exception: Record[String, Any], syntheticException: js.Error): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromPlainObject")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromPlainObject(
    stackParser: StackParser,
    exception: Record[String, Any],
    syntheticException: js.Error,
    isUnhandledRejection: Boolean
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromPlainObject")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], isUnhandledRejection.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromPlainObject(
    stackParser: StackParser,
    exception: Record[String, Any],
    syntheticException: Unit,
    isUnhandledRejection: Boolean
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromPlainObject")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], isUnhandledRejection.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def eventFromString(stackParser: StackParser, input: String): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromString")(stackParser.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromString(stackParser: StackParser, input: String, syntheticException: js.Error): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromString")(stackParser.asInstanceOf[js.Any], input.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromString(stackParser: StackParser, input: String, syntheticException: js.Error, attachStacktrace: Boolean): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromString")(stackParser.asInstanceOf[js.Any], input.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromString(stackParser: StackParser, input: String, syntheticException: Unit, attachStacktrace: Boolean): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromString")(stackParser.asInstanceOf[js.Any], input.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def eventFromUnknownInput(stackParser: StackParser, exception: Any): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromUnknownInput(stackParser: StackParser, exception: Any, syntheticException: js.Error): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromUnknownInput(stackParser: StackParser, exception: Any, syntheticException: js.Error, attachStacktrace: Boolean): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromUnknownInput(
    stackParser: StackParser,
    exception: Any,
    syntheticException: js.Error,
    attachStacktrace: Boolean,
    isUnhandledRejection: Boolean
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any], isUnhandledRejection.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromUnknownInput(
    stackParser: StackParser,
    exception: Any,
    syntheticException: js.Error,
    attachStacktrace: Unit,
    isUnhandledRejection: Boolean
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any], isUnhandledRejection.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromUnknownInput(stackParser: StackParser, exception: Any, syntheticException: Unit, attachStacktrace: Boolean): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromUnknownInput(
    stackParser: StackParser,
    exception: Any,
    syntheticException: Unit,
    attachStacktrace: Boolean,
    isUnhandledRejection: Boolean
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any], isUnhandledRejection.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromUnknownInput(
    stackParser: StackParser,
    exception: Any,
    syntheticException: Unit,
    attachStacktrace: Unit,
    isUnhandledRejection: Boolean
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any], isUnhandledRejection.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def exceptionFromError(stackParser: StackParser, ex: js.Error): Exception = (^.asInstanceOf[js.Dynamic].applyDynamic("exceptionFromError")(stackParser.asInstanceOf[js.Any], ex.asInstanceOf[js.Any])).asInstanceOf[Exception]
  
  inline def parseStackFrames(stackParser: StackParser, ex: ErrorframesToPopnumberund): js.Array[StackFrame] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStackFrames")(stackParser.asInstanceOf[js.Any], ex.asInstanceOf[js.Any])).asInstanceOf[js.Array[StackFrame]]
}
