package typingsJapgolly.gulpTap

import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(tapFunction: js.Function2[/* file */ File, /* t */ js.UndefOr[js.Object], Unit]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(tapFunction.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-tap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Tap = js.Function2[/* tapFunction */ TapFunction, /* t */ js.UndefOr[Any], ReadWriteStream]
  
  type TapFunction = js.Function1[/* file */ File, Any]
}
