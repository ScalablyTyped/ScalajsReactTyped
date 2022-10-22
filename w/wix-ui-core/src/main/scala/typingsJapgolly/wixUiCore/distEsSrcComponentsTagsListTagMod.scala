package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLabelElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.wixUiCore.anon.Checked
import typingsJapgolly.wixUiCore.anon.CompId
import typingsJapgolly.wixUiCore.distEsSrcComponentsTagsListTagsListDothelpersMod.DisplayNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsTagsListTagMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/tags-list/Tag", "FocusableTag")
  @js.native
  open class FocusableTag protected ()
    extends Component[TagProps, js.Object, Any] {
    def this(props: TagProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TagProps, context: Any) = this()
    
    var anchorRef: RefHandle[HTMLAnchorElement] = js.native
    
    def handleKeyDown(ev: ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLLabelElement) & Element]): Unit = js.native
    
    def handleTagClick(ev: ReactMouseEventFrom[HTMLAnchorElement]): Unit = js.native
    
    var inputRef: RefHandle[HTMLInputElement] = js.native
    
    var labelRef: RefHandle[HTMLLabelElement] = js.native
    
    def renderLabeledInput(ownProps: Any): typingsJapgolly.react.mod.global.JSX.Element = js.native
    def renderLabeledInput(ownProps: Any, wrapperProps: js.Object): typingsJapgolly.react.mod.global.JSX.Element = js.native
  }
  /* static members */
  object FocusableTag {
    
    @JSImport("wix-ui-core/dist/es/src/components/tags-list/Tag", "FocusableTag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/tags-list/Tag", "FocusableTag.displayName")
    @js.native
    def displayName: DisplayNames = js.native
    inline def displayName_=(x: DisplayNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/tags-list/Tag", "FocusableTag.propTypes")
    @js.native
    def propTypes: Checked = js.native
    inline def propTypes_=(x: Checked): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/tags-list/Tag", "Tag")
  @js.native
  open class Tag protected ()
    extends Component[TagProps, js.Object, Any] {
    def this(props: TagProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TagProps, context: Any) = this()
    
    var anchorRef: RefHandle[HTMLAnchorElement] = js.native
    
    def handleKeyDown(ev: ReactKeyboardEventFrom[HTMLAnchorElement]): Unit = js.native
    
    def handleTagClick(ev: ReactMouseEventFrom[HTMLAnchorElement]): Unit = js.native
    
    var inputRef: RefHandle[HTMLInputElement] = js.native
    
    var labelRef: RefHandle[HTMLLabelElement] = js.native
  }
  /* static members */
  object Tag {
    
    @JSImport("wix-ui-core/dist/es/src/components/tags-list/Tag", "Tag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/tags-list/Tag", "Tag.displayName")
    @js.native
    def displayName: DisplayNames = js.native
    inline def displayName_=(x: DisplayNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/tags-list/Tag", "Tag.propTypes")
    @js.native
    def propTypes: CompId = js.native
    inline def propTypes_=(x: CompId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait TagProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var compId: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tagIndex: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object TagProps {
    
    inline def apply(): TagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagProps]
    }
    
    extension [Self <: TagProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompId(value: String): Self = StObject.set(x, "compId", value.asInstanceOf[js.Any])
      
      inline def setCompIdUndefined: Self = StObject.set(x, "compId", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTagIndex(value: Double): Self = StObject.set(x, "tagIndex", value.asInstanceOf[js.Any])
      
      inline def setTagIndexUndefined: Self = StObject.set(x, "tagIndex", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
