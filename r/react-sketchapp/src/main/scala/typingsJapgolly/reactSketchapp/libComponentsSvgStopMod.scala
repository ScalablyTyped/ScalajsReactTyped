package typingsJapgolly.reactSketchapp

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSketchapp.anon.StopColor
import typingsJapgolly.reactSketchapp.anon.StopOpacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSvgStopMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Stop", "Stop")
  @js.native
  open class Stop protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Stop {
    
    @JSImport("react-sketchapp/lib/components/Svg/Stop", "Stop")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/Svg/Stop", "Stop.defaultProps")
    @js.native
    def defaultProps: StopOpacity = js.native
    inline def defaultProps_=(x: StopOpacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/Svg/Stop", "Stop.propTypes")
    @js.native
    def propTypes: StopColor = js.native
    inline def propTypes_=(x: StopColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[StopColor]
}
