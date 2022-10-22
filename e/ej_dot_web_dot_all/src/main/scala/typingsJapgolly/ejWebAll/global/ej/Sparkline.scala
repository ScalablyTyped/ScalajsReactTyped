package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Sparkline")
@js.native
open class Sparkline protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Sparkline {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Sparkline {
  
  @JSGlobal("ej.Sparkline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Sparkline.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Sparkline.FontStyle & Double] = js.native
    
    /* 1 */ val Italic: typingsJapgolly.ejWebAll.ej.Sparkline.FontStyle.Italic & Double = js.native
    
    /* 0 */ val Normal: typingsJapgolly.ejWebAll.ej.Sparkline.FontStyle.Normal & Double = js.native
  }
  
  @JSGlobal("ej.Sparkline.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Sparkline.FontWeight & Double] = js.native
    
    /* 1 */ val Bold: typingsJapgolly.ejWebAll.ej.Sparkline.FontWeight.Bold & Double = js.native
    
    /* 2 */ val Lighter: typingsJapgolly.ejWebAll.ej.Sparkline.FontWeight.Lighter & Double = js.native
    
    /* 0 */ val Regular: typingsJapgolly.ejWebAll.ej.Sparkline.FontWeight.Regular & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Sparkline.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Sparkline.Theme")
  @js.native
  object Theme extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Sparkline.Theme & Double] = js.native
    
    /* 0 */ val Azure: typingsJapgolly.ejWebAll.ej.Sparkline.Theme.Azure & Double = js.native
    
    /* 3 */ val Azuredark: typingsJapgolly.ejWebAll.ej.Sparkline.Theme.Azuredark & Double = js.native
    
    /* 2 */ val FlatDark: typingsJapgolly.ejWebAll.ej.Sparkline.Theme.FlatDark & Double = js.native
    
    /* 1 */ val FlatLight: typingsJapgolly.ejWebAll.ej.Sparkline.Theme.FlatLight & Double = js.native
    
    /* 9 */ val GradientDark: typingsJapgolly.ejWebAll.ej.Sparkline.Theme.GradientDark & Double = js.native
    
    /* 8 */ val GradientLight: typingsJapgolly.ejWebAll.ej.Sparkline.Theme.GradientLight & Double = js.native
    
    /* 4 */ val Lime: typingsJapgolly.ejWebAll.ej.Sparkline.Theme.Lime & Double = js.native
    
    /* 5 */ val LimeDark: typingsJapgolly.ejWebAll.ej.Sparkline.Theme.LimeDark & Double = js.native
    
    /* 6 */ val Saffron: typingsJapgolly.ejWebAll.ej.Sparkline.Theme.Saffron & Double = js.native
    
    /* 7 */ val SaffronDark: typingsJapgolly.ejWebAll.ej.Sparkline.Theme.SaffronDark & Double = js.native
  }
  
  @JSGlobal("ej.Sparkline.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Sparkline.Type & Double] = js.native
    
    /* 0 */ val Area: typingsJapgolly.ejWebAll.ej.Sparkline.Type.Area & Double = js.native
    
    /* 2 */ val Column: typingsJapgolly.ejWebAll.ej.Sparkline.Type.Column & Double = js.native
    
    /* 1 */ val Line: typingsJapgolly.ejWebAll.ej.Sparkline.Type.Line & Double = js.native
    
    /* 3 */ val Pie: typingsJapgolly.ejWebAll.ej.Sparkline.Type.Pie & Double = js.native
    
    /* 4 */ val WinLoss: typingsJapgolly.ejWebAll.ej.Sparkline.Type.WinLoss & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Sparkline.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Sparkline = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Sparkline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
