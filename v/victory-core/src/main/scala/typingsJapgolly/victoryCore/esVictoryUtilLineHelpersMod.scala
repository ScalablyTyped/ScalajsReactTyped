package typingsJapgolly.victoryCore

import typingsJapgolly.d3Shape.mod.LineRadial_
import typingsJapgolly.d3Shape.mod.Line_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryUtilLineHelpersMod {
  
  @JSImport("victory-core/es/victory-util/line-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInterpolationFunction(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterpolationFunction")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getLineFunction(props: Any): (LineRadial_[js.Tuple2[Double, Double]]) | (Line_[js.Tuple2[Double, Double]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getLineFunction")(props.asInstanceOf[js.Any]).asInstanceOf[(LineRadial_[js.Tuple2[Double, Double]]) | (Line_[js.Tuple2[Double, Double]])]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryCore.victoryCoreStrings.basis
    - typingsJapgolly.victoryCore.victoryCoreStrings.cardinal
    - typingsJapgolly.victoryCore.victoryCoreStrings.bumpX
    - typingsJapgolly.victoryCore.victoryCoreStrings.bumpY
    - typingsJapgolly.victoryCore.victoryCoreStrings.bundle
    - typingsJapgolly.victoryCore.victoryCoreStrings.catmullRom
    - typingsJapgolly.victoryCore.victoryCoreStrings.linear
    - typingsJapgolly.victoryCore.victoryCoreStrings.monotoneX
    - typingsJapgolly.victoryCore.victoryCoreStrings.monotoneY
    - typingsJapgolly.victoryCore.victoryCoreStrings.step
    - typingsJapgolly.victoryCore.victoryCoreStrings.stepAfter
    - typingsJapgolly.victoryCore.victoryCoreStrings.stepBefore
    - typingsJapgolly.victoryCore.victoryCoreStrings.natural
  */
  trait CurveName extends StObject
  object CurveName {
    
    inline def basis: typingsJapgolly.victoryCore.victoryCoreStrings.basis = "basis".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.basis]
    
    inline def bumpX: typingsJapgolly.victoryCore.victoryCoreStrings.bumpX = "bumpX".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.bumpX]
    
    inline def bumpY: typingsJapgolly.victoryCore.victoryCoreStrings.bumpY = "bumpY".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.bumpY]
    
    inline def bundle: typingsJapgolly.victoryCore.victoryCoreStrings.bundle = "bundle".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.bundle]
    
    inline def cardinal: typingsJapgolly.victoryCore.victoryCoreStrings.cardinal = "cardinal".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.cardinal]
    
    inline def catmullRom: typingsJapgolly.victoryCore.victoryCoreStrings.catmullRom = "catmullRom".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.catmullRom]
    
    inline def linear: typingsJapgolly.victoryCore.victoryCoreStrings.linear = "linear".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.linear]
    
    inline def monotoneX: typingsJapgolly.victoryCore.victoryCoreStrings.monotoneX = "monotoneX".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.monotoneX]
    
    inline def monotoneY: typingsJapgolly.victoryCore.victoryCoreStrings.monotoneY = "monotoneY".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.monotoneY]
    
    inline def natural: typingsJapgolly.victoryCore.victoryCoreStrings.natural = "natural".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.natural]
    
    inline def step: typingsJapgolly.victoryCore.victoryCoreStrings.step = "step".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.step]
    
    inline def stepAfter: typingsJapgolly.victoryCore.victoryCoreStrings.stepAfter = "stepAfter".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.stepAfter]
    
    inline def stepBefore: typingsJapgolly.victoryCore.victoryCoreStrings.stepBefore = "stepBefore".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.stepBefore]
  }
}
