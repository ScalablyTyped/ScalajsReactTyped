package typingsJapgolly.gulpMocha

import typingsJapgolly.mocha.Mocha.MochaOptions
import typingsJapgolly.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  inline def apply(setupOptions: MochaOptions): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(setupOptions.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-mocha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
