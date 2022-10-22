package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.anon.FullMap
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.LazyMap")
@js.native
open class LazyMap () extends StObject {
  def this(args: FullMap) = this()
  
  var fullMap: js.UndefOr[Map[String, String]] = js.native
  
  var keysOnly: js.UndefOr[Set[String]] = js.native
}
