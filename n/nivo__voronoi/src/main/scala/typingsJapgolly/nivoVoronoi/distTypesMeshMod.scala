package typingsJapgolly.nivoVoronoi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import typingsJapgolly.nivoVoronoi.distTypesComputeMeshMod.XYAccessor
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMeshMod {
  
  @JSImport("@nivo/voronoi/dist/types/Mesh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Mesh[Datum](hasNodesWidthHeightXYOnMouseEnterOnMouseMoveOnMouseLeaveOnClickDebug: MeshProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Mesh")(hasNodesWidthHeightXYOnMouseEnterOnMouseMoveOnMouseLeaveOnClickDebug.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MeshProps[Datum] extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var nodes: js.Array[Datum]
    
    var onClick: js.UndefOr[MouseHandler[Datum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseHandler[Datum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseHandler[Datum]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseHandler[Datum]] = js.undefined
    
    var width: Double
    
    var x: js.UndefOr[XYAccessor[Datum]] = js.undefined
    
    var y: js.UndefOr[XYAccessor[Datum]] = js.undefined
  }
  object MeshProps {
    
    inline def apply[Datum](height: Double, nodes: js.Array[Datum], width: Double): MeshProps[Datum] = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeshProps[Datum]]
    }
    
    extension [Self <: MeshProps[?], Datum](x: Self & MeshProps[Datum]) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[Datum]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: Datum*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setOnClick(value: (Datum, /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: (Datum, /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: (Datum, /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: (Datum, /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: XYAccessor[Datum]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXFunction1(value: Datum => Double): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: XYAccessor[Datum]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYFunction1(value: Datum => Double): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type MouseHandler[Datum] = js.Function2[/* datum */ Datum, /* event */ ReactMouseEventFrom[org.scalajs.dom.Element], Unit]
}
