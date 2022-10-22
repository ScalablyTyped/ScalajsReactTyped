package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Autocomplete")
@js.native
open class Autocomplete protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Autocomplete {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Autocomplete {
  
  @JSGlobal("ej.Autocomplete")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Autocomplete.Animation")
  @js.native
  object Animation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Autocomplete.Animation & Double] = js.native
    
    /* 2 */ val Fade: typingsJapgolly.ejWebAll.ej.Autocomplete.Animation.Fade & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.Autocomplete.Animation.None & Double = js.native
    
    /* 1 */ val Slide: typingsJapgolly.ejWebAll.ej.Autocomplete.Animation.Slide & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Autocomplete.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Autocomplete.MultiSelectMode")
  @js.native
  object MultiSelectMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Autocomplete.MultiSelectMode & Double] = js.native
    
    /* 0 */ val Delimiter: typingsJapgolly.ejWebAll.ej.Autocomplete.MultiSelectMode.Delimiter & Double = js.native
    
    /* 1 */ val VisualMode: typingsJapgolly.ejWebAll.ej.Autocomplete.MultiSelectMode.VisualMode & Double = js.native
  }
  
  @JSGlobal("ej.Autocomplete.SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Autocomplete.SortOrder & Double] = js.native
    
    /* 0 */ val Ascending: typingsJapgolly.ejWebAll.ej.Autocomplete.SortOrder.Ascending & Double = js.native
    
    /* 1 */ val Descending: typingsJapgolly.ejWebAll.ej.Autocomplete.SortOrder.Descending & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Autocomplete.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Autocomplete = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Autocomplete): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
