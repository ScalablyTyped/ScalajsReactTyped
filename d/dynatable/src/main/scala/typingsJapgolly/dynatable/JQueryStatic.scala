package typingsJapgolly.dynatable

import japgolly.scalajs.react.Callback
import typingsJapgolly.dynatable.JQueryDynatable.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Static members of jQuery (those on $ and jQuery themselves) */
trait JQueryStatic extends StObject {
  
  /**
    * Global dynatable plugin setting defaults
    *
    * @param options The configuration options to be set globally
    */
  def dynatableSetup(options: Options): Unit
}
object JQueryStatic {
  
  inline def apply(dynatableSetup: Options => Callback): JQueryStatic = {
    val __obj = js.Dynamic.literal(dynatableSetup = js.Any.fromFunction1((t0: Options) => dynatableSetup(t0).runNow()))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setDynatableSetup(value: Options => Callback): Self = StObject.set(x, "dynatableSetup", js.Any.fromFunction1((t0: Options) => value(t0).runNow()))
  }
}
