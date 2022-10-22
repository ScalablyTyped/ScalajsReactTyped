package typingsJapgolly.mongodb.mod

import typingsJapgolly.mongodb.mongodbStrings.slow_only
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mongodbStrings.off
  - typingsJapgolly.mongodb.mongodbStrings.slow_only
  - typingsJapgolly.mongodb.mongodbStrings.all
*/
trait ProfilingLevel extends StObject
/* Inlined std.Readonly<{ readonly off :'off',  readonly slowOnly :'slow_only',  readonly all :'all'}> */
object ProfilingLevel {
  
  @JSImport("mongodb", "ProfilingLevel.all")
  @js.native
  val all: typingsJapgolly.mongodb.mongodbStrings.all = js.native
  
  @JSImport("mongodb", "ProfilingLevel.off")
  @js.native
  val off: typingsJapgolly.mongodb.mongodbStrings.off = js.native
  
  @JSImport("mongodb", "ProfilingLevel.slowOnly")
  @js.native
  val slowOnly: slow_only = js.native
}
