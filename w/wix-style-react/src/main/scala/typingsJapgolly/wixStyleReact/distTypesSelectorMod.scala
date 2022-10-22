package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorMod {
  
  @JSImport("wix-style-react/dist/types/Selector", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SelectorProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/Selector", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Selector", "default.ExtraText")
    @js.native
    def ExtraText: Instantiable0[SelectorExtraText] = js.native
    inline def ExtraText_=(x: Instantiable0[SelectorExtraText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtraText")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Selector", "default.ProgressBar")
    @js.native
    def ProgressBar: Instantiable0[SelectorProgressBar] = js.native
    inline def ProgressBar_=(x: Instantiable0[SelectorProgressBar]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProgressBar")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/Selector", "SelectorExtraText")
  @js.native
  open class SelectorExtraText protected ()
    extends PureComponent[SelectorExtraTextProps, js.Object, Any] {
    def this(props: SelectorExtraTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SelectorExtraTextProps, context: Any) = this()
  }
  
  @JSImport("wix-style-react/dist/types/Selector", "SelectorProgressBar")
  @js.native
  open class SelectorProgressBar protected ()
    extends PureComponent[SelectorProgressBarProps, js.Object, Any] {
    def this(props: SelectorProgressBarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SelectorProgressBarProps, context: Any) = this()
  }
  
  type Selector = PureComponent[SelectorProps, js.Object, Any]
  
  trait SelectorExtraTextProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object SelectorExtraTextProps {
    
    inline def apply(text: String): SelectorExtraTextProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorExtraTextProps]
    }
    
    extension [Self <: SelectorExtraTextProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.rectangular
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle
  */
  trait SelectorImageShape extends StObject
  object SelectorImageShape {
    
    inline def circle: typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle = "circle".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle]
    
    inline def rectangular: typingsJapgolly.wixStyleReact.wixStyleReactStrings.rectangular = "rectangular".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.rectangular]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.portrait
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.cinema
  */
  trait SelectorImageSize extends StObject
  object SelectorImageSize {
    
    inline def cinema: typingsJapgolly.wixStyleReact.wixStyleReactStrings.cinema = "cinema".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.cinema]
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def portrait: typingsJapgolly.wixStyleReact.wixStyleReactStrings.portrait = "portrait".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.portrait]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  trait SelectorProgressBarProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var progress: Double
  }
  object SelectorProgressBarProps {
    
    inline def apply(progress: Double): SelectorProgressBarProps = {
      val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorProgressBarProps]
    }
    
    extension [Self <: SelectorProgressBarProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectorProps extends StObject {
    
    var belowNode: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var extraNode: js.UndefOr[Node] = js.undefined
    
    var id: String | Double
    
    var image: js.UndefOr[Node] = js.undefined
    
    var imageShape: js.UndefOr[SelectorImageShape] = js.undefined
    
    var imageSize: js.UndefOr[SelectorImageSize] = js.undefined
    
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var onToggle: js.UndefOr[js.Function1[/* id */ String | Double, Unit]] = js.undefined
    
    var showBelowNodeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var subtitleNode: js.UndefOr[Node] = js.undefined
    
    var title: String
    
    var toggleType: js.UndefOr[SelectorToggleType] = js.undefined
  }
  object SelectorProps {
    
    inline def apply(id: String | Double, title: String): SelectorProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorProps]
    }
    
    extension [Self <: SelectorProps](x: Self) {
      
      inline def setBelowNode(value: VdomNode): Self = StObject.set(x, "belowNode", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBelowNodeNull: Self = StObject.set(x, "belowNode", null)
      
      inline def setBelowNodeUndefined: Self = StObject.set(x, "belowNode", js.undefined)
      
      inline def setBelowNodeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "belowNode", js.Array(value*))
      
      inline def setBelowNodeVdomElement(value: VdomElement): Self = StObject.set(x, "belowNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setExtraNode(value: VdomNode): Self = StObject.set(x, "extraNode", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExtraNodeNull: Self = StObject.set(x, "extraNode", null)
      
      inline def setExtraNodeUndefined: Self = StObject.set(x, "extraNode", js.undefined)
      
      inline def setExtraNodeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "extraNode", js.Array(value*))
      
      inline def setExtraNodeVdomElement(value: VdomElement): Self = StObject.set(x, "extraNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage(value: VdomNode): Self = StObject.set(x, "image", value.rawNode.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageShape(value: SelectorImageShape): Self = StObject.set(x, "imageShape", value.asInstanceOf[js.Any])
      
      inline def setImageShapeUndefined: Self = StObject.set(x, "imageShape", js.undefined)
      
      inline def setImageSize(value: SelectorImageSize): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setOnToggle(value: /* id */ String | Double => Callback): Self = StObject.set(x, "onToggle", js.Any.fromFunction1((t0: /* id */ String | Double) => value(t0).runNow()))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setShowBelowNodeOnSelect(value: Boolean): Self = StObject.set(x, "showBelowNodeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setShowBelowNodeOnSelectUndefined: Self = StObject.set(x, "showBelowNodeOnSelect", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleNode(value: VdomNode): Self = StObject.set(x, "subtitleNode", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubtitleNodeNull: Self = StObject.set(x, "subtitleNode", null)
      
      inline def setSubtitleNodeUndefined: Self = StObject.set(x, "subtitleNode", js.undefined)
      
      inline def setSubtitleNodeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subtitleNode", js.Array(value*))
      
      inline def setSubtitleNodeVdomElement(value: VdomElement): Self = StObject.set(x, "subtitleNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setToggleType(value: SelectorToggleType): Self = StObject.set(x, "toggleType", value.asInstanceOf[js.Any])
      
      inline def setToggleTypeUndefined: Self = StObject.set(x, "toggleType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.checkbox
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.radio
  */
  trait SelectorToggleType extends StObject
  object SelectorToggleType {
    
    inline def checkbox: typingsJapgolly.wixStyleReact.wixStyleReactStrings.checkbox = "checkbox".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.checkbox]
    
    inline def radio: typingsJapgolly.wixStyleReact.wixStyleReactStrings.radio = "radio".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.radio]
  }
}
