package typingsJapgolly.selectables

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("selectables", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Selectables {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def disable(): Unit = js.native
    
    /* CompleteClass */
    override def enable(): Unit = js.native
    
    /* CompleteClass */
    var options: Options = js.native
  }
  
  trait Options extends StObject {
    
    var elements: js.UndefOr[String] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String | Boolean] = js.undefined
    
    var moreUsing: js.UndefOr[String] = js.undefined
    
    var onDeselect: js.UndefOr[js.Function1[/* el */ Element, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* el */ Element, Unit]] = js.undefined
    
    var selectedClass: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var stop: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var zone: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setElements(value: String): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setKey(value: String | Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMoreUsing(value: String): Self = StObject.set(x, "moreUsing", value.asInstanceOf[js.Any])
      
      inline def setMoreUsingUndefined: Self = StObject.set(x, "moreUsing", js.undefined)
      
      inline def setOnDeselect(value: /* el */ Element => Callback): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1((t0: /* el */ Element) => value(t0).runNow()))
      
      inline def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      inline def setOnSelect(value: /* el */ Element => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* el */ Element) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setSelectedClass(value: String): Self = StObject.set(x, "selectedClass", value.asInstanceOf[js.Any])
      
      inline def setSelectedClassUndefined: Self = StObject.set(x, "selectedClass", js.undefined)
      
      inline def setStart(value: /* e */ Event => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: /* e */ Event => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
  
  trait Selectables extends StObject {
    
    def disable(): Unit
    
    def enable(): Unit
    
    var options: Options
  }
  object Selectables {
    
    inline def apply(disable: Callback, enable: Callback, options: Options): Selectables = {
      val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selectables]
    }
    
    extension [Self <: Selectables](x: Self) {
      
      inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
