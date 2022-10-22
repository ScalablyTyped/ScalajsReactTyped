package typingsJapgolly.chalkPipe

import typingsJapgolly.chalk.mod.ChalkInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * 🌈 Create chalk-style schemes with simpler style strings.
    * @param stylePipe Use a dot `.` to separate multiple styles.
    */
  inline def apply[T /* <: ChalkInstance */](stylePipe: String): T = ^.asInstanceOf[js.Dynamic].apply(stylePipe.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def apply[T /* <: ChalkInstance */](stylePipe: String, customChalk: T): T = (^.asInstanceOf[js.Dynamic].apply(stylePipe.asInstanceOf[js.Any], customChalk.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("chalk-pipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
