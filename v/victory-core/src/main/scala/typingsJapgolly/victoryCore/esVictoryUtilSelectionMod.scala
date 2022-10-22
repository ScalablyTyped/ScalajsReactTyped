package typingsJapgolly.victoryCore

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGElement
import typingsJapgolly.victoryCore.anon.PickSyntheticEventElement
import typingsJapgolly.victoryCore.anon.PickVictoryCommonPropssca
import typingsJapgolly.victoryCore.anon.XArray
import typingsJapgolly.victoryCore.esTypesPropTypesMod.DomainPropType
import typingsJapgolly.victoryCore.esTypesPropTypesMod.ScaleXYPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryUtilSelectionMod {
  
  @JSImport("victory-core/es/victory-util/selection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBounds(props: ComputedCommonProps): SVGCoordinateBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(props.asInstanceOf[js.Any]).asInstanceOf[SVGCoordinateBounds]
  
  inline def getDataCoordinates(props: Any, scale: ScaleXYPropType, x: Double, y: Double): SVGCoordinateType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataCoordinates")(props.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[SVGCoordinateType]
  
  inline def getDomainCoordinates(props: PickVictoryCommonPropssca): XArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainCoordinates")(props.asInstanceOf[js.Any]).asInstanceOf[XArray]
  inline def getDomainCoordinates(props: PickVictoryCommonPropssca, domain: DomainPropType): XArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainCoordinates")(props.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[XArray]
  
  inline def getParentSVG(evt: PickSyntheticEventElement): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentSVG")(evt.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  
  inline def getSVGEventCoordinates(evt: ReactEventFrom[Element]): SVGCoordinateType = ^.asInstanceOf[js.Dynamic].applyDynamic("getSVGEventCoordinates")(evt.asInstanceOf[js.Any]).asInstanceOf[SVGCoordinateType]
  inline def getSVGEventCoordinates(evt: ReactEventFrom[Element], svg: SVGElement): SVGCoordinateType = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGEventCoordinates")(evt.asInstanceOf[js.Any], svg.asInstanceOf[js.Any])).asInstanceOf[SVGCoordinateType]
  
  trait ComputedCommonProps extends StObject {
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var scale: ScaleXYPropType
    
    var x1: Double
    
    var x2: Double
    
    var y1: Double
    
    var y2: Double
  }
  object ComputedCommonProps {
    
    inline def apply(scale: ScaleXYPropType, x1: Double, x2: Double, y1: Double, y2: Double): ComputedCommonProps = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputedCommonProps]
    }
    
    extension [Self <: ComputedCommonProps](x: Self) {
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setScale(value: ScaleXYPropType): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait SVGCoordinateBounds extends StObject {
    
    var x: js.Tuple2[Double, Double]
    
    var y: js.Tuple2[Double, Double]
  }
  object SVGCoordinateBounds {
    
    inline def apply(x: js.Tuple2[Double, Double], y: js.Tuple2[Double, Double]): SVGCoordinateBounds = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVGCoordinateBounds]
    }
    
    extension [Self <: SVGCoordinateBounds](x: Self) {
      
      inline def setX(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait SVGCoordinateType extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object SVGCoordinateType {
    
    inline def apply(x: Double, y: Double): SVGCoordinateType = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVGCoordinateType]
    }
    
    extension [Self <: SVGCoordinateType](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
