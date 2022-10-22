package typingsJapgolly.lib0

import typingsJapgolly.lib0.testingMod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomDottestMod {
  
  @JSImport("lib0/random.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testUint32(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testUint32")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testUint53(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testUint53")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testUuidv4(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testUuidv4")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testUuidv4Overlaps(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testUuidv4Overlaps")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
