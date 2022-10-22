package typingsJapgolly.materializeCss.global.M

import org.scalajs.dom.Element
import typingsJapgolly.materializeCss.M.DropdownOptions
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.anon.PartialDropdownOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Dropdown")
@js.native
open class Dropdown ()
  extends StObject
     with typingsJapgolly.materializeCss.M.Dropdown {
  
  /**
    * Close dropdown
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The DOM element of the dropdown
    */
  /* CompleteClass */
  var dropdownEl: Element = js.native
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * The index of the item focused
    */
  /* CompleteClass */
  var focusedIndex: Double = js.native
  
  /**
    * ID of the dropdown element
    */
  /* CompleteClass */
  var id: String = js.native
  
  /**
    * If the dropdown is open
    */
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /**
    * If the dropdown content is scrollable
    */
  /* CompleteClass */
  var isScrollable: Boolean = js.native
  
  /**
    * Open dropdown
    */
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: DropdownOptions = js.native
  
  /**
    * While dropdown is open, you can recalculate its dimensions if its contents have changed
    */
  /* CompleteClass */
  override def recalculateDimensions(): Unit = js.native
}
object Dropdown {
  
  @JSGlobal("M.Dropdown")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Dropdown = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializeCss.M.Dropdown]
  
  /**
    * Init Dropdown
    */
  /* static member */
  inline def init(els: Element): typingsJapgolly.materializeCss.M.Dropdown = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializeCss.M.Dropdown]
  inline def init(els: Element, options: PartialDropdownOptions): typingsJapgolly.materializeCss.M.Dropdown = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.materializeCss.M.Dropdown]
  /**
    * Init Dropdowns
    */
  /* static member */
  inline def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Dropdown] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.materializeCss.M.Dropdown]]
  inline def init(els: MElements, options: PartialDropdownOptions): js.Array[typingsJapgolly.materializeCss.M.Dropdown] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.materializeCss.M.Dropdown]]
}
