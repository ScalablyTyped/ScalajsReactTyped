package typingsJapgolly.oracleOraclejet

import org.scalajs.dom.Element
import typingsJapgolly.oracleOraclejet.anon.Axis
import typingsJapgolly.oracleOraclejet.anon.Color
import typingsJapgolly.oracleOraclejet.anon.Delay
import typingsJapgolly.oracleOraclejet.anon.Direction
import typingsJapgolly.oracleOraclejet.anon.Duration
import typingsJapgolly.oracleOraclejet.anon.Persist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojanimationMod {
  
  @JSImport("@oracle/oraclejet/ojanimation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collapse(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("collapse")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def collapse(element: Element, options: Delay): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("collapse")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def expand(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def expand(element: Element, options: Delay): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def fadeIn(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeIn")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def fadeIn(element: Element, options: Duration): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeIn")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def fadeOut(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeOut")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def fadeOut(element: Element, options: Duration): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOut")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def flipIn(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipIn")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def flipIn(element: Element, options: Axis): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("flipIn")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def flipOut(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipOut")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def flipOut(element: Element, options: Axis): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("flipOut")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def ripple(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("ripple")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def ripple(element: Element, options: Color): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("ripple")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def slideIn(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("slideIn")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def slideIn(element: Element, options: Direction): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("slideIn")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def slideOut(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("slideOut")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def slideOut(element: Element, options: Direction): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("slideOut")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def zoomIn(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("zoomIn")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def zoomIn(element: Element, options: Persist): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomIn")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def zoomOut(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("zoomOut")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def zoomOut(element: Element, options: Persist): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomOut")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.collapse
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.expand
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fadeIn
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fadeOut
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.flipIn
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.flipOut
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ripple
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.slideIn
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.slideOut
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomIn
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomOut
  */
  trait AnimationMethods extends StObject
  object AnimationMethods {
    
    inline def collapse: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.collapse = "collapse".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.collapse]
    
    inline def expand: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.expand = "expand".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.expand]
    
    inline def fadeIn: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fadeIn = "fadeIn".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fadeIn]
    
    inline def fadeOut: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fadeOut = "fadeOut".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fadeOut]
    
    inline def flipIn: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.flipIn = "flipIn".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.flipIn]
    
    inline def flipOut: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.flipOut = "flipOut".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.flipOut]
    
    inline def ripple: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ripple = "ripple".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ripple]
    
    inline def slideIn: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.slideIn = "slideIn".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.slideIn]
    
    inline def slideOut: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.slideOut = "slideOut".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.slideOut]
    
    inline def zoomIn: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomIn = "zoomIn".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomIn]
    
    inline def zoomOut: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomOut = "zoomOut".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomOut]
  }
}
