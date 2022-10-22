package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.factoryCommonMod.LodashMethodDecorator
import typingsJapgolly.std.MethodDecorator
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overArgsMod {
  
  @JSImport("lodash-decorators/overArgs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): MethodDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MethodDecorator & PropertyDecorator]
  
  inline def OverArgs_(transforms: js.Function*): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("OverArgs")(transforms.asInstanceOf[Seq[js.Any]]*).asInstanceOf[LodashMethodDecorator]
  
  inline def overArgs(transforms: js.Function*): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("overArgs")(transforms.asInstanceOf[Seq[js.Any]]*).asInstanceOf[LodashMethodDecorator]
}
