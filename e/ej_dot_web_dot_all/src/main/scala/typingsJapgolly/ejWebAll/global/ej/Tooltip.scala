package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Tooltip")
@js.native
open class Tooltip protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Tooltip {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Tooltip {
  
  @JSGlobal("ej.Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Tooltip.Associate")
  @js.native
  object Associate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Tooltip.Associate & Double] = js.native
    
    /* 3 */ val Axis: typingsJapgolly.ejWebAll.ej.Tooltip.Associate.Axis & Double = js.native
    
    /* 2 */ val MouseEnter: typingsJapgolly.ejWebAll.ej.Tooltip.Associate.MouseEnter & Double = js.native
    
    /* 1 */ val MouseFollow: typingsJapgolly.ejWebAll.ej.Tooltip.Associate.MouseFollow & Double = js.native
    
    /* 0 */ val Target: typingsJapgolly.ejWebAll.ej.Tooltip.Associate.Target & Double = js.native
    
    /* 4 */ val Window: typingsJapgolly.ejWebAll.ej.Tooltip.Associate.Window & Double = js.native
  }
  
  @JSGlobal("ej.Tooltip.CloseMode")
  @js.native
  object CloseMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Tooltip.CloseMode & Double] = js.native
    
    /* 1 */ val Auto: typingsJapgolly.ejWebAll.ej.Tooltip.CloseMode.Auto & Double = js.native
    
    /* 2 */ val None: typingsJapgolly.ejWebAll.ej.Tooltip.CloseMode.None & Double = js.native
    
    /* 0 */ val Sticky: typingsJapgolly.ejWebAll.ej.Tooltip.CloseMode.Sticky & Double = js.native
  }
  
  @JSGlobal("ej.Tooltip.Collision")
  @js.native
  object Collision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Tooltip.Collision & Double] = js.native
    
    /* 1 */ val Fit: typingsJapgolly.ejWebAll.ej.Tooltip.Collision.Fit & Double = js.native
    
    /* 0 */ val Flip: typingsJapgolly.ejWebAll.ej.Tooltip.Collision.Flip & Double = js.native
    
    /* 2 */ val FlipFit: typingsJapgolly.ejWebAll.ej.Tooltip.Collision.FlipFit & Double = js.native
    
    /* 3 */ val None: typingsJapgolly.ejWebAll.ej.Tooltip.Collision.None & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tooltip.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Tooltip.Trigger")
  @js.native
  object Trigger extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Tooltip.Trigger & Double] = js.native
    
    /* 0 */ val Click: typingsJapgolly.ejWebAll.ej.Tooltip.Trigger.Click & Double = js.native
    
    /* 2 */ val Focus: typingsJapgolly.ejWebAll.ej.Tooltip.Trigger.Focus & Double = js.native
    
    /* 1 */ val Hover: typingsJapgolly.ejWebAll.ej.Tooltip.Trigger.Hover & Double = js.native
  }
  
  @JSGlobal("ej.Tooltip.effect")
  @js.native
  object effect extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Tooltip.effect & Double] = js.native
    
    /* 2 */ val Fade: typingsJapgolly.ejWebAll.ej.Tooltip.effect.Fade & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.Tooltip.effect.None & Double = js.native
    
    /* 1 */ val Slide: typingsJapgolly.ejWebAll.ej.Tooltip.effect.Slide & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tooltip.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Tooltip = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Tooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
