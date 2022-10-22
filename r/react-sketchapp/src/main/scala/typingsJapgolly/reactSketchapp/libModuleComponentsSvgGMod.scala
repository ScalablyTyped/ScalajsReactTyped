package typingsJapgolly.reactSketchapp

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSketchapp.anon.Fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleComponentsSvgGMod {
  
  @JSImport("react-sketchapp/lib/module/components/Svg/G", "G")
  @js.native
  open class G protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object G {
    
    @JSImport("react-sketchapp/lib/module/components/Svg/G", "G")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Svg/G", "G.propTypes")
    @js.native
    def propTypes: Fill = js.native
    inline def propTypes_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[Fill]
}
