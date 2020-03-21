package typingsJapgolly.pgPromise.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.pgMinify.mod.IMinifyOptions
import typingsJapgolly.pgPromise.AnonCall
import typingsJapgolly.pgPromise.Typeoferrors
import typingsJapgolly.pgPromise.Typeofpg
import typingsJapgolly.pgPromise.pgSubsetMod.IClient
import typingsJapgolly.pgPromise.pgSubsetMod.IConnectionParameters
import typingsJapgolly.spex.mod.ISpex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Post-initialization interface;
// API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
@js.native
trait IMain[Ext, C /* <: IClient */] extends js.Object {
  val ParameterizedQuery: Instantiable1[
    js.UndefOr[String | typingsJapgolly.pgPromise.mod.QueryFile | IParameterizedQuery], 
    typingsJapgolly.pgPromise.mod.ParameterizedQuery
  ] = js.native
  val PreparedStatement: Instantiable1[
    js.UndefOr[/* options */ IPreparedStatement], 
    typingsJapgolly.pgPromise.mod.PreparedStatement
  ] = js.native
  val PromiseAdapter: Instantiable1[/* api */ IPromiseConfig, typingsJapgolly.pgPromise.mod.PromiseAdapter] = js.native
  val QueryFile: Instantiable2[
    /* file */ String, 
    js.UndefOr[/* options */ IQueryFileOptions], 
    typingsJapgolly.pgPromise.mod.QueryFile
  ] = js.native
  val as: IFormatting = js.native
  val errors: Typeoferrors = js.native
  val helpers: IHelpers = js.native
  @JSName("minify")
  val minify_Original: AnonCall = js.native
  val pg: Typeofpg = js.native
  val queryResult: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof queryResult */ js.Any = js.native
  val spex: ISpex = js.native
  val txMode: ITXMode = js.native
  val utils: IUtils = js.native
  def apply[T, C /* <: IClient */](cn: String): (IDatabase[T, C]) with T = js.native
  def apply[T, C /* <: IClient */](cn: String, dc: js.Any): (IDatabase[T, C]) with T = js.native
  def apply[T, C /* <: IClient */](cn: IConnectionParameters[C]): (IDatabase[T, C]) with T = js.native
  def apply[T, C /* <: IClient */](cn: IConnectionParameters[C], dc: js.Any): (IDatabase[T, C]) with T = js.native
  def end(): Unit = js.native
  def minify(sql: String): String = js.native
  def minify(sql: String, options: IMinifyOptions): String = js.native
}

