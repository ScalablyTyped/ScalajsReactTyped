package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaletteMod {
  
  @JSImport("wix-style-react/dist/types/Palette", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[PaletteProps, js.Object, Any]
  
  type Palette = PureComponent[PaletteProps, js.Object, Any]
  
  trait PaletteProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fill: js.UndefOr[js.Array[Node]] = js.undefined
  }
  object PaletteProps {
    
    inline def apply(): PaletteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaletteProps]
    }
    
    extension [Self <: PaletteProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFill(value: js.Array[Node]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFillVarargs(value: Node*): Self = StObject.set(x, "fill", js.Array(value*))
    }
  }
}
