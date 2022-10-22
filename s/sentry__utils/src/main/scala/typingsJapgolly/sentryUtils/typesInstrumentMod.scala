package typingsJapgolly.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInstrumentMod {
  
  @JSImport("@sentry/utils/types/instrument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addInstrumentationHandler(`type`: InstrumentHandlerType, callback: InstrumentHandlerCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addInstrumentationHandler")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type InstrumentHandlerCallback = js.Function1[/* data */ Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.console
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.dom
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.fetch
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.history
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.sentry
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.xhr
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.error
    - typingsJapgolly.sentryUtils.sentryUtilsStrings.unhandledrejection
  */
  trait InstrumentHandlerType extends StObject
  object InstrumentHandlerType {
    
    inline def console: typingsJapgolly.sentryUtils.sentryUtilsStrings.console = "console".asInstanceOf[typingsJapgolly.sentryUtils.sentryUtilsStrings.console]
    
    inline def dom: typingsJapgolly.sentryUtils.sentryUtilsStrings.dom = "dom".asInstanceOf[typingsJapgolly.sentryUtils.sentryUtilsStrings.dom]
    
    inline def error: typingsJapgolly.sentryUtils.sentryUtilsStrings.error = "error".asInstanceOf[typingsJapgolly.sentryUtils.sentryUtilsStrings.error]
    
    inline def fetch: typingsJapgolly.sentryUtils.sentryUtilsStrings.fetch = "fetch".asInstanceOf[typingsJapgolly.sentryUtils.sentryUtilsStrings.fetch]
    
    inline def history: typingsJapgolly.sentryUtils.sentryUtilsStrings.history = "history".asInstanceOf[typingsJapgolly.sentryUtils.sentryUtilsStrings.history]
    
    inline def sentry: typingsJapgolly.sentryUtils.sentryUtilsStrings.sentry = "sentry".asInstanceOf[typingsJapgolly.sentryUtils.sentryUtilsStrings.sentry]
    
    inline def unhandledrejection: typingsJapgolly.sentryUtils.sentryUtilsStrings.unhandledrejection = "unhandledrejection".asInstanceOf[typingsJapgolly.sentryUtils.sentryUtilsStrings.unhandledrejection]
    
    inline def xhr: typingsJapgolly.sentryUtils.sentryUtilsStrings.xhr = "xhr".asInstanceOf[typingsJapgolly.sentryUtils.sentryUtilsStrings.xhr]
  }
}
