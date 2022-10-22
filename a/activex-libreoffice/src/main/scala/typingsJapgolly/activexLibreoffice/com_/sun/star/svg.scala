package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svg {
  
  /** @deprecated Deprecated */
  trait XSVGPrinter
    extends StObject
       with XInterface {
    
    def endJob(): Unit
    
    def printPage(aPrintPage: SeqEquiv[Double]): Unit
    
    def startJob(
      aHandler: XDocumentHandler,
      aJobSetup: SeqEquiv[Double],
      aJobName: String,
      nCopies: Double,
      bCollate: Boolean
    ): Boolean
  }
  object XSVGPrinter {
    
    inline def apply(
      acquire: Callback,
      endJob: Callback,
      printPage: SeqEquiv[Double] => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      startJob: (XDocumentHandler, SeqEquiv[Double], String, Double, Boolean) => Boolean
    ): XSVGPrinter = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, endJob = endJob.toJsFn, printPage = js.Any.fromFunction1((t0: SeqEquiv[Double]) => printPage(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, startJob = js.Any.fromFunction5(startJob))
      __obj.asInstanceOf[XSVGPrinter]
    }
    
    extension [Self <: XSVGPrinter](x: Self) {
      
      inline def setEndJob(value: Callback): Self = StObject.set(x, "endJob", value.toJsFn)
      
      inline def setPrintPage(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "printPage", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
      
      inline def setStartJob(value: (XDocumentHandler, SeqEquiv[Double], String, Double, Boolean) => Boolean): Self = StObject.set(x, "startJob", js.Any.fromFunction5(value))
    }
  }
  
  /** @deprecated Deprecated */
  trait XSVGWriter
    extends StObject
       with XInterface {
    
    def write(aHandler: XDocumentHandler, aMtf: SeqEquiv[Double]): Unit
  }
  object XSVGWriter {
    
    inline def apply(
      acquire: Callback,
      queryInterface: `type` => Any,
      release: Callback,
      write: (XDocumentHandler, SeqEquiv[Double]) => Callback
    ): XSVGWriter = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, write = js.Any.fromFunction2((t0: XDocumentHandler, t1: SeqEquiv[Double]) => (write(t0, t1)).runNow()))
      __obj.asInstanceOf[XSVGWriter]
    }
    
    extension [Self <: XSVGWriter](x: Self) {
      
      inline def setWrite(value: (XDocumentHandler, SeqEquiv[Double]) => Callback): Self = StObject.set(x, "write", js.Any.fromFunction2((t0: XDocumentHandler, t1: SeqEquiv[Double]) => (value(t0, t1)).runNow()))
    }
  }
}
