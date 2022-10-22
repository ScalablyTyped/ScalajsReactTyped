package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.FileExplorer")
@js.native
open class FileExplorer protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.FileExplorer {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object FileExplorer {
  
  @JSGlobal("ej.FileExplorer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.FileExplorer.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.FileExplorer.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.FileExplorer = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.FileExplorer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.FileExplorer.layoutType")
  @js.native
  object layoutType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.FileExplorer.layoutType & Double] = js.native
    
    /* 1 */ val Grid: typingsJapgolly.ejWebAll.ej.FileExplorer.layoutType.Grid & Double = js.native
    
    /* 2 */ val LargeIcons: typingsJapgolly.ejWebAll.ej.FileExplorer.layoutType.LargeIcons & Double = js.native
    
    /* 0 */ val Tile: typingsJapgolly.ejWebAll.ej.FileExplorer.layoutType.Tile & Double = js.native
  }
}
