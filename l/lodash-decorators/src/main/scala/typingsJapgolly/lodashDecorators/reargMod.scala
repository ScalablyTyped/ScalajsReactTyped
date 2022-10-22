package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.factoryCommonMod.LodashDecorator
import typingsJapgolly.lodashDecorators.factoryCommonMod.ResolvableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reargMod {
  
  @JSImport("lodash-decorators/rearg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[LodashDecorator]
  
  inline def Rearg_(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Rearg")(scala.List(indexes.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[LodashDecorator]
  inline def Rearg_(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Rearg")(scala.List(indexes.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[LodashDecorator]
  inline def Rearg_(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Rearg")(scala.List(indexes.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[LodashDecorator]
  
  inline def rearg(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("rearg")(scala.List(indexes.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[LodashDecorator]
  inline def rearg(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("rearg")(scala.List(indexes.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[LodashDecorator]
  inline def rearg(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("rearg")(scala.List(indexes.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[LodashDecorator]
}
