package typingsJapgolly.jsbn

import typingsJapgolly.jsbn.mod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jsbn {
    
    @JSGlobal("jsbn.BigInteger")
    @js.native
    open class BigInteger protected ()
      extends typingsJapgolly.jsbn.mod.BigInteger {
      def this(a: String) = this()
      def this(a: js.Array[Double]) = this()
      def this(a: typingsJapgolly.jsbn.mod.BigInteger) = this()
      def this(a: String, b: Double) = this()
      def this(a: js.Array[Double], b: Double) = this()
      def this(a: Double, c: RandomGenerator) = this()
      def this(a: Double, b: Double, c: RandomGenerator) = this()
    }
    /* static members */
    object BigInteger {
      
      @JSGlobal("jsbn.BigInteger")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("jsbn.BigInteger.ONE")
      @js.native
      def ONE: typingsJapgolly.jsbn.mod.BigInteger = js.native
      inline def ONE_=(x: typingsJapgolly.jsbn.mod.BigInteger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jsbn.BigInteger.ZERO")
      @js.native
      def ZERO: typingsJapgolly.jsbn.mod.BigInteger = js.native
      inline def ZERO_=(x: typingsJapgolly.jsbn.mod.BigInteger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    }
  }
}
