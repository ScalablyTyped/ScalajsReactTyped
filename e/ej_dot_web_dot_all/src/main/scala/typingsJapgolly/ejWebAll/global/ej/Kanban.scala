package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Kanban")
@js.native
open class Kanban protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Kanban {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Kanban {
  
  @JSGlobal("ej.Kanban")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Kanban.EditMode")
  @js.native
  object EditMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Kanban.EditMode & Double] = js.native
    
    /* 0 */ val Dialog: typingsJapgolly.ejWebAll.ej.Kanban.EditMode.Dialog & Double = js.native
    
    /* 1 */ val DialogTemplate: typingsJapgolly.ejWebAll.ej.Kanban.EditMode.DialogTemplate & Double = js.native
    
    /* 2 */ val ExternalForm: typingsJapgolly.ejWebAll.ej.Kanban.EditMode.ExternalForm & Double = js.native
    
    /* 3 */ val ExternalFormTemplate: typingsJapgolly.ejWebAll.ej.Kanban.EditMode.ExternalFormTemplate & Double = js.native
  }
  
  @JSGlobal("ej.Kanban.EditingType")
  @js.native
  object EditingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Kanban.EditingType & Double] = js.native
    
    /* 3 */ val DatePicker: typingsJapgolly.ejWebAll.ej.Kanban.EditingType.DatePicker & Double = js.native
    
    /* 4 */ val DateTimePicker: typingsJapgolly.ejWebAll.ej.Kanban.EditingType.DateTimePicker & Double = js.native
    
    /* 2 */ val Dropdown: typingsJapgolly.ejWebAll.ej.Kanban.EditingType.Dropdown & Double = js.native
    
    /* 1 */ val Numeric: typingsJapgolly.ejWebAll.ej.Kanban.EditingType.Numeric & Double = js.native
    
    /* 6 */ val RTE: typingsJapgolly.ejWebAll.ej.Kanban.EditingType.RTE & Double = js.native
    
    /* 0 */ val String: typingsJapgolly.ejWebAll.ej.Kanban.EditingType.String & Double = js.native
    
    /* 5 */ val TextArea: typingsJapgolly.ejWebAll.ej.Kanban.EditingType.TextArea & Double = js.native
  }
  
  @JSGlobal("ej.Kanban.FormPosition")
  @js.native
  object FormPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Kanban.FormPosition & Double] = js.native
    
    /* 0 */ val Bottom: typingsJapgolly.ejWebAll.ej.Kanban.FormPosition.Bottom & Double = js.native
    
    /* 1 */ val Right: typingsJapgolly.ejWebAll.ej.Kanban.FormPosition.Right & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Kanban.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Kanban.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Kanban.SelectionType & Double] = js.native
    
    /* 1 */ val Multiple: typingsJapgolly.ejWebAll.ej.Kanban.SelectionType.Multiple & Double = js.native
    
    /* 0 */ val Single: typingsJapgolly.ejWebAll.ej.Kanban.SelectionType.Single & Double = js.native
  }
  
  @JSGlobal("ej.Kanban.Target")
  @js.native
  object Target extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Kanban.Target & Double] = js.native
    
    /* 3 */ val All: typingsJapgolly.ejWebAll.ej.Kanban.Target.All & Double = js.native
    
    /* 2 */ val Card: typingsJapgolly.ejWebAll.ej.Kanban.Target.Card & Double = js.native
    
    /* 1 */ val Content: typingsJapgolly.ejWebAll.ej.Kanban.Target.Content & Double = js.native
    
    /* 0 */ val Header: typingsJapgolly.ejWebAll.ej.Kanban.Target.Header & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Kanban.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Kanban = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Kanban): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
