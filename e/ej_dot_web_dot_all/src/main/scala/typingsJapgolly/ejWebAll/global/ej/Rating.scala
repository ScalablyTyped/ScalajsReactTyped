package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Rating")
@js.native
open class Rating protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Rating {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Rating {
  
  @JSGlobal("ej.Rating")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Rating.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Rating.Precision")
  @js.native
  object Precision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Rating.Precision & Double] = js.native
    
    /* 0 */ val Exact: typingsJapgolly.ejWebAll.ej.Rating.Precision.Exact & Double = js.native
    
    /* 1 */ val Full: typingsJapgolly.ejWebAll.ej.Rating.Precision.Full & Double = js.native
    
    /* 2 */ val Half: typingsJapgolly.ejWebAll.ej.Rating.Precision.Half & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Rating.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Rating = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Rating): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
