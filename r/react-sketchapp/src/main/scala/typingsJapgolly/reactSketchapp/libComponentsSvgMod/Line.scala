package typingsJapgolly.reactSketchapp.libComponentsSvgMod

import typingsJapgolly.reactSketchapp.anon.FillOpacity
import typingsJapgolly.reactSketchapp.anon.X1
import typingsJapgolly.reactSketchapp.libComponentsSvgLineMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/components/Svg", "Line")
@js.native
open class Line protected ()
  extends typingsJapgolly.reactSketchapp.libComponentsSvgLineMod.Line {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Line {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Line")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/components/Svg", "Line.defaultProps")
  @js.native
  def defaultProps: X1 = js.native
  inline def defaultProps_=(x: X1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sketchapp/lib/components/Svg", "Line.propTypes")
  @js.native
  def propTypes: FillOpacity = js.native
  inline def propTypes_=(x: FillOpacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
