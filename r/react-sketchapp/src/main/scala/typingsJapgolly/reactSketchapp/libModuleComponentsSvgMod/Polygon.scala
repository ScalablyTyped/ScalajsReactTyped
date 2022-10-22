package typingsJapgolly.reactSketchapp.libModuleComponentsSvgMod

import typingsJapgolly.reactSketchapp.anon.FillRule
import typingsJapgolly.reactSketchapp.anon.Points
import typingsJapgolly.reactSketchapp.libModuleComponentsSvgPolygonMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "Polygon")
@js.native
open class Polygon protected ()
  extends typingsJapgolly.reactSketchapp.libModuleComponentsSvgPolygonMod.Polygon {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Polygon {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Polygon")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Polygon.defaultProps")
  @js.native
  def defaultProps: Points = js.native
  inline def defaultProps_=(x: Points): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Polygon.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Polygon.propTypes")
  @js.native
  def propTypes: FillRule = js.native
  inline def propTypes_=(x: FillRule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
