package typingsJapgolly.karmaViewport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAdapterUtilInspectMod {
  
  @JSImport("karma-viewport/dist/adapter/util/inspect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inspect(value: InspectValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait InspectFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type InspectValue = js.UndefOr[Null | Double | String | js.Object | InspectFunction]
}
