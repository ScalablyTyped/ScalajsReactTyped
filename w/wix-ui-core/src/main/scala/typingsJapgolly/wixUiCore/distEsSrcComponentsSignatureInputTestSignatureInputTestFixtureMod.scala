package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixUiCore.distEsSrcComponentsSignatureInputSigningPadSigningPadMod.SigningPadOwnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsSignatureInputTestSignatureInputTestFixtureMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/signature-input/test/SignatureInputTestFixture", "SignatureInputTestFixture")
  @js.native
  open class SignatureInputTestFixture protected ()
    extends Component[SignatureInputTestFixtureProps, js.Object, Any] {
    def this(props: SignatureInputTestFixtureProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SignatureInputTestFixtureProps, context: Any) = this()
  }
  
  object TEST_IDS {
    
    @JSImport("wix-ui-core/dist/es/src/components/signature-input/test/SignatureInputTestFixture", "TEST_IDS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/signature-input/test/SignatureInputTestFixture", "TEST_IDS.CLEAR_BUTTON")
    @js.native
    def CLEAR_BUTTON: String = js.native
    inline def CLEAR_BUTTON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLEAR_BUTTON")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/signature-input/test/SignatureInputTestFixture", "TEST_IDS.PAD")
    @js.native
    def PAD: String = js.native
    inline def PAD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAD")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/signature-input/test/SignatureInputTestFixture", "TEST_IDS.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/signature-input/test/SignatureInputTestFixture", "TEST_IDS.TITLE")
    @js.native
    def TITLE: String = js.native
    inline def TITLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TITLE")(x.asInstanceOf[js.Any])
  }
  
  trait SignatureInputTestFixtureProps
    extends StObject
       with SigningPadOwnProps {
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var titleText: js.UndefOr[String] = js.undefined
  }
  object SignatureInputTestFixtureProps {
    
    inline def apply(): SignatureInputTestFixtureProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureInputTestFixtureProps]
    }
    
    extension [Self <: SignatureInputTestFixtureProps](x: Self) {
      
      inline def setOnClear(value: Callback): Self = StObject.set(x, "onClear", value.toJsFn)
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    }
  }
}
