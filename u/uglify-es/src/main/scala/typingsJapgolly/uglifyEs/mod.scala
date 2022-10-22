package typingsJapgolly.uglifyEs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uglifyJs.mod.MinifyOptions
import typingsJapgolly.uglifyJs.mod.MinifyOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uglify-es", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("uglify-es", "InlineFunctions")
  @js.native
  object InlineFunctions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.uglifyJs.mod.InlineFunctions & Double] = js.native
    
    /* 0 */ val Disabled: typingsJapgolly.uglifyJs.mod.InlineFunctions.Disabled & Double = js.native
    
    /* 1 */ val SimpleFunctions: typingsJapgolly.uglifyJs.mod.InlineFunctions.SimpleFunctions & Double = js.native
    
    /* 2 */ val WithArguments: typingsJapgolly.uglifyJs.mod.InlineFunctions.WithArguments & Double = js.native
    
    /* 3 */ val WithArgumentsAndVariables: typingsJapgolly.uglifyJs.mod.InlineFunctions.WithArgumentsAndVariables & Double = js.native
  }
  
  @JSImport("uglify-es", "OutputQuoteStyle")
  @js.native
  object OutputQuoteStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.uglifyJs.mod.OutputQuoteStyle & Double] = js.native
    
    /* 2 */ val AlwaysDouble: typingsJapgolly.uglifyJs.mod.OutputQuoteStyle.AlwaysDouble & Double = js.native
    
    /* 3 */ val AlwaysOriginal: typingsJapgolly.uglifyJs.mod.OutputQuoteStyle.AlwaysOriginal & Double = js.native
    
    /* 1 */ val AlwaysSingle: typingsJapgolly.uglifyJs.mod.OutputQuoteStyle.AlwaysSingle & Double = js.native
    
    /* 0 */ val PreferDouble: typingsJapgolly.uglifyJs.mod.OutputQuoteStyle.PreferDouble & Double = js.native
  }
  
  inline def minify(files: String): MinifyOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[MinifyOutput]
  inline def minify(files: String, options: MinifyOptions): MinifyOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MinifyOutput]
  inline def minify(files: js.Array[String]): MinifyOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[MinifyOutput]
  inline def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MinifyOutput]
  inline def minify(files: StringDictionary[String]): MinifyOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[MinifyOutput]
  inline def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MinifyOutput]
}
