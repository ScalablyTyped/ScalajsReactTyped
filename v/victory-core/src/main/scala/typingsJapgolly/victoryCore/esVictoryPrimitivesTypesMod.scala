package typingsJapgolly.victoryCore

import typingsJapgolly.victoryCore.esVictoryUtilCommonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryPrimitivesTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryCore.victoryCoreStrings.circle
    - typingsJapgolly.victoryCore.victoryCoreStrings.cross
    - typingsJapgolly.victoryCore.victoryCoreStrings.diamond
    - typingsJapgolly.victoryCore.victoryCoreStrings.plus
    - typingsJapgolly.victoryCore.victoryCoreStrings.minus
    - typingsJapgolly.victoryCore.victoryCoreStrings.square
    - typingsJapgolly.victoryCore.victoryCoreStrings.star
    - typingsJapgolly.victoryCore.victoryCoreStrings.triangleDown
    - typingsJapgolly.victoryCore.victoryCoreStrings.triangleUp
  */
  trait ScatterSymbolType extends StObject
  object ScatterSymbolType {
    
    inline def circle: typingsJapgolly.victoryCore.victoryCoreStrings.circle = "circle".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.circle]
    
    inline def cross: typingsJapgolly.victoryCore.victoryCoreStrings.cross = "cross".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.cross]
    
    inline def diamond: typingsJapgolly.victoryCore.victoryCoreStrings.diamond = "diamond".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.diamond]
    
    inline def minus: typingsJapgolly.victoryCore.victoryCoreStrings.minus = "minus".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.minus]
    
    inline def plus: typingsJapgolly.victoryCore.victoryCoreStrings.plus = "plus".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.plus]
    
    inline def square: typingsJapgolly.victoryCore.victoryCoreStrings.square = "square".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.square]
    
    inline def star: typingsJapgolly.victoryCore.victoryCoreStrings.star = "star".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.star]
    
    inline def triangleDown: typingsJapgolly.victoryCore.victoryCoreStrings.triangleDown = "triangleDown".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.triangleDown]
    
    inline def triangleUp: typingsJapgolly.victoryCore.victoryCoreStrings.triangleUp = "triangleUp".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.triangleUp]
  }
  
  trait VictoryPrimitiveShapeProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    @JSName("desc")
    var desc_VictoryPrimitiveShapeProps: js.UndefOr[String] = js.undefined
    
    var rx: js.UndefOr[Double] = js.undefined
    
    var ry: js.UndefOr[Double] = js.undefined
  }
  object VictoryPrimitiveShapeProps {
    
    inline def apply(): VictoryPrimitiveShapeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryPrimitiveShapeProps]
    }
    
    extension [Self <: VictoryPrimitiveShapeProps](x: Self) {
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    }
  }
}
