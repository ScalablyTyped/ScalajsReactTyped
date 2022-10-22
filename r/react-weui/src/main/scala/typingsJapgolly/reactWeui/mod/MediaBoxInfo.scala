package typingsJapgolly.reactWeui.mod

import typingsJapgolly.reactWeui.anon.DataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "MediaBoxInfo")
@js.native
open class MediaBoxInfo protected () extends StObject {
  def this(args: Any*) = this()
  
  def render(): Any = js.native
  
  def renderData(metas: Any): Any = js.native
}
/* static members */
object MediaBoxInfo {
  
  @JSImport("react-weui", "MediaBoxInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "MediaBoxInfo.defaultProps")
  @js.native
  def defaultProps: DataArray = js.native
  inline def defaultProps_=(x: DataArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object data {
      
      inline def apply(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("react-weui", "MediaBoxInfo.propTypes.data")
      @js.native
      val ^ : js.Any = js.native
      
      inline def isRequired(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
  }
}
