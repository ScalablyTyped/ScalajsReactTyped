package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Resizable")
@js.native
open class Resizable protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Resizable {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Resizable {
  
  @JSGlobal("ej.Resizable")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Resizable.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.Resizable.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Resizable = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Resizable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
