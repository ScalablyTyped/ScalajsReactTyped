package typingsJapgolly.activexLibreoffice.com_.sun.star.xml

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XActiveDataControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XActiveDataSink
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XActiveDataSource
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XStreamListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xslt {
  
  /**
    * Get XSLT filter transformer supporting XSLT 2.0.
    * @since LibreOffice 4.0
    */
  trait XSLT2Transformer
    extends StObject
       with XXSLTTransformer {
    
    def create(args: SeqEquiv[Any]): Unit
  }
  object XSLT2Transformer {
    
    inline def apply(
      InputStream: XInputStream,
      OutputStream: XOutputStream,
      acquire: Callback,
      addListener: XStreamListener => Callback,
      create: SeqEquiv[Any] => Callback,
      getInputStream: CallbackTo[XInputStream],
      getOutputStream: CallbackTo[XOutputStream],
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeListener: XStreamListener => Callback,
      setInputStream: XInputStream => Callback,
      setOutputStream: XOutputStream => Callback,
      start: Callback,
      terminate: Callback
    ): XSLT2Transformer = {
      val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, addListener = js.Any.fromFunction1((t0: XStreamListener) => addListener(t0).runNow()), create = js.Any.fromFunction1((t0: SeqEquiv[Any]) => create(t0).runNow()), getInputStream = getInputStream.toJsFn, getOutputStream = getOutputStream.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeListener = js.Any.fromFunction1((t0: XStreamListener) => removeListener(t0).runNow()), setInputStream = js.Any.fromFunction1((t0: XInputStream) => setInputStream(t0).runNow()), setOutputStream = js.Any.fromFunction1((t0: XOutputStream) => setOutputStream(t0).runNow()), start = start.toJsFn, terminate = terminate.toJsFn)
      __obj.asInstanceOf[XSLT2Transformer]
    }
    
    extension [Self <: XSLT2Transformer](x: Self) {
      
      inline def setCreate(value: SeqEquiv[Any] => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: SeqEquiv[Any]) => value(t0).runNow()))
    }
  }
  
  /**
    * Get unspecified XSLT filter transformer.
    *
    * It is not safe to expect support for any features except XSLT 1.0 .
    * @since LibreOffice 4.0
    */
  trait XSLTTransformer
    extends StObject
       with XXSLTTransformer {
    
    def create(args: SeqEquiv[Any]): Unit
  }
  object XSLTTransformer {
    
    inline def apply(
      InputStream: XInputStream,
      OutputStream: XOutputStream,
      acquire: Callback,
      addListener: XStreamListener => Callback,
      create: SeqEquiv[Any] => Callback,
      getInputStream: CallbackTo[XInputStream],
      getOutputStream: CallbackTo[XOutputStream],
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeListener: XStreamListener => Callback,
      setInputStream: XInputStream => Callback,
      setOutputStream: XOutputStream => Callback,
      start: Callback,
      terminate: Callback
    ): XSLTTransformer = {
      val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, addListener = js.Any.fromFunction1((t0: XStreamListener) => addListener(t0).runNow()), create = js.Any.fromFunction1((t0: SeqEquiv[Any]) => create(t0).runNow()), getInputStream = getInputStream.toJsFn, getOutputStream = getOutputStream.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeListener = js.Any.fromFunction1((t0: XStreamListener) => removeListener(t0).runNow()), setInputStream = js.Any.fromFunction1((t0: XInputStream) => setInputStream(t0).runNow()), setOutputStream = js.Any.fromFunction1((t0: XOutputStream) => setOutputStream(t0).runNow()), start = start.toJsFn, terminate = terminate.toJsFn)
      __obj.asInstanceOf[XSLTTransformer]
    }
    
    extension [Self <: XSLTTransformer](x: Self) {
      
      inline def setCreate(value: SeqEquiv[Any] => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: SeqEquiv[Any]) => value(t0).runNow()))
    }
  }
  
  /**
    * An interface for XSLT transformers.
    * @since LibreOffice 4.0
    */
  trait XXSLTTransformer
    extends StObject
       with XActiveDataControl
       with XActiveDataSink
       with XActiveDataSource
       with XInitialization
  object XXSLTTransformer {
    
    inline def apply(
      InputStream: XInputStream,
      OutputStream: XOutputStream,
      acquire: Callback,
      addListener: XStreamListener => Callback,
      getInputStream: CallbackTo[XInputStream],
      getOutputStream: CallbackTo[XOutputStream],
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeListener: XStreamListener => Callback,
      setInputStream: XInputStream => Callback,
      setOutputStream: XOutputStream => Callback,
      start: Callback,
      terminate: Callback
    ): XXSLTTransformer = {
      val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, addListener = js.Any.fromFunction1((t0: XStreamListener) => addListener(t0).runNow()), getInputStream = getInputStream.toJsFn, getOutputStream = getOutputStream.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeListener = js.Any.fromFunction1((t0: XStreamListener) => removeListener(t0).runNow()), setInputStream = js.Any.fromFunction1((t0: XInputStream) => setInputStream(t0).runNow()), setOutputStream = js.Any.fromFunction1((t0: XOutputStream) => setOutputStream(t0).runNow()), start = start.toJsFn, terminate = terminate.toJsFn)
      __obj.asInstanceOf[XXSLTTransformer]
    }
  }
}
