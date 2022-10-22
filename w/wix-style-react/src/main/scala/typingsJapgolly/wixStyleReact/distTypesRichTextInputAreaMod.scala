package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.BulletedListButtonLabel
import typingsJapgolly.wixStyleReact.anon.ConfirmButtonLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRichTextInputAreaMod {
  
  @JSImport("wix-style-react/dist/types/RichTextInputArea", JSImport.Default)
  @js.native
  open class default () extends RichTextInputArea
  
  @js.native
  trait RichTextInputArea
    extends PureComponent[RichTextInputAreaProps, js.Object, Any] {
    
    def setValue(value: String): Unit = js.native
  }
  
  trait RichTextInputAreaProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var initialValue: js.UndefOr[String] = js.undefined
    
    var maxHeight: js.UndefOr[String] = js.undefined
    
    var minHeight: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[RichTextInputAreaStatus] = js.undefined
    
    var statusMessage: js.UndefOr[Node] = js.undefined
    
    var texts: js.UndefOr[typingsJapgolly.wixStyleReact.distTypesRichTextInputAreaMod.texts] = js.undefined
  }
  object RichTextInputAreaProps {
    
    inline def apply(): RichTextInputAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RichTextInputAreaProps]
    }
    
    extension [Self <: RichTextInputAreaProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMinHeight(value: String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStatus(value: RichTextInputAreaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: VdomNode): Self = StObject.set(x, "statusMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "statusMessage", js.Array(value*))
      
      inline def setStatusMessageVdomElement(value: VdomElement): Self = StObject.set(x, "statusMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTexts(value: texts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.error
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading
  */
  trait RichTextInputAreaStatus extends StObject
  object RichTextInputAreaStatus {
    
    inline def error: typingsJapgolly.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.error]
    
    inline def loading: typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading = "loading".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading]
    
    inline def warning: typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning]
  }
  
  trait texts extends StObject {
    
    var insertionForm: js.UndefOr[ConfirmButtonLabel] = js.undefined
    
    var toolbarButtons: js.UndefOr[BulletedListButtonLabel] = js.undefined
  }
  object texts {
    
    inline def apply(): texts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[texts]
    }
    
    extension [Self <: texts](x: Self) {
      
      inline def setInsertionForm(value: ConfirmButtonLabel): Self = StObject.set(x, "insertionForm", value.asInstanceOf[js.Any])
      
      inline def setInsertionFormUndefined: Self = StObject.set(x, "insertionForm", js.undefined)
      
      inline def setToolbarButtons(value: BulletedListButtonLabel): Self = StObject.set(x, "toolbarButtons", value.asInstanceOf[js.Any])
      
      inline def setToolbarButtonsUndefined: Self = StObject.set(x, "toolbarButtons", js.undefined)
    }
  }
}
