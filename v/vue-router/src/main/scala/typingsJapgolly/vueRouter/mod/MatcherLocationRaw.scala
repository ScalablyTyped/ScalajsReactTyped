package typingsJapgolly.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Route location that can be passed to the matcher.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vueRouter.mod.MatcherLocationAsPath
  - typingsJapgolly.vueRouter.mod.MatcherLocationAsName
  - typingsJapgolly.vueRouter.mod.MatcherLocationAsRelative
*/
trait MatcherLocationRaw extends StObject
object MatcherLocationRaw {
  
  inline def MatcherLocationAsName(name: RouteRecordName): typingsJapgolly.vueRouter.mod.MatcherLocationAsName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vueRouter.mod.MatcherLocationAsName]
  }
  
  inline def MatcherLocationAsPath(path: String): typingsJapgolly.vueRouter.mod.MatcherLocationAsPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vueRouter.mod.MatcherLocationAsPath]
  }
  
  inline def MatcherLocationAsRelative(): typingsJapgolly.vueRouter.mod.MatcherLocationAsRelative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.vueRouter.mod.MatcherLocationAsRelative]
  }
}
