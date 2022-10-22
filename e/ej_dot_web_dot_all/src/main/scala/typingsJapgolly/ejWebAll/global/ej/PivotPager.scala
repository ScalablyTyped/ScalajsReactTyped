package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotPager")
@js.native
open class PivotPager protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.PivotPager {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object PivotPager {
  
  @JSGlobal("ej.PivotPager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.PivotPager.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.PivotPager.Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PivotPager.Mode & Double] = js.native
    
    /* 0 */ val Both: typingsJapgolly.ejWebAll.ej.PivotPager.Mode.Both & Double = js.native
    
    /* 1 */ val Categorical: typingsJapgolly.ejWebAll.ej.PivotPager.Mode.Categorical & Double = js.native
    
    /* 2 */ val Series: typingsJapgolly.ejWebAll.ej.PivotPager.Mode.Series & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotPager.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.PivotPager = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.PivotPager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
