package typingsJapgolly.pgPromise.mod

import typingsJapgolly.pgPromise.anon.CndMode
import typingsJapgolly.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITaskArguments[T]
  extends StObject
     with IArguments {
  
  def cb(): Any = js.native
  
  var options: CndMode & T = js.native
}
