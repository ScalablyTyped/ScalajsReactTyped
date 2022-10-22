package typingsJapgolly.reactTagsinput.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactTagsinput.mod.InputProps
import typingsJapgolly.reactTagsinput.mod.ReactTagsInputProps
import typingsJapgolly.reactTagsinput.mod.RenderInputProps
import typingsJapgolly.reactTagsinput.mod.RenderTagProps
import typingsJapgolly.reactTagsinput.mod.TagProps
import typingsJapgolly.reactTagsinput.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTagsinput {
  
  inline def apply[Tag](onChange: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Callback, value: js.Array[Tag]): Builder[Tag] = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction3((t0: js.Array[Tag], t1: js.Array[Tag], t2: js.Array[Double]) => (onChange(t0, t1, t2)).runNow()), value = value.asInstanceOf[js.Any])
    new Builder[Tag](js.Array(this.component, __props.asInstanceOf[ReactTagsInputProps[Tag]]))
  }
  
  @JSImport("react-tagsinput", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Tag] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^[Tag]] {
    
    inline def addKeys(value: js.Array[Double | String]): this.type = set("addKeys", value.asInstanceOf[js.Any])
    
    inline def addKeysVarargs(value: (Double | String)*): this.type = set("addKeys", js.Array(value*))
    
    inline def addOnBlur(value: Boolean): this.type = set("addOnBlur", value.asInstanceOf[js.Any])
    
    inline def addOnPaste(value: Boolean): this.type = set("addOnPaste", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def currentValue(value: String): this.type = set("currentValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def focusedClassName(value: String): this.type = set("focusedClassName", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: InputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
    
    inline def maxTags(value: Double): this.type = set("maxTags", value.asInstanceOf[js.Any])
    
    inline def onChangeInput(value: /* value */ String => Callback): this.type = set("onChangeInput", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onValidationReject(value: /* tags */ js.Array[String] => Callback): this.type = set("onValidationReject", js.Any.fromFunction1((t0: /* tags */ js.Array[String]) => value(t0).runNow()))
    
    inline def onlyUnique(value: Boolean): this.type = set("onlyUnique", value.asInstanceOf[js.Any])
    
    inline def pasteSplit(value: /* data */ String => js.Array[String]): this.type = set("pasteSplit", js.Any.fromFunction1(value))
    
    inline def preventSubmit(value: Boolean): this.type = set("preventSubmit", value.asInstanceOf[js.Any])
    
    inline def removeKeys(value: js.Array[Double]): this.type = set("removeKeys", value.asInstanceOf[js.Any])
    
    inline def removeKeysVarargs(value: Double*): this.type = set("removeKeys", js.Array(value*))
    
    inline def renderInput(value: /* props */ RenderInputProps[Tag] => Node): this.type = set("renderInput", js.Any.fromFunction1(value))
    
    inline def renderLayout(value: (/* tagElements */ js.Array[Element], /* inputElement */ Element) => ReactChild): this.type = set("renderLayout", js.Any.fromFunction2(value))
    
    inline def renderTag(value: /* props */ RenderTagProps[Tag] => Node): this.type = set("renderTag", js.Any.fromFunction1(value))
    
    inline def tagDisplayProp(value: /* keyof Tag */ String): this.type = set("tagDisplayProp", value.asInstanceOf[js.Any])
    
    inline def tagDisplayPropNull: this.type = set("tagDisplayProp", null)
    
    inline def tagProps(value: TagProps): this.type = set("tagProps", value.asInstanceOf[js.Any])
    
    inline def validationRegex(value: js.RegExp): this.type = set("validationRegex", value.asInstanceOf[js.Any])
  }
  
  def withProps[Tag](p: ReactTagsInputProps[Tag]): Builder[Tag] = new Builder[Tag](js.Array(this.component, p.asInstanceOf[js.Any]))
}
