package typingsJapgolly.reactSketchapp

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSketchapp.anon.AlignmentBaseline
import typingsJapgolly.reactSketchapp.anon.IsInAParentText
import typingsJapgolly.reactSketchapp.anon.IsInAParentTextBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSvgTspanMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/TSpan", "TSpan")
  @js.native
  open class TSpan protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
    
    def getChildContext(): IsInAParentTextBoolean = js.native
    
    def getContextTypes(): IsInAParentText = js.native
  }
  /* static members */
  object TSpan {
    
    @JSImport("react-sketchapp/lib/components/Svg/TSpan", "TSpan")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/Svg/TSpan", "TSpan.childContextTypes")
    @js.native
    def childContextTypes: IsInAParentText = js.native
    inline def childContextTypes_=(x: IsInAParentText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/Svg/TSpan", "TSpan.propTypes")
    @js.native
    def propTypes: AlignmentBaseline = js.native
    inline def propTypes_=(x: AlignmentBaseline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[AlignmentBaseline]
}
