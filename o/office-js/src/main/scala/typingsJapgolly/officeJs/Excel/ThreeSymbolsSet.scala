package typingsJapgolly.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeSymbolsSet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var greenCheckSymbol: Icon
  
  var redCrossSymbol: Icon
  
  var yellowExclamationSymbol: Icon
}
object ThreeSymbolsSet {
  
  inline def apply(greenCheckSymbol: Icon, redCrossSymbol: Icon, yellowExclamationSymbol: Icon): ThreeSymbolsSet = {
    val __obj = js.Dynamic.literal(greenCheckSymbol = greenCheckSymbol.asInstanceOf[js.Any], redCrossSymbol = redCrossSymbol.asInstanceOf[js.Any], yellowExclamationSymbol = yellowExclamationSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeSymbolsSet]
  }
  
  extension [Self <: ThreeSymbolsSet](x: Self) {
    
    inline def setGreenCheckSymbol(value: Icon): Self = StObject.set(x, "greenCheckSymbol", value.asInstanceOf[js.Any])
    
    inline def setRedCrossSymbol(value: Icon): Self = StObject.set(x, "redCrossSymbol", value.asInstanceOf[js.Any])
    
    inline def setYellowExclamationSymbol(value: Icon): Self = StObject.set(x, "yellowExclamationSymbol", value.asInstanceOf[js.Any])
  }
}
