package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Signature")
@js.native
open class Signature protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Signature {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Signature {
  
  @JSGlobal("ej.Signature")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Signature.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Signature.SaveImageFormat")
  @js.native
  object SaveImageFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Signature.SaveImageFormat & Double] = js.native
    
    /* 2 */ val BMP: typingsJapgolly.ejWebAll.ej.Signature.SaveImageFormat.BMP & Double = js.native
    
    /* 1 */ val JPG: typingsJapgolly.ejWebAll.ej.Signature.SaveImageFormat.JPG & Double = js.native
    
    /* 0 */ val PNG: typingsJapgolly.ejWebAll.ej.Signature.SaveImageFormat.PNG & Double = js.native
    
    /* 3 */ val TIFF: typingsJapgolly.ejWebAll.ej.Signature.SaveImageFormat.TIFF & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Signature.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Signature = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Signature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
