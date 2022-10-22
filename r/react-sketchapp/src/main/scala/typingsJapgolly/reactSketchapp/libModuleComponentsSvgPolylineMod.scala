package typingsJapgolly.reactSketchapp

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSketchapp.anon.FillRule
import typingsJapgolly.reactSketchapp.anon.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleComponentsSvgPolylineMod {
  
  @JSImport("react-sketchapp/lib/module/components/Svg/Polyline", "Polyline")
  @js.native
  open class Polyline protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Polyline {
    
    @JSImport("react-sketchapp/lib/module/components/Svg/Polyline", "Polyline")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Svg/Polyline", "Polyline.defaultProps")
    @js.native
    def defaultProps: Points = js.native
    inline def defaultProps_=(x: Points): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Svg/Polyline", "Polyline.propTypes")
    @js.native
    def propTypes: FillRule = js.native
    inline def propTypes_=(x: FillRule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[FillRule]
}
