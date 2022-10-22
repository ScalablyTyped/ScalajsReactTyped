package typingsJapgolly.lib0

import typingsJapgolly.lib0.anon.N
import typingsJapgolly.lib0.lib0Doubles.`0.000001`
import typingsJapgolly.lib0.lib0Doubles.`0.001`
import typingsJapgolly.lib0.lib0Doubles.`0.01`
import typingsJapgolly.lib0.lib0Doubles.`0.1`
import typingsJapgolly.lib0.lib0Doubles.`1000000000000000000`
import typingsJapgolly.lib0.lib0Doubles.`1000000000000000`
import typingsJapgolly.lib0.lib0Doubles.`1000000000000`
import typingsJapgolly.lib0.lib0Doubles.`1e+21`
import typingsJapgolly.lib0.lib0Doubles.`1e+24`
import typingsJapgolly.lib0.lib0Doubles.`1e-12`
import typingsJapgolly.lib0.lib0Doubles.`1e-15`
import typingsJapgolly.lib0.lib0Doubles.`1e-18`
import typingsJapgolly.lib0.lib0Doubles.`1e-21`
import typingsJapgolly.lib0.lib0Doubles.`1e-24`
import typingsJapgolly.lib0.lib0Doubles.`1e-9`
import typingsJapgolly.lib0.lib0Ints.`1000000000`
import typingsJapgolly.lib0.lib0Ints.`1000000`
import typingsJapgolly.lib0.lib0Ints.`1000`
import typingsJapgolly.lib0.lib0Ints.`100`
import typingsJapgolly.lib0.lib0Ints.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricMod {
  
  @JSImport("lib0/metric", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/metric", "atto")
  @js.native
  val atto: `1e-18` = js.native
  
  @JSImport("lib0/metric", "centi")
  @js.native
  val centi: `0.01` = js.native
  
  @JSImport("lib0/metric", "deca")
  @js.native
  val deca: `10` = js.native
  
  @JSImport("lib0/metric", "deci")
  @js.native
  val deci: `0.1` = js.native
  
  @JSImport("lib0/metric", "exa")
  @js.native
  val exa: `1000000000000000000` = js.native
  
  @JSImport("lib0/metric", "femto")
  @js.native
  val femto: `1e-15` = js.native
  
  @JSImport("lib0/metric", "giga")
  @js.native
  val giga: `1000000000` = js.native
  
  @JSImport("lib0/metric", "hecto")
  @js.native
  val hecto: `100` = js.native
  
  @JSImport("lib0/metric", "kilo")
  @js.native
  val kilo: `1000` = js.native
  
  @JSImport("lib0/metric", "mega")
  @js.native
  val mega: `1000000` = js.native
  
  @JSImport("lib0/metric", "micro")
  @js.native
  val micro: `0.000001` = js.native
  
  @JSImport("lib0/metric", "milli")
  @js.native
  val milli: `0.001` = js.native
  
  @JSImport("lib0/metric", "nano")
  @js.native
  val nano: `1e-9` = js.native
  
  @JSImport("lib0/metric", "peta")
  @js.native
  val peta: `1000000000000000` = js.native
  
  @JSImport("lib0/metric", "pico")
  @js.native
  val pico: `1e-12` = js.native
  
  inline def prefix(n: Double): N = ^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(n.asInstanceOf[js.Any]).asInstanceOf[N]
  inline def prefix(n: Double, baseMultiplier: Double): N = (^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(n.asInstanceOf[js.Any], baseMultiplier.asInstanceOf[js.Any])).asInstanceOf[N]
  
  @JSImport("lib0/metric", "tera")
  @js.native
  val tera: `1000000000000` = js.native
  
  @JSImport("lib0/metric", "yocto")
  @js.native
  val yocto: `1e-24` = js.native
  
  @JSImport("lib0/metric", "yotta")
  @js.native
  val yotta: `1e+24` = js.native
  
  @JSImport("lib0/metric", "zepto")
  @js.native
  val zepto: `1e-21` = js.native
  
  @JSImport("lib0/metric", "zetta")
  @js.native
  val zetta: `1e+21` = js.native
}
