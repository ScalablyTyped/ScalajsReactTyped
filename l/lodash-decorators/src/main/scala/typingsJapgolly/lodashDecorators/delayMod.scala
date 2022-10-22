package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.factoryCommonMod.LodashMethodDecorator
import typingsJapgolly.std.MethodDecorator
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayMod {
  
  @JSImport("lodash-decorators/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): MethodDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MethodDecorator & PropertyDecorator]
  
  inline def Delay_(wait: Double, args: Any*): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Delay")(scala.List(wait.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[LodashMethodDecorator]
  
  inline def delay(wait: Double, args: Any*): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(scala.List(wait.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[LodashMethodDecorator]
}
