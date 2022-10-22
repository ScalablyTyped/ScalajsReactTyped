package typingsJapgolly.wixUiTestUtils

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcUnidriverLegacyStylableTypesMod.CommonStylesheet
import typingsJapgolly.wixUiTestUtils.distSrcUnidriverStylableUnidriverUtilLegacyMod.StylableCompatUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUnidriverMod {
  
  @JSImport("wix-ui-test-utils/dist/src/unidriver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-ui-test-utils/dist/src/unidriver", "StylableUnidriverUtil")
  @js.native
  open class StylableUnidriverUtil protected () extends StylableCompatUniDriver {
    def this(style: CommonStylesheet) = this()
  }
  @JSImport("wix-ui-test-utils/dist/src/unidriver", "StylableUnidriverUtil")
  @js.native
  val StylableUnidriverUtil: Instantiable1[/* style */ CommonStylesheet, StylableCompatUniDriver] = js.native
  
  inline def baseUniDriverFactory(base: UniDriver[Any]): BaseUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[BaseUniDriver]
}
