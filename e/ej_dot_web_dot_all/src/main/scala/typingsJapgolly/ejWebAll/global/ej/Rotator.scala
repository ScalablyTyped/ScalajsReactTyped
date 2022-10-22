package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Rotator")
@js.native
open class Rotator protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Rotator {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Rotator {
  
  @JSGlobal("ej.Rotator")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Rotator.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Rotator.PagerPosition")
  @js.native
  object PagerPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Rotator.PagerPosition & Double] = js.native
    
    /* 0 */ val BottomLeft: typingsJapgolly.ejWebAll.ej.Rotator.PagerPosition.BottomLeft & Double = js.native
    
    /* 1 */ val BottomRight: typingsJapgolly.ejWebAll.ej.Rotator.PagerPosition.BottomRight & Double = js.native
    
    /* 2 */ val Outside: typingsJapgolly.ejWebAll.ej.Rotator.PagerPosition.Outside & Double = js.native
    
    /* 3 */ val TopCenter: typingsJapgolly.ejWebAll.ej.Rotator.PagerPosition.TopCenter & Double = js.native
    
    /* 4 */ val TopLeft: typingsJapgolly.ejWebAll.ej.Rotator.PagerPosition.TopLeft & Double = js.native
    
    /* 5 */ val TopRight: typingsJapgolly.ejWebAll.ej.Rotator.PagerPosition.TopRight & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Rotator.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Rotator = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Rotator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
