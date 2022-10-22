package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.ReactEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.fundamentalReact.anon.Callback
import typingsJapgolly.fundamentalReact.anon.Text
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSearchInputSearchInputMod {
  
  @JSImport("fundamental-react/lib/SearchInput/SearchInput", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SearchInputProps, js.Object, Any]
  object default {
    
    @JSImport("fundamental-react/lib/SearchInput/SearchInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("fundamental-react/lib/SearchInput/SearchInput", "default.displayName")
    @js.native
    def displayName: typingsJapgolly.fundamentalReact.fundamentalReactStrings.SearchInput = js.native
    inline def displayName_=(x: typingsJapgolly.fundamentalReact.fundamentalReactStrings.SearchInput): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type SearchInput = japgolly.scalajs.react.facade.React.Component[SearchInputProps & js.Object, js.Object]
  
  trait SearchInputProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var inShellbar: js.UndefOr[Boolean] = js.undefined
    
    var inputGroupAddonProps: js.UndefOr[Any] = js.undefined
    
    var inputGroupProps: js.UndefOr[Any] = js.undefined
    
    var inputProps: js.UndefOr[Any] = js.undefined
    
    var listProps: js.UndefOr[Any] = js.undefined
    
    var noSearchBtn: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Unit]] = js.undefined
    
    var onEnter: js.UndefOr[js.Function1[/* value */ js.UndefOr[String | Double | js.Array[String]], Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[Any] = js.undefined
    
    var searchBtnProps: js.UndefOr[Any] = js.undefined
    
    var searchList: js.UndefOr[js.Array[Callback]] = js.undefined
    
    var validationState: js.UndefOr[Text] = js.undefined
  }
  object SearchInputProps {
    
    inline def apply(): SearchInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchInputProps]
    }
    
    extension [Self <: SearchInputProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setInShellbar(value: Boolean): Self = StObject.set(x, "inShellbar", value.asInstanceOf[js.Any])
      
      inline def setInShellbarUndefined: Self = StObject.set(x, "inShellbar", js.undefined)
      
      inline def setInputGroupAddonProps(value: Any): Self = StObject.set(x, "inputGroupAddonProps", value.asInstanceOf[js.Any])
      
      inline def setInputGroupAddonPropsUndefined: Self = StObject.set(x, "inputGroupAddonProps", js.undefined)
      
      inline def setInputGroupProps(value: Any): Self = StObject.set(x, "inputGroupProps", value.asInstanceOf[js.Any])
      
      inline def setInputGroupPropsUndefined: Self = StObject.set(x, "inputGroupProps", js.undefined)
      
      inline def setInputProps(value: Any): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setListProps(value: Any): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      inline def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      inline def setNoSearchBtn(value: Boolean): Self = StObject.set(x, "noSearchBtn", value.asInstanceOf[js.Any])
      
      inline def setNoSearchBtnUndefined: Self = StObject.set(x, "noSearchBtn", js.undefined)
      
      inline def setOnChange(value: /* event */ ReactEventFrom[HTMLInputElement] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnEnter(
        value: /* value */ js.UndefOr[String | Double | js.Array[String]] => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "onEnter", js.Any.fromFunction1((t0: /* value */ js.UndefOr[String | Double | js.Array[String]]) => value(t0).runNow()))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopoverProps(value: Any): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setSearchBtnProps(value: Any): Self = StObject.set(x, "searchBtnProps", value.asInstanceOf[js.Any])
      
      inline def setSearchBtnPropsUndefined: Self = StObject.set(x, "searchBtnProps", js.undefined)
      
      inline def setSearchList(value: js.Array[Callback]): Self = StObject.set(x, "searchList", value.asInstanceOf[js.Any])
      
      inline def setSearchListUndefined: Self = StObject.set(x, "searchList", js.undefined)
      
      inline def setSearchListVarargs(value: Callback*): Self = StObject.set(x, "searchList", js.Array(value*))
      
      inline def setValidationState(value: Text): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
}
