package typingsJapgolly.bnJs

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.bnJs.anon.A
import typingsJapgolly.bnJs.anon.Div
import typingsJapgolly.bnJs.bnJsInts.`-1`
import typingsJapgolly.bnJs.bnJsInts.`0`
import typingsJapgolly.bnJs.bnJsInts.`1`
import typingsJapgolly.bnJs.bnJsInts.`26`
import typingsJapgolly.bnJs.bnJsStrings.div
import typingsJapgolly.bnJs.bnJsStrings.hex
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bn.js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BN {
    def this(number: String) = this()
    def this(number: js.Array[Double]) = this()
    def this(number: js.typedarray.Uint8Array) = this()
    def this(number: Double) = this()
    def this(number: BN) = this()
    def this(number: Buffer) = this()
    def this(number: String, base: Double) = this()
    def this(number: String, base: hex) = this()
    def this(number: String, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double) = this()
    def this(number: js.Array[Double], base: hex) = this()
    def this(number: js.Array[Double], endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: Double) = this()
    def this(number: js.typedarray.Uint8Array, base: hex) = this()
    def this(number: js.typedarray.Uint8Array, endian: Endianness) = this()
    def this(number: Double, base: Double) = this()
    def this(number: Double, base: hex) = this()
    def this(number: Double, endian: Endianness) = this()
    def this(number: BN, base: Double) = this()
    def this(number: BN, base: hex) = this()
    def this(number: BN, endian: Endianness) = this()
    def this(number: Buffer, base: Double) = this()
    def this(number: Buffer, base: hex) = this()
    def this(number: Buffer, endian: Endianness) = this()
    def this(number: String, base: Double, endian: Endianness) = this()
    def this(number: String, base: Unit, endian: Endianness) = this()
    def this(number: String, base: hex, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Unit, endian: Endianness) = this()
    def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: Double, endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: Unit, endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: hex, endian: Endianness) = this()
    def this(number: Double, base: Double, endian: Endianness) = this()
    def this(number: Double, base: Unit, endian: Endianness) = this()
    def this(number: Double, base: hex, endian: Endianness) = this()
    def this(number: BN, base: Double, endian: Endianness) = this()
    def this(number: BN, base: Unit, endian: Endianness) = this()
    def this(number: BN, base: hex, endian: Endianness) = this()
    def this(number: Buffer, base: Double, endian: Endianness) = this()
    def this(number: Buffer, base: Unit, endian: Endianness) = this()
    def this(number: Buffer, base: hex, endian: Endianness) = this()
  }
  @JSImport("bn.js", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (Instantiable3[
    /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | BN, 
    /* base */ js.UndefOr[Double | hex], 
    /* endian */ js.UndefOr[Endianness], 
    BN
  ]) = js.native
  
  @js.native
  trait BN extends StObject {
    
    /**
      * @description absolute value
      */
    def abs(): BN = js.native
    
    /**
      * @description addition
      */
    def add(b: BN): BN = js.native
    
    /**
      * @description addition
      */
    def addn(b: Double): BN = js.native
    
    /**
      * @description and
      */
    def and(b: BN): BN = js.native
    
    /**
      * @description and (NOTE: `andln` is going to be replaced with `andn` in future)
      */
    def andln(b: Double): BN = js.native
    
    /**
      * @description add `1 << b` to the number
      */
    def bincn(b: Double): BN = js.native
    
    /**
      * @description get number of bits occupied
      */
    def bitLength(): Double = js.native
    
    /**
      * @description return number of bytes occupied
      */
    def byteLength(): Double = js.native
    
    /**
      * @description compare numbers and return `-1 (a < b)`, `0 (a == b)`, or `1 (a > b)` depending on the comparison result
      */
    def cmp(b: BN): `-1` | `0` | `1` = js.native
    
    /**
      * @description compare numbers and return `-1 (a < b)`, `0 (a == b)`, or `1 (a > b)` depending on the comparison result
      */
    def cmpn(b: Double): `-1` | `0` | `1` = js.native
    
    /**
      * @description divide
      */
    def div(b: BN): BN = js.native
    
    /**
      * @description  rounded division
      */
    def divRound(b: BN): BN = js.native
    
    /**
      * @description division with remainder
      */
    def divmod(b: BN): Div = js.native
    def divmod(b: BN, mode: div | typingsJapgolly.bnJs.bnJsStrings.mod): Div = js.native
    def divmod(b: BN, mode: div | typingsJapgolly.bnJs.bnJsStrings.mod, positive: Boolean): Div = js.native
    def divmod(b: BN, mode: Unit, positive: Boolean): Div = js.native
    
    /**
      * @description divide
      */
    def divn(b: Double): BN = js.native
    
    /**
      * @description Extended GCD results `({ a: ..., b: ..., gcd: ... })`
      */
    def egcd(b: BN): A = js.native
    
    /**
      * @description a equals b
      */
    def eq(b: BN): Boolean = js.native
    
    /**
      * @description a equals b
      */
    def eqn(b: Double): Boolean = js.native
    
    /**
      * @description  convert from two's complement representation, where width is the bit width
      */
    def fromTwos(width: Double): BN = js.native
    
    /**
      * @description GCD
      */
    def gcd(b: BN): BN = js.native
    
    /**
      * @description a greater than b
      */
    def gt(b: BN): Boolean = js.native
    
    /**
      * @description a greater than or equals b
      */
    def gte(b: BN): Boolean = js.native
    
    /**
      * @description a greater than or equals b
      */
    def gten(b: Double): Boolean = js.native
    
    /**
      * @description a greater than b
      */
    def gtn(b: Double): Boolean = js.native
    
    /**
      * @description absolute value
      */
    def iabs(): BN = js.native
    
    /**
      * @description  addition
      */
    def iadd(b: BN): BN = js.native
    
    /**
      * @description addition
      */
    def iaddn(b: Double): BN = js.native
    
    /**
      * @description and
      */
    def iand(b: BN): BN = js.native
    
    /**
      * @description divide
      */
    def idivn(b: Double): BN = js.native
    
    /**
      * @description clear bits with indexes higher or equal to `b`
      */
    def imaskn(b: Double): BN = js.native
    
    /**
      * @description multiply
      */
    def imul(b: BN): BN = js.native
    
    /**
      * @description multiply
      */
    def imuln(b: Double): BN = js.native
    
    /**
      * @description negate sign
      */
    def ineg(): BN = js.native
    
    /**
      * @description not (for the width specified by `w`)
      */
    def inotn(w: Double): BN = js.native
    
    /**
      * @description inverse `a` modulo `b`
      */
    def invm(b: BN): BN = js.native
    
    /**
      * @description or
      */
    def ior(b: BN): BN = js.native
    
    /**
      * @description  check if value is even
      */
    def isEven(): Boolean = js.native
    
    /**
      * @description  true if the number is negative
      */
    def isNeg(): Boolean = js.native
    
    /**
      * @description   check if value is odd
      */
    def isOdd(): Boolean = js.native
    
    /**
      * @description  check if value is zero
      */
    def isZero(): Boolean = js.native
    
    /**
      * @description shift left
      */
    def ishln(b: Double): BN = js.native
    
    /**
      * @description shift right (unimplemented https://github.com/indutny/bn.js/blob/master/lib/bn.js#L2086)
      */
    def ishrn(b: Double): BN = js.native
    
    /**
      * @description square
      */
    def isqr(): BN = js.native
    
    /**
      * @description subtraction
      */
    def isub(b: BN): BN = js.native
    
    /**
      * @description subtraction
      */
    def isubn(b: Double): BN = js.native
    
    /**
      * @description and
      */
    def iuand(b: BN): BN = js.native
    
    /**
      * @description or
      */
    def iuor(b: BN): BN = js.native
    
    /**
      * @description shift left
      */
    def iushln(b: Double): BN = js.native
    
    /**
      * @description shift right
      */
    def iushrn(b: Double): BN = js.native
    
    /**
      * @description xor
      */
    def iuxor(b: BN): BN = js.native
    
    /**
      * @description xor
      */
    def ixor(b: BN): BN = js.native
    
    /**
      * @description a less than b
      */
    def lt(b: BN): Boolean = js.native
    
    /**
      * @description a less than or equals b
      */
    def lte(b: BN): Boolean = js.native
    
    /**
      * @description a less than or equals b
      */
    def lten(b: Double): Boolean = js.native
    
    /**
      * @description a less than b
      */
    def ltn(b: Double): Boolean = js.native
    
    /**
      * @description clear bits with indexes higher or equal to `b`
      */
    def maskn(b: Double): BN = js.native
    
    /**
      * @description reduct
      */
    def mod(b: BN): BN = js.native
    
    /**
      * @deprecated
      * @description reduct
      */
    def modn(b: Double): Double = js.native
    
    /**
      * @description reduct
      */
    def modrn(b: Double): Double = js.native
    
    /**
      * @description multiply
      */
    def mul(b: BN): BN = js.native
    
    /**
      * @description multiply
      */
    def muln(b: Double): BN = js.native
    
    /**
      * @description negate sign
      */
    def neg(): BN = js.native
    
    /**
      * @description not (for the width specified by `w`)
      */
    def notn(w: Double): BN = js.native
    
    /**
      * @description or
      */
    def or(b: BN): BN = js.native
    
    /**
      * @description raise `a` to the power of `b`
      */
    def pow(b: BN): BN = js.native
    
    /**
      * @description set specified bit to 1
      */
    def setn(b: Double): BN = js.native
    
    /**
      * @description shift left
      */
    def shln(b: Double): BN = js.native
    
    /**
      * @description shift right
      */
    def shrn(b: Double): BN = js.native
    
    /**
      * @description square
      */
    def sqr(): BN = js.native
    
    /**
      * @description subtraction
      */
    def sub(b: BN): BN = js.native
    
    /**
      * @description subtraction
      */
    def subn(b: Double): BN = js.native
    
    /**
      * @description  test if specified bit is set
      */
    def testn(b: Double): Boolean = js.native
    
    /**
      * @description  convert to byte Array, and optionally zero pad to length, throwing if already exceeding
      */
    def toArray(): js.Array[Double] = js.native
    def toArray(endian: Unit, length: Double): js.Array[Double] = js.native
    def toArray(endian: Endianness): js.Array[Double] = js.native
    def toArray(endian: Endianness, length: Double): js.Array[Double] = js.native
    
    def toArrayLike(ArrayType: js.Array[Any]): js.Array[Any] = js.native
    def toArrayLike(ArrayType: js.Array[Any], endian: Unit, length: Double): js.Array[Any] = js.native
    def toArrayLike(ArrayType: js.Array[Any], endian: Endianness): js.Array[Any] = js.native
    def toArrayLike(ArrayType: js.Array[Any], endian: Endianness, length: Double): js.Array[Any] = js.native
    /**
      * @description convert to an instance of `type`, which must behave like an Array
      */
    def toArrayLike(ArrayType: BufferConstructor): Buffer = js.native
    def toArrayLike(ArrayType: BufferConstructor, endian: Unit, length: Double): Buffer = js.native
    def toArrayLike(ArrayType: BufferConstructor, endian: Endianness): Buffer = js.native
    def toArrayLike(ArrayType: BufferConstructor, endian: Endianness, length: Double): Buffer = js.native
    
    /**
      * @description  convert to Node.js Buffer (if available). For compatibility with browserify and similar tools, use this instead: a.toArrayLike(Buffer, endian, length)
      */
    def toBuffer(): Buffer = js.native
    def toBuffer(endian: Unit, length: Double): Buffer = js.native
    def toBuffer(endian: Endianness): Buffer = js.native
    def toBuffer(endian: Endianness, length: Double): Buffer = js.native
    
    /**
      * @description convert to JSON compatible hex string (alias of toString(16))
      */
    def toJSON(): String = js.native
    
    /**
      * @description convert to Javascript Number (limited to 53 bits)
      */
    def toNumber(): Double = js.native
    
    /**
      * @description Convert number to red
      */
    def toRed(reductionContext: ReductionContext): RedBN = js.native
    
    def toString(base: Double): String = js.native
    def toString(base: Double, length: Double): String = js.native
    def toString(base: Unit, length: Double): String = js.native
    @JSName("toString")
    def toString_hex(base: hex): String = js.native
    @JSName("toString")
    def toString_hex(base: hex, length: Double): String = js.native
    
    /**
      * @description convert to two's complement representation, where width is bit width
      */
    def toTwos(width: Double): BN = js.native
    
    /**
      * @description and
      */
    def uand(b: BN): BN = js.native
    
    /**
      * @description compare numbers and return `-1 (a < b)`, `0 (a == b)`, or `1 (a > b)` depending on the comparison result
      */
    def ucmp(b: BN): `-1` | `0` | `1` = js.native
    
    /**
      * @description reduct
      */
    def umod(b: BN): BN = js.native
    
    /**
      * @description or
      */
    def uor(b: BN): BN = js.native
    
    /**
      * @description shift left
      */
    def ushln(b: Double): BN = js.native
    
    /**
      * @description shift right
      */
    def ushrn(b: Double): BN = js.native
    
    /**
      * @description xor
      */
    def uxor(b: BN): BN = js.native
    
    /**
      * @description xor
      */
    def xor(b: BN): BN = js.native
    
    /**
      * @description return number of less-significant consequent zero bits (example: 1010000 has 4 zero bits)
      */
    def zeroBits(): Double = js.native
  }
  /* static member */
  @JSImport("bn.js", "BN")
  @js.native
  def BN: Instantiable3[
    /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | BN, 
    /* base */ js.UndefOr[Double | hex], 
    /* endian */ js.UndefOr[Endianness], 
    BN
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bn.js", "BN")
  @js.native
  open class BNCls protected ()
    extends StObject
       with BN {
    def this(number: String) = this()
    def this(number: js.Array[Double]) = this()
    def this(number: js.typedarray.Uint8Array) = this()
    def this(number: Double) = this()
    def this(number: BN) = this()
    def this(number: Buffer) = this()
    def this(number: String, base: Double) = this()
    def this(number: String, base: hex) = this()
    def this(number: js.Array[Double], base: Double) = this()
    def this(number: js.Array[Double], base: hex) = this()
    def this(number: js.typedarray.Uint8Array, base: Double) = this()
    def this(number: js.typedarray.Uint8Array, base: hex) = this()
    def this(number: Double, base: Double) = this()
    def this(number: Double, base: hex) = this()
    def this(number: BN, base: Double) = this()
    def this(number: BN, base: hex) = this()
    def this(number: Buffer, base: Double) = this()
    def this(number: Buffer, base: hex) = this()
    def this(number: String, base: Double, endian: Endianness) = this()
    def this(number: String, base: Unit, endian: Endianness) = this()
    def this(number: String, base: hex, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Unit, endian: Endianness) = this()
    def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: Double, endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: Unit, endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: hex, endian: Endianness) = this()
    def this(number: Double, base: Double, endian: Endianness) = this()
    def this(number: Double, base: Unit, endian: Endianness) = this()
    def this(number: Double, base: hex, endian: Endianness) = this()
    def this(number: BN, base: Double, endian: Endianness) = this()
    def this(number: BN, base: Unit, endian: Endianness) = this()
    def this(number: BN, base: hex, endian: Endianness) = this()
    def this(number: Buffer, base: Double, endian: Endianness) = this()
    def this(number: Buffer, base: Unit, endian: Endianness) = this()
    def this(number: Buffer, base: hex, endian: Endianness) = this()
  }
  
  inline def BN_=(
    x: Instantiable3[
      /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | BN, 
      /* base */ js.UndefOr[Double | hex], 
      /* endian */ js.UndefOr[Endianness], 
      BN
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BN")(x.asInstanceOf[js.Any])
  
  /**
    * @description returns true if the supplied object is a BN.js instance
    */
  /* static member */
  inline def isBN(b: Any): /* is bn.js.bn.js.BN */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBN")(b.asInstanceOf[js.Any]).asInstanceOf[/* is bn.js.bn.js.BN */ Boolean]
  
  /**
    * @description returns the maximum of 2 BN instances.
    */
  /* static member */
  inline def max(left: BN, right: BN): BN = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BN]
  
  /**
    * @description returns the minimum of 2 BN instances.
    */
  /* static member */
  inline def min(left: BN, right: BN): BN = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BN]
  
  /**
    * @description  create a reduction context  with the Montgomery trick.
    */
  /* static member */
  inline def mont(num: BN): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("mont")(num.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
  
  /**
    * @description  create a reduction context
    */
  /* static member */
  inline def red(reductionContext: BN): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(reductionContext.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
  inline def red(reductionContext: IPrimeName): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(reductionContext.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
  
  /* static member */
  @JSImport("bn.js", "wordSize")
  @js.native
  def wordSize: `26` = js.native
  inline def wordSize_=(x: `26`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordSize")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bnJs.bnJsStrings.le
    - typingsJapgolly.bnJs.bnJsStrings.be
  */
  trait Endianness extends StObject
  object Endianness {
    
    inline def be: typingsJapgolly.bnJs.bnJsStrings.be = "be".asInstanceOf[typingsJapgolly.bnJs.bnJsStrings.be]
    
    inline def le: typingsJapgolly.bnJs.bnJsStrings.le = "le".asInstanceOf[typingsJapgolly.bnJs.bnJsStrings.le]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bnJs.bnJsStrings.k256
    - typingsJapgolly.bnJs.bnJsStrings.p224
    - typingsJapgolly.bnJs.bnJsStrings.p192
    - typingsJapgolly.bnJs.bnJsStrings.p25519
  */
  trait IPrimeName extends StObject
  object IPrimeName {
    
    inline def k256: typingsJapgolly.bnJs.bnJsStrings.k256 = "k256".asInstanceOf[typingsJapgolly.bnJs.bnJsStrings.k256]
    
    inline def p192: typingsJapgolly.bnJs.bnJsStrings.p192 = "p192".asInstanceOf[typingsJapgolly.bnJs.bnJsStrings.p192]
    
    inline def p224: typingsJapgolly.bnJs.bnJsStrings.p224 = "p224".asInstanceOf[typingsJapgolly.bnJs.bnJsStrings.p224]
    
    inline def p25519: typingsJapgolly.bnJs.bnJsStrings.p25519 = "p25519".asInstanceOf[typingsJapgolly.bnJs.bnJsStrings.p25519]
  }
  
  trait MPrime extends StObject {
    
    var k: BN
    
    var n: Double
    
    var name: String
    
    var p: BN
  }
  object MPrime {
    
    inline def apply(k: BN, n: Double, name: String, p: BN): MPrime = {
      val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
      __obj.asInstanceOf[MPrime]
    }
    
    extension [Self <: MPrime](x: Self) {
      
      inline def setK(value: BN): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setP(value: BN): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * BN operations in a reduction context.
    */
  @js.native
  trait RedBN
    extends StObject
       with BN {
    
    /**
      * @description Convert back a number using a reduction context
      */
    def fromRed(): BN = js.native
    
    /**
      * @description modular addition
      */
    def redAdd(b: RedBN): RedBN = js.native
    
    /**
      * @description in-place modular addition
      */
    def redIAdd(b: RedBN): RedBN = js.native
    
    /**
      * @description in-place modular multiplication
      */
    def redIMul(b: RedBN): RedBN = js.native
    
    /**
      * @description in-place modular square
      */
    def redISqr(): RedBN = js.native
    
    /**
      * @description in-place modular subtraction
      */
    def redISub(b: RedBN): RedBN = js.native
    
    /**
      * @description modular inverse of the number
      */
    def redInvm(): RedBN = js.native
    
    /**
      * @description modular multiplication
      */
    def redMul(b: RedBN): RedBN = js.native
    
    /**
      * @description modular negation
      */
    def redNeg(): RedBN = js.native
    
    /**
      * @description modular exponentiation
      */
    def redPow(b: BN): RedBN = js.native
    
    /**
      * @description modular shift left
      */
    def redShl(num: Double): RedBN = js.native
    
    /**
      * @description modular square
      */
    def redSqr(): RedBN = js.native
    
    /**
      * @description modular square root
      */
    def redSqrt(): RedBN = js.native
    
    /**
      * @description modular subtraction
      */
    def redSub(b: RedBN): RedBN = js.native
  }
  
  trait ReductionContext
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var m: Double
    
    var prime: MPrime
  }
  object ReductionContext {
    
    inline def apply(m: Double, prime: MPrime): ReductionContext = {
      val __obj = js.Dynamic.literal(m = m.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReductionContext]
    }
    
    extension [Self <: ReductionContext](x: Self) {
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setPrime(value: MPrime): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Object & (Instantiable3[
    /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | BN, 
    /* base */ js.UndefOr[Double | hex], 
    /* endian */ js.UndefOr[Endianness], 
    BN
  ])
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & (Instantiable3[
    /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | BN, 
    /* base */ js.UndefOr[Double | hex], 
    /* endian */ js.UndefOr[Endianness], 
    BN
  ]) = ^
}
