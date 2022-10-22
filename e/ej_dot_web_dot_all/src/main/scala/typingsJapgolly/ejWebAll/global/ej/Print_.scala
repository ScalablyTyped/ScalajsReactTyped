package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import typingsJapgolly.ejWebAll.ej.Print
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Print")
@js.native
open class Print_ protected ()
  extends StObject
     with Print {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Print_ {
  
  @JSGlobal("ej.Print")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Print.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.Print.fn")
  @js.native
  def fn: Print = js.native
  inline def fn_=(x: Print): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
