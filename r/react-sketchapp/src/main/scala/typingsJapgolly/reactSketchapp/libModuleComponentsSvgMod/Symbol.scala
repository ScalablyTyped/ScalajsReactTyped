package typingsJapgolly.reactSketchapp.libModuleComponentsSvgMod

import typingsJapgolly.reactSketchapp.anon.ViewBox
import typingsJapgolly.reactSketchapp.libModuleComponentsSvgSymbolMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "Symbol")
@js.native
open class Symbol protected ()
  extends typingsJapgolly.reactSketchapp.libModuleComponentsSvgSymbolMod.Symbol {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Symbol {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Symbol")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Symbol.propTypes")
  @js.native
  def propTypes: ViewBox = js.native
  inline def propTypes_=(x: ViewBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
