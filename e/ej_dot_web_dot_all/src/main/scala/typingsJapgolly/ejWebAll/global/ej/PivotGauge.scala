package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotGauge")
@js.native
open class PivotGauge protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.PivotGauge {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object PivotGauge {
  
  @JSGlobal("ej.PivotGauge")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.PivotGauge.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.PivotGauge.NumberFormat")
  @js.native
  object NumberFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PivotGauge.NumberFormat & Double] = js.native
    
    /* 1 */ val Currency: typingsJapgolly.ejWebAll.ej.PivotGauge.NumberFormat.Currency & Double = js.native
    
    /* 0 */ val Default: typingsJapgolly.ejWebAll.ej.PivotGauge.NumberFormat.Default & Double = js.native
    
    /* 3 */ val Fraction: typingsJapgolly.ejWebAll.ej.PivotGauge.NumberFormat.Fraction & Double = js.native
    
    /* 6 */ val Notation: typingsJapgolly.ejWebAll.ej.PivotGauge.NumberFormat.Notation & Double = js.native
    
    /* 2 */ val Percentage: typingsJapgolly.ejWebAll.ej.PivotGauge.NumberFormat.Percentage & Double = js.native
    
    /* 4 */ val Scientific: typingsJapgolly.ejWebAll.ej.PivotGauge.NumberFormat.Scientific & Double = js.native
    
    /* 5 */ val Text: typingsJapgolly.ejWebAll.ej.PivotGauge.NumberFormat.Text & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotGauge.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.PivotGauge = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.PivotGauge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
