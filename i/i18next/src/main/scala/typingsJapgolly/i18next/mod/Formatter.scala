package typingsJapgolly.i18next.mod

import typingsJapgolly.i18next.anon.InterpolationOptionskeyst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatter extends StObject {
  
  def add(
    name: String,
    fc: js.Function3[/* value */ Any, /* lng */ js.UndefOr[String], /* options */ Any, String]
  ): Unit
  
  def format(value: Any): String
  def format(value: Any, format: String): String
  def format(value: Any, format: String, lng: String): String
  def format(value: Any, format: String, lng: String, options: InterpolationOptionskeyst): String
  def format(value: Any, format: String, lng: Unit, options: InterpolationOptionskeyst): String
  def format(value: Any, format: Unit, lng: String): String
  def format(value: Any, format: Unit, lng: String, options: InterpolationOptionskeyst): String
  def format(value: Any, format: Unit, lng: Unit, options: InterpolationOptionskeyst): String
  @JSName("format")
  var format_Original: FormatFunction
  
  def init(services: Services, i18nextOptions: InitOptions): Unit
}
object Formatter {
  
  inline def apply(
    add: (String, js.Function3[/* value */ Any, /* lng */ js.UndefOr[String], /* options */ Any, String]) => japgolly.scalajs.react.Callback,
    format: (/* value */ Any, /* format */ js.UndefOr[String], /* lng */ js.UndefOr[String], /* options */ js.UndefOr[InterpolationOptionskeyst]) => String,
    init: (Services, InitOptions) => japgolly.scalajs.react.Callback
  ): Formatter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: String, t1: js.Function3[/* value */ Any, /* lng */ js.UndefOr[String], /* options */ Any, String]) => (add(t0, t1)).runNow()), format = js.Any.fromFunction4(format), init = js.Any.fromFunction2((t0: Services, t1: InitOptions) => (init(t0, t1)).runNow()))
    __obj.asInstanceOf[Formatter]
  }
  
  extension [Self <: Formatter](x: Self) {
    
    inline def setAdd(
      value: (String, js.Function3[/* value */ Any, /* lng */ js.UndefOr[String], /* options */ Any, String]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: String, t1: js.Function3[/* value */ Any, /* lng */ js.UndefOr[String], /* options */ Any, String]) => (value(t0, t1)).runNow()))
    
    inline def setFormat(
      value: (/* value */ Any, /* format */ js.UndefOr[String], /* lng */ js.UndefOr[String], /* options */ js.UndefOr[InterpolationOptionskeyst]) => String
    ): Self = StObject.set(x, "format", js.Any.fromFunction4(value))
    
    inline def setInit(value: (Services, InitOptions) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "init", js.Any.fromFunction2((t0: Services, t1: InitOptions) => (value(t0, t1)).runNow()))
  }
}
