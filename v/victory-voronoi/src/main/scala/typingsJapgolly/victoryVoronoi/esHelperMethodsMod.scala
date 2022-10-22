package typingsJapgolly.victoryVoronoi

import typingsJapgolly.d3Voronoi.mod.VoronoiLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHelperMethodsMod {
  
  @JSImport("victory-voronoi/es/helper-methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBaseProps(props: Any, fallbackProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseProps")(props.asInstanceOf[js.Any], fallbackProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def internalD3Voronoi[T](): VoronoiLayout[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_internalD3Voronoi")().asInstanceOf[VoronoiLayout[T]]
}
