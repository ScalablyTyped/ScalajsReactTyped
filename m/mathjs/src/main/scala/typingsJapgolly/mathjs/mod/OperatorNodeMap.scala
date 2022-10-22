package typingsJapgolly.mathjs.mod

import typingsJapgolly.mathjs.mathjsStrings.Ampersand
import typingsJapgolly.mathjs.mathjsStrings.Asterisk
import typingsJapgolly.mathjs.mathjsStrings.DotAsterisk
import typingsJapgolly.mathjs.mathjsStrings.DotSlash
import typingsJapgolly.mathjs.mathjsStrings.EqualssignEqualssign
import typingsJapgolly.mathjs.mathjsStrings.Exclamationmark
import typingsJapgolly.mathjs.mathjsStrings.ExclamationmarkEqualssign
import typingsJapgolly.mathjs.mathjsStrings.Greaterthansign
import typingsJapgolly.mathjs.mathjsStrings.GreaterthansignEqualssign
import typingsJapgolly.mathjs.mathjsStrings.GreaterthansignGreaterthansign
import typingsJapgolly.mathjs.mathjsStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsJapgolly.mathjs.mathjsStrings.Lessthansign
import typingsJapgolly.mathjs.mathjsStrings.LessthansignEqualssign
import typingsJapgolly.mathjs.mathjsStrings.LessthansignLessthansign
import typingsJapgolly.mathjs.mathjsStrings.Plussign
import typingsJapgolly.mathjs.mathjsStrings.Slash
import typingsJapgolly.mathjs.mathjsStrings.Tilde
import typingsJapgolly.mathjs.mathjsStrings.Verticalline
import typingsJapgolly.mathjs.mathjsStrings.`-_`
import typingsJapgolly.mathjs.mathjsStrings.`Dot^`
import typingsJapgolly.mathjs.mathjsStrings.`^Verticalline`
import typingsJapgolly.mathjs.mathjsStrings.and
import typingsJapgolly.mathjs.mathjsStrings.not
import typingsJapgolly.mathjs.mathjsStrings.or
import typingsJapgolly.mathjs.mathjsStrings.to
import typingsJapgolly.mathjs.mathjsStrings.xor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatorNodeMap extends StObject {
  
  var add: Plussign
  
  var and: typingsJapgolly.mathjs.mathjsStrings.and
  
  var bitAnd: Ampersand
  
  var bitNot: Tilde
  
  var bitOr: Verticalline
  
  var bitXor: `^Verticalline`
  
  var divide: Slash
  
  var dotDivide: DotSlash
  
  var dotMultiply: DotAsterisk
  
  var dotPow: `Dot^`
  
  var equal: EqualssignEqualssign
  
  var factorial: Exclamationmark
  
  var larger: Greaterthansign
  
  var largerEq: GreaterthansignEqualssign
  
  var leftShift: LessthansignLessthansign
  
  var mod: typingsJapgolly.mathjs.mathjsStrings.mod
  
  var multiply: Asterisk
  
  var not: typingsJapgolly.mathjs.mathjsStrings.not
  
  var or: typingsJapgolly.mathjs.mathjsStrings.or
  
  var pow: typingsJapgolly.mathjs.mathjsStrings.^
  
  var rightArithShift: GreaterthansignGreaterthansign
  
  var rightLogShift: GreaterthansignGreaterthansignGreaterthansign
  
  var smaller: Lessthansign
  
  var smallerEq: LessthansignEqualssign
  
  var subtract: `-_`
  
  var to: typingsJapgolly.mathjs.mathjsStrings.to
  
  var unaryMinus: `-_`
  
  var unaryPlus: Plussign
  
  var unequal: ExclamationmarkEqualssign
  
  var xor: typingsJapgolly.mathjs.mathjsStrings.xor
}
object OperatorNodeMap {
  
