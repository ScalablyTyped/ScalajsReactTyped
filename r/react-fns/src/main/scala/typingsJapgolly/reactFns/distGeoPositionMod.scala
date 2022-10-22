package typingsJapgolly.reactFns

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFns.distGeoPositionGeoPositionMod.GeoPositionProps
import typingsJapgolly.reactFns.distTypesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGeoPositionMod {
  
  @JSImport("react-fns/dist/GeoPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-fns/dist/GeoPosition", "GeoPosition")
  @js.native
  open class GeoPosition protected ()
    extends typingsJapgolly.reactFns.distGeoPositionGeoPositionMod.GeoPosition {
    def this(props: SharedRenderProps[GeoPositionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[GeoPositionProps], context: Any) = this()
  }
  
  inline def withGeoPosition[Props](Component: ComponentType[Props & GeoPositionProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withGeoPosition")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
