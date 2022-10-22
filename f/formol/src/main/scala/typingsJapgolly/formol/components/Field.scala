package typingsJapgolly.formol.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.formol.mod.FieldProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Field {
  
  @JSImport("formol", "Field")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def TypeField(value: ComponentType[js.Object]): this.type = set("TypeField", value.asInstanceOf[js.Any])
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def choices(value: js.Array[Any]): this.type = set("choices", value.asInstanceOf[js.Any])
    
    inline def choicesVarargs(value: Any*): this.type = set("choices", js.Array(value*))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameModifiers(value: Any): this.type = set("classNameModifiers", value.asInstanceOf[js.Any])
    
    inline def dangerousRawHTMLLabels(value: Boolean): this.type = set("dangerousRawHTMLLabels", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: VdomNode): this.type = set("error", value.rawNode.asInstanceOf[js.Any])
    
    inline def errorNull: this.type = set("error", null)
    
    inline def errorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("error", js.Array(value*))
    
    inline def errorVdomElement(value: VdomElement): this.type = set("error", value.rawElement.asInstanceOf[js.Any])
    
    inline def extras(value: VdomNode): this.type = set("extras", value.rawNode.asInstanceOf[js.Any])
    
    inline def extrasNull: this.type = set("extras", null)
    
    inline def extrasVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extras", js.Array(value*))
    
    inline def extrasVdomElement(value: VdomElement): this.type = set("extras", value.rawElement.asInstanceOf[js.Any])
    
    inline def formatter(value: Any => Any): this.type = set("formatter", js.Any.fromFunction1(value))
    
    inline def handleChange(value: (/* name */ String, Any) => Callback): this.type = set("handleChange", js.Any.fromFunction2((t0: /* name */ String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def handleEntered(value: (/* name */ String, Any) => Callback): this.type = set("handleEntered", js.Any.fromFunction2((t0: /* name */ String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def i18n(value: Any): this.type = set("i18n", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    inline def modified(value: Boolean): this.type = set("modified", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def normalizer(value: Any => Any): this.type = set("normalizer", js.Any.fromFunction1(value))
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def register(
      value: (/* name */ String, /* element */ Ref[Any], /* validator */ Any, /* validityErrors */ Any) => Callback
    ): this.type = set("register", js.Any.fromFunction4((t0: /* name */ String, t1: /* element */ Ref[Any], t2: /* validator */ Any, t3: /* validityErrors */ Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def unformatter(value: Any => Any): this.type = set("unformatter", js.Any.fromFunction1(value))
    
    inline def unit(value: VdomNode): this.type = set("unit", value.rawNode.asInstanceOf[js.Any])
    
    inline def unitNull: this.type = set("unit", null)
    
    inline def unitVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("unit", js.Array(value*))
    
    inline def unitVdomElement(value: VdomElement): this.type = set("unit", value.rawElement.asInstanceOf[js.Any])
    
    inline def unregister(value: /* name */ String => Callback): this.type = set("unregister", js.Any.fromFunction1((t0: /* name */ String) => value(t0).runNow()))
    
    inline def validator(value: Any => String): this.type = set("validator", js.Any.fromFunction1(value))
    
    inline def validityErrors(value: Any): this.type = set("validityErrors", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Field.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FieldProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
