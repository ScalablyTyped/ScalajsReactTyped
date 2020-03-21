package typingsJapgolly.webpackStream

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.webpack.mod.Compiler_
import typingsJapgolly.webpack.mod.Compiler_.Watching
import typingsJapgolly.webpack.mod.Compiler_.Watching.Handler
import typingsJapgolly.webpack.mod.Compiler_.Watching.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofCompiler extends js.Object {
  var Watching: Instantiable3[
    /* compiler */ Compiler_, 
    /* watchOptions */ WatchOptions, 
    /* handler */ Handler, 
    typingsJapgolly.webpack.mod.Compiler_.Watching
  ]
}

object TypeofCompiler {
  @scala.inline
  def apply(
    Watching: Instantiable3[
      /* compiler */ Compiler_, 
      /* watchOptions */ WatchOptions, 
      /* handler */ Handler, 
      Watching
    ]
  ): TypeofCompiler = {
    val __obj = js.Dynamic.literal(Watching = Watching.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofCompiler]
  }
}

