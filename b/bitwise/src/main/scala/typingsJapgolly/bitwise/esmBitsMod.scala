package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Bit
import typingsJapgolly.bitwise.typesMod.Bits
import typingsJapgolly.bitwise.typesMod.BooleanBits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBitsMod {
  
  @JSImport("bitwise/esm/bits", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("bitwise/esm/bits", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def and(bits1: Bits, bits2: Bits): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[Bits]
    
    inline def circularShiftLeft(bits: Bits, amount: Double): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("circularShiftLeft")(bits.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Bits]
    
    inline def circularShiftRight(bits: Bits, amount: Double): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("circularShiftRight")(bits.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Bits]
    
    inline def nand(bits1: Bits, bits2: Bits): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("nand")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[Bits]
    
    inline def nor(bits1: Bits, bits2: Bits): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("nor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[Bits]
    
    inline def not(bits: Bits): Bits = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(bits.asInstanceOf[js.Any]).asInstanceOf[Bits]
    
    inline def or(bits1: Bits, bits2: Bits): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[Bits]
    
    inline def reduceAnd(bits: Bits): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceAnd")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    inline def reduceNand(bits: Bits): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceNand")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    inline def reduceNor(bits: Bits): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceNor")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    inline def reduceOr(bits: Bits): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceOr")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    inline def reduceXnor(bits: Bits): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceXnor")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    inline def reduceXor(bits: Bits): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceXor")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    inline def toBoolean(bits: Bits): BooleanBits = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(bits.asInstanceOf[js.Any]).asInstanceOf[BooleanBits]
    
    inline def toString_(bits: Bits): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toString_(bits: Bits, spacing: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toString_(bits: Bits, spacing: Double, spacer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], spacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toString_(bits: Bits, spacing: Unit, spacer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], spacer.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def xnor(bits1: Bits, bits2: Bits): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("xnor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[Bits]
    
    inline def xor(bits1: Bits, bits2: Bits): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[Bits]
  }
  
  inline def and(bits1: typingsJapgolly.bitwise.esmTypesMod.Bits, bits2: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bits]
  
  inline def circularShiftLeft(bits: typingsJapgolly.bitwise.esmTypesMod.Bits, amount: Double): typingsJapgolly.bitwise.esmTypesMod.Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("circularShiftLeft")(bits.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bits]
  
  inline def circularShiftRight(bits: typingsJapgolly.bitwise.esmTypesMod.Bits, amount: Double): typingsJapgolly.bitwise.esmTypesMod.Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("circularShiftRight")(bits.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bits]
  
  inline def nand(bits1: typingsJapgolly.bitwise.esmTypesMod.Bits, bits2: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("nand")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bits]
  
  inline def nor(bits1: typingsJapgolly.bitwise.esmTypesMod.Bits, bits2: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("nor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bits]
  
  inline def not(bits: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bits = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bits]
  
  inline def or(bits1: typingsJapgolly.bitwise.esmTypesMod.Bits, bits2: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bits]
  
  inline def reduceAnd(bits: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceAnd")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bit]
  
  inline def reduceNand(bits: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceNand")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bit]
  
  inline def reduceNor(bits: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceNor")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bit]
  
  inline def reduceOr(bits: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceOr")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bit]
  
  inline def reduceXnor(bits: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceXnor")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bit]
  
  inline def reduceXor(bits: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceXor")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bit]
  
  inline def toBoolean(bits: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.BooleanBits = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.BooleanBits]
  
  inline def toString_(bits: typingsJapgolly.bitwise.esmTypesMod.Bits): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(bits: typingsJapgolly.bitwise.esmTypesMod.Bits, spacing: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(bits: typingsJapgolly.bitwise.esmTypesMod.Bits, spacing: Double, spacer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], spacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(bits: typingsJapgolly.bitwise.esmTypesMod.Bits, spacing: Unit, spacer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], spacer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def xnor(bits1: typingsJapgolly.bitwise.esmTypesMod.Bits, bits2: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("xnor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bits]
  
  inline def xor(bits1: typingsJapgolly.bitwise.esmTypesMod.Bits, bits2: typingsJapgolly.bitwise.esmTypesMod.Bits): typingsJapgolly.bitwise.esmTypesMod.Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bits]
}
