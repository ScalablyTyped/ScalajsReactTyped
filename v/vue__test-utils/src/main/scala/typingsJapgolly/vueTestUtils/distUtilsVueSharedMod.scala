package typingsJapgolly.vueTestUtils

import typingsJapgolly.vueTestUtils.vueTestUtilsInts.`128`
import typingsJapgolly.vueTestUtils.vueTestUtilsInts.`16`
import typingsJapgolly.vueTestUtils.vueTestUtilsInts.`1`
import typingsJapgolly.vueTestUtils.vueTestUtilsInts.`256`
import typingsJapgolly.vueTestUtils.vueTestUtilsInts.`2`
import typingsJapgolly.vueTestUtils.vueTestUtilsInts.`32`
import typingsJapgolly.vueTestUtils.vueTestUtilsInts.`4`
import typingsJapgolly.vueTestUtils.vueTestUtilsInts.`512`
import typingsJapgolly.vueTestUtils.vueTestUtilsInts.`64`
import typingsJapgolly.vueTestUtils.vueTestUtilsInts.`6`
import typingsJapgolly.vueTestUtils.vueTestUtilsInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsVueSharedMod {
  
  @JSImport("@vue/test-utils/dist/utils/vueShared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hyphenate(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hyphenate")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vueTestUtils.vueTestUtilsInts.`1`
    - typingsJapgolly.vueTestUtils.vueTestUtilsInts.`2`
    - typingsJapgolly.vueTestUtils.vueTestUtilsInts.`4`
    - typingsJapgolly.vueTestUtils.vueTestUtilsInts.`8`
    - typingsJapgolly.vueTestUtils.vueTestUtilsInts.`16`
    - typingsJapgolly.vueTestUtils.vueTestUtilsInts.`32`
    - typingsJapgolly.vueTestUtils.vueTestUtilsInts.`64`
    - typingsJapgolly.vueTestUtils.vueTestUtilsInts.`128`
    - typingsJapgolly.vueTestUtils.vueTestUtilsInts.`256`
    - typingsJapgolly.vueTestUtils.vueTestUtilsInts.`512`
    - typingsJapgolly.vueTestUtils.vueTestUtilsInts.`6`
  */
  trait ShapeFlags extends StObject
  object ShapeFlags {
    
    inline def ARRAY_CHILDREN: `16` = 16.asInstanceOf[`16`]
    
    inline def COMPONENT: `6` = 6.asInstanceOf[`6`]
    
    inline def COMPONENT_KEPT_ALIVE: `512` = 512.asInstanceOf[`512`]
    
    inline def COMPONENT_SHOULD_KEEP_ALIVE: `256` = 256.asInstanceOf[`256`]
    
    inline def ELEMENT: `1` = 1.asInstanceOf[`1`]
    
    inline def FUNCTIONAL_COMPONENT: `2` = 2.asInstanceOf[`2`]
    
    inline def SLOTS_CHILDREN: `32` = 32.asInstanceOf[`32`]
    
    inline def STATEFUL_COMPONENT: `4` = 4.asInstanceOf[`4`]
    
    inline def SUSPENSE: `128` = 128.asInstanceOf[`128`]
    
    inline def TELEPORT: `64` = 64.asInstanceOf[`64`]
    
    inline def TEXT_CHILDREN: `8` = 8.asInstanceOf[`8`]
  }
}
