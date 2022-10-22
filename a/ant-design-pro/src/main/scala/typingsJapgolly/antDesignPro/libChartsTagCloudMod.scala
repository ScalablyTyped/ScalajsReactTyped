package typingsJapgolly.antDesignPro

import typingsJapgolly.antDesignPro.anon.Name
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartsTagCloudMod {
  
  @JSImport("ant-design-pro/lib/Charts/TagCloud", JSImport.Default)
  @js.native
  open class default () extends Component[ITagCloudProps, Any, Any]
  
  trait ITagCloudProps extends StObject {
    
    var data: js.Array[Name]
    
    var height: Double
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ITagCloudProps {
    
    inline def apply(data: js.Array[Name], height: Double): ITagCloudProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITagCloudProps]
    }
    
    extension [Self <: ITagCloudProps](x: Self) {
      
      inline def setData(value: js.Array[Name]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Name*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type TagCloud = japgolly.scalajs.react.facade.React.Component[ITagCloudProps & js.Object, js.Object]
}
