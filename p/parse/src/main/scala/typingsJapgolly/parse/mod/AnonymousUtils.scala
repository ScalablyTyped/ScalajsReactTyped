package typingsJapgolly.parse.mod

import typingsJapgolly.parse.mod.global.Parse.Attributes
import typingsJapgolly.parse.mod.global.Parse.ScopeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility functions for working with Anonymously logged-in users.
  */
object AnonymousUtils {
  
  @JSImport("parse", "AnonymousUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLinked(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinked")(user.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def link(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes]): js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]]]
  inline def link(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes], options: ScopeOptions): js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]]]
  
  inline def logIn(): js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")().asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]]]
  inline def logIn(options: ScopeOptions): js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]]]
}
