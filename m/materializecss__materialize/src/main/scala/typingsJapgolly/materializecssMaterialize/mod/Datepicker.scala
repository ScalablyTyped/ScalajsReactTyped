package typingsJapgolly.materializecssMaterialize.mod

import org.scalajs.dom.Element
import typingsJapgolly.materializecssMaterialize.M.DatepickerOptions
import typingsJapgolly.materializecssMaterialize.MElements
import typingsJapgolly.materializecssMaterialize.anon.PartialDatepickerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "Datepicker")
@js.native
open class Datepicker ()
  extends StObject
     with typingsJapgolly.materializecssMaterialize.M.Datepicker {
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: DatepickerOptions = js.native
}
object Datepicker {
  
  @JSImport("@materializecss/materialize", "Datepicker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typingsJapgolly.materializecssMaterialize.M.Datepicker = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.Datepicker]
  
  /**
    * Init Datepicker
    */
  /* static member */
  inline def init(els: Element): typingsJapgolly.materializecssMaterialize.M.Datepicker = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.Datepicker]
  inline def init(els: Element, options: PartialDatepickerOptions): typingsJapgolly.materializecssMaterialize.M.Datepicker = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.Datepicker]
  /**
    * Init Datepickers
    */
  /* static member */
  inline def init(els: MElements): js.Array[typingsJapgolly.materializecssMaterialize.M.Datepicker] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.materializecssMaterialize.M.Datepicker]]
  inline def init(els: MElements, options: PartialDatepickerOptions): js.Array[typingsJapgolly.materializecssMaterialize.M.Datepicker] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.materializecssMaterialize.M.Datepicker]]
}
