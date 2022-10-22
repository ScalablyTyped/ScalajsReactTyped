package typingsJapgolly.reactSketchapp

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSketchapp.anon.ClipRule
import typingsJapgolly.reactSketchapp.anon.Cy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSvgEllipseMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Ellipse", "Ellipse")
  @js.native
  open class Ellipse protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Ellipse {
    
    @JSImport("react-sketchapp/lib/components/Svg/Ellipse", "Ellipse")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/Svg/Ellipse", "Ellipse.defaultProps")
    @js.native
    def defaultProps: Cy = js.native
    inline def defaultProps_=(x: Cy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/Svg/Ellipse", "Ellipse.propTypes")
    @js.native
    def propTypes: ClipRule = js.native
    inline def propTypes_=(x: ClipRule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[ClipRule]
}
