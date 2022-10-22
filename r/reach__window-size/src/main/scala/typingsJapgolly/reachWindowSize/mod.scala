package typingsJapgolly.reachWindowSize

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reachWindowSize.anon.Height
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/window-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Measure the current window dimensions.
    *
    * @see Docs   https://reach.tech/window-size
    * @see Source https://github.com/reach/reach-ui/tree/main/packages/window-size
    */
  /**
    * WindowSize
    *
    * @see Docs https://reach.tech/window-size#windowsize
    * @param props
    */
  @JSImport("@reach/window-size", "WindowSize")
  @js.native
  val WindowSize: FC[WindowSizeProps] = js.native
  
  /**
    * useWindowSize
    *
    * @see Docs https://reach.tech/window-size#usewindowsize
    */
  inline def useWindowSize(): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowSize")().asInstanceOf[Height]
  
  trait TWindowSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object TWindowSize {
    
    inline def apply(height: Double, width: Double): TWindowSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TWindowSize]
    }
    
    extension [Self <: TWindowSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see Docs https://reach.tech/window-size#windowsize-props
    */
  trait WindowSizeProps extends StObject {
    
    /**
      * A function that calls back to you with the window size.
      *
      * @see Docs https://reach.tech/window-size#windowsize-children
      */
    def children(size: Height): Element
  }
  object WindowSizeProps {
    
    inline def apply(children: Height => Element): WindowSizeProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[WindowSizeProps]
    }
    
    extension [Self <: WindowSizeProps](x: Self) {
      
      inline def setChildren(value: Height => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
}
