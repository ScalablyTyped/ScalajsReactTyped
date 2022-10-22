package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Ribbon")
@js.native
open class Ribbon protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Ribbon {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Ribbon {
  
  @JSGlobal("ej.Ribbon")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Ribbon.AlignType")
  @js.native
  object AlignType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Ribbon.AlignType & Double] = js.native
    
    /* 1 */ val Columns: typingsJapgolly.ejWebAll.ej.Ribbon.AlignType.Columns & Double = js.native
    
    /* 0 */ val Rows: typingsJapgolly.ejWebAll.ej.Ribbon.AlignType.Rows & Double = js.native
  }
  
  @JSGlobal("ej.Ribbon.ApplicationTabType")
  @js.native
  object ApplicationTabType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Ribbon.ApplicationTabType & Double] = js.native
    
    /* 1 */ val Backstage: typingsJapgolly.ejWebAll.ej.Ribbon.ApplicationTabType.Backstage & Double = js.native
    
    /* 0 */ val Menu: typingsJapgolly.ejWebAll.ej.Ribbon.ApplicationTabType.Menu & Double = js.native
  }
  
  @JSGlobal("ej.Ribbon.CustomItemType")
  @js.native
  object CustomItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Ribbon.CustomItemType & Double] = js.native
    
    /* 0 */ val Button: typingsJapgolly.ejWebAll.ej.Ribbon.CustomItemType.Button & Double = js.native
    
    /* 1 */ val Menu: typingsJapgolly.ejWebAll.ej.Ribbon.CustomItemType.Menu & Double = js.native
  }
  
  @JSGlobal("ej.Ribbon.ItemType")
  @js.native
  object ItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Ribbon.ItemType & Double] = js.native
    
    /* 0 */ val Button: typingsJapgolly.ejWebAll.ej.Ribbon.ItemType.Button & Double = js.native
    
    /* 1 */ val Tab: typingsJapgolly.ejWebAll.ej.Ribbon.ItemType.Tab & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Ribbon.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Ribbon.QuickAccessMode")
  @js.native
  object QuickAccessMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Ribbon.QuickAccessMode & Double] = js.native
    
    /* 2 */ val Menu: typingsJapgolly.ejWebAll.ej.Ribbon.QuickAccessMode.Menu & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.Ribbon.QuickAccessMode.None & Double = js.native
    
    /* 1 */ val ToolBar: typingsJapgolly.ejWebAll.ej.Ribbon.QuickAccessMode.ToolBar & Double = js.native
  }
  
  @JSGlobal("ej.Ribbon.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Ribbon.Type & Double] = js.native
    
    /* 0 */ val Button: typingsJapgolly.ejWebAll.ej.Ribbon.Type.Button & Double = js.native
    
    /* 3 */ val Custom: typingsJapgolly.ejWebAll.ej.Ribbon.Type.Custom & Double = js.native
    
    /* 2 */ val DropDownList: typingsJapgolly.ejWebAll.ej.Ribbon.Type.DropDownList & Double = js.native
    
    /* 5 */ val Gallery: typingsJapgolly.ejWebAll.ej.Ribbon.Type.Gallery & Double = js.native
    
    /* 1 */ val SplitButton: typingsJapgolly.ejWebAll.ej.Ribbon.Type.SplitButton & Double = js.native
    
    /* 4 */ val ToggleButton: typingsJapgolly.ejWebAll.ej.Ribbon.Type.ToggleButton & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Ribbon.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Ribbon = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Ribbon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