  inline def apply(): OperatorNodeMap = {
    val __obj = js.Dynamic.literal(add = "+", and = "and", bitAnd = "&", bitNot = "~", bitOr = "|", bitXor = "^|", divide = "/", dotDivide = "./", dotMultiply = ".*", dotPow = ".^", equal = "==", factorial = "!", larger = ">", largerEq = ">=", leftShift = "<<", mod = "mod", multiply = "*", not = "not", or = "or", pow = "^", rightArithShift = ">>", rightLogShift = ">>>", smaller = "<", smallerEq = "<=", subtract = "-", to = "to", unaryMinus = "-", unaryPlus = "+", unequal = "!=", xor = "xor")
    __obj.asInstanceOf[OperatorNodeMap]
  }
  
  extension [Self <: OperatorNodeMap](x: Self) {
    
    inline def setAdd(value: Plussign): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAnd(value: and): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setBitAnd(value: Ampersand): Self = StObject.set(x, "bitAnd", value.asInstanceOf[js.Any])
    
    inline def setBitNot(value: Tilde): Self = StObject.set(x, "bitNot", value.asInstanceOf[js.Any])
    
    inline def setBitOr(value: Verticalline): Self = StObject.set(x, "bitOr", value.asInstanceOf[js.Any])
    
    inline def setBitXor(value: `^Verticalline`): Self = StObject.set(x, "bitXor", value.asInstanceOf[js.Any])
    
    inline def setDivide(value: Slash): Self = StObject.set(x, "divide", value.asInstanceOf[js.Any])
    
    inline def setDotDivide(value: DotSlash): Self = StObject.set(x, "dotDivide", value.asInstanceOf[js.Any])
    
    inline def setDotMultiply(value: DotAsterisk): Self = StObject.set(x, "dotMultiply", value.asInstanceOf[js.Any])
    
    inline def setDotPow(value: `Dot^`): Self = StObject.set(x, "dotPow", value.asInstanceOf[js.Any])
    
    inline def setEqual(value: EqualssignEqualssign): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
    
    inline def setFactorial(value: Exclamationmark): Self = StObject.set(x, "factorial", value.asInstanceOf[js.Any])
    
    inline def setLarger(value: Greaterthansign): Self = StObject.set(x, "larger", value.asInstanceOf[js.Any])
    
    inline def setLargerEq(value: GreaterthansignEqualssign): Self = StObject.set(x, "largerEq", value.asInstanceOf[js.Any])
    
    inline def setLeftShift(value: LessthansignLessthansign): Self = StObject.set(x, "leftShift", value.asInstanceOf[js.Any])
    
    inline def setMod(value: typingsJapgolly.mathjs.mathjsStrings.mod): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    inline def setMultiply(value: Asterisk): Self = StObject.set(x, "multiply", value.asInstanceOf[js.Any])
    
    inline def setNot(value: not): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setOr(value: or): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setPow(value: typingsJapgolly.mathjs.mathjsStrings.^): Self = StObject.set(x, "pow", value.asInstanceOf[js.Any])
    
    inline def setRightArithShift(value: GreaterthansignGreaterthansign): Self = StObject.set(x, "rightArithShift", value.asInstanceOf[js.Any])
    
    inline def setRightLogShift(value: GreaterthansignGreaterthansignGreaterthansign): Self = StObject.set(x, "rightLogShift", value.asInstanceOf[js.Any])
    
    inline def setSmaller(value: Lessthansign): Self = StObject.set(x, "smaller", value.asInstanceOf[js.Any])
    
    inline def setSmallerEq(value: LessthansignEqualssign): Self = StObject.set(x, "smallerEq", value.asInstanceOf[js.Any])
    
    inline def setSubtract(value: `-_`): Self = StObject.set(x, "subtract", value.asInstanceOf[js.Any])
    
    inline def setTo(value: to): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setUnaryMinus(value: `-_`): Self = StObject.set(x, "unaryMinus", value.asInstanceOf[js.Any])
    
    inline def setUnaryPlus(value: Plussign): Self = StObject.set(x, "unaryPlus", value.asInstanceOf[js.Any])
    
    inline def setUnequal(value: ExclamationmarkEqualssign): Self = StObject.set(x, "unequal", value.asInstanceOf[js.Any])
    
    inline def setXor(value: xor): Self = StObject.set(x, "xor", value.asInstanceOf[js.Any])
  }
}
