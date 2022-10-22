package typingsJapgolly.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.yandexMaps.mod.behavior.DblClickZoom
import typingsJapgolly.yandexMaps.mod.behavior.Drag
import typingsJapgolly.yandexMaps.mod.behavior.IDblClickZoomOptions
import typingsJapgolly.yandexMaps.mod.behavior.IDragOptions
import typingsJapgolly.yandexMaps.mod.behavior.ILeftMouseButtonMagnifierOptions
import typingsJapgolly.yandexMaps.mod.behavior.IMultiTouchOptions
import typingsJapgolly.yandexMaps.mod.behavior.IRightMouseButtonMagnifierOptions
import typingsJapgolly.yandexMaps.mod.behavior.IRulerOptions
import typingsJapgolly.yandexMaps.mod.behavior.IScrollZoomOptions
import typingsJapgolly.yandexMaps.mod.behavior.LeftMouseButtonMagnifier
import typingsJapgolly.yandexMaps.mod.behavior.MultiTouch
import typingsJapgolly.yandexMaps.mod.behavior.RightMouseButtonMagnifier
import typingsJapgolly.yandexMaps.mod.behavior.RouteEditor
import typingsJapgolly.yandexMaps.mod.behavior.Ruler
import typingsJapgolly.yandexMaps.mod.behavior.ScrollZoom
import typingsJapgolly.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofbehavior extends StObject {
  
  var DblClickZoom: Instantiable1[
    /* options */ js.UndefOr[IDblClickZoomOptions], 
    typingsJapgolly.yandexMaps.mod.behavior.DblClickZoom
  ]
  
  var Drag: Instantiable1[
    /* options */ js.UndefOr[IDragOptions], 
    typingsJapgolly.yandexMaps.mod.behavior.Drag
  ]
  
  var LeftMouseButtonMagnifier: Instantiable1[
    /* options */ js.UndefOr[ILeftMouseButtonMagnifierOptions], 
    typingsJapgolly.yandexMaps.mod.behavior.LeftMouseButtonMagnifier
  ]
  
  var MultiTouch: Instantiable1[
    /* options */ js.UndefOr[IMultiTouchOptions], 
    typingsJapgolly.yandexMaps.mod.behavior.MultiTouch
  ]
  
  var RightMouseButtonMagnifier: Instantiable1[
    /* options */ js.UndefOr[IRightMouseButtonMagnifierOptions], 
    typingsJapgolly.yandexMaps.mod.behavior.RightMouseButtonMagnifier
  ]
  
  var RouteEditor: Instantiable0[typingsJapgolly.yandexMaps.mod.behavior.RouteEditor]
  
  var Ruler: Instantiable1[
    /* options */ js.UndefOr[IRulerOptions], 
    typingsJapgolly.yandexMaps.mod.behavior.Ruler
  ]
  
  var ScrollZoom: Instantiable1[
    /* options */ js.UndefOr[IScrollZoomOptions], 
    typingsJapgolly.yandexMaps.mod.behavior.ScrollZoom
  ]
  
  val storage: Storage
}
object Typeofbehavior {
  
  inline def apply(
    DblClickZoom: Instantiable1[/* options */ js.UndefOr[IDblClickZoomOptions], DblClickZoom],
    Drag: Instantiable1[/* options */ js.UndefOr[IDragOptions], Drag],
    LeftMouseButtonMagnifier: Instantiable1[
      /* options */ js.UndefOr[ILeftMouseButtonMagnifierOptions], 
      LeftMouseButtonMagnifier
    ],
    MultiTouch: Instantiable1[/* options */ js.UndefOr[IMultiTouchOptions], MultiTouch],
    RightMouseButtonMagnifier: Instantiable1[
      /* options */ js.UndefOr[IRightMouseButtonMagnifierOptions], 
      RightMouseButtonMagnifier
    ],
    RouteEditor: Instantiable0[RouteEditor],
    Ruler: Instantiable1[/* options */ js.UndefOr[IRulerOptions], Ruler],
    ScrollZoom: Instantiable1[/* options */ js.UndefOr[IScrollZoomOptions], ScrollZoom],
    storage: Storage
  ): Typeofbehavior = {
    val __obj = js.Dynamic.literal(DblClickZoom = DblClickZoom.asInstanceOf[js.Any], Drag = Drag.asInstanceOf[js.Any], LeftMouseButtonMagnifier = LeftMouseButtonMagnifier.asInstanceOf[js.Any], MultiTouch = MultiTouch.asInstanceOf[js.Any], RightMouseButtonMagnifier = RightMouseButtonMagnifier.asInstanceOf[js.Any], RouteEditor = RouteEditor.asInstanceOf[js.Any], Ruler = Ruler.asInstanceOf[js.Any], ScrollZoom = ScrollZoom.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofbehavior]
  }
  
  extension [Self <: Typeofbehavior](x: Self) {
    
    inline def setDblClickZoom(value: Instantiable1[/* options */ js.UndefOr[IDblClickZoomOptions], DblClickZoom]): Self = StObject.set(x, "DblClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDrag(value: Instantiable1[/* options */ js.UndefOr[IDragOptions], Drag]): Self = StObject.set(x, "Drag", value.asInstanceOf[js.Any])
    
    inline def setLeftMouseButtonMagnifier(
      value: Instantiable1[
          /* options */ js.UndefOr[ILeftMouseButtonMagnifierOptions], 
          LeftMouseButtonMagnifier
        ]
    ): Self = StObject.set(x, "LeftMouseButtonMagnifier", value.asInstanceOf[js.Any])
    
    inline def setMultiTouch(value: Instantiable1[/* options */ js.UndefOr[IMultiTouchOptions], MultiTouch]): Self = StObject.set(x, "MultiTouch", value.asInstanceOf[js.Any])
    
    inline def setRightMouseButtonMagnifier(
      value: Instantiable1[
          /* options */ js.UndefOr[IRightMouseButtonMagnifierOptions], 
          RightMouseButtonMagnifier
        ]
    ): Self = StObject.set(x, "RightMouseButtonMagnifier", value.asInstanceOf[js.Any])
    
    inline def setRouteEditor(value: Instantiable0[RouteEditor]): Self = StObject.set(x, "RouteEditor", value.asInstanceOf[js.Any])
    
    inline def setRuler(value: Instantiable1[/* options */ js.UndefOr[IRulerOptions], Ruler]): Self = StObject.set(x, "Ruler", value.asInstanceOf[js.Any])
    
    inline def setScrollZoom(value: Instantiable1[/* options */ js.UndefOr[IScrollZoomOptions], ScrollZoom]): Self = StObject.set(x, "ScrollZoom", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
