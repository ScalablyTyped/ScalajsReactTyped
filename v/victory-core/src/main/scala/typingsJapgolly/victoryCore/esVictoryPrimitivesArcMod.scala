package typingsJapgolly.victoryCore

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.victoryCore.anon.Active
import typingsJapgolly.victoryCore.anon.PathComponent
import typingsJapgolly.victoryCore.esVictoryUtilCommonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryPrimitivesArcMod {
  
  object Arc {
    
    inline def apply(props: ArcProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("victory-core/es/victory-primitives/arc", "Arc")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/es/victory-primitives/arc", "Arc.defaultProps")
    @js.native
    def defaultProps: PathComponent = js.native
    inline def defaultProps_=(x: PathComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-primitives/arc", "Arc.propTypes")
    @js.native
    def propTypes: Active = js.native
    inline def propTypes_=(x: Active): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait ArcProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    var closedPath: js.UndefOr[Boolean] = js.undefined
    
    var cx: js.UndefOr[Double] = js.undefined
    
    var cy: js.UndefOr[Double] = js.undefined
    
    var datum: js.UndefOr[Any] = js.undefined
    
    var endAngle: js.UndefOr[Double] = js.undefined
    
    var pathComponent: js.UndefOr[Element] = js.undefined
    
    var r: js.UndefOr[Double] = js.undefined
    
    var startAngle: js.UndefOr[Double] = js.undefined
  }
  object ArcProps {
    
    inline def apply(): ArcProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArcProps]
    }
    
    extension [Self <: ArcProps](x: Self) {
      
      inline def setClosedPath(value: Boolean): Self = StObject.set(x, "closedPath", value.asInstanceOf[js.Any])
      
      inline def setClosedPathUndefined: Self = StObject.set(x, "closedPath", js.undefined)
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setPathComponent(value: VdomElement): Self = StObject.set(x, "pathComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPathComponentUndefined: Self = StObject.set(x, "pathComponent", js.undefined)
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    }
  }
}
