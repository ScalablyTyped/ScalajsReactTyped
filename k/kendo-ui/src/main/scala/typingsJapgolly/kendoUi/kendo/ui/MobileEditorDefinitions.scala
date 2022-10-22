package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileEditorDefinitions extends StObject {
  
  def boolean(container: String, options: EditorDefinitionOptions): Unit
  def boolean(container: Element, options: EditorDefinitionOptions): Unit
  def boolean(container: JQuery, options: EditorDefinitionOptions): Unit
  @JSName("boolean")
  var boolean_Original: EditorDefinition
  
  def date(container: String, options: EditorDefinitionOptions): Unit
  def date(container: Element, options: EditorDefinitionOptions): Unit
  def date(container: JQuery, options: EditorDefinitionOptions): Unit
  @JSName("date")
  var date_Original: EditorDefinition
  
  def number(container: String, options: EditorDefinitionOptions): Unit
  def number(container: Element, options: EditorDefinitionOptions): Unit
  def number(container: JQuery, options: EditorDefinitionOptions): Unit
  @JSName("number")
  var number_Original: EditorDefinition
  
  def string(container: String, options: EditorDefinitionOptions): Unit
  def string(container: Element, options: EditorDefinitionOptions): Unit
  def string(container: JQuery, options: EditorDefinitionOptions): Unit
  @JSName("string")
  var string_Original: EditorDefinition
  
  def values(container: String, options: EditorDefinitionOptions): Unit
  def values(container: Element, options: EditorDefinitionOptions): Unit
  def values(container: JQuery, options: EditorDefinitionOptions): Unit
  @JSName("values")
  var values_Original: EditorDefinition
}
object MobileEditorDefinitions {
  
  inline def apply(
    boolean: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Callback,
    date: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Callback,
    number: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Callback,
    string: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Callback,
    values: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Callback
  ): MobileEditorDefinitions = {
    val __obj = js.Dynamic.literal(boolean = js.Any.fromFunction2((t0: /* container */ JQuery | Element | String, t1: /* options */ EditorDefinitionOptions) => (boolean(t0, t1)).runNow()), date = js.Any.fromFunction2((t0: /* container */ JQuery | Element | String, t1: /* options */ EditorDefinitionOptions) => (date(t0, t1)).runNow()), number = js.Any.fromFunction2((t0: /* container */ JQuery | Element | String, t1: /* options */ EditorDefinitionOptions) => (number(t0, t1)).runNow()), string = js.Any.fromFunction2((t0: /* container */ JQuery | Element | String, t1: /* options */ EditorDefinitionOptions) => (string(t0, t1)).runNow()), values = js.Any.fromFunction2((t0: /* container */ JQuery | Element | String, t1: /* options */ EditorDefinitionOptions) => (values(t0, t1)).runNow()))
    __obj.asInstanceOf[MobileEditorDefinitions]
  }
  
  extension [Self <: MobileEditorDefinitions](x: Self) {
    
    inline def setBoolean(
      value: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Callback
    ): Self = StObject.set(x, "boolean", js.Any.fromFunction2((t0: /* container */ JQuery | Element | String, t1: /* options */ EditorDefinitionOptions) => (value(t0, t1)).runNow()))
    
    inline def setDate(
      value: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Callback
    ): Self = StObject.set(x, "date", js.Any.fromFunction2((t0: /* container */ JQuery | Element | String, t1: /* options */ EditorDefinitionOptions) => (value(t0, t1)).runNow()))
    
    inline def setNumber(
      value: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Callback
    ): Self = StObject.set(x, "number", js.Any.fromFunction2((t0: /* container */ JQuery | Element | String, t1: /* options */ EditorDefinitionOptions) => (value(t0, t1)).runNow()))
    
    inline def setString(
      value: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Callback
    ): Self = StObject.set(x, "string", js.Any.fromFunction2((t0: /* container */ JQuery | Element | String, t1: /* options */ EditorDefinitionOptions) => (value(t0, t1)).runNow()))
    
    inline def setValues(
      value: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Callback
    ): Self = StObject.set(x, "values", js.Any.fromFunction2((t0: /* container */ JQuery | Element | String, t1: /* options */ EditorDefinitionOptions) => (value(t0, t1)).runNow()))
  }
}
