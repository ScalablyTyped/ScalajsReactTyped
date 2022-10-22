package typingsJapgolly.tabris.mod

import typingsJapgolly.tabris.tabrisStrings.debug
import typingsJapgolly.tabris.tabrisStrings.error
import typingsJapgolly.tabris.tabrisStrings.info
import typingsJapgolly.tabris.tabrisStrings.log
import typingsJapgolly.tabris.tabrisStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabrisLogEvent[Target] extends EventObject[Target] {
  
  val level: debug | info | log | warn | error = js.native
  
  val message: String = js.native
}
