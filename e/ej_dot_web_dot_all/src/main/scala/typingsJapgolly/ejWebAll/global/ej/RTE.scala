package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.RTE")
@js.native
open class RTE protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.RTE {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object RTE {
  
  @JSGlobal("ej.RTE")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.RTE.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.RTE.ToolbarOverflowMode")
  @js.native
  object ToolbarOverflowMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.RTE.ToolbarOverflowMode & Double] = js.native
    
    /* 1 */ val Inline: typingsJapgolly.ejWebAll.ej.RTE.ToolbarOverflowMode.Inline & Double = js.native
    
    /* 0 */ val Popup: typingsJapgolly.ejWebAll.ej.RTE.ToolbarOverflowMode.Popup & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.RTE.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.RTE = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.RTE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
