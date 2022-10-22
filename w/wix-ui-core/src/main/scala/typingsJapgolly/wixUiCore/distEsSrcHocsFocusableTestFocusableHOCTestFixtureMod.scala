package typingsJapgolly.wixUiCore

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcHocsFocusableTestFocusableHOCTestFixtureMod {
  
  @js.native
  sealed trait DataHook extends StObject
  @JSImport("wix-ui-core/dist/es/src/hocs/Focusable/test/FocusableHOCTestFixture", "DataHook")
  @js.native
  object DataHook extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DataHook & String] = js.native
    
    @js.native
    sealed trait FirstButton
      extends StObject
         with DataHook
    /* "first-button" */ val FirstButton: typingsJapgolly.wixUiCore.distEsSrcHocsFocusableTestFocusableHOCTestFixtureMod.DataHook.FirstButton & String = js.native
    
    @js.native
    sealed trait SecondButton
      extends StObject
         with DataHook
    /* "second-button" */ val SecondButton: typingsJapgolly.wixUiCore.distEsSrcHocsFocusableTestFocusableHOCTestFixtureMod.DataHook.SecondButton & String = js.native
  }
  
  @JSImport("wix-ui-core/dist/es/src/hocs/Focusable/test/FocusableHOCTestFixture", "FocusableHOCTestFixture")
  @js.native
  open class FocusableHOCTestFixture protected ()
    extends Component[js.Object, js.Object, Any] {
    def this(props: Any) = this()
    
    /* private */ val _onFirstButtonClick: Any = js.native
    
    /* private */ val firstButtonRef: Any = js.native
    
    /* private */ val secondButtonRef: Any = js.native
  }
}
