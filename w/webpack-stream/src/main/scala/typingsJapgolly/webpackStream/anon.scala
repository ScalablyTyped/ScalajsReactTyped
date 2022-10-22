package typingsJapgolly.webpackStream

import typingsJapgolly.webpack.mod.CallbackWebpack
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpack.mod.Configuration
import typingsJapgolly.webpack.mod.MultiCompiler
import typingsJapgolly.webpack.mod.MultiCompilerOptions
import typingsJapgolly.webpack.mod.MultiStats
import typingsJapgolly.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(options: js.Array[Configuration] & MultiCompilerOptions): MultiCompiler = js.native
    def apply(options: js.Array[Configuration] & MultiCompilerOptions, callback: CallbackWebpack[MultiStats]): MultiCompiler = js.native
    def apply(options: Configuration): Compiler = js.native
    def apply(options: Configuration, callback: CallbackWebpack[Stats]): Compiler = js.native
  }
}
