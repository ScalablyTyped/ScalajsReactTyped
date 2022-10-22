package typingsJapgolly.materializeCss.global.M

import org.scalajs.dom.Element
import typingsJapgolly.materializeCss.M.TimepickerOptions
import typingsJapgolly.materializeCss.M.Views
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.anon.PartialTimepickerOptions
import typingsJapgolly.materializeCss.materializeCssStrings.AM
import typingsJapgolly.materializeCss.materializeCssStrings.PM
import typingsJapgolly.materializeCss.materializeCssStrings.webkitVibrate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Timepicker")
@js.native
open class Timepicker ()
  extends StObject
     with typingsJapgolly.materializeCss.M.Timepicker {
  
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
  var vibrate: typingsJapgolly.materializeCss.materializeCssStrings.vibrate | webkitVibrate | Null = js.native
}
object Timepicker {
  
  @JSGlobal("M.Timepicker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Timepicker = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializeCss.M.Timepicker]
  
  /**
    * Init Timepicker
    */
  /* static member */
  inline def init(els: Element): typingsJapgolly.materializeCss.M.Timepicker = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializeCss.M.Timepicker]
  inline def init(els: Element, options: PartialTimepickerOptions): typingsJapgolly.materializeCss.M.Timepicker = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.materializeCss.M.Timepicker]
  /**
    * Init Timepickers
    */
  /* static member */
  inline def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Timepicker] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.materializeCss.M.Timepicker]]
  inline def init(els: MElements, options: PartialTimepickerOptions): js.Array[typingsJapgolly.materializeCss.M.Timepicker] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.materializeCss.M.Timepicker]]
}
