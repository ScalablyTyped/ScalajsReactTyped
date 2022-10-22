package typingsJapgolly.reactTagsinput

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactTagsinput.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-tagsinput", JSImport.Namespace)
  @js.native
  open class ^[Tag] () extends TagsInput[Tag]
  
  type InputProps = StringDictionary[Any]
  
  trait ReactTagsInputProps[Tag] extends StObject {
    
    var addKeys: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    var addOnBlur: js.UndefOr[Boolean] = js.undefined
    
    var addOnPaste: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var currentValue: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var focusedClassName: js.UndefOr[String] = js.undefined
    
    var inputProps: js.UndefOr[InputProps] = js.undefined
    
    var inputValue: js.UndefOr[String] = js.undefined
    
    var maxTags: js.UndefOr[Double] = js.undefined
    
    def onChange(tags: js.Array[Tag], changed: js.Array[Tag], changedIndexes: js.Array[Double]): Unit
    
    var onChangeInput: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onValidationReject: js.UndefOr[js.Function1[/* tags */ js.Array[String], Unit]] = js.undefined
    
    var onlyUnique: js.UndefOr[Boolean] = js.undefined
    
    var pasteSplit: js.UndefOr[js.Function1[/* data */ String, js.Array[String]]] = js.undefined
    
    var preventSubmit: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[TagsInput[Tag]]] = js.undefined
    
    var removeKeys: js.UndefOr[js.Array[Double]] = js.undefined
    
    var renderInput: js.UndefOr[js.Function1[/* props */ RenderInputProps[Tag], Node]] = js.undefined
    
    var renderLayout: js.UndefOr[RenderLayout] = js.undefined
    
    var renderTag: js.UndefOr[js.Function1[/* props */ RenderTagProps[Tag], Node]] = js.undefined
    
    var tagDisplayProp: js.UndefOr[(/* keyof Tag */ String) | Null] = js.undefined
    
    var tagProps: js.UndefOr[TagProps] = js.undefined
    
    var validationRegex: js.UndefOr[js.RegExp] = js.undefined
    
    var value: js.Array[Tag]
  }
  object ReactTagsInputProps {
    
    inline def apply[Tag](onChange: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Callback, value: js.Array[Tag]): ReactTagsInputProps[Tag] = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction3((t0: js.Array[Tag], t1: js.Array[Tag], t2: js.Array[Double]) => (onChange(t0, t1, t2)).runNow()), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTagsInputProps[Tag]]
    }
    
    extension [Self <: ReactTagsInputProps[?], Tag](x: Self & ReactTagsInputProps[Tag]) {
      
      inline def setAddKeys(value: js.Array[Double | String]): Self = StObject.set(x, "addKeys", value.asInstanceOf[js.Any])
      
      inline def setAddKeysUndefined: Self = StObject.set(x, "addKeys", js.undefined)
      
      inline def setAddKeysVarargs(value: (Double | String)*): Self = StObject.set(x, "addKeys", js.Array(value*))
      
      inline def setAddOnBlur(value: Boolean): Self = StObject.set(x, "addOnBlur", value.asInstanceOf[js.Any])
      
      inline def setAddOnBlurUndefined: Self = StObject.set(x, "addOnBlur", js.undefined)
      
      inline def setAddOnPaste(value: Boolean): Self = StObject.set(x, "addOnPaste", value.asInstanceOf[js.Any])
      
      inline def setAddOnPasteUndefined: Self = StObject.set(x, "addOnPaste", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCurrentValue(value: String): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
      
      inline def setCurrentValueUndefined: Self = StObject.set(x, "currentValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocusedClassName(value: String): Self = StObject.set(x, "focusedClassName", value.asInstanceOf[js.Any])
      
      inline def setFocusedClassNameUndefined: Self = StObject.set(x, "focusedClassName", js.undefined)
      
      inline def setInputProps(value: InputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setMaxTags(value: Double): Self = StObject.set(x, "maxTags", value.asInstanceOf[js.Any])
      
      inline def setMaxTagsUndefined: Self = StObject.set(x, "maxTags", js.undefined)
      
      inline def setOnChange(value: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: js.Array[Tag], t1: js.Array[Tag], t2: js.Array[Double]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnChangeInput(value: /* value */ String => Callback): Self = StObject.set(x, "onChangeInput", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnChangeInputUndefined: Self = StObject.set(x, "onChangeInput", js.undefined)
      
      inline def setOnValidationReject(value: /* tags */ js.Array[String] => Callback): Self = StObject.set(x, "onValidationReject", js.Any.fromFunction1((t0: /* tags */ js.Array[String]) => value(t0).runNow()))
      
      inline def setOnValidationRejectUndefined: Self = StObject.set(x, "onValidationReject", js.undefined)
      
      inline def setOnlyUnique(value: Boolean): Self = StObject.set(x, "onlyUnique", value.asInstanceOf[js.Any])
      
      inline def setOnlyUniqueUndefined: Self = StObject.set(x, "onlyUnique", js.undefined)
      
      inline def setPasteSplit(value: /* data */ String => js.Array[String]): Self = StObject.set(x, "pasteSplit", js.Any.fromFunction1(value))
      
      inline def setPasteSplitUndefined: Self = StObject.set(x, "pasteSplit", js.undefined)
      
      inline def setPreventSubmit(value: Boolean): Self = StObject.set(x, "preventSubmit", value.asInstanceOf[js.Any])
      
      inline def setPreventSubmitUndefined: Self = StObject.set(x, "preventSubmit", js.undefined)
      
      inline def setRef(value: LegacyRef[TagsInput[Tag]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: TagsInput[Tag] | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: TagsInput[Tag] | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRemoveKeys(value: js.Array[Double]): Self = StObject.set(x, "removeKeys", value.asInstanceOf[js.Any])
      
      inline def setRemoveKeysUndefined: Self = StObject.set(x, "removeKeys", js.undefined)
      
      inline def setRemoveKeysVarargs(value: Double*): Self = StObject.set(x, "removeKeys", js.Array(value*))
      
      inline def setRenderInput(value: /* props */ RenderInputProps[Tag] => Node): Self = StObject.set(x, "renderInput", js.Any.fromFunction1(value))
      
      inline def setRenderInputUndefined: Self = StObject.set(x, "renderInput", js.undefined)
      
      inline def setRenderLayout(value: (/* tagElements */ js.Array[Element], /* inputElement */ Element) => ReactChild): Self = StObject.set(x, "renderLayout", js.Any.fromFunction2(value))
      
      inline def setRenderLayoutUndefined: Self = StObject.set(x, "renderLayout", js.undefined)
      
      inline def setRenderTag(value: /* props */ RenderTagProps[Tag] => Node): Self = StObject.set(x, "renderTag", js.Any.fromFunction1(value))
      
      inline def setRenderTagUndefined: Self = StObject.set(x, "renderTag", js.undefined)
      
      inline def setTagDisplayProp(value: /* keyof Tag */ String): Self = StObject.set(x, "tagDisplayProp", value.asInstanceOf[js.Any])
      
      inline def setTagDisplayPropNull: Self = StObject.set(x, "tagDisplayProp", null)
      
      inline def setTagDisplayPropUndefined: Self = StObject.set(x, "tagDisplayProp", js.undefined)
      
      inline def setTagProps(value: TagProps): Self = StObject.set(x, "tagProps", value.asInstanceOf[js.Any])
      
      inline def setTagPropsUndefined: Self = StObject.set(x, "tagProps", js.undefined)
      
      inline def setValidationRegex(value: js.RegExp): Self = StObject.set(x, "validationRegex", value.asInstanceOf[js.Any])
      
      inline def setValidationRegexUndefined: Self = StObject.set(x, "validationRegex", js.undefined)
      
      inline def setValue(value: js.Array[Tag]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Tag*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait RenderInputProps[Tag]
    extends StObject
       with InputProps {
    
    def addTag(tag: Tag): Unit
    
    def onChange(e: ReactEventFrom[Value & org.scalajs.dom.Element]): Unit
    
    def ref(r: Any): Unit
    
    // parameter is either a DOM element or a mounted React component
    val value: Tag
  }
  object RenderInputProps {
    
    inline def apply[Tag](
      addTag: Tag => Callback,
      onChange: ReactEventFrom[Value & org.scalajs.dom.Element] => Callback,
      ref: Any => Callback,
      value: Tag
    ): RenderInputProps[Tag] = {
      val __obj = js.Dynamic.literal(addTag = js.Any.fromFunction1((t0: Tag) => addTag(t0).runNow()), onChange = js.Any.fromFunction1((t0: ReactEventFrom[Value & org.scalajs.dom.Element]) => onChange(t0).runNow()), ref = js.Any.fromFunction1((t0: Any) => ref(t0).runNow()), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderInputProps[Tag]]
    }
    
    extension [Self <: RenderInputProps[?], Tag](x: Self & RenderInputProps[Tag]) {
      
      inline def setAddTag(value: Tag => Callback): Self = StObject.set(x, "addTag", js.Any.fromFunction1((t0: Tag) => value(t0).runNow()))
      
      inline def setOnChange(value: ReactEventFrom[Value & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[Value & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setRef(value: Any => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setValue(value: Tag): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RenderLayout = js.Function2[/* tagElements */ js.Array[Element], /* inputElement */ Element, ReactChild]
  
  trait RenderTagProps[Tag]
    extends StObject
       with TagProps {
    
    val disabled: Boolean
    
    def getTagDisplayValue(tag: Tag): String
    
    def onRemove(tagIndex: Double): Unit
    
    val tag: Tag
  }
  object RenderTagProps {
    
    inline def apply[Tag](disabled: Boolean, getTagDisplayValue: Tag => String, onRemove: Double => Callback, tag: Tag): RenderTagProps[Tag] = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], getTagDisplayValue = js.Any.fromFunction1(getTagDisplayValue), onRemove = js.Any.fromFunction1((t0: Double) => onRemove(t0).runNow()), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderTagProps[Tag]]
    }
    
    extension [Self <: RenderTagProps[?], Tag](x: Self & RenderTagProps[Tag]) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setGetTagDisplayValue(value: Tag => String): Self = StObject.set(x, "getTagDisplayValue", js.Any.fromFunction1(value))
      
      inline def setOnRemove(value: Double => Callback): Self = StObject.set(x, "onRemove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  type TagProps = StringDictionary[Any]
  
  @js.native
  trait TagsInput[Tag]
    extends Component[ReactTagsInputProps[Tag], js.Object, Any] {
    
    def accept(): Any = js.native
    
    def addTag(tag: Tag): Any = js.native
    
    def blur(): Unit = js.native
    
    def clearInput(): Unit = js.native
    
    def focus(): Unit = js.native
  }
}
