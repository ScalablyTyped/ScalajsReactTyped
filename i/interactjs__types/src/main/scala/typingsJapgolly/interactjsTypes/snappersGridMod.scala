package typingsJapgolly.interactjsTypes

import typingsJapgolly.interactjsTypes.anon.CoordFields
import typingsJapgolly.interactjsTypes.modifiersSnapPointerMod.SnapFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snappersGridMod {
  
  @JSImport("@interactjs/snappers/grid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(grid: GridOptions): SnapFunction & CoordFields = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(grid.asInstanceOf[js.Any]).asInstanceOf[SnapFunction & CoordFields]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.interactjsTypes.anon.PartialRectrangenumberund
    - typingsJapgolly.interactjsTypes.anon.Pointrangenumberundefined
  */
  trait GridOptions extends StObject
  object GridOptions {
    
    inline def PartialRectrangenumberund(): typingsJapgolly.interactjsTypes.anon.PartialRectrangenumberund = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.interactjsTypes.anon.PartialRectrangenumberund]
    }
    
    inline def Pointrangenumberundefined(x: Double, y: Double): typingsJapgolly.interactjsTypes.anon.Pointrangenumberundefined = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.interactjsTypes.anon.Pointrangenumberundefined]
    }
  }
}
