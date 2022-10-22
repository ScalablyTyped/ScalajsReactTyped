package typingsJapgolly.materializecssMaterialize.mod

import org.scalajs.dom.Element
import typingsJapgolly.materializecssMaterialize.M.TimepickerOptions
import typingsJapgolly.materializecssMaterialize.M.Views
import typingsJapgolly.materializecssMaterialize.MElements
import typingsJapgolly.materializecssMaterialize.anon.PartialTimepickerOptions
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.AM
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.PM
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.webkitVibrate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "Timepicker")
@js.native
open class Timepicker ()
  extends StObject
     with typingsJapgolly.materializecssMaterialize.M.Timepicker {
  
  /**
    * If the time is AM or PM on twelve-hour clock
    * @default 'PM'
    */
  /* CompleteClass */
  var amOrPm: AM | PM = js.native
  
  /**
    * Close timepicker
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Current view on the timepicker
    * @default 'hours'
    */
  /* CompleteClass */
  var currentView: Views = js.native
  
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
  
  /**
    * If the picker is open.
    */
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /**
    * Open timepicker
    */
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: TimepickerOptions = js.native
  
  /**
    * Show hours or minutes view on timepicker
    * @param view The name of the view you want to switch to, 'hours' or 'minutes'.
    */
  /* CompleteClass */
  override def showView(view: Views): Unit = js.native
  
  /**
    * The selected time.
    */
  /* CompleteClass */
  var time: String = js.native
  
  /**
    * Vibrate device when dragging clock hand.
    */
  /* CompleteClass */
  var vibrate: typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.vibrate | webkitVibrate | Null = js.native
}
object Timepicker {
  
  @JSImport("@materializecss/materialize", "Timepicker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typingsJapgolly.materializecssMaterialize.M.Timepicker = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.Timepicker]
  
  /**
    * Init Timepicker
    */
  /* static member */
  inline def init(els: Element): typingsJapgolly.materializecssMaterialize.M.Timepicker = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.Timepicker]
  inline def init(els: Element, options: PartialTimepickerOptions): typingsJapgolly.materializecssMaterialize.M.Timepicker = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.Timepicker]
  /**
    * Init Timepickers
    */
  /* static member */
  inline def init(els: MElements): js.Array[typingsJapgolly.materializecssMaterialize.M.Timepicker] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.materializecssMaterialize.M.Timepicker]]
  inline def init(els: MElements, options: PartialTimepickerOptions): js.Array[typingsJapgolly.materializecssMaterialize.M.Timepicker] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.materializecssMaterialize.M.Timepicker]]
}
