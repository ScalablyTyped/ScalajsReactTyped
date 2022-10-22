package typingsJapgolly.bitArray

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bit-array", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BitArray {
    /**
      * Creates a new empty BitArray with the given length or initialises the BitArray with the given hex representation.
      */
    def this(size: Double) = this()
    def this(size: Double, hex: String) = this()
    
    /**
      * Bitwise AND on the values of this BitArray using BitArray x.
      */
    /* CompleteClass */
    override def and(x: BitArray): BitArray = js.native
    
    /**
      * Returns a copy of this BitArray.
      */
    /* CompleteClass */
    override def copy(): BitArray = js.native
    
    /**
      * Returns the total number of bits set to one in this BitArray.
      */
    /* CompleteClass */
    override def count(): Double = js.native
    
    /**
      * Returns true if this BitArray equals another. Two BitArrays are considered
      * equal if both have the same length and bit pattern.
      */
    /* CompleteClass */
    override def equals(x: BitArray): Boolean = js.native
    
    /**
      * Returns the value of the bit at index (boolean.)
      */
    /* CompleteClass */
    override def get(index: Double): Boolean = js.native
    
    /**
      * Inverts this BitArray.
      */
    /* CompleteClass */
    override def not(): BitArray = js.native
    
    /**
      * Bitwise OR on the values of this BitArray using BitArray x.
      */
    /* CompleteClass */
    override def or(x: BitArray): BitArray = js.native
    
    /**
      * Resets the BitArray so that it is empty and can be re-used.
      */
    /* CompleteClass */
    override def reset(): BitArray = js.native
    
    /**
      * Sets the bit at index to a value (boolean.)
      */
    /* CompleteClass */
    override def set(index: Double, value: Boolean): BitArray = js.native
    
    /**
      * Returns the total number of bits in this BitArray.
      */
    /* CompleteClass */
    override def size(): Double = js.native
    
    /**
      * Convert the BitArray to an Array of boolean values (slow).
      */
    /* CompleteClass */
    override def toArray(): js.Array[Boolean] = js.native
    
    /**
      * Returns a string representation of the BitArray with bits
      * in mathemetical order.
      */
    /* CompleteClass */
    override def toBinaryString(): String = js.native
    
    /**
      * Returns a hexadecimal string representation of the BitArray
      * with bits in logical order.
      */
    /* CompleteClass */
    override def toHexString(): String = js.native
    
    /**
      * Returns the JSON representation of this BitArray.
      */
    /* CompleteClass */
    override def toJSON(): String = js.native
    
    /**
      * Toggles the bit at index. If the bit is on, it is turned off. Likewise, if the bit is off it is turned on.
      */
    /* CompleteClass */
    override def toggle(index: Double): BitArray = js.native
    
    /**
      * Bitwise XOR on the values of this BitArray using BitArray x.
      */
    /* CompleteClass */
    override def xor(x: BitArray): BitArray = js.native
  }
  
  trait BitArray extends StObject {
    
    /**
      * Bitwise AND on the values of this BitArray using BitArray x.
      */
    def and(x: BitArray): BitArray
    
    /**
      * Returns a copy of this BitArray.
      */
    def copy(): BitArray
    
    /**
      * Returns the total number of bits set to one in this BitArray.
      */
    def count(): Double
    
    /**
      * Returns true if this BitArray equals another. Two BitArrays are considered
      * equal if both have the same length and bit pattern.
      */
    def equals(x: BitArray): Boolean
    
    /**
      * Returns the value of the bit at index (boolean.)
      */
    def get(index: Double): Boolean
    
    /**
      * Inverts this BitArray.
      */
    def not(): BitArray
    
    /**
      * Bitwise OR on the values of this BitArray using BitArray x.
      */
    def or(x: BitArray): BitArray
    
    /**
      * Resets the BitArray so that it is empty and can be re-used.
      */
    def reset(): BitArray
    
    /**
      * Sets the bit at index to a value (boolean.)
      */
    def set(index: Double, value: Boolean): BitArray
    
    /**
      * Returns the total number of bits in this BitArray.
      */
    def size(): Double
    
    /**
      * Convert the BitArray to an Array of boolean values (slow).
      */
    def toArray(): js.Array[Boolean]
    
    /**
      * Returns a string representation of the BitArray with bits
      * in mathemetical order.
      */
    def toBinaryString(): String
    
    /**
      * Returns a hexadecimal string representation of the BitArray
      * with bits in logical order.
      */
    def toHexString(): String
    
    /**
      * Returns the JSON representation of this BitArray.
      */
    def toJSON(): String
    
    /**
      * Toggles the bit at index. If the bit is on, it is turned off. Likewise, if the bit is off it is turned on.
      */
    def toggle(index: Double): BitArray
    
    /**
      * Bitwise XOR on the values of this BitArray using BitArray x.
      */
    def xor(x: BitArray): BitArray
  }
  object BitArray {
    
    inline def apply(
      and: BitArray => BitArray,
      copy: CallbackTo[BitArray],
      count: CallbackTo[Double],
      equals_ : BitArray => Boolean,
      get: Double => Boolean,
      not: CallbackTo[BitArray],
      or: BitArray => BitArray,
      reset: CallbackTo[BitArray],
      set: (Double, Boolean) => BitArray,
      size: CallbackTo[Double],
      toArray: CallbackTo[js.Array[Boolean]],
      toBinaryString: CallbackTo[String],
      toHexString: CallbackTo[String],
      toJSON: CallbackTo[String],
      toggle: Double => BitArray,
      xor: BitArray => BitArray
    ): BitArray = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), copy = copy.toJsFn, count = count.toJsFn, get = js.Any.fromFunction1(get), not = not.toJsFn, or = js.Any.fromFunction1(or), reset = reset.toJsFn, set = js.Any.fromFunction2(set), size = size.toJsFn, toArray = toArray.toJsFn, toBinaryString = toBinaryString.toJsFn, toHexString = toHexString.toJsFn, toJSON = toJSON.toJsFn, toggle = js.Any.fromFunction1(toggle), xor = js.Any.fromFunction1(xor))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[BitArray]
    }
    
    extension [Self <: BitArray](x: Self) {
      
      inline def setAnd(value: BitArray => BitArray): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setCopy(value: CallbackTo[BitArray]): Self = StObject.set(x, "copy", value.toJsFn)
      
      inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
      
      inline def setEquals_(value: BitArray => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setGet(value: Double => Boolean): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setNot(value: CallbackTo[BitArray]): Self = StObject.set(x, "not", value.toJsFn)
      
      inline def setOr(value: BitArray => BitArray): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
      
      inline def setReset(value: CallbackTo[BitArray]): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setSet(value: (Double, Boolean) => BitArray): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
      
      inline def setToArray(value: CallbackTo[js.Array[Boolean]]): Self = StObject.set(x, "toArray", value.toJsFn)
      
      inline def setToBinaryString(value: CallbackTo[String]): Self = StObject.set(x, "toBinaryString", value.toJsFn)
      
      inline def setToHexString(value: CallbackTo[String]): Self = StObject.set(x, "toHexString", value.toJsFn)
      
      inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "toJSON", value.toJsFn)
      
      inline def setToggle(value: Double => BitArray): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      inline def setXor(value: BitArray => BitArray): Self = StObject.set(x, "xor", js.Any.fromFunction1(value))
    }
  }
}
