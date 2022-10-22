package typingsJapgolly.reactSketchapp.libModuleComponentsSvgMod

import typingsJapgolly.reactSketchapp.anon.AlignmentBaseline
import typingsJapgolly.reactSketchapp.anon.IsInAParentText
import typingsJapgolly.reactSketchapp.libModuleComponentsSvgTspanMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "TSpan")
@js.native
open class TSpan protected ()
  extends typingsJapgolly.reactSketchapp.libModuleComponentsSvgTspanMod.TSpan {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object TSpan {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "TSpan")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "TSpan.childContextTypes")
  @js.native
  def childContextTypes: IsInAParentText = js.native
  inline def childContextTypes_=(x: IsInAParentText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "TSpan.propTypes")
  @js.native
  def propTypes: AlignmentBaseline = js.native
  inline def propTypes_=(x: AlignmentBaseline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
