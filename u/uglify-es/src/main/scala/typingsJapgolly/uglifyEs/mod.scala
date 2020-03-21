package typingsJapgolly.uglifyEs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uglifyJs.mod.MinifyOptions
import typingsJapgolly.uglifyJs.mod.MinifyOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uglify-es", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def minify(files: String): MinifyOutput = js.native
  def minify(files: String, options: MinifyOptions): MinifyOutput = js.native
  def minify(files: js.Array[String]): MinifyOutput = js.native
  def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  def minify(files: StringDictionary[String]): MinifyOutput = js.native
  def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
  @js.native
  object InlineFunctions extends js.Object {
    /* 0 */ val Disabled: typingsJapgolly.uglifyJs.mod.InlineFunctions.Disabled with Double = js.native
    /* 1 */ val SimpleFunctions: typingsJapgolly.uglifyJs.mod.InlineFunctions.SimpleFunctions with Double = js.native
    /* 2 */ val WithArguments: typingsJapgolly.uglifyJs.mod.InlineFunctions.WithArguments with Double = js.native
    /* 3 */ val WithArgumentsAndVariables: typingsJapgolly.uglifyJs.mod.InlineFunctions.WithArgumentsAndVariables with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.uglifyJs.mod.InlineFunctions with Double] = js.native
  }
  
  @js.native
  object OutputQuoteStyle extends js.Object {
    /* 2 */ val AlwaysDouble: typingsJapgolly.uglifyJs.mod.OutputQuoteStyle.AlwaysDouble with Double = js.native
    /* 3 */ val AlwaysOriginal: typingsJapgolly.uglifyJs.mod.OutputQuoteStyle.AlwaysOriginal with Double = js.native
    /* 1 */ val AlwaysSingle: typingsJapgolly.uglifyJs.mod.OutputQuoteStyle.AlwaysSingle with Double = js.native
    /* 0 */ val PreferDouble: typingsJapgolly.uglifyJs.mod.OutputQuoteStyle.PreferDouble with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.uglifyJs.mod.OutputQuoteStyle with Double] = js.native
  }
  
}

