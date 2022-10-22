package typingsJapgolly.reactCountup

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactCountup.buildTypesMod.CallbackProps
import typingsJapgolly.reactCountup.buildTypesMod.CommonProps
import typingsJapgolly.reactCountup.buildTypesMod.CountUpApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUseCountUpMod {
  
  @JSImport("react-countup/build/useCountUp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: useCountUpProps): CountUpApi = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[CountUpApi]
  
  trait useCountUpProps
    extends StObject
       with CommonProps
       with CallbackProps {
    
    var enableReinitialize: js.UndefOr[Boolean] = js.undefined
    
    var ref: String | RefHandle[HTMLElement]
    
    var startOnMount: js.UndefOr[Boolean] = js.undefined
  }
  object useCountUpProps {
    
    inline def apply(end: Double, ref: String | RefHandle[HTMLElement]): useCountUpProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[useCountUpProps]
    }
    
    extension [Self <: useCountUpProps](x: Self) {
      
      inline def setEnableReinitialize(value: Boolean): Self = StObject.set(x, "enableReinitialize", value.asInstanceOf[js.Any])
      
      inline def setEnableReinitializeUndefined: Self = StObject.set(x, "enableReinitialize", js.undefined)
      
      inline def setRef(value: String | RefHandle[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setStartOnMount(value: Boolean): Self = StObject.set(x, "startOnMount", value.asInstanceOf[js.Any])
      
      inline def setStartOnMountUndefined: Self = StObject.set(x, "startOnMount", js.undefined)
    }
  }
}
