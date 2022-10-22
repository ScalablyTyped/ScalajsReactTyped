package typingsJapgolly.activexLibreoffice.com_.sun.star.logging

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a component implementing a log handler whose output channel is the processes console.
  * @since OOo 2.3
  */
trait ConsoleHandler
  extends StObject
     with XConsoleHandler {
  
  def create(): Unit
  
  /**
    * creates an instance of the log handler, using generic settings
    * @param Settings contains the initial settings for the log handler  The following settings are recognized and supported: `Encoding` - denotes the initial
    * @throws com::sun::star::lang::IllegalArgumentException if `Settings` contains arguments with names other than in the list above, or settings whose value
    */
  def createWithSettings(Settings: SeqEquiv[NamedValue]): Unit
}
object ConsoleHandler {
  
  inline def apply(
    Encoding: String,
    Formatter: XLogFormatter,
    Level: Double,
    Threshold: Double,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    create: Callback,
    createWithSettings: SeqEquiv[NamedValue] => Callback,
    dispose: Callback,
    flush: Callback,
    publish: LogRecord => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): ConsoleHandler = {
    val __obj = js.Dynamic.literal(Encoding = Encoding.asInstanceOf[js.Any], Formatter = Formatter.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), create = create.toJsFn, createWithSettings = js.Any.fromFunction1((t0: SeqEquiv[NamedValue]) => createWithSettings(t0).runNow()), dispose = dispose.toJsFn, flush = flush.toJsFn, publish = js.Any.fromFunction1(publish), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[ConsoleHandler]
  }
  
  extension [Self <: ConsoleHandler](x: Self) {
    
    inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setCreateWithSettings(value: SeqEquiv[NamedValue] => Callback): Self = StObject.set(x, "createWithSettings", js.Any.fromFunction1((t0: SeqEquiv[NamedValue]) => value(t0).runNow()))
  }
}
