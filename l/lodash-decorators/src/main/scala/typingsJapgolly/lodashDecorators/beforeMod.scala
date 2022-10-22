package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.factoryCommonMod.LodashDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beforeMod {
  
  @JSImport("lodash-decorators/before", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[LodashDecorator]
  
  inline def Before_(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Before")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def before(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("before")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
}
