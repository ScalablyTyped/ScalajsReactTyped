package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.grommet.anon.Bottom
import typingsJapgolly.grommet.anon.EnterSelect
import typingsJapgolly.grommet.anon.LabelValue
import typingsJapgolly.grommet.anon.Suggestion
import typingsJapgolly.grommet.es6ComponentsDropMod.DropProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.PlaceHolderType
import typingsJapgolly.grommet.es6UtilsMod.TextAlignType
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsTextInputMod {
  
  @JSImport("grommet/es6/components/TextInput", "TextInput")
  @js.native
  val TextInput: FC[TextInputProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'onSelect' | 'size' | 'placeholder'> ]: react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>[P]} */ trait TextInputProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var defaultSuggestion: js.UndefOr[Double] = js.undefined
    
    var dropAlign: js.UndefOr[Bottom] = js.undefined
    
    var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
    
    var dropProps: js.UndefOr[DropProps] = js.undefined
    
    var dropTarget: js.UndefOr[js.Object] = js.undefined
    
    var focusIndicator: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[Element] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var messages: js.UndefOr[EnterSelect] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* x */ Suggestion, Unit]] = js.undefined
    
    var onSuggestionSelect: js.UndefOr[js.Function1[/* x */ Suggestion, Unit]] = js.undefined
    
    var onSuggestionsClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSuggestionsOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placeholder: js.UndefOr[PlaceHolderType] = js.undefined
    
    var plain: js.UndefOr[Boolean | full] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
    
    var suggestions: js.UndefOr[js.Array[LabelValue | String]] = js.undefined
    
    var textAlign: js.UndefOr[TextAlignType] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object TextInputProps {
    
    inline def apply(): TextInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInputProps]
    }
    
    extension [Self <: TextInputProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setDefaultSuggestion(value: Double): Self = StObject.set(x, "defaultSuggestion", value.asInstanceOf[js.Any])
      
      inline def setDefaultSuggestionUndefined: Self = StObject.set(x, "defaultSuggestion", js.undefined)
      
      inline def setDropAlign(value: Bottom): Self = StObject.set(x, "dropAlign", value.asInstanceOf[js.Any])
      
      inline def setDropAlignUndefined: Self = StObject.set(x, "dropAlign", js.undefined)
      
      inline def setDropHeight(value: xsmall | small | medium | large | xlarge | String): Self = StObject.set(x, "dropHeight", value.asInstanceOf[js.Any])
      
      inline def setDropHeightUndefined: Self = StObject.set(x, "dropHeight", js.undefined)
      
      inline def setDropProps(value: DropProps): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      inline def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      inline def setDropTarget(value: js.Object): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      inline def setFocusIndicator(value: Boolean): Self = StObject.set(x, "focusIndicator", value.asInstanceOf[js.Any])
      
      inline def setFocusIndicatorUndefined: Self = StObject.set(x, "focusIndicator", js.undefined)
      
      inline def setIcon(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMessages(value: EnterSelect): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnSelect(value: /* x */ Suggestion => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* x */ Suggestion) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnSuggestionSelect(value: /* x */ Suggestion => Callback): Self = StObject.set(x, "onSuggestionSelect", js.Any.fromFunction1((t0: /* x */ Suggestion) => value(t0).runNow()))
      
      inline def setOnSuggestionSelectUndefined: Self = StObject.set(x, "onSuggestionSelect", js.undefined)
      
      inline def setOnSuggestionsClose(value: Callback): Self = StObject.set(x, "onSuggestionsClose", value.toJsFn)
      
      inline def setOnSuggestionsCloseUndefined: Self = StObject.set(x, "onSuggestionsClose", js.undefined)
      
      inline def setOnSuggestionsOpen(value: Callback): Self = StObject.set(x, "onSuggestionsOpen", value.toJsFn)
      
      inline def setOnSuggestionsOpenUndefined: Self = StObject.set(x, "onSuggestionsOpen", js.undefined)
      
      inline def setPlaceholder(value: PlaceHolderType): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaceholderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "placeholder", js.Array(value*))
      
      inline def setPlaceholderVdomElement(value: VdomElement): Self = StObject.set(x, "placeholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPlain(value: Boolean | full): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSuggestions(value: js.Array[LabelValue | String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      inline def setSuggestionsVarargs(value: (LabelValue | String)*): Self = StObject.set(x, "suggestions", js.Array(value*))
      
      inline def setTextAlign(value: TextAlignType): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
