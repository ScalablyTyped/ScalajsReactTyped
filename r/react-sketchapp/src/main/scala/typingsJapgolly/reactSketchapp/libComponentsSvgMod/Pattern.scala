package typingsJapgolly.reactSketchapp.libComponentsSvgMod

import typingsJapgolly.reactSketchapp.anon.PatternContentUnits
import typingsJapgolly.reactSketchapp.libComponentsSvgPatternMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/components/Svg", "Pattern")
@js.native
open class Pattern protected ()
  extends typingsJapgolly.reactSketchapp.libComponentsSvgPatternMod.Pattern {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Pattern {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Pattern")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/components/Svg", "Pattern.propTypes")
  @js.native
  def propTypes: PatternContentUnits = js.native
  inline def propTypes_=(x: PatternContentUnits): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
