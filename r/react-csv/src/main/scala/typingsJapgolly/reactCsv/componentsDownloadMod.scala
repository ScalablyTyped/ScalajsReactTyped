package typingsJapgolly.reactCsv

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactCsv.componentsCommonPropTypesMod.CommonPropTypes
import typingsJapgolly.reactCsv.componentsCommonPropTypesMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDownloadMod {
  
  @JSImport("react-csv/components/Download", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DownloadPropTypes, js.Object, Any]
  
  type Download = japgolly.scalajs.react.facade.React.Component[DownloadPropTypes & js.Object, js.Object]
  
  trait DownloadPropTypes
    extends StObject
       with CommonPropTypes {
    
    var target: js.UndefOr[String] = js.undefined
  }
  object DownloadPropTypes {
    
    inline def apply(data: String | Data | (js.Function0[String | Data])): DownloadPropTypes = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadPropTypes]
    }
    
    extension [Self <: DownloadPropTypes](x: Self) {
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
