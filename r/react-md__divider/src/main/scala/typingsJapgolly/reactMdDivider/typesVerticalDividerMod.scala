package typingsJapgolly.reactMdDivider

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesVerticalDividerMod {
  
  @JSImport("@react-md/divider/types/VerticalDivider", "VerticalDivider")
  @js.native
  val VerticalDivider: ForwardRefExoticComponent[VerticalDividerProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait VerticalDividerProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /** {@inheritDoc VerticalDividerHookOptions.maxHeight} */
    var maxHeight: js.UndefOr[Double] = js.undefined
  }
  object VerticalDividerProps {
    
    inline def apply(): VerticalDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalDividerProps]
    }
    
    extension [Self <: VerticalDividerProps](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    }
  }
}
