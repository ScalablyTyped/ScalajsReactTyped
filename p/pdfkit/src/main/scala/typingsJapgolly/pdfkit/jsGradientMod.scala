package typingsJapgolly.pdfkit

import typingsJapgolly.pdfkit.PDFKit.PDFRadialGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsGradientMod {
  
  @JSImport("pdfkit/js/gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/gradient", "PDFGradient")
  @js.native
  open class PDFGradient protected ()
    extends StObject
       with typingsJapgolly.pdfkit.PDFKit.PDFGradient {
    def this(document: Any) = this()
  }
  @JSImport("pdfkit/js/gradient", "PDFGradient")
  @js.native
  def PDFGradient: typingsJapgolly.pdfkit.PDFKit.PDFGradient = js.native
  inline def PDFGradient_=(x: typingsJapgolly.pdfkit.PDFKit.PDFGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDFGradient")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/gradient", "PDFLinearGradient")
  @js.native
  open class PDFLinearGradient protected ()
    extends StObject
       with typingsJapgolly.pdfkit.PDFKit.PDFLinearGradient {
    def this(document: Any, x1: Double, y1: Double, x2: Double, y2: Double) = this()
  }
  @JSImport("pdfkit/js/gradient", "PDFLinearGradient")
  @js.native
  def PDFLinearGradient: typingsJapgolly.pdfkit.PDFKit.PDFLinearGradient = js.native
  inline def PDFLinearGradient_=(x: typingsJapgolly.pdfkit.PDFKit.PDFLinearGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDFLinearGradient")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/gradient", "PDFRadialGradiant")
  @js.native
  open class PDFRadialGradiant protected ()
    extends StObject
       with PDFRadialGradient {
    def this(document: Any, x1: Double, y1: Double, x2: Double, y2: Double) = this()
  }
  @JSImport("pdfkit/js/gradient", "PDFRadialGradiant")
  @js.native
  def PDFRadialGradiant: PDFRadialGradient = js.native
  inline def PDFRadialGradiant_=(x: PDFRadialGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDFRadialGradiant")(x.asInstanceOf[js.Any])
}
