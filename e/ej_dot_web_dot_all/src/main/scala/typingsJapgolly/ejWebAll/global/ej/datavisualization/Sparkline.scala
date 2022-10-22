package typingsJapgolly.ejWebAll.global.ej.datavisualization

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import typingsJapgolly.ejWebAll.ej.Sparkline.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.Sparkline")
@js.native
open class Sparkline protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: Model) = this()
  def this(element: JQuery, options: Model) = this()
}
object Sparkline {
  
  @JSGlobal("ej.datavisualization.Sparkline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.datavisualization.Sparkline.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.FontStyle & Double] = js.native
    
    /* 1 */ val Italic: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.FontStyle.Italic & Double = js.native
    
    /* 0 */ val Normal: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.FontStyle.Normal & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Sparkline.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.FontWeight & Double] = js.native
    
    /* 1 */ val Bold: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.FontWeight.Bold & Double = js.native
    
    /* 2 */ val Lighter: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.FontWeight.Lighter & Double = js.native
    
    /* 0 */ val Regular: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.FontWeight.Regular & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.Sparkline.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.Sparkline.Theme")
  @js.native
  object Theme extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Theme & Double] = js.native
    
    /* 0 */ val Azure: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Theme.Azure & Double = js.native
    
    /* 3 */ val Azuredark: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Theme.Azuredark & Double = js.native
    
    /* 2 */ val FlatDark: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Theme.FlatDark & Double = js.native
    
    /* 1 */ val FlatLight: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Theme.FlatLight & Double = js.native
    
    /* 9 */ val GradientDark: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Theme.GradientDark & Double = js.native
    
    /* 8 */ val GradientLight: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Theme.GradientLight & Double = js.native
    
    /* 4 */ val Lime: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Theme.Lime & Double = js.native
    
    /* 5 */ val LimeDark: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Theme.LimeDark & Double = js.native
    
    /* 6 */ val Saffron: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Theme.Saffron & Double = js.native
    
    /* 7 */ val SaffronDark: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Theme.SaffronDark & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Sparkline.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Type & Double] = js.native
    
    /* 0 */ val Area: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Type.Area & Double = js.native
    
    /* 2 */ val Column: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Type.Column & Double = js.native
    
    /* 1 */ val Line: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Type.Line & Double = js.native
    
    /* 3 */ val Pie: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Type.Pie & Double = js.native
    
    /* 4 */ val WinLoss: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.Type.WinLoss & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.Sparkline.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
