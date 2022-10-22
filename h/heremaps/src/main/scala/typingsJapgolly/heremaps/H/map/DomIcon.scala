package typingsJapgolly.heremaps.H.map

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A visual representation of the H.map.DomMarker.
  */
trait DomIcon extends StObject
object DomIcon {
  
  /**
    * Options used to initialize a DomIcon
    * @property onAttach {function(Element, H.map.DomIcon, H.map.DomMarker)=} - A callback which is invoked before a clone of the icon's element is appended and displayed on the map.
    * This callback can be used to setup the clone.
    * @property onDetach {function(Element, H.map.DomIcon, H.map.DomMarker)=} - A callback which is invoked after a clone of the icon's element is removed from the map.
    * This callback can be used to clean up the clone.
    */
  trait Options extends StObject {
    
    var onAttach: js.UndefOr[js.Function3[/* el */ Element, /* icon */ DomIcon, /* marker */ DomMarker, Unit]] = js.undefined
    
    var onDetach: js.UndefOr[js.Function3[/* el */ Element, /* icon */ DomIcon, /* marker */ DomMarker, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnAttach(value: (/* el */ Element, /* icon */ DomIcon, /* marker */ DomMarker) => Callback): Self = StObject.set(x, "onAttach", js.Any.fromFunction3((t0: /* el */ Element, t1: /* icon */ DomIcon, t2: /* marker */ DomMarker) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnAttachUndefined: Self = StObject.set(x, "onAttach", js.undefined)
      
      inline def setOnDetach(value: (/* el */ Element, /* icon */ DomIcon, /* marker */ DomMarker) => Callback): Self = StObject.set(x, "onDetach", js.Any.fromFunction3((t0: /* el */ Element, t1: /* icon */ DomIcon, t2: /* marker */ DomMarker) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnDetachUndefined: Self = StObject.set(x, "onDetach", js.undefined)
    }
  }
}
