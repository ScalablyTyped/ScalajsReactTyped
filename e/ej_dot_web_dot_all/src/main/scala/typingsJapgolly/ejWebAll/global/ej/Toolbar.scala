package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Toolbar")
@js.native
open class Toolbar protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Toolbar {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Toolbar {
  
  @JSGlobal("ej.Toolbar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Toolbar.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Toolbar.ResponsiveType")
  @js.native
  object ResponsiveType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Toolbar.ResponsiveType & Double] = js.native
    
    /* 1 */ val Inline: typingsJapgolly.ejWebAll.ej.Toolbar.ResponsiveType.Inline & Double = js.native
    
    /* 0 */ val Popup: typingsJapgolly.ejWebAll.ej.Toolbar.ResponsiveType.Popup & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Toolbar.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Toolbar = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Toolbar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
