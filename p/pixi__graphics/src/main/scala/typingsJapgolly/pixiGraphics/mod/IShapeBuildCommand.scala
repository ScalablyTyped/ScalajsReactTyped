package typingsJapgolly.pixiGraphics.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShapeBuildCommand extends StObject {
  
  def build(graphicsData: GraphicsData): Unit
  
  def triangulate(graphicsData: GraphicsData, target: GraphicsGeometry): Unit
}
object IShapeBuildCommand {
  
  inline def apply(build: GraphicsData => Callback, triangulate: (GraphicsData, GraphicsGeometry) => Callback): IShapeBuildCommand = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1((t0: GraphicsData) => build(t0).runNow()), triangulate = js.Any.fromFunction2((t0: GraphicsData, t1: GraphicsGeometry) => (triangulate(t0, t1)).runNow()))
    __obj.asInstanceOf[IShapeBuildCommand]
  }
  
  extension [Self <: IShapeBuildCommand](x: Self) {
    
    inline def setBuild(value: GraphicsData => Callback): Self = StObject.set(x, "build", js.Any.fromFunction1((t0: GraphicsData) => value(t0).runNow()))
    
    inline def setTriangulate(value: (GraphicsData, GraphicsGeometry) => Callback): Self = StObject.set(x, "triangulate", js.Any.fromFunction2((t0: GraphicsData, t1: GraphicsGeometry) => (value(t0, t1)).runNow()))
  }
}
