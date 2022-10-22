package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotGrid")
@js.native
open class PivotGrid protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.PivotGrid {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object PivotGrid {
  
  @JSGlobal("ej.PivotGrid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.PivotGrid.Layout")
  @js.native
  object Layout extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PivotGrid.Layout & Double] = js.native
    
    /* 3 */ val ExcelLikeLayout: typingsJapgolly.ejWebAll.ej.PivotGrid.Layout.ExcelLikeLayout & Double = js.native
    
    /* 2 */ val NoSummaries: typingsJapgolly.ejWebAll.ej.PivotGrid.Layout.NoSummaries & Double = js.native
    
    /* 0 */ val Normal: typingsJapgolly.ejWebAll.ej.PivotGrid.Layout.Normal & Double = js.native
    
    /* 1 */ val NormalTopSummary: typingsJapgolly.ejWebAll.ej.PivotGrid.Layout.NormalTopSummary & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotGrid.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.PivotGrid.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.PivotGrid = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.PivotGrid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
