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
  * specifies a component implementing a log handler whose output channel is a file.
  *
  * The handler will use the `Encoding` attribute of {@link XLogHandler} to determine how to encode strings before actually writing them to the output
  * file.
  * @see XLogHandler.Encoding
  * @since OOo 2.3
  */
trait FileHandler
  extends StObject
     with XLogHandler {
  
  /**
    * creates a log handler whose output is directed to a file given by URL.
    * @param FileURL the URL of the file to be created. This URL is resolved using the {@link com.sun.star.util.PathSubstitution} service. That is, it is allo
    */
  def create(FileURL: String): Unit
  
  /**
    * creates an instance of the log handler, using generic settings
    * @param Settings contains the initial settings for the log handler  The following settings are recognized and supported: `Encoding` - denotes the initial
    * @throws com::sun::star::lang::IllegalArgumentException if `Settings` contains settings whose value is of the wrong type.
    */
  def createWithSettings(Settings: SeqEquiv[NamedValue]): Unit
}
object FileHandler {
  
  inline def apply(
    Encoding: String,
    Formatter: XLogFormatter,
    Level: Double,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    create: String => Callback,
    createWithSettings: SeqEquiv[NamedValue] => Callback,
    dispose: Callback,
    flush: Callback,
    publish: LogRecord => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): FileHandler = {
    val __obj = js.Dynamic.literal(Encoding = Encoding.asInstanceOf[js.Any], Formatter = Formatter.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), create = js.Any.fromFunction1((t0: String) => create(t0).runNow()), createWithSettings = js.Any.fromFunction1((t0: SeqEquiv[NamedValue]) => createWithSettings(t0).runNow()), dispose = dispose.toJsFn, flush = flush.toJsFn, publish = js.Any.fromFunction1(publish), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[FileHandler]
  }
  
  extension [Self <: FileHandler](x: Self) {
    
    inline def setCreate(value: String => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setCreateWithSettings(value: SeqEquiv[NamedValue] => Callback): Self = StObject.set(x, "createWithSettings", js.Any.fromFunction1((t0: SeqEquiv[NamedValue]) => value(t0).runNow()))
  }
}
