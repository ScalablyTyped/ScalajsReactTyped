package typingsJapgolly.victoryCore

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.victoryCore.anon.Data
import typingsJapgolly.victoryCore.anon.PathComponent
import typingsJapgolly.victoryCore.esVictoryPrimitivesTypesMod.ScatterSymbolType
import typingsJapgolly.victoryCore.esVictoryUtilCommonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryPrimitivesPointMod {
  
  object Point {
    
    inline def apply(props: PointProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("victory-core/es/victory-primitives/point", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/es/victory-primitives/point", "Point.defaultProps")
    @js.native
    def defaultProps: PathComponent = js.native
    inline def defaultProps_=(x: PathComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-primitives/point", "Point.propTypes")
    @js.native
    def propTypes: Data = js.native
    inline def propTypes_=(x: Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait PointProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    var datum: js.UndefOr[Any] = js.undefined
    
    var getPath: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* size */ Double, String]] = js.undefined
    
    var pathComponent: js.UndefOr[Element] = js.undefined
    
    var size: js.UndefOr[Double | js.Function] = js.undefined
    
    var symbol: js.UndefOr[ScatterSymbolType | js.Function] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PointProps {
    
    inline def apply(): PointProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointProps]
    }
    
    extension [Self <: PointProps](x: Self) {
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setGetPath(value: (/* x */ Double, /* y */ Double, /* size */ Double) => String): Self = StObject.set(x, "getPath", js.Any.fromFunction3(value))
      
      inline def setGetPathUndefined: Self = StObject.set(x, "getPath", js.undefined)
      
      inline def setPathComponent(value: VdomElement): Self = StObject.set(x, "pathComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPathComponentUndefined: Self = StObject.set(x, "pathComponent", js.undefined)
      
      inline def setSize(value: Double | js.Function): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSymbol(value: ScatterSymbolType | js.Function): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
