package typingsJapgolly.wixUiTestUtils

import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcUnidriverLegacyStylableTypesMod.CommonStylesheet
import typingsJapgolly.wixUiTestUtils.distSrcUnidriverLegacyStylableTypesMod.CompatStylesheet
import typingsJapgolly.wixUiTestUtils.distSrcUnidriverLegacyStylableTypesMod.LegacyStylesheet
import typingsJapgolly.wixUiTestUtils.distSrcUnidriverLegacyStylableTypesMod.StateValue
import typingsJapgolly.wixUiTestUtils.wixUiTestUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUnidriverStylableUnidriverUtilLegacyMod {
  
  @JSImport("wix-ui-test-utils/dist/src/unidriver/stylable-unidriver-util-legacy", "StylableCompatUniDriver")
  @js.native
  open class StylableCompatUniDriver protected () extends StObject {
    def this(style: CommonStylesheet) = this()
    
    /**
      * Get style state value
      *
      * @returns state or null if not found
      */
    def getStyleState(base: UniDriver[Any], stateName: String): js.Promise[Any] = js.native
    
    def hasStyleState(base: UniDriver[Any], stateName: String): js.Promise[Boolean] = js.native
    def hasStyleState(base: UniDriver[Any], stateName: String, param: StateValue): js.Promise[Boolean] = js.native
    
    /* private */ var internal: Any = js.native
    
    /* private */ var style: Any = js.native
  }
  
  @JSImport("wix-ui-test-utils/dist/src/unidriver/stylable-unidriver-util-legacy", "StylableUnidriverUtilCompat")
  @js.native
  open class StylableUnidriverUtilCompat protected () extends StObject {
    def this(style: CompatStylesheet) = this()
    
    /* private */ var getBaseStateWithParam: Any = js.native
    
    def getStateValueFromClassName(cls: String, baseState: String): String = js.native
    
    /**
      * Get style state value
      *
      * @returns state or null if not found
      */
    def getStyleState(base: UniDriver[Any], stateName: String): js.Promise[String | `true` | Null] = js.native
    
    def hasStyleState(base: UniDriver[Any], stateName: String): js.Promise[Boolean] = js.native
    def hasStyleState(base: UniDriver[Any], stateName: String, param: StateValue): js.Promise[Boolean] = js.native
    
    /* private */ var style: Any = js.native
  }
  
  @JSImport("wix-ui-test-utils/dist/src/unidriver/stylable-unidriver-util-legacy", "StylableUnidriverUtilLegacy")
  @js.native
  open class StylableUnidriverUtilLegacy protected () extends StObject {
    def this(style: LegacyStylesheet) = this()
    
    /* private */ var getStateDataAttrKey: Any = js.native
    
    /**
      * Get style state value
      *
      * @returns state or null if not found
      */
    def getStyleState(base: UniDriver[Any], stateName: String): js.Promise[String | Null] = js.native
    
    def hasStyleState(base: UniDriver[Any], stateName: String): js.Promise[Boolean] = js.native
    def hasStyleState(base: UniDriver[Any], stateName: String, param: StateValue): js.Promise[Boolean] = js.native
    
    /* private */ var style: Any = js.native
  }
}
