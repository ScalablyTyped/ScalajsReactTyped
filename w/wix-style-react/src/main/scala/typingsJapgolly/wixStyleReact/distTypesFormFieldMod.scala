package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.anon.SetCharactersLeftCharactersLeftFn
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormFieldMod {
  
  @JSImport("wix-style-react/dist/types/FormField", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FormFieldProps, js.Object, Any]
  
  type CharactersLeftFn = js.Function1[/* lengthLeft */ Double, Unit]
  
  type FormField = japgolly.scalajs.react.facade.React.Component[FormFieldProps & js.Object, js.Object]
  
  trait FormFieldProps extends StObject {
    
    var charCount: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[Node | (js.Function1[/* data */ SetCharactersLeftCharactersLeftFn, Node])] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var infoContent: js.UndefOr[Node] = js.undefined
    
    var infoTooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var labelAlignment: js.UndefOr[LabelAlignment] = js.undefined
    
    var labelId: js.UndefOr[String] = js.undefined
    
    var labelPlacement: js.UndefOr[LabelPlacement] = js.undefined
    
    var labelSize: js.UndefOr[LabelSize] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[StatusType] = js.undefined
    
    var statusMessage: js.UndefOr[Node] = js.undefined
    
    var stretchContent: js.UndefOr[Boolean] = js.undefined
    
    var suffix: js.UndefOr[Node] = js.undefined
  }
  object FormFieldProps {
    
    inline def apply(): FormFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldProps]
    }
    
    extension [Self <: FormFieldProps](x: Self) {
      
      inline def setCharCount(value: Double): Self = StObject.set(x, "charCount", value.asInstanceOf[js.Any])
      
      inline def setCharCountUndefined: Self = StObject.set(x, "charCount", js.undefined)
      
      inline def setChildren(value: Node | (js.Function1[/* data */ SetCharactersLeftCharactersLeftFn, Node])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* data */ SetCharactersLeftCharactersLeftFn => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInfoContent(value: VdomNode): Self = StObject.set(x, "infoContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setInfoContentNull: Self = StObject.set(x, "infoContent", null)
      
      inline def setInfoContentUndefined: Self = StObject.set(x, "infoContent", js.undefined)
      
      inline def setInfoContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "infoContent", js.Array(value*))
      
      inline def setInfoContentVdomElement(value: VdomElement): Self = StObject.set(x, "infoContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInfoTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "infoTooltipProps", value.asInstanceOf[js.Any])
      
      inline def setInfoTooltipPropsUndefined: Self = StObject.set(x, "infoTooltipProps", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelAlignment(value: LabelAlignment): Self = StObject.set(x, "labelAlignment", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignmentUndefined: Self = StObject.set(x, "labelAlignment", js.undefined)
      
      inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelPlacement(value: LabelPlacement): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setLabelSize(value: LabelSize): Self = StObject.set(x, "labelSize", value.asInstanceOf[js.Any])
      
      inline def setLabelSizeUndefined: Self = StObject.set(x, "labelSize", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStatus(value: StatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: VdomNode): Self = StObject.set(x, "statusMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "statusMessage", js.Array(value*))
      
      inline def setStatusMessageVdomElement(value: VdomElement): Self = StObject.set(x, "statusMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStretchContent(value: Boolean): Self = StObject.set(x, "stretchContent", value.asInstanceOf[js.Any])
      
      inline def setStretchContentUndefined: Self = StObject.set(x, "stretchContent", js.undefined)
      
      inline def setSuffix(value: VdomNode): Self = StObject.set(x, "suffix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "suffix", js.Array(value*))
      
      inline def setSuffixVdomElement(value: VdomElement): Self = StObject.set(x, "suffix", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.middle
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.top
  */
  trait LabelAlignment extends StObject
  object LabelAlignment {
    
    inline def middle: typingsJapgolly.wixStyleReact.wixStyleReactStrings.middle = "middle".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.middle]
    
    inline def top: typingsJapgolly.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.top
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.right
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.left
  */
  trait LabelPlacement extends StObject
  object LabelPlacement {
    
    inline def left: typingsJapgolly.wixStyleReact.wixStyleReactStrings.left = "left".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.left]
    
    inline def right: typingsJapgolly.wixStyleReact.wixStyleReactStrings.right = "right".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.right]
    
    inline def top: typingsJapgolly.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
  */
  trait LabelSize extends StObject
  object LabelSize {
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.error
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading
  */
  trait StatusType extends StObject
  object StatusType {
    
    inline def error: typingsJapgolly.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.error]
    
    inline def loading: typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading = "loading".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading]
    
    inline def warning: typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning]
  }
}
