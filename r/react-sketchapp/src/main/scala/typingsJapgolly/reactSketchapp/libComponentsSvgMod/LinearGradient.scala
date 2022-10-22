package typingsJapgolly.reactSketchapp.libComponentsSvgMod

import typingsJapgolly.reactSketchapp.anon.GradientUnits
import typingsJapgolly.reactSketchapp.anon.X2
import typingsJapgolly.reactSketchapp.libComponentsSvgLinearGradientMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/components/Svg", "LinearGradient")
@js.native
open class LinearGradient protected ()
  extends typingsJapgolly.reactSketchapp.libComponentsSvgLinearGradientMod.LinearGradient {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object LinearGradient {
  
  @JSImport("react-sketchapp/lib/components/Svg", "LinearGradient")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/components/Svg", "LinearGradient.defaultProps")
  @js.native
  def defaultProps: X2 = js.native
  inline def defaultProps_=(x: X2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sketchapp/lib/components/Svg", "LinearGradient.propTypes")
  @js.native
  def propTypes: GradientUnits = js.native
  inline def propTypes_=(x: GradientUnits): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
