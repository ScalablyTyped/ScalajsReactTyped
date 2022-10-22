package typingsJapgolly.wixUiCore

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsInputWithOptionsInputWithOptionsTestFixtureMod {
  
  @js.native
  sealed trait DataHook extends StObject
  @JSImport("wix-ui-core/dist/es/src/components/input-with-options/InputWithOptionsTestFixture", "DataHook")
  @js.native
  object DataHook extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DataHook & String] = js.native
    
    @js.native
    sealed trait inputWithOptions
      extends StObject
         with DataHook
    /* "storybook-input-with-options" */ val inputWithOptions: typingsJapgolly.wixUiCore.distEsSrcComponentsInputWithOptionsInputWithOptionsTestFixtureMod.DataHook.inputWithOptions & String = js.native
    
    @js.native
    sealed trait onManualInputCount
      extends StObject
         with DataHook
    /* "on-manual-input-count" */ val onManualInputCount: typingsJapgolly.wixUiCore.distEsSrcComponentsInputWithOptionsInputWithOptionsTestFixtureMod.DataHook.onManualInputCount & String = js.native
    
    @js.native
    sealed trait onSelectCount
      extends StObject
         with DataHook
    /* "on-select-count" */ val onSelectCount: typingsJapgolly.wixUiCore.distEsSrcComponentsInputWithOptionsInputWithOptionsTestFixtureMod.DataHook.onSelectCount & String = js.native
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/input-with-options/InputWithOptionsTestFixture", "InputWithOptionsTestFixture")
  @js.native
  open class InputWithOptionsTestFixture protected () extends Component[Any, Any, Any] {
    def this(props: Any) = this()
    
    def handleOnChange(e: Any): Unit = js.native
    
    def handleOnManualInput(): Unit = js.native
    
    def handleOnSelect(): Unit = js.native
  }
}
