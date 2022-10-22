package typingsJapgolly.parse.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.parse.mod.global.Parse.UseMasterKeyOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parse", "Config")
@js.native
open class Config ()
  extends typingsJapgolly.parse.mod.global.Parse.Config
object Config {
  
  @JSImport("parse", "Config")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def current(): typingsJapgolly.parse.mod.global.Parse.Config = ^.asInstanceOf[js.Dynamic].applyDynamic("current")().asInstanceOf[typingsJapgolly.parse.mod.global.Parse.Config]
  
  /* static member */
  inline def get(): js.Promise[typingsJapgolly.parse.mod.global.Parse.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.Config]]
  inline def get(options: UseMasterKeyOption): js.Promise[typingsJapgolly.parse.mod.global.Parse.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.Config]]
  
  /* static member */
  inline def save(attr: Any): js.Promise[typingsJapgolly.parse.mod.global.Parse.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(attr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.Config]]
  inline def save(attr: Any, options: StringDictionary[Boolean]): js.Promise[typingsJapgolly.parse.mod.global.Parse.Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(attr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.Config]]
}
