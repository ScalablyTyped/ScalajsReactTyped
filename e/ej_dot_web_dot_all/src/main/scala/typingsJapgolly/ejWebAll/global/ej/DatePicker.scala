package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.DatePicker")
@js.native
open class DatePicker protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.DatePicker {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object DatePicker {
  
  @JSGlobal("ej.DatePicker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.DatePicker.Header")
  @js.native
  object Header extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.DatePicker.Header & Double] = js.native
    
    /* 2 */ val Min: typingsJapgolly.ejWebAll.ej.DatePicker.Header.Min & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.DatePicker.Header.None & Double = js.native
    
    /* 1 */ val Short: typingsJapgolly.ejWebAll.ej.DatePicker.Header.Short & Double = js.native
  }
  
  @JSGlobal("ej.DatePicker.HighlightSection")
  @js.native
  object HighlightSection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.DatePicker.HighlightSection & Double] = js.native
    
    /* 2 */ val None: typingsJapgolly.ejWebAll.ej.DatePicker.HighlightSection.None & Double = js.native
    
    /* 0 */ val Week: typingsJapgolly.ejWebAll.ej.DatePicker.HighlightSection.Week & Double = js.native
    
    /* 1 */ val WorkDays: typingsJapgolly.ejWebAll.ej.DatePicker.HighlightSection.WorkDays & Double = js.native
  }
  
  @JSGlobal("ej.DatePicker.Level")
  @js.native
  object Level extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.DatePicker.Level & Double] = js.native
    
    /* 2 */ val Century: typingsJapgolly.ejWebAll.ej.DatePicker.Level.Century & Double = js.native
    
    /* 1 */ val Decade: typingsJapgolly.ejWebAll.ej.DatePicker.Level.Decade & Double = js.native
    
    /* 0 */ val Year: typingsJapgolly.ejWebAll.ej.DatePicker.Level.Year & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.DatePicker.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.DatePicker.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.DatePicker = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.DatePicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
