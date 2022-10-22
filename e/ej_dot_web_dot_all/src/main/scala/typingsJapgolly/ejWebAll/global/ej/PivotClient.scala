package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotClient")
@js.native
open class PivotClient protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.PivotClient {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object PivotClient {
  
  @JSGlobal("ej.PivotClient")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.PivotClient.ClientExportMode")
  @js.native
  object ClientExportMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PivotClient.ClientExportMode & Double] = js.native
    
    /* 0 */ val ChartAndGrid: typingsJapgolly.ejWebAll.ej.PivotClient.ClientExportMode.ChartAndGrid & Double = js.native
    
    /* 1 */ val ChartOnly: typingsJapgolly.ejWebAll.ej.PivotClient.ClientExportMode.ChartOnly & Double = js.native
    
    /* 2 */ val GridOnly: typingsJapgolly.ejWebAll.ej.PivotClient.ClientExportMode.GridOnly & Double = js.native
  }
  
  @JSGlobal("ej.PivotClient.ControlPlacement")
  @js.native
  object ControlPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PivotClient.ControlPlacement & Double] = js.native
    
    /* 0 */ val Tab: typingsJapgolly.ejWebAll.ej.PivotClient.ControlPlacement.Tab & Double = js.native
    
    /* 1 */ val Tile: typingsJapgolly.ejWebAll.ej.PivotClient.ControlPlacement.Tile & Double = js.native
  }
  
  @JSGlobal("ej.PivotClient.DefaultView")
  @js.native
  object DefaultView extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PivotClient.DefaultView & Double] = js.native
    
    /* 0 */ val Chart: typingsJapgolly.ejWebAll.ej.PivotClient.DefaultView.Chart & Double = js.native
    
    /* 1 */ val Grid: typingsJapgolly.ejWebAll.ej.PivotClient.DefaultView.Grid & Double = js.native
  }
  
  @JSGlobal("ej.PivotClient.DisplayMode")
  @js.native
  object DisplayMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PivotClient.DisplayMode & Double] = js.native
    
    /* 2 */ val ChartAndGrid: typingsJapgolly.ejWebAll.ej.PivotClient.DisplayMode.ChartAndGrid & Double = js.native
    
    /* 0 */ val ChartOnly: typingsJapgolly.ejWebAll.ej.PivotClient.DisplayMode.ChartOnly & Double = js.native
    
    /* 1 */ val GridOnly: typingsJapgolly.ejWebAll.ej.PivotClient.DisplayMode.GridOnly & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotClient.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.PivotClient.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.PivotClient = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.PivotClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
