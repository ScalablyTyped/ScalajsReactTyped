package typingsJapgolly.formol.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.formol.mod.FormolProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Formol {
  
  @JSImport("formol", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def allowUnmodifiedSubmit(value: Any): this.type = set("allowUnmodifiedSubmit", value.asInstanceOf[js.Any])
    
    inline def cancelText(value: Any): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: Any): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def i18n(value: Any): this.type = set("i18n", value.asInstanceOf[js.Any])
    
    inline def item(value: Any): this.type = set("item", value.asInstanceOf[js.Any])
    
    inline def noCancel(value: Any): this.type = set("noCancel", value.asInstanceOf[js.Any])
    
    inline def onSubmit(value: /* e */ Event => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def submitText(value: Any): this.type = set("submitText", value.asInstanceOf[js.Any])
    
    inline def types(value: js.Array[String]): this.type = set("types", value.asInstanceOf[js.Any])
    
    inline def typesVarargs(value: String*): this.type = set("types", js.Array(value*))
    
    inline def validator(
      value: Any => /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof V ]:? string | null} */ js.Any
    ): this.type = set("validator", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: Formol.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FormolProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
