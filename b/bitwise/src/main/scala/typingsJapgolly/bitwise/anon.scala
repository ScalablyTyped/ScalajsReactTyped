package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Bit
import typingsJapgolly.bitwise.typesMod.Bits
import typingsJapgolly.bitwise.typesMod.BooleanBits
import typingsJapgolly.bitwise.typesMod.Byte
import typingsJapgolly.bitwise.typesMod.Nibble
import typingsJapgolly.bitwise.typesMod.UInt4
import typingsJapgolly.bitwise.typesMod.UInt8
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait And extends StObject {
    
    def and(bits1: Bits, bits2: Bits): Bits = js.native
    
    def circularShiftLeft(bits: Bits, amount: Double): Bits = js.native
    
    def circularShiftRight(bits: Bits, amount: Double): Bits = js.native
    
    def nand(bits1: Bits, bits2: Bits): Bits = js.native
    
    def nor(bits1: Bits, bits2: Bits): Bits = js.native
    
    def not(bits: Bits): Bits = js.native
    
    def or(bits1: Bits, bits2: Bits): Bits = js.native
    
    def reduceAnd(bits: Bits): Bit = js.native
    
    def reduceNand(bits: Bits): Bit = js.native
    
    def reduceNor(bits: Bits): Bit = js.native
    
    def reduceOr(bits: Bits): Bit = js.native
    
    def reduceXnor(bits: Bits): Bit = js.native
    
    def reduceXor(bits: Bits): Bit = js.native
    
    def toBoolean(bits: Bits): BooleanBits = js.native
    
    def toString(bits: Bits): String = js.native
    def toString(bits: Bits, spacing: Double): String = js.native
    def toString(bits: Bits, spacing: Double, spacer: String): String = js.native
    def toString(bits: Bits, spacing: Unit, spacer: String): String = js.native
    
    def xnor(bits1: Bits, bits2: Bits): Bits = js.native
    
    def xor(bits1: Bits, bits2: Bits): Bits = js.native
  }
  
  @js.native
  trait Create extends StObject {
    
    def and(a: Buffer, b: Buffer): Buffer = js.native
    def and(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    def create(bits: Bits): Buffer = js.native
    
    def modify(buffer: Buffer, bits: Bits): Unit = js.native
    def modify(buffer: Buffer, bits: Bits, offset: Double): Unit = js.native
    
    def nand(a: Buffer, b: Buffer): Buffer = js.native
    def nand(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    def nor(a: Buffer, b: Buffer): Buffer = js.native
    def nor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    def not(buffer: Buffer): Buffer = js.native
    
    def or(a: Buffer, b: Buffer): Buffer = js.native
    def or(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    def read(buffer: Buffer): Bits = js.native
    def read(buffer: Buffer, offset: Double): Bits = js.native
    def read(buffer: Buffer, offset: Double, length: Double): Bits = js.native
    def read(buffer: Buffer, offset: Unit, length: Double): Bits = js.native
    
    def readInt(buffer: Buffer): Double = js.native
    def readInt(buffer: Buffer, offset: Double): Double = js.native
    def readInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    def readInt(buffer: Buffer, offset: Unit, length: Double): Double = js.native
    
    def readUInt(buffer: Buffer): Double = js.native
    def readUInt(buffer: Buffer, offset: Double): Double = js.native
    def readUInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    def readUInt(buffer: Buffer, offset: Unit, length: Double): Double = js.native
    
    def xnor(a: Buffer, b: Buffer): Buffer = js.native
    def xnor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    def xor(a: Buffer, b: Buffer): Buffer = js.native
    def xor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  }
  
  trait GetBit extends StObject {
    
    def getBit(int32: Double, position: Double): Bit
    
    def setBit(int32: Double, position: Double, value: Bit): Bit
    
    def toggleBit(int32: Double, position: Double): Double
  }
  object GetBit {
    
    inline def apply(
      getBit: (Double, Double) => Bit,
      setBit: (Double, Double, Bit) => Bit,
      toggleBit: (Double, Double) => Double
    ): GetBit = {
      val __obj = js.Dynamic.literal(getBit = js.Any.fromFunction2(getBit), setBit = js.Any.fromFunction3(setBit), toggleBit = js.Any.fromFunction2(toggleBit))
      __obj.asInstanceOf[GetBit]
    }
    
    extension [Self <: GetBit](x: Self) {
      
      inline def setGetBit(value: (Double, Double) => Bit): Self = StObject.set(x, "getBit", js.Any.fromFunction2(value))
      
      inline def setSetBit(value: (Double, Double, Bit) => Bit): Self = StObject.set(x, "setBit", js.Any.fromFunction3(value))
      
      inline def setToggleBit(value: (Double, Double) => Double): Self = StObject.set(x, "toggleBit", js.Any.fromFunction2(value))
    }
  }
  
  trait Read extends StObject {
    
    def read(byte: UInt8): Byte
    
    def write(byte: Byte): UInt8
  }
  object Read {
    
    inline def apply(read: UInt8 => Byte, write: Byte => UInt8): Read = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Read]
    }
    
    extension [Self <: Read](x: Self) {
      
      inline def setRead(value: UInt8 => Byte): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setWrite(value: Byte => UInt8): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait ToBits extends StObject {
    
    def toBits(string: String): Bits
  }
  object ToBits {
    
    inline def apply(toBits: String => Bits): ToBits = {
      val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
      __obj.asInstanceOf[ToBits]
    }
    
    extension [Self <: ToBits](x: Self) {
      
      inline def setToBits(value: String => Bits): Self = StObject.set(x, "toBits", js.Any.fromFunction1(value))
    }
  }
  
  trait Write extends StObject {
    
    def read(nibble: UInt4): Nibble
    
    def write(nibble: Nibble): UInt4
  }
  object Write {
    
    inline def apply(read: UInt4 => Nibble, write: Nibble => UInt4): Write = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Write]
    }
    
    extension [Self <: Write](x: Self) {
      
      inline def setRead(value: UInt4 => Nibble): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setWrite(value: Nibble => UInt4): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
