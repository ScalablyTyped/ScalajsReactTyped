package typingsJapgolly.ejWebAll.global.ej.datavisualization

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import typingsJapgolly.ejWebAll.ej.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.Barcode")
@js.native
open class Barcode protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.datavisualization.Barcode {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: Model) = this()
  def this(element: JQuery, options: Model) = this()
}
object Barcode {
  
  @JSGlobal("ej.datavisualization.Barcode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.datavisualization.Barcode.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.Barcode.SymbologyType")
  @js.native
  object SymbologyType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType & Double] = js.native
    
    /* 5 */ val Codabar: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Codabar & Double = js.native
    
    /* 4 */ val Code11: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code11 & Double = js.native
    
    /* 9 */ val Code128A: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code128A & Double = js.native
    
    /* 10 */ val Code128B: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code128B & Double = js.native
    
    /* 11 */ val Code128C: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code128C & Double = js.native
    
    /* 6 */ val Code32: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code32 & Double = js.native
    
    /* 2 */ val Code39: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code39 & Double = js.native
    
    /* 3 */ val Code39Extended: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code39Extended & Double = js.native
    
    /* 7 */ val Code93: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code93 & Double = js.native
    
    /* 8 */ val Code93Extended: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code93Extended & Double = js.native
    
    /* 1 */ val DataMatrix: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType.DataMatrix & Double = js.native
    
    /* 0 */ val QRBarcode: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode.SymbologyType.QRBarcode & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.Barcode.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.datavisualization.Barcode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
