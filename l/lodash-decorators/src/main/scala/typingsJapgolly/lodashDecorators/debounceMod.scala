package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.factoryCommonMod.LodashDecorator
import typingsJapgolly.lodashDecorators.sharedMod.DebounceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceMod {
  
  @JSImport("lodash-decorators/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[LodashDecorator]
  
  inline def Debounce_(): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Debounce")().asInstanceOf[LodashDecorator]
  inline def Debounce_(wait: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Debounce")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  inline def Debounce_(wait: Double, options: DebounceOptions): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Debounce")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  inline def Debounce_(wait: Unit, options: DebounceOptions): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Debounce")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  
  inline def debounce(): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")().asInstanceOf[LodashDecorator]
  inline def debounce(wait: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  inline def debounce(wait: Double, options: DebounceOptions): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  inline def debounce(wait: Unit, options: DebounceOptions): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
}
