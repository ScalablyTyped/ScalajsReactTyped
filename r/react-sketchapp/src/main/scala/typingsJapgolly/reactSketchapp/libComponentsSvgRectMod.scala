package typingsJapgolly.reactSketchapp

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSketchapp.anon.Origin
import typingsJapgolly.reactSketchapp.anon.Rx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSvgRectMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Rect", "Rect")
  @js.native
  open class Rect protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Rect {
    
    @JSImport("react-sketchapp/lib/components/Svg/Rect", "Rect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/Svg/Rect", "Rect.defaultProps")
    @js.native
    def defaultProps: Rx = js.native
    inline def defaultProps_=(x: Rx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/Svg/Rect", "Rect.propTypes")
    @js.native
    def propTypes: Origin = js.native
    inline def propTypes_=(x: Origin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[Origin]
}
