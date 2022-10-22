package typingsJapgolly.victoryCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.victoryCore.anon.Children
import typingsJapgolly.victoryCore.esVictoryUtilCommonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryPrimitivesClipPathMod {
  
  object ClipPath {
    
    inline def apply(props: ClipPathProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("victory-core/es/victory-primitives/clip-path", "ClipPath")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/es/victory-primitives/clip-path", "ClipPath.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait ClipPathProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    var children: js.UndefOr[js.Array[Node] | Node] = js.undefined
    
    var clipId: js.UndefOr[Double | String] = js.undefined
  }
  object ClipPathProps {
    
    inline def apply(): ClipPathProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClipPathProps]
    }
    
    extension [Self <: ClipPathProps](x: Self) {
      
      inline def setChildren(value: js.Array[Node] | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (japgolly.scalajs.react.facade.React.Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClipId(value: Double | String): Self = StObject.set(x, "clipId", value.asInstanceOf[js.Any])
      
      inline def setClipIdUndefined: Self = StObject.set(x, "clipId", js.undefined)
    }
  }
}
