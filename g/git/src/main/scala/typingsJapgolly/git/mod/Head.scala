package typingsJapgolly.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Head")
@js.native
open class Head protected () extends StObject {
  // string or Commit or ...?
  def this(name: String, commit: Any) = this()
  
  var commit: Any = js.native
  
  var name: String = js.native
}
/* static members */
object Head {
  
  @JSImport("git", "Head")
  @js.native
  val ^ : js.Any = js.native
  
  inline def current(repo: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("current")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def current(repo: Any, options: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("current")(repo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def find_all(repo: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def find_all(repo: Any, options: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
