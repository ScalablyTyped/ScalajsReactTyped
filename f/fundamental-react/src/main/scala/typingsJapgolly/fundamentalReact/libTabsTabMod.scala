package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.anon.PartialTabProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapTabProps
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.Tab
import typingsJapgolly.fundamentalReact.libIconIconMod.IconGlyph
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabsTabMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Tabs/Tab.TabProps> & {  displayName :'Tab'} */
  object default {
    
    inline def apply(props: TabProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: TabProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("fundamental-react/lib/Tabs/Tab", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Tabs/Tab", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tabs/Tab", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTabProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialTabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tabs/Tab", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String | Tab] = js.native
    inline def displayName_=(x: js.UndefOr[String | Tab]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Tabs/Tab", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTabProps] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapTabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait TabProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var glyph: js.UndefOr[IconGlyph] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var linkProps: js.UndefOr[Any] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var tabContentProps: js.UndefOr[Any] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object TabProps {
    
    inline def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    extension [Self <: TabProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setGlyph(value: IconGlyph): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLinkProps(value: Any): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
      
      inline def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
      
      inline def setOnClick(value: /* repeated */ Any => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTabContentProps(value: Any): Self = StObject.set(x, "tabContentProps", value.asInstanceOf[js.Any])
      
      inline def setTabContentPropsUndefined: Self = StObject.set(x, "tabContentProps", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
